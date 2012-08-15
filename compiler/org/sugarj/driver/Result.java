package org.sugarj.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
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
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativePath;
import org.sugarj.driver.path.RelativeSourceLocationPath;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;
import org.sugarj.driver.sourcefilecontent.JavaSourceFileContent;
import org.sugarj.util.AppendableObjectOutputStream;
import org.sugarj.util.Pair;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Result {
  
  /**
   * Canonicalizing mapping for results
   */
  private static HashMap<Path, WeakReference<Result>> results = new HashMap<Path, WeakReference<Result>>();
  
  /**
   * Path and hash of the disk-stored version of this result.
   * If the result was not stored yet, both variables are null.
   */
  private Path persistentPath;
  private Integer persistentHash = null;
  
  private boolean isGenerated;
  private boolean generateFiles;
  
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
  private Path generationLog;
  private String cacheVersion;

  /**
   * deferred source files (*.sugj) -> 
   * to-be-generated files (e.g., *.class) 
   */
  private Map<Path, Set<RelativePath>> availableGeneratedFiles = new HashMap<Path, Set<RelativePath>>();
  
  /**
   * deferred source files (*.sugj) -> 
   * to-be-compiled source files (e.g., *.java + JavaSourceFileContent) 
   */
  private Map<Path, Pair<Path, ISourceFileContent>> deferredSourceFiles = new HashMap<Path, Pair<Path, ISourceFileContent>>();
  
  public final static Result OUTDATED_RESULT = new Result(true, null) {
    @Override
    public boolean isUpToDate(Path file, Environment env) {
      return false;
    }

    @Override
    public boolean isUpToDate(int hash, Environment env) {
      return false;
    }
  };
  
  public Result(boolean generateFiles, String cacheVersion) {
    this.generateFiles = generateFiles;
    this.cacheVersion = cacheVersion;
  }
  
  void addFileDependency(Path file) throws IOException {
    allDependentFiles.add(file);
    dependingFileHashes.put(file, FileCommands.fileHash(file));
  }
  
  void addGeneratedFile(Path file) throws IOException {
    allDependentFiles.add(file);
    generatedFileHashes.put(file, FileCommands.fileHash(file));
  }

  void addCircularDependency(Path depFile) throws IOException {
    circularDependencies.add(depFile);
  }

  void addDependency(Path depFile, Environment env) throws IOException {
    dependencies.put(depFile, FileCommands.fileHash(depFile));
    Result result = readDependencyFile(depFile, env);
    allDependentFiles.addAll(result.getFileDependencies(env));
  }
  
  public boolean hasDependency(Path otherDep, Environment env) throws IOException {
    if (dependencies.containsKey(otherDep))
      return true;
    for (Path dep : dependencies.keySet())
      if (Result.readDependencyFile(dep, env).hasDependency(otherDep, env))
        return true;
    return false;
  }
  
  public Collection<Path> getFileDependencies(Environment env) throws IOException {
    if (allDependentFiles == null) {
      HashSet<Path> deps = new HashSet<Path>(generatedFileHashes.keySet());
      deps.addAll(dependingFileHashes.keySet());
      for (Path depFile : dependencies.keySet())
        deps.addAll(readDependencyFile(depFile, env).getFileDependencies(env));
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
      Result res = readDependencyFile(dep, env);
      
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
  
  void setGenerationLog(Path file) {
    this.generationLog = file;
  }
  
  Path getGenerationLog() {
    return generationLog;
  }
  
  void generateFile(Path file, String content) throws IOException {
    if (generateFiles) {
      FileCommands.writeToFile(file, content);
      generatedFileHashes.put(file, FileCommands.fileHash(file));
      allDependentFiles.add(file);
      logGeneration(file);
    }
  }
  
  void generateFile(Path file, Serializable content) throws IOException {
    if (generateFiles) {
      FileCommands.writeObjectToFile(file, content);
      generatedFileHashes.put(file, FileCommands.fileHash(file));
      allDependentFiles.add(file);
      logGeneration(file);
    }
  }

  private void logGeneration(Object o) throws IOException {
    if (generateFiles && generationLog != null) {
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
  
  void writeToFile(Path file, String content) throws IOException {
    generateFile(file, content);
  }
  
  void appendToFile(Path file, String content) throws IOException {
    if (generateFiles) {
      FileCommands.appendToFile(file, content);
      generatedFileHashes.put(file, FileCommands.fileHash(file));
    }
  }
  
  void addEditorService(IStrategoTerm service) {
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
  
  public boolean isUpToDate(Path inputFile, Environment env) throws IOException {
    return isUpToDate(FileCommands.fileHash(inputFile), env);
  }

  public boolean isUpToDateShallow(int inputHash, Environment env) throws IOException {
    if (!Driver.CACHE_VERSION.equals(cacheVersion))
      return false;
    
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
      
      Result r = Result.readDependencyFile(path, env);
      if (r == null || !r.isUpToDateShallow(r.getSourceFile(), env))
        return false;
      
      dependends.addAll(r.dependencies.keySet());
      checked.add(path);
    }

    return true;
  }
  
  void logError(String error) {
    collectedErrors.add(error);
  }
  
  public List<String> getCollectedErrors() {
    return collectedErrors;
  }
  
  void logParseError(BadTokenException e) {
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

  void compileJava(Path javaOutFile, JavaSourceFileContent javaSource, Path bin, List<Path> path, Set<RelativePath> generatedJavaClasses) throws IOException, ClassNotFoundException {
    Set<RelativePath> generatedClasses = new HashSet<RelativePath>(generatedJavaClasses);
    
    for (Set<RelativePath> files: availableGeneratedFiles.values())
      for (RelativePath file : files)
        if ("class".equals(FileCommands.getExtension(file)))
          generatedClasses.add(file);

    List<Path> javaOutFiles = new ArrayList<Path>();
    javaOutFiles.add(javaOutFile);

    for (Pair<Path, ISourceFileContent> source : deferredSourceFiles.values())
      if (source.b instanceof JavaSourceFileContent) {
        JavaSourceFileContent otherJavaSource = (JavaSourceFileContent) source.b;
        try {
          writeToFile(source.a, otherJavaSource.getCode(generatedClasses));
        } catch (ClassNotFoundException e) {
          throw new ClassNotFoundException("Unresolved import " + e.getMessage() + " in " + source.a);
        }
      }
    
    try {
      writeToFile(javaOutFile, javaSource.getCode(generatedClasses));
    } catch (ClassNotFoundException e) {
      throw new ClassNotFoundException("Unresolved import " + e.getMessage() + " in " + javaOutFile);
    }
    
    compileJava(javaOutFiles, bin, path, generatedClasses);
  }
  
  private void compileJava(List<Path> javaOutFiles, Path bin, List<Path> path, Set<? extends Path> generatedJavaClasses) throws IOException {
    if (generateFiles) {
      JavaCommands.javac(javaOutFiles, bin, path);
      for (Path cl : generatedJavaClasses)
        generatedFileHashes.put(cl, FileCommands.fileHash(cl));
    }
  }
  
  void delegateCompilation(Result delegate, Path compileFile, ISourceFileContent fileContent, Set<RelativePath> generatedFiles) {
    delegate.availableGeneratedFiles.putAll(availableGeneratedFiles);
    if (!generatedFiles.isEmpty())
      delegate.availableGeneratedFiles.put(sourceFile, generatedFiles);
    
    delegate.deferredSourceFiles.putAll(deferredSourceFiles);
    if (!fileContent.isEmpty())
      delegate.deferredSourceFiles.put(sourceFile, Pair.create(compileFile, fileContent));
  }
  
  boolean isDelegateOf(Path compileFile) {
    return deferredSourceFiles.containsKey(compileFile);
  }
  
  void resetDelegation() {
    availableGeneratedFiles.clear();
    deferredSourceFiles.clear();
  }
  
  void registerParseTable(Path tbl) {
    this.parseTableFile = tbl;
  }
  
  public Path getParseTable() {
    return parseTableFile;
  }
  
  public void setDesugaring(Path jarfile) throws IOException {
    desugaringsFile = jarfile;
    editorServices = new HashSet<IStrategoTerm>(ATermCommands.registerSemanticProvider(editorServices, jarfile));
  }
  
  public Path getDesugaringsFile() {
    return desugaringsFile;
  }
  
  public void rewriteDependencyFile() throws IOException {
    if (persistentPath == null)
      throw new IllegalStateException("Result not previously written to file.");
    writeDependencyFile(persistentPath);
  }
  
  public void writeDependencyFile(Path dep) throws IOException {
    if (generateFiles) {
      logGeneration(dep);
  
      ObjectOutputStream oos = null;

      try {
        FileCommands.createFile(dep);
        oos = new ObjectOutputStream(new FileOutputStream(dep.getFile()));
  
        oos.writeBoolean(isGenerated);
        oos.writeBoolean(generateFiles);
        
        oos.writeObject(sourceFile);
        oos.writeInt(sourceFileHash);
        
        oos.writeObject(dependencies);
        oos.writeObject(circularDependencies);
        oos.writeObject(generatedFileHashes);
        oos.writeObject(dependingFileHashes);
        
        oos.writeObject(availableGeneratedFiles);
        oos.writeObject(deferredSourceFiles);
        
        oos.writeObject(cacheVersion);
        
  //      new TermReader(ATermCommands.factory).unparseToFile(sugaredSyntaxTree, oos);
  //      oos.writeBoolean(failed);
  //      oos.writeObject(collectedErrors);
  //      oos.writeObject(parseErrors);
  //      oos.writeObject(generationLog);
  //      oos.writeObject(desugaringsFile);
      } finally {
        if (oos != null)
          oos.close();
      }

      synchronized (results) {
        results.put(dep, new WeakReference<Result>(this));
      }
    }
    
    setPersistentPath(dep);
  }
  
  @SuppressWarnings("unchecked")
  public static Result readDependencyFile(Path dep, Environment env) throws IOException {
    Result result = null;
    
    synchronized (results) {
      WeakReference<Result> ref = results.get(dep);
      if (ref != null)
        result = ref.get();
    }
    if (result != null && !result.hasPersistentVersionChanged())
      return result;
    
    result = new Result(true, null);
    result.allDependentFiles = null;
    ObjectInputStream ois = null;
    
    try {
      ois = new ObjectInputStream(new FileInputStream(dep.getFile()));
      
      result.isGenerated = ois.readBoolean();
      result.generateFiles = ois.readBoolean();
      
      result.sourceFile = (RelativeSourceLocationPath) Path.readPath(ois, env);
      result.sourceFileHash = ois.readInt();
      
      result.dependencies = (Map<Path, Integer>) ois.readObject();
      result.circularDependencies = (Set<Path>) ois.readObject();
      result.generatedFileHashes = (Map<Path, Integer>) ois.readObject();
      result.dependingFileHashes = (Map<Path, Integer>) ois.readObject();

      result.availableGeneratedFiles = (Map<Path, Set<RelativePath>>) ois.readObject();
      result.deferredSourceFiles = (Map<Path, Pair<Path, ISourceFileContent>>) ois.readObject();

      result.cacheVersion = (String) ois.readObject();
      
//      result.sugaredSyntaxTree = new TermReader(ATermCommands.factory).parseFromStream(ois);
//      result.failed = ois.readBoolean();
//      result.collectedErrors = (List<String>) ois.readObject();
//      result.parseErrors = (Set<BadTokenException>) ois.readObject();
//      result.generationLog = Path.readPath(ois, env);
//      result.desugaringsFile = Path.readPath(ois, env);
      
    } catch (FileNotFoundException e) {
      return OUTDATED_RESULT;
    } catch (ClassNotFoundException e) {
      throw new IOException(e);
    } catch (Exception e) {
//      e.printStackTrace();
      return OUTDATED_RESULT;
    } finally {
      if (ois != null)
        ois.close();
    }
    
    result.setPersistentPath(dep);

    synchronized (results) {
      results.put(dep, new WeakReference<Result>(result));
    }

    return result;
  }
  
  private void setPersistentPath(Path dep) throws IOException {
    persistentPath = dep;
    persistentHash = FileCommands.fileHash(dep);
  }
  
  public Path getPersistentPath() {
    return persistentPath;
  }
  
  void setSourceFile(RelativeSourceLocationPath sourceFile) throws IOException {
    setSourceFile(sourceFile, FileCommands.fileHash(sourceFile));
  }
  
  void setSourceFile(RelativeSourceLocationPath sourceFile, int sourceFileHash) {
    this.sourceFile = sourceFile;
    this.sourceFileHash = sourceFileHash;
  }

  public RelativePath getSourceFile() {
    return sourceFile;
  }
  
  public boolean hasFailed() {
    return !getParseErrors().isEmpty() || !getCollectedErrors().isEmpty();
  }

  public boolean isGenerated() {
    return isGenerated;
  }

  public void setGenerated(boolean isGenerated) {
    this.isGenerated = isGenerated;
  }
}
