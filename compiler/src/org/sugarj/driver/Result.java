
package org.sugarj.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.shared.BadTokenException;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.util.AppendableObjectOutputStream;
import org.sugarj.util.Pair;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Result {
  /**
   * Caching for results
   */
  private static HashMap<Path, Result> results = new HashMap<Path, Result>();
    
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
  private Map<RelativePath, Integer> dependingFileHashes = new HashMap<RelativePath, Integer>();
  private Set<IStrategoTerm> editorServices = new HashSet<IStrategoTerm>();
  private List<String> collectedErrors = new LinkedList<String>();
  private Set<BadTokenException> parseErrors = new HashSet<BadTokenException>();
  private IStrategoTerm sugaredSyntaxTree = null;
  private IStrategoTerm desugaredSyntaxTree;
  private Path parseTableFile;
  private Path desugaringsFile;
  private RelativePath sourceFile;
  private Integer sourceFileHash;
  private Map<Path, Integer> allDependentFiles = new HashMap<Path, Integer>();
  private boolean failed = false;
  private Path generationLog;
  
  /**
   * deferred source files (*.sugj) -> 
   * to-be-compiled source files (e.g., *.java + generated SourceFileContent) 
   */
  private Map<Path, Pair<Path, String>> deferredSourceFiles = new HashMap<Path, Pair<Path, String>>();
  
  public Result() {
  }
  
  public Result(Path parseResultPath) {
    this.parseResultPath = parseResultPath;
  }
  
  public void addFileDependency(RelativePath file) {
    int hash;
    try {
      hash = FileCommands.fileHash(file);
    } catch (IOException e) {
      e.printStackTrace();
      hash = -1;
    }
    dependingFileHashes.put(file, hash);
    allDependentFiles.put(file, hash);
  }
  
  void addCircularDependency(Path depFile) throws IOException {
    circularDependencies.add(depFile);
  }
  
  public void addDependency(Result result) throws IOException {
    if (result.persistentPath != null && !result.hasPersistentVersionChanged())
      dependencies.put(result.persistentPath, result.persistentHash);
    allDependentFiles.putAll(result.getTransitiveFileDependencies());
  }
  
  public void addDependency(Path depFile) throws IOException {
    dependencies.put(depFile, FileCommands.fileHash(depFile));
    Result result = readDependencyFile(depFile);
    allDependentFiles.putAll(result.getTransitiveFileDependencies());
  }
  
  public boolean hasDependency(Path otherDep, Environment env) throws IOException {
    if (dependencies.containsKey(otherDep))
      return true;
    for (Path dep : dependencies.keySet())
      if (Result.readDependencyFile(dep).hasDependency(otherDep, env))
        return true;
    return false;
  }
  
  public Map<RelativePath, Integer> getFileDependencies() {
    return dependingFileHashes;
  }

  public Map<Path, Integer> getTransitiveFileDependencies() throws IOException {
    if (allDependentFiles == null) {
      Map<Path, Integer> deps = new HashMap<Path, Integer>();
      deps.putAll(generatedFileHashes);
      deps.putAll(dependingFileHashes);
      for (Path depFile : dependencies.keySet())
        deps.putAll(readDependencyFile(depFile).getTransitiveFileDependencies());
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

  public void generateFile(RelativePath file, String content) throws IOException {
    FileCommands.writeToFile(file, content);
    int hash = FileCommands.fileHash(file);
    logFileGeneration(file, hash);
  }

  private void logFileGeneration(Path file, int hash) throws IOException {
    generatedFileHashes.put(file, hash);
    allDependentFiles.put(file, hash);
    if (file instanceof RelativePath)
      dependingFileHashes.put((RelativePath) file, hash);
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

  private boolean isUpToDateShallow(int inputHash, Environment env) throws IOException {
     if (hasPersistentVersionChanged())
      return false;
    
    if (hasSourceFileChanged(inputHash))
      return false;
    
    if (desugaringsFile != null && !FileCommands.exists(desugaringsFile))
      return false;
    
    for (Entry<Path, Integer> entry : generatedFileHashes.entrySet())
      if (FileCommands.fileHash(entry.getKey()) != entry.getValue())
        return false;

    for (Entry<RelativePath, Integer> entry : dependingFileHashes.entrySet())
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
      if (!isParseResult() && r.isParseResult())
        // rebuild if compiled-result dependency to parsed-result dependency
        return false;
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
    this.sugaredSyntaxTree = sugaredSyntaxTree;
  }
  
  public IStrategoTerm getSugaredSyntaxTree() {
    return sugaredSyntaxTree;
  }
  
  public void setDesugaredSyntaxTree(IStrategoTerm desugaredSyntaxTree) {
    this.desugaredSyntaxTree = desugaredSyntaxTree;
  }
  
  public IStrategoTerm getDesugaredSyntaxTree() {
    return desugaredSyntaxTree;
  }
  
  void delegateCompilation(Result delegate, Path compileFile, String source, boolean hasNonBaseDec) {
    delegate.deferredSourceFiles.putAll(deferredSourceFiles);
    if (!source.isEmpty() || hasNonBaseDec)
      delegate.deferredSourceFiles.put(sourceFile, Pair.create(compileFile, source));
  }
  
  boolean isDelegateOf(Path compileFile) {
    return deferredSourceFiles.containsKey(compileFile);
  }
  
  void resetDelegation() {
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

  public Map<Path, Pair<Path, String>> getDeferredSourceFiles() {
    return deferredSourceFiles;
  }

  public Map<Path, Integer> getGeneratedFileHashes() {
    return generatedFileHashes;
  }

  public boolean isParseResult() {
    return parseResultPath != null;
  }
  
  public Path getParseResultPath() {
    return parseResultPath;
  }
  
  public void rewriteDependencyFile() throws IOException {
    if (persistentPath == null)
      throw new IllegalStateException("Result not previously written to file.");
    writeDependencyFile(persistentPath);
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
      
      oos.writeObject(deferredSourceFiles);
      
      cacheInMemory(dep, this);
    } finally {
      if (oos != null)
        oos.close();
    }
    
    setPersistentPath(dep);
  }
  
  @SuppressWarnings("unchecked")
  public static Result readDependencyFile(Path dep) throws IOException {
    Result result = getCachedResult(dep);
    if (result != null)
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
      result.dependingFileHashes = (Map<RelativePath, Integer>) ois.readObject();

      result.deferredSourceFiles = (Map<Path, Pair<Path, String>>) ois.readObject();
      
      cacheInMemory(dep, result);
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

    res.dependencies = new HashMap<Path, Integer>();
    for (Path dep : dependencies.keySet()) {
      Result other = readDependencyFile(dep);
      if (other.isParseResult())
        other.moveTo(targetDir, isParseResult);
      res.addDependency(other);
    }
    
    res.circularDependencies = circularDependencies;
    res.dependingFileHashes = dependingFileHashes;
    res.collectedErrors = collectedErrors;
    res.parseErrors = parseErrors;
    res.sugaredSyntaxTree = sugaredSyntaxTree;
    res.sourceFile = sourceFile;
    res.sourceFileHash = sourceFileHash;
    res.allDependentFiles = allDependentFiles;
    res.failed = failed;
    res.deferredSourceFiles = deferredSourceFiles;
    res.editorServices = editorServices;
    
    res.desugaringsFile = FileCommands.tryCopyFile(parseResultPath, targetDir, desugaringsFile);
    res.parseTableFile = FileCommands.tryCopyFile(parseResultPath, targetDir, parseTableFile);
    res.generationLog = FileCommands.tryCopyFile(parseResultPath, targetDir, generationLog);

    res.generatedFileHashes = new HashMap<Path, Integer>(generatedFileHashes.size());
    for (Entry<Path, Integer> e : generatedFileHashes.entrySet()) {
      Path p = FileCommands.tryCopyFile(parseResultPath, targetDir, e.getKey());
      res.logFileGeneration(p, FileCommands.fileHash(p));
    }
    
    RelativePath wasDep = FileCommands.getRelativePath(parseResultPath, persistentPath);
    Path dep = persistentPath;
    if (wasDep != null)
      dep = new RelativePath(targetDir, wasDep.getRelativePath());
    
    res.writeDependencyFile(dep);
    
    return res;
  }
  
  public static void cacheInMemory(Path dep, Result result) {
    synchronized (results) {
      results.put(dep, result);
//      results.put(dep, new SoftReference<Result>(result));
    }
  }
  
  public static Result getCachedResult(Path dep) throws IOException {
    Result result = null;
    synchronized (results) {
      result = results.get(dep);
//      SoftReference<Result> ref = results.get(dep);
//      if (ref != null)
//        result = ref.get();
    }
    if (result != null && !result.hasPersistentVersionChanged())
      return result;
    return null;
  }

}
