package org.sugarj.driver;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.shared.BadTokenException;

public class Result {
  // private Map<String, Integer> fileDependencyHashes = new HashMap<String, Integer>();
  private Map<String, Integer> dependencies = new HashMap<String, Integer>();
  private Map<String, Integer> generatedFileHashes = new HashMap<String, Integer>();
  private Set<IStrategoTerm> editorServices = new HashSet<IStrategoTerm>();
  private Set<BadTokenException> collectedErrors = new HashSet<BadTokenException>();
  private IStrategoTerm sugaredSyntaxTree = null;
  private String desugaringsFile;
  private String sourceFile;
  private Integer sourceFileHash;
  private Set<String> allDependentFiles = new HashSet<String>();
  private boolean failed = false;
  private String lastParseTable;

  private final static Result OUTDATED_RESULT = new Result() {
    @Override
    public boolean isUpToDate(String file) {
      return false;
    }

    @Override
    public boolean isUpToDate(int hash) {
      return false;
    }
  };
  
  void addDependency(String depFile) throws IOException {
    dependencies.put(depFile, FileCommands.fileHash(depFile));
    allDependentFiles.addAll(readDependencyFile(depFile).getFileDependencies());
  }
  
  public Collection<String> getFileDependencies() throws IOException {
    if (allDependentFiles == null) {
      allDependentFiles = new HashSet<String>(generatedFileHashes.keySet());
      for (String depFile : dependencies.keySet())
        allDependentFiles.addAll(readDependencyFile(depFile).getFileDependencies());
    }
    
    return allDependentFiles;
  }
  
  void generateFile(String file, String content) throws IOException {
    FileCommands.writeToFile(file, content);
    generatedFileHashes.put(file, FileCommands.fileHash(file));
    allDependentFiles.add(file);
  }
  
  void appendToFile(String file, String content) throws IOException {
    FileCommands.appendToFile(file, content);
    generatedFileHashes.put(file, FileCommands.fileHash(file));
  }
  
  void addEditorService(IStrategoTerm service) {
    editorServices.add(service);
  }
  
  public Set<IStrategoTerm> getEditorServices() {
    return editorServices;
  }
  
  public boolean isUpToDate(String inputFile) throws IOException {
    return isUpToDate(FileCommands.fileHash(inputFile));
  }
  
  public boolean isUpToDate(int inputHash) throws IOException {
    if (inputHash != sourceFileHash)
      return false;
    
    for (Entry<String, Integer> entry : generatedFileHashes.entrySet())
      if (FileCommands.fileHash(entry.getKey()) != entry.getValue())
        return false;

    for (Entry<String, Integer> entry : dependencies.entrySet()) {
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
  
  void setSugaredSyntaxTree(IStrategoTerm sugaredSyntaxTree) {
    this.sugaredSyntaxTree = sugaredSyntaxTree;
  }
  
  public IStrategoTerm getSugaredSyntaxTree() {
    return sugaredSyntaxTree;
  }

  void compileJava(String javaOutFile, String bin, List<String> path, List<String> generatedJavaClasses) throws IOException {
    JavaCommands.javac(javaOutFile, bin, path);
    for (String cl : generatedJavaClasses)
      generatedFileHashes.put(cl, FileCommands.fileHash(cl));
  }
  
  void registerEditorDesugarings(String jarfile) throws IOException {
    desugaringsFile = jarfile;
    editorServices = new HashSet<IStrategoTerm>(ATermCommands.registerSemanticProvider(editorServices, jarfile));
  }
  
  String getDesugaringsFile() {
    return desugaringsFile;
  }
  
  void writeDependencyFile(String dep) throws IOException {
    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dep));
    
    try {
      byte[] newline = "\n".getBytes();
      
      out.write(sourceFile.getBytes());
      out.write(newline);
      out.write(Integer.toString(sourceFileHash).getBytes());
      out.write(newline);
      
      for (Entry<String, Integer> entry : dependencies.entrySet()) {
        out.write(entry.getKey().getBytes());
        out.write(newline);
        out.write(Integer.toString(entry.getValue()).getBytes());
        out.write(newline);
      }
      
      out.write(newline);
      
      for (Entry<String, Integer> e : generatedFileHashes.entrySet()) {
        out.write(e.getKey().getBytes());
        out.write(newline);
        out.write(e.getValue().toString().getBytes());
        out.write(newline);
      }
    } finally {
      out.close();
    }
  }
  
  static Result readDependencyFile(String dep) throws IOException {
    Result result = new Result();
    result.allDependentFiles = null;
    
    try {
      BufferedReader in = new BufferedReader(new FileReader(dep));
      
      result.sourceFile = in.readLine();
      result.sourceFileHash = Integer.parseInt(in.readLine());
      
      String line;
      while ((line = in.readLine()) != null && !line.isEmpty()) {
        String file = line;
        Integer hash = Integer.parseInt(in.readLine());
        result.dependencies.put(file, hash);
      }
      
      while ((line = in.readLine()) != null && !line.isEmpty()) {
        String file = line;
        Integer hash = Integer.parseInt(in.readLine());
        result.generatedFileHashes.put(file, hash);
      }
    } catch (FileNotFoundException e) {
      return OUTDATED_RESULT;
    } catch (Exception e) {
      e.printStackTrace();
      return OUTDATED_RESULT;
    }
    
    return result;
  }
  
  void setSourceFile(String sourceFile, int sourceFileHash) {
    this.sourceFile = sourceFile;
    this.sourceFileHash = sourceFileHash;
  }

  public String getSourceFile() {
    return sourceFile;
  }
  
  public boolean hasFailed() {
    return failed;
  }
  
  public void setFailed(boolean hasFailed) {
    this.failed = hasFailed;
  }
  
  public void setLastParseTable(String parseTable) {
    this.lastParseTable = parseTable;
  }
  
  public String getLastParseTable() {
    return lastParseTable;
  }
}