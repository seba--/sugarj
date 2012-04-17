package org.sugarj.driver;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.sugarj.IResult;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.driver.sourcefilecontent.JavaSourceFileContent;

public interface ICompilerCommands {
  // TODO: This should provide an interface to the commands in JavaCommands
  
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

    
    
    // from Result
    // XXX: generatedJavaClasses clearly is the wrong name. Think of a better name.
    void compileJava(Path javaOutFile, JavaSourceFileContent javaSource, Path bin, List<Path> path, Set<RelativePath> generatedJavaClasses, IResult result) throws IOException, ClassNotFoundException;

    

  
  
}
