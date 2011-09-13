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
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativeSourceLocationPath;
import org.sugarj.util.AppendableObjectOutputStream;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Result {
  
  private final boolean generateFiles;
  
  private Map<Path, Integer> dependencies = new HashMap<Path, Integer>();
  private Map<Path, Integer> generatedFileHashes = new HashMap<Path, Integer>();
  private Set<IStrategoTerm> editorServices = new HashSet<IStrategoTerm>();
  private List<String> collectedErrors = new LinkedList<String>();
  private Set<BadTokenException> parseErrors = new HashSet<BadTokenException>();
  private IStrategoTerm sugaredSyntaxTree = null;
  private Path desugaringsFile;
  private RelativeSourceLocationPath sourceFile;
  private Integer sourceFileHash;
  private Set<Path> allDependentFiles = new HashSet<Path>();
  private boolean failed = false;
  private Path generationLog;

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
  
  void addDependency(Path depFile, Environment env) throws IOException {
    dependencies.put(depFile, FileCommands.fileHash(depFile));
    allDependentFiles.addAll(readDependencyFile(depFile, env).getFileDependencies(env));
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
  
  public boolean isUpToDateShallow(Path inputFile, Environment env) throws IOException {
    return isUpToDateShallow(FileCommands.fileHash(inputFile), env);
  }
  
  public boolean isUpToDate(Path inputFile, Environment env) throws IOException {
    return isUpToDate(FileCommands.fileHash(inputFile), env);
  }

  public boolean isUpToDateShallow(int inputHash, Environment env) throws IOException {
    if (sourceFileHash == null || inputHash != sourceFileHash)
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

  void compileJava(Path javaOutFile, Path bin, List<Path> path, List<Path> generatedJavaClasses) throws IOException {
    if (generateFiles) {
      JavaCommands.javac(javaOutFile, bin, path);
      for (Path cl : generatedJavaClasses)
        generatedFileHashes.put(cl, FileCommands.fileHash(cl));
    }
  }
  
  void registerEditorDesugarings(Path jarfile) throws IOException {
    desugaringsFile = jarfile;
    editorServices = new HashSet<IStrategoTerm>(ATermCommands.registerSemanticProvider(editorServices, jarfile));
  }
  
  public Path getDesugaringsFile() {
    return desugaringsFile;
  }
  
  public void writeDependencyFile(Path dep) throws IOException {
    if (!generateFiles)
      return;
    
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
      e.printStackTrace();
      return OUTDATED_RESULT;
    } finally {
      if (ois != null)
        ois.close();
    }
    
    return result;
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