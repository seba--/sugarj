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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.shared.BadTokenException;
import org.sugarj.driver.path.Path;
import org.sugarj.driver.path.RelativePath;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Result {
  private Map<Path, Integer> dependencies = new HashMap<Path, Integer>();
  private Map<Path, Integer> generatedFileHashes = new HashMap<Path, Integer>();
  private Set<IStrategoTerm> editorServices = new HashSet<IStrategoTerm>();
  private Set<BadTokenException> collectedErrors = new HashSet<BadTokenException>();
  private IStrategoTerm sugaredSyntaxTree = null;
  private Path desugaringsFile;
  private RelativePath sourceFile;
  private Integer sourceFileHash;
  private Set<Path> allDependentFiles = new HashSet<Path>();
  private boolean failed = false;
  private Path lastParseTable;
  private Path generationLog;

  private final static Result OUTDATED_RESULT = new Result() {
    @Override
    public boolean isUpToDate(Path file) {
      return false;
    }

    @Override
    public boolean isUpToDate(int hash) {
      return false;
    }
  };
  
  void addDependency(Path depFile) throws IOException {
    dependencies.put(depFile, FileCommands.fileHash(depFile));
    allDependentFiles.addAll(readDependencyFile(depFile).getFileDependencies());
  }
  
  public Collection<Path> getFileDependencies() throws IOException {
    if (allDependentFiles == null) {
      allDependentFiles = new HashSet<Path>(generatedFileHashes.keySet());
      for (Path depFile : dependencies.keySet())
        allDependentFiles.addAll(readDependencyFile(depFile).getFileDependencies());
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
    FileCommands.writeToFile(file, content);
    generatedFileHashes.put(file, FileCommands.fileHash(file));
    allDependentFiles.add(file);
    
    logGeneration(file);
  }
  
  private void logGeneration(Object o) throws IOException {
    if (generationLog != null) {
      FileCommands.createFile(generationLog);
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(generationLog.getFile(), true));
      try {
        oos.writeObject(o);
      } finally {
        oos.close();
      }
    }
  }
  
  void appendToFile(Path file, String content) throws IOException {
    FileCommands.appendToFile(file, content);
    generatedFileHashes.put(file, FileCommands.fileHash(file));
  }
  
  void addEditorService(IStrategoTerm service) {
    editorServices.add(service);
  }
  
  public Set<IStrategoTerm> getEditorServices() {
    return editorServices;
  }
  
  public boolean isUpToDate(Path inputFile) throws IOException {
    return isUpToDate(FileCommands.fileHash(inputFile));
  }
  
  public boolean isUpToDate(int inputHash) throws IOException {
    if (inputHash != sourceFileHash)
      return false;
    
    for (Entry<Path, Integer> entry : generatedFileHashes.entrySet())
      if (FileCommands.fileHash(entry.getKey()) != entry.getValue())
        return false;

    for (Entry<Path, Integer> entry : dependencies.entrySet()) {
      if (FileCommands.fileHash(entry.getKey()) != entry.getValue())
        return false;
      
      Result r = Result.readDependencyFile(entry.getKey());
      if (r == null || !r.isUpToDate(r.getSourceFile()))
        return false;
    }

    return true;
  }
  
  void addBadTokenExceptions(Collection<? extends BadTokenException> exceptions) {
    collectedErrors.addAll(exceptions);
  }
  
  public Set<BadTokenException> getCollectedErrors() {
    return collectedErrors;
  }
  
  public void setSugaredSyntaxTree(IStrategoTerm sugaredSyntaxTree) {
    this.sugaredSyntaxTree = sugaredSyntaxTree;
  }
  
  public IStrategoTerm getSugaredSyntaxTree() {
    return sugaredSyntaxTree;
  }

  void compileJava(Path javaOutFile, Path bin, List<String> path, List<Path> generatedJavaClasses) throws IOException {
    JavaCommands.javac(javaOutFile, bin, path);
    for (Path cl : generatedJavaClasses)
      generatedFileHashes.put(cl, FileCommands.fileHash(cl));
  }
  
  void registerEditorDesugarings(Path jarfile) throws IOException {
    desugaringsFile = jarfile;
    editorServices = new HashSet<IStrategoTerm>(ATermCommands.registerSemanticProvider(editorServices, jarfile));
  }
  
  Path getDesugaringsFile() {
    return desugaringsFile;
  }
  
  void writeDependencyFile(Path dep) throws IOException {
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
    } finally {
      if (oos != null)
        oos.close();
    }
  }
  
  static Result readDependencyFile(Path dep) throws IOException {
    Result result = new Result();
    result.allDependentFiles = null;
    ObjectInputStream ois = null;
    
    try {
      ois = new ObjectInputStream(new FileInputStream(dep.getFile()));
      
      result.sourceFile = (RelativePath) ois.readObject();
      result.sourceFileHash = ois.readInt();
      
      int numDependencies = ois.readInt();
      for (int i = 0; i < numDependencies; i++) {
        Path file = (Path) ois.readObject();
        int hash = ois.readInt();
        result.dependencies.put(file, hash);
      }
      
      int numGeneratedFiles = ois.readInt();
      for (int i = 0; i< numGeneratedFiles; i++) {
        Path file = (Path) ois.readObject();
        int hash = ois.readInt();
        result.generatedFileHashes.put(file, hash);
      }
    } catch (FileNotFoundException e) {
      return OUTDATED_RESULT;
    } catch (ClassNotFoundException e) {
      throw new IllegalStateException(e);
    } catch (Exception e) {
      e.printStackTrace();
      return OUTDATED_RESULT;
    } finally {
      if (ois != null)
        ois.close();
    }
    
    return result;
  }
  
  void setSourceFile(RelativePath sourceFile, int sourceFileHash) {
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
  
  public void setLastParseTable(Path parseTable) {
    this.lastParseTable = parseTable;
  }
  
  public Path getLastParseTable() {
    return lastParseTable;
  }
}