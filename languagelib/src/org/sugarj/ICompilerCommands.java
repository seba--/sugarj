package org.sugarj;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;

public interface ICompilerCommands {
  // TODO: This should provide an interface to the commands in JavaCommands
  // TODO: Rename the methods to something more sensible
  
    public  boolean javac(Path sourceFile, Path dir, Collection<Path> cp) throws IOException;
    
    public  boolean javac(List<Path> sourceFiles, Path dir, Collection<Path> cp) throws IOException;

    public  boolean javac(List<Path> sourceFiles, Path dir, Path... cp) throws IOException;

    /**
     * Runs a compiled java program, linking against  {@code strategoxt.jar},
     * and providing a bunch of parameters. 
     */
    public  void java(Path dir, String main, Collection<String> paths, String... args) throws IOException;
    
    
    public  void jar(Path dir, Path output);
    
    
    //   private Map<Path, Map<Path, Set<RelativePath>>> availableGeneratedFiles = new HashMap<Path, Map<Path, Set<RelativePath>>>();

    
    
    // XXX: Move back to language library
    public void compile(Path javaOutFile, ISourceFileContent javaSource, Path bin, List<Path> path,
  		  Set<RelativePath> generatedJavaClasses,
  		  Map<Path, Set<RelativePath>> availableGeneratedFilesForSourceFile,
  		  Map<Path, Map<Path, ISourceFileContent>> deferredSourceFilesForSourceFile,
  		  Map<Path, Integer> generatedFileHashes,
  		  boolean generateFiles
  		  ) throws IOException, ClassNotFoundException;

    public void compile(List<Path> javaOutFiles, Path bin, List<Path> path, Set<? extends Path> generatedJavaClasses, Map<Path, Integer> generatedFileHashes, boolean generateFiles) throws IOException;


  
  
}
