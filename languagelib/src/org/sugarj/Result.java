package org.sugarj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;
import org.sugarj.util.AppendableObjectOutputStream;


// XXX: How to handle this?
// XXX: Make Interface and implement separately in each language? Or make abstract and implement only language-specific stuff?


/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public abstract class Result {
  
  /**
   * Path and hash of the disk-stored version of this result.
   * If the result was not stored yet, both variables are null.
   */
  private Path persistentPath;
  private Integer persistentHash = null;
  
  private final boolean generateFiles;
  
  private Map<Path, Integer> dependencies = new HashMap<Path, Integer>();
  private Map<Path, Integer> generatedFileHashes = new HashMap<Path, Integer>();
  private Set<IStrategoTerm> editorServices = new HashSet<IStrategoTerm>();
  private List<String> collectedErrors = new LinkedList<String>();
  private Set<BadTokenException> parseErrors = new HashSet<BadTokenException>();
  private IStrategoTerm sugaredSyntaxTree = null;
  private Path parseTableFile;
  private Path desugaringsFile;
  private RelativeSourceLocationPath sourceFile;
  private Integer sourceFileHash;
  private Set<Path> allDependentFiles = new HashSet<Path>();
  private boolean failed = false;
  private Path generationLog;
  
  /**
   * deferred to (*.sugj) -> 
   * deferred source files (*.sugj) -> 
   * to-be-generated files (e.g., *.class) 
   */
  private Map<Path, Map<Path, Set<RelativePath>>> availableGeneratedFiles = new HashMap<Path, Map<Path, Set<RelativePath>>>();
  
  /**
   * deferred to (*.sugj) -> 
   * deferred source files (*.sugj) -> 
   * to-be-compiled source files (e.g., *.java + JavaSourceFileContent) 
   */
  private Map<Path, Map<Path, Map<Path, ISourceFileContent>>> deferredSourceFiles = new HashMap<Path, Map<Path, Map<Path, ISourceFileContent>>>();
  
  private final static Result OUTDATED_RESULT = new Result(true) {
    @Override
    public boolean isUpToDate(Path file, Environment env) {
      return false;
    }

    @Override
    public boolean isUpToDate(int hash, Environment env) {
      return false;
    }
  };
  
  public Result(boolean generateFiles) {
    this.generateFiles = generateFiles;
  }
  
  void addFileDependency(Path file) throws IOException {
    allDependentFiles.add(file);
    generatedFileHashes.put(file, FileCommands.fileHash(file));
  }
  
  void addDependency(Path depFile, Environment env) throws IOException {
    dependencies.put(depFile, FileCommands.fileHash(depFile));
    Result result = readDependencyFile(depFile, env);
    addDependency(result, env);
  }
  
  void addDependency(Result result, Environment env) throws IOException {
    allDependentFiles.addAll(result.getFileDependencies(env));
    
    for (Entry<Path, Map<Path, Set<RelativePath>>> e : result.availableGeneratedFiles.entrySet())
      if (!availableGeneratedFiles.containsKey(e.getKey()))
        availableGeneratedFiles.put(e.getKey(), e.getValue());
      else {
        Map<Path, Set<RelativePath>> deferred = availableGeneratedFiles.get(e.getKey());
        for (Entry<Path, Set<RelativePath>> e2 : e.getValue().entrySet())
          if (deferred.containsKey(e2.getKey()) && !deferred.get(e2.getKey()).equals(e2.getValue()))
            throw new IllegalStateException("Deferred generated files differ.");
          else
            deferred.put(e2.getKey(), e2.getValue());
      }
    
//    Map<Path, Set<RelativePath>> map = availableGeneratedFiles.get(sourceFile);
//    if (map == null) {
//      map = new HashMap<Path, Set<RelativePath>>();
//      availableGeneratedFiles.put(sourceFile, map);
//    }
//    Set<RelativePath> set = map.get(result.sourceFile);
//    if (set == null) {
//      set = new HashSet<RelativePath>();
//      map.put(result.sourceFile, set);
//    }
//    for (Entry<Path, Integer> e : result.generatedFileHashes.entrySet())
//      if (e.getValue() != 0 && e.getKey() instanceof RelativePath)
//        set.add((RelativePath) e.getKey());
    
    
    for (Entry<Path, Map<Path, Map<Path, ISourceFileContent>>> e : result.deferredSourceFiles.entrySet())
      if (!deferredSourceFiles.containsKey(e.getKey()))
        deferredSourceFiles.put(e.getKey(), e.getValue());
      else {
        Map<Path, Map<Path, ISourceFileContent>> deferred = deferredSourceFiles.get(e.getKey());
        for (Entry<Path, Map<Path, ISourceFileContent>> e2 : e.getValue().entrySet())
          if (deferred.containsKey(e2.getKey()) && !deferred.get(e2.getKey()).equals(e2.getValue()))
            throw new IllegalStateException("Deferred source files differ.");
          else
            deferred.put(e2.getKey(), e2.getValue());
      }
  }
  
  public Collection<Path> getFileDependencies(Environment env) throws IOException {
    if (allDependentFiles == null) {
      allDependentFiles = new HashSet<Path>(generatedFileHashes.keySet());
      for (Path depFile : dependencies.keySet())
        allDependentFiles.addAll(readDependencyFile(depFile, env).getFileDependencies(env));
    }
    
    return allDependentFiles;
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
    if (generateFiles) {
      FileCommands.writeToFile(file, content);
      generatedFileHashes.put(file, FileCommands.fileHash(file));
    }
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
  
  private boolean hasPersistentVersionChanged() throws IOException {
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
    if (hasPersistentVersionChanged())
      return false;
    
    if (hasSourceFileChanged(inputHash))
      return false;
    
    if (desugaringsFile != null && !FileCommands.exists(desugaringsFile))
      return false;
    
    for (Entry<Path, Integer> entry : generatedFileHashes.entrySet())
      if (FileCommands.fileHash(entry.getKey()) != entry.getValue())
        return false;

    for (Entry<Path, Integer> entry : dependencies.entrySet()) {
      if (FileCommands.fileHash(entry.getKey()) != entry.getValue())
        return false;
    }

    return true;
  }

  public boolean isUpToDate(int inputHash, Environment env) throws IOException {
    if (!isUpToDateShallow(inputHash, env))
      return false;

    for (Entry<Path, Integer> entry : dependencies.entrySet()) {
      Result r = Result.readDependencyFile(entry.getKey(), env);
      if (r == null || !r.isUpToDate(r.getSourceFile(), env))
        return false;
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

  // XXX: Made this abstract so it can be implemented by each language library
  protected abstract void compileLanguage(Path langOutFile, ISourceFileContent langSource, Path bin, List<Path> path, Set<RelativePath> generatedFiles) throws IOException, ClassNotFoundException;
/*  void compileJava(Path javaOutFile, JavaSourceFileContent javaSource, Path bin, List<Path> path, Set<RelativePath> generatedJavaClasses) throws IOException, ClassNotFoundException {
    Map<Path, Set<RelativePath>> generatedFiles = availableGeneratedFiles.get(sourceFile);
    Set<RelativePath> generatedClasses = new HashSet<RelativePath>(generatedJavaClasses);
    
    if (generatedFiles != null) {
      for (Set<RelativePath> files: generatedFiles.values())
        for (RelativePath file : files)
          if ("class".equals(FileCommands.getExtension(file)))
            generatedClasses.add(file);
    }

    Map<Path, Map<Path, ISourceFileContent>> sourceFiles = deferredSourceFiles.get(sourceFile);
    List<Path> javaOutFiles = new ArrayList<Path>();
    javaOutFiles.add(javaOutFile);

    if (sourceFiles != null)
      for (Entry<Path, Map<Path, ISourceFileContent>> sources : sourceFiles.entrySet())
        for (Entry<Path, ISourceFileContent> source : sources.getValue().entrySet())
          if (source.getValue() instanceof JavaSourceFileContent) {
            JavaSourceFileContent otherJavaSource = (JavaSourceFileContent) source.getValue();
            try {
              writeToFile(source.getKey(), otherJavaSource.getCode(generatedClasses));
            } catch (ClassNotFoundException e) {
              throw new ClassNotFoundException("Unresolved import " + e.getMessage() + " in " + source.getKey());
            }
          }
    
    writeToFile(javaOutFile, javaSource.getCode(generatedClasses));
    
    compileJava(javaOutFiles, bin, path, generatedClasses);
  } */
  
  
  protected abstract void compileLanguage(List<Path> langOutFiles, Path bin, List<Path> path, Set<? extends Path> generatedFiles) throws IOException;
  /*
  private void compileJava(List<Path> javaOutFiles, Path bin, List<Path> path, Set<? extends Path> generatedJavaClasses) throws IOException {
    if (generateFiles) {
      JavaCommands.javac(javaOutFiles, bin, path);
      for (Path cl : generatedJavaClasses)
        generatedFileHashes.put(cl, FileCommands.fileHash(cl));
    }
  }*/
  
  void delegateCompilation(Path delegate, Path compileFile, ISourceFileContent fileContent, Set<RelativePath> generatedFiles) {
    Map<Path, Set<RelativePath>> myGeneratedFiles = availableGeneratedFiles.get(delegate);
    if (myGeneratedFiles == null)
      myGeneratedFiles = new HashMap<Path, Set<RelativePath>>();
    myGeneratedFiles.put(sourceFile, generatedFiles);
    
    if (availableGeneratedFiles.containsKey(sourceFile))
      myGeneratedFiles.putAll(availableGeneratedFiles.get(sourceFile));

    availableGeneratedFiles.put(delegate, myGeneratedFiles);
    
    Map<Path, Map<Path, ISourceFileContent>> sourceFiles = deferredSourceFiles.get(delegate);
    if (sourceFiles == null)
      sourceFiles = new HashMap<Path, Map<Path,ISourceFileContent>>();
    Map<Path, ISourceFileContent> sources = sourceFiles.get(sourceFile);
    if (sources == null)
      sources = new HashMap<Path, ISourceFileContent>();
    sources.put(compileFile, fileContent);
    sourceFiles.put(sourceFile, sources);
    
    if (deferredSourceFiles.containsKey(sourceFile))
      sourceFiles.putAll(deferredSourceFiles.get(sourceFile));
    
    deferredSourceFiles.put(delegate, sourceFiles);
  }
  
  boolean hasDelegatedCompilation(Path compileFile) {
    return deferredSourceFiles.containsKey(sourceFile) && deferredSourceFiles.get(sourceFile).containsKey(compileFile);
  }
  
  void registerParseTable(Path tbl) {
    this.parseTableFile = tbl;
  }
  
  public Path getParseTable() {
    return parseTableFile;
  }
  
  void registerEditorDesugarings(Path jarfile) throws IOException {
    desugaringsFile = jarfile;
    editorServices = new HashSet<IStrategoTerm>(ATermCommands.registerSemanticProvider(editorServices, jarfile));
  }
  
  public Path getDesugaringsFile() {
    return desugaringsFile;
  }
  
  public void writeDependencyFile(Path dep) throws IOException {
    if (generateFiles) {
      logGeneration(dep);
  
      ObjectOutputStream oos = null;
      
      try {
        FileCommands.createFile(dep);
        oos = new ObjectOutputStream(new FileOutputStream(dep.getFile()));
  
        oos.writeObject(sourceFile);
        oos.writeInt(sourceFileHash);
        
        oos.writeInt(dependencies.size());
        for (Entry<Path, Integer> e : dependencies.entrySet()) {
          oos.writeObject(e.getKey());
          oos.writeInt(e.getValue());
        }
        
        oos.writeInt(generatedFileHashes.size());
        for (Entry<Path, Integer> e : generatedFileHashes.entrySet()) {
          oos.writeObject(e.getKey());
          oos.writeInt(e.getValue());
        }
        
        oos.writeObject(availableGeneratedFiles);
        oos.writeObject(deferredSourceFiles);
        
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
    }
    
    setPersistentPath(dep);
  }
  
  @SuppressWarnings("unchecked")
  public static Result readDependencyFile(Path dep, Environment env) throws IOException {
    Result result = new Result(true);
    result.allDependentFiles = null;
    ObjectInputStream ois = null;
    
    try {
      ois = new ObjectInputStream(new FileInputStream(dep.getFile()));
      
      result.sourceFile = (RelativeSourceLocationPath) Path.readPath(ois, env);
      result.sourceFileHash = ois.readInt();
      
      boolean reallocate = result.sourceFile.getBasePath().toString().equals(env.getRoot());
      
      int numDependencies = ois.readInt();
      for (int i = 0; i < numDependencies; i++) {
        Path file = Path.readPath(ois, env, reallocate);
        int hash = ois.readInt();
        result.dependencies.put(file, hash);
      }
      
      int numGeneratedFiles = ois.readInt();
      for (int i = 0; i< numGeneratedFiles; i++) {
        Path file = Path.readPath(ois, env, reallocate);
        int hash = ois.readInt();
        result.generatedFileHashes.put(file, hash);
      }
      
      result.availableGeneratedFiles = (Map<Path, Map<Path, Set<RelativePath>>>) ois.readObject();
      result.deferredSourceFiles = (Map<Path, Map<Path, Map<Path, ISourceFileContent>>>) ois.readObject();
      
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
    return result;
  }
  
  public void setPersistentPath(Path dep) throws IOException {
    persistentPath = dep;
    persistentHash = FileCommands.fileHash(dep);
  }
  
  void setSourceFile(RelativeSourceLocationPath sourceFile, int sourceFileHash) {
    this.sourceFile = sourceFile;
    this.sourceFileHash = sourceFileHash;
  }

  public RelativeSourceLocationPath getSourceFile() {
    return sourceFile;
  }
  
  public boolean hasFailed() {
    return failed;
  }
  
  public void setFailed(boolean hasFailed) {
    this.failed = hasFailed;
  }
}
