package org.sugarj.driver;

import java.io.File;
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
  private Map<String, Integer> fileDependencyHashes = new HashMap<String, Integer>();
  private Map<String, Integer> generatedFileHashes = new HashMap<String, Integer>();
  private Set<IStrategoTerm> editorServices = new HashSet<IStrategoTerm>();
  private Set<BadTokenException> collectedErrors = new HashSet<BadTokenException>();
  private IStrategoTerm sugaredSyntaxTree = null;
  private List<String> generatedJavaClasses;
  private String desugaringsFile;

  void addFileDependency(String file) throws IOException {
    fileDependencyHashes.put(file, FileCommands.fileHash(file));
  }
  
  public Collection<String> getFileDependencies() {
    return fileDependencyHashes.keySet();
  }
  
  void generateFile(String file, String content) throws IOException {
    FileCommands.writeToFile(file, content);
    generatedFileHashes.put(file, FileCommands.fileHash(file));
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
  
  boolean isUpToDate() throws IOException {
    if (generatedJavaClasses != null)
      for (String classFile : generatedJavaClasses)
        if (!new File(classFile).exists())
          return false;

    for (Entry<String, Integer> entry : fileDependencyHashes.entrySet())
      if (FileCommands.fileHash(entry.getKey()) != entry.getValue())
        return false;
    
    for (Entry<String, Integer> entry : generatedFileHashes.entrySet())
      if (FileCommands.fileHash(entry.getKey()) != entry.getValue())
        return false;
    
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
    this.generatedJavaClasses = generatedJavaClasses;    
    JavaCommands.javac(javaOutFile, bin, path);
  }
  
  void registerEditorDesugarings(String jarfile) throws IOException {
    desugaringsFile = jarfile;
    editorServices = new HashSet<IStrategoTerm>(ATermCommands.registerSemanticProvider(editorServices, jarfile));
  }
  
  String getDesugaringsFile() {
    return desugaringsFile;
  }
}