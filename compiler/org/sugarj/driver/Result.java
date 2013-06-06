
package org.sugarj.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr_layout.shared.BadTokenException;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.IErrorLogger;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.languagelib.SourceFileContent;
import org.sugarj.util.AppendableObjectOutputStream;
import org.sugarj.util.Pair;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Result implements IErrorLogger {
  /**
   * Caching for results
   */
  private static HashMap<Path, SoftReference<Result>> results = new HashMap<Path, SoftReference<Result>>();
    
  /**
   * Path and hash of the disk-stored version of this result.
   * If the result was not stored yet, both variables are null.
   */
  private Path persistentPath;
  private Integer persistentHash = null;
  
  /**
   *  This is a parse result if it was produced during parsing.
   */
  private Path parseResultPath;
  
  private Map<Path, Integer> dependencies = new HashMap<Path, Integer>();
  private Set<Path> circularDependencies = new HashSet<Path>();
  private Map<Path, Integer> generatedFileHashes = new HashMap<Path, Integer>();
  private Map<Path, Integer> dependingFileHashes = new HashMap<Path, Integer>();
  private Set<IStrategoTerm> editorServices = new HashSet<IStrategoTerm>();
  private List<String> collectedErrors = new LinkedList<String>();
  private Set<BadTokenException> parseErrors = new HashSet<BadTokenException>();
  private IStrategoTerm sugaredSyntaxTree = null;
  private Path parseTableFile;
  private Path desugaringsFile;
  private RelativePath sourceFile;
  private Integer sourceFileHash;
  private Set<Path> allDependentFiles = new HashSet<Path>();
  private boolean failed = false;
  private Path generationLog;
  
  /**
   * deferred source files (*.sugj) -> 
   * to-be-generated files (e.g., *.class) 
   */
  private Map<Path, Set<RelativePath>> availableGeneratedFiles = new HashMap<Path, Set<RelativePath>>();
  
  /**
   * deferred source files (*.sugj) -> 
   * to-be-compiled source files (e.g., *.java + generated SourceFileContent) 
   */
  private Map<Path, Pair<Path, SourceFileContent.Generated>> deferredSourceFiles = new HashMap<Path, Pair<Path, SourceFileContent.Generated>>();
  
  public Result() {
  }
  
  public Result(Path parseResultPath) {
    this.parseResultPath = parseResultPath;
  }
  
  public void addFileDependency(Path file) {
    allDependentFiles.add(file);
    try {
      dependingFileHashes.put(file, FileCommands.fileHash(file));
    } catch (IOException e) {
      e.printStackTrace();
      dependingFileHashes.put(file, -1);
    }
  }
  
  void addCircularDependency(Path depFile) throws IOException {
    circularDependencies.add(depFile);
  }
  
  public void addDependency(Result result) throws IOException {
    if (result.persistentPath != null && !result.hasPersistentVersionChanged())
      dependencies.put(result.persistentPath, result.persistentHash);
    allDependentFiles.addAll(result.getFileDependencies());
  }
  
  public void addDependency(Path depFile) throws IOException {
    dependencies.put(depFile, FileCommands.fileHash(depFile));
    Result result = readDependencyFile(depFile);
    allDependentFiles.addAll(result.getFileDependencies());
  }
  
  public boolean hasDependency(Path otherDep, Environment env) throws IOException {
    if (dependencies.containsKey(otherDep))
      return true;
    for (Path dep : dependencies.keySet())
      if (Result.readDependencyFile(dep).hasDependency(otherDep, env))
        return true;
    return false;
  }

  public Collection<Path> getFileDependencies() throws IOException {
    if (allDependentFiles == null) {
      HashSet<Path> deps = new HashSet<Path>(generatedFileHashes.keySet());
      deps.addAll(dependingFileHashes.keySet());
      for (Path depFile : dependencies.keySet())
        deps.addAll(readDependencyFile(depFile).getFileDependencies());
      synchronized(this) { allDependentFiles = deps; }
    }

    return allDependentFiles;
  }

  public Collection<Path> getCircularFileDependencies(Environment env) throws IOException {
    assert persistentPath != null;
    
    Set<Path> dependencies = new HashSet<Path>();
    Set<Path> visited = new HashSet<Path>();
    LinkedList<Path> queue = new LinkedList<Path>();
    queue.add(persistentPath);
    visited.add(persistentPath);
    
    while (!queue.isEmpty()) {
      Path dep = queue.pop();
      Result res = readDependencyFile(dep);
      
      for (Path p : res.generatedFileHashes.keySet())
        if (!dependencies.contains(p) && FileCommands.exists(p))
          dependencies.add(p);
      for (Path p : res.dependingFileHashes.keySet())
        if (!dependencies.contains(p) && FileCommands.exists(p))
          dependencies.add(p);
      
      for (Path nextDep : res.dependencies.keySet())
        if (!visited.contains(nextDep)) {
          queue.addFirst(nextDep);
          visited.add(dep);
        }
      for (Path nextDep : res.circularDependencies)
        if (!visited.contains(nextDep)) {
          queue.addFirst(nextDep);
          visited.add(dep);
        }
    }
    
    return dependencies;
  }
  
  public Set<Path> getDirectlyGeneratedFiles() {
    return generatedFileHashes.keySet();
  }
  
  public void setGenerationLog(Path file) {
    this.generationLog = file;
  }
  
  public Path getGenerationLog() {
    return generationLog;
  }
  
  private void logGeneration(Object o) throws IOException {
    if (generationLog != null) {
      boolean exists = FileCommands.exists(generationLog);
      if (!exists)
        FileCommands.createFile(generationLog);
      ObjectOutputStream oos = exists ? new AppendableObjectOutputStream(new FileOutputStream(generationLog.getFile(), true))
      : new ObjectOutputStream(new FileOutputStream(generationLog.getFile()));
      try {
        oos.writeObject(o);
      } finally {
        oos.close();
      }
    }
  }

  public void generateFile(Path file, String content) throws IOException {
    FileCommands.writeToFile(file, content);
    generatedFileHashes.put(file, FileCommands.fileHash(file));
    allDependentFiles.add(file);
    logGeneration(file);
  }

  public void addEditorService(IStrategoTerm service) {
    editorServices.add(service);
  }
  
  public Set<IStrategoTerm> getEditorServices() {
    return editorServices;
  }
  
  public boolean hasPersistentVersionChanged() throws IOException {
    return persistentPath != null && 
           persistentHash != null && 
           FileCommands.fileHash(persistentPath) != persistentHash;
  }
  
  public boolean hasSourceFileChanged(Path inputFile) throws IOException {
    return inputFile == null || hasSourceFileChanged(FileCommands.fileHash(inputFile));
  }
  
  private boolean hasSourceFileChanged(int inputHash) {
    return sourceFileHash == null || inputHash != sourceFileHash;
  }
  
  public boolean isUpToDateShallow(Path inputFile, Environment env) throws IOException {
    return isUpToDateShallow(FileCommands.fileHash(inputFile), env);
  }
  
  public boolean isUpToDate(Environment env) throws IOException {
    return isUpToDate(persistentPath, env);
  }
  
  public boolean isUpToDate(Path inputFile, Environment env) throws IOException {
    return isUpToDate(FileCommands.fileHash(inputFile), env);
  }

  public boolean isUpToDateShallow(int inputHash, Environment env) throws IOException {
     if (hasPersistentVersionChanged())
      return false;
    
    if (hasSourceFileChanged(inputHash))
      return false;
    
    if (desugaringsFile != null && !FileCommands.exists(desugaringsFile))
      return false;
    
    for (Entry<Path, Integer> entry : generatedFileHashes.entrySet())
      if (FileCommands.fileHash(entry.getKey()) != entry.getValue())
        return false;

    for (Entry<Path, Integer> entry : dependingFileHashes.entrySet())
      if (FileCommands.fileHash(entry.getKey()) != entry.getValue())
        return false;

    for (Entry<Path, Integer> entry : dependencies.entrySet())
      if (FileCommands.fileHash(entry.getKey()) != entry.getValue())
        return false;

    return true;
  }

  public boolean isUpToDate(int inputHash, Environment env) throws IOException {
    if (!isUpToDateShallow(inputHash, env))
      return false;

    Set<Path> checked = new HashSet<Path>();
    Set<Path> dependends = new HashSet<Path>(dependencies.keySet());
    
    while (!dependends.isEmpty()) {
      Path path = dependends.iterator().next();
      dependends.remove(path);
      
      if (checked.contains(path))
        continue;
      
      Result r = Result.readDependencyFile(path);
      if (r == null || !r.isUpToDateShallow(r.getSourceFile(), env))
        return false;
      
      dependends.addAll(r.dependencies.keySet());
      checked.add(path);
    }

    return true;
  }
  
  public void logError(String error) {
    collectedErrors.add(error);
  }
  
  public List<String> getCollectedErrors() {
    return collectedErrors;
  }
  
  public void logParseError(BadTokenException e) {
    parseErrors.add(e);  
  }
  
  public Set<BadTokenException> getParseErrors() {
    return parseErrors;
  }
  
  public void setSugaredSyntaxTree(IStrategoTerm sugaredSyntaxTree) {
    // TODO remove fixing after merging layout-sensitive parser into Spoofax
    this.sugaredSyntaxTree = ATermCommands.fixTokenizer(sugaredSyntaxTree);
  }
  
  public IStrategoTerm getSugaredSyntaxTree() {
    return sugaredSyntaxTree;
  }
  
  void delegateCompilation(Result delegate, Path compileFile, SourceFileContent fileContent, boolean hasNonBaseDec, Set<RelativePath> generatedFiles) {
    delegate.availableGeneratedFiles.putAll(availableGeneratedFiles);
    if (!generatedFiles.isEmpty())
      delegate.availableGeneratedFiles.put(sourceFile, generatedFiles);
    
    delegate.deferredSourceFiles.putAll(deferredSourceFiles);
    if (!fileContent.isEmpty() || hasNonBaseDec)
      delegate.deferredSourceFiles.put(sourceFile, Pair.create(compileFile, fileContent.getCode(compileFile)));
  }
  
  boolean isDelegateOf(Path compileFile) {
    return deferredSourceFiles.containsKey(compileFile);
  }
  
  void resetDelegation() {
    availableGeneratedFiles.clear();
    deferredSourceFiles.clear();
  }
  
  public void registerParseTable(Path tbl) {
    this.parseTableFile = tbl;
  }
  
  public Path getParseTable() {
    return parseTableFile;
  }
  
  public void registerEditorDesugarings(Path jarfile) throws IOException {
    desugaringsFile = jarfile;
    editorServices = new HashSet<IStrategoTerm>(ATermCommands.registerSemanticProvider(editorServices, jarfile));
  }
  
  public Path getDesugaringsFile() {
    return desugaringsFile;
  }
  
  private void setPersistentPath(Path dep) throws IOException {
    persistentPath = dep;
    persistentHash = FileCommands.fileHash(dep);
  }
  
  public Path getPersistentPath() {
    return persistentPath;
  }
  
  public void setSourceFile(RelativePath sourceFile, int sourceFileHash) {
    this.sourceFile = sourceFile;
    this.sourceFileHash = sourceFileHash;
  }

  public RelativePath getSourceFile() {
    return sourceFile;
  }
  
  public boolean hasFailed() {
    return failed;
  }
  
  public void setFailed(boolean hasFailed) {
    this.failed = hasFailed;
  }
  
  public boolean isGenerated() {
    return sourceFile != null && "model".equals(FileCommands.getExtension(sourceFile));
  }

  public Map<Path, Set<RelativePath>> getAvailableGeneratedFiles() {
    return availableGeneratedFiles;
  }

  public Map<Path, Pair<Path, SourceFileContent.Generated>> getDeferredSourceFiles() {
    return deferredSourceFiles;
  }

  public Map<Path, Integer> getGeneratedFileHashes() {
    return generatedFileHashes;
  }

  public boolean isParseResult() {
    return parseResultPath != null;
  }
  
  public void rewriteDependencyFile() throws IOException {
    if (persistentPath == null)
      throw new IllegalStateException("Result not previously written to file.");
    writeDependencyFile(persistentPath);
  }
  
  private void cacheInMemory(Path dep) {
    synchronized (results) {
      results.put(dep, new SoftReference<Result>(this));
    }
  }
  
  public void writeDependencyFile(Path dep) throws IOException {
    logGeneration(dep);

    ObjectOutputStream oos = null;
    
    try {
      FileCommands.createFile(dep);
      oos = new ObjectOutputStream(new FileOutputStream(dep.getFile()));
      
      oos.writeObject(parseResultPath);
      
      oos.writeObject(sourceFile);
      oos.writeInt(sourceFileHash);
      
      oos.writeObject(dependencies);
      oos.writeObject(circularDependencies);
      oos.writeObject(generatedFileHashes);
      oos.writeObject(dependingFileHashes);
      
      oos.writeObject(availableGeneratedFiles);
      oos.writeObject(deferredSourceFiles);
      
      cacheInMemory(dep);
    } finally {
      if (oos != null)
        oos.close();
    }
    
    setPersistentPath(dep);
  }
  
  @SuppressWarnings("unchecked")
  public static Result readDependencyFile(Path dep) throws IOException {
    Result result = null;
    
    synchronized (results) {
      SoftReference<Result> ref = results.get(dep);
      if (ref != null)
        result = ref.get();
    }
    if (result != null && !result.hasPersistentVersionChanged())
      return result;
    
    result = new Result();
    result.allDependentFiles = null;
    ObjectInputStream ois = null;
    
    try {
      ois = new ObjectInputStream(new FileInputStream(dep.getFile()));
      
      result.parseResultPath = (Path) ois.readObject();
      
      result.sourceFile = (RelativePath) ois.readObject();
      result.sourceFileHash = ois.readInt();
      
      result.dependencies = (Map<Path, Integer>) ois.readObject();
      result.circularDependencies = (Set<Path>) ois.readObject();
      result.generatedFileHashes = (Map<Path, Integer>) ois.readObject();
      result.dependingFileHashes = (Map<Path, Integer>) ois.readObject();

      result.availableGeneratedFiles = (Map<Path, Set<RelativePath>>) ois.readObject();
      result.deferredSourceFiles = (Map<Path, Pair<Path, SourceFileContent.Generated>>) ois.readObject();
      
      result.cacheInMemory(dep);
    } catch (FileNotFoundException e) {
      return null;
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      throw new IOException(e);
    } catch (Exception e) {
      return null;
    } finally {
      if (ois != null)
        ois.close();
    }
    
    result.setPersistentPath(dep);
    return result;
  }
  
  /**
   * Moves this result and the files generated by this result to the given target directory.
   * @return the moved result.
   */
  public Result moveTo(Path targetDir, boolean isParseResult) throws IOException {
    Result res = new Result(isParseResult ? targetDir : null);

    res.dependencies = dependencies;
    res.circularDependencies = circularDependencies;
    res.dependingFileHashes = dependingFileHashes;
    res.collectedErrors = collectedErrors;
    res.parseErrors = parseErrors;
    res.sugaredSyntaxTree = sugaredSyntaxTree;
    res.sourceFile = sourceFile;
    res.sourceFileHash = sourceFileHash;
    res.allDependentFiles = allDependentFiles;
    res.failed = failed;
    res.availableGeneratedFiles = availableGeneratedFiles;
    res.deferredSourceFiles = deferredSourceFiles;
    res.editorServices = editorServices;
    
    res.desugaringsFile = FileCommands.tryMoveFile(parseResultPath, targetDir, desugaringsFile);
    res.parseTableFile = FileCommands.tryMoveFile(parseResultPath, targetDir, parseTableFile);
    res.generationLog = FileCommands.tryMoveFile(parseResultPath, targetDir, generationLog);

    res.generatedFileHashes = new HashMap<Path, Integer>(generatedFileHashes.size());
    for (Entry<Path, Integer> e : generatedFileHashes.entrySet()) {
      Path p = FileCommands.tryMoveFile(parseResultPath, targetDir, e.getKey());
      res.generatedFileHashes.put(p, e.getValue());
    }
    
    RelativePath wasDep = FileCommands.getRelativePath(parseResultPath, persistentPath);
    Path dep = persistentPath;
    if (wasDep != null)
      dep = new RelativePath(targetDir, wasDep.getRelativePath());
    
    res.writeDependencyFile(dep);
    
    return res;
  }
}
