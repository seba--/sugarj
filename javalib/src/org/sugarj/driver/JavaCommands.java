package org.sugarj.driver;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.jdt.core.compiler.batch.BatchCompiler;
import org.sugarj.common.CommandExecution;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;
import org.sugarj.driver.sourcefilecontent.JavaSourceFileContent;
import org.sugarj.ICompilerCommands;

/**
 * 
 * Provides methods related to processing Java. Mainly, we provide
 * a method for compiling Java code.
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 *
 */
public class JavaCommands implements ICompilerCommands {
  // move this to java language library


  public boolean javac(Path sourceFile, Path dir, Collection<Path> cp) throws IOException {
    ArrayList<Path> sourceFiles = new ArrayList<Path>();
    sourceFiles.add(sourceFile);
    return javac(sourceFiles, dir, cp);
  }
  
  public boolean javac(List<Path> sourceFiles, Path dir, Collection<Path> cp) throws IOException {
    return javac(sourceFiles, dir, cp.toArray(new Path[cp.size()]));
  }

  public boolean javac(List<Path> sourceFiles, Path dir, Path... cp) throws IOException {
    StringBuilder cpBuilder = new StringBuilder();
    
    for (int i = 0; i < cp.length; i++) {
      cpBuilder.append(FileCommands.toWindowsPath(cp[i].getAbsolutePath()));
      
      if (i < cp.length - 1)
        cpBuilder.append(Environment.classpathsep);
    }
    
    if(cp.length > 0)
      cpBuilder.append(Environment.classpathsep);
    
    cpBuilder.append(dir);
    

    String[] cmd = new String[7 + sourceFiles.size()];
    cmd[0] = "-cp";
    cmd[1] = cpBuilder.toString();
    cmd[2] = "-d";
    cmd[3] = FileCommands.toWindowsPath(dir.getAbsolutePath());
    cmd[4] = "-source";
    cmd[5] = "1.5";
    cmd[6] = "-nowarn";
    
    for (int i = 0; i < sourceFiles.size(); i++)
      cmd[i + 7] = FileCommands.toWindowsPath(sourceFiles.get(i).getAbsolutePath());
    
    // this is ECJ
    return BatchCompiler.compile(
        cmd,
        new PrintWriter(Log.out),
        new PrintWriter(Log.err),
        null);
  }

  /**
   * Runs a compiled java program, linking against  {@code strategoxt.jar},
   * and providing a bunch of parameters. 
   */
  public void java(Path dir, String main, Collection<String> paths, String... args) throws IOException {
    StringBuilder classpath = new StringBuilder();
    classpath.append(FileCommands.toWindowsPath(dir.getAbsolutePath()));
    classpath.append(Environment.classpathsep);
    
    for (String path : paths)
      classpath.append(path).append(Environment.classpathsep);
    
    String[] cmd = new String[args.length + 5];
    cmd[0] = "java";
    cmd[1] = "-Xss4M";
    cmd[2] = "-cp";
    cmd[3] = classpath.toString();
    cmd[4] = main;
    
    for (int i = 0; i < args.length; i++)
      cmd[i + 5] = args[i];
    
    CommandExecution.executeWithPrefix(main, cmd);
  }
  
  
  public void jar(Path dir, Path output) {
    String[] cmd = {
        "jar",
        "cf",
        output.getAbsolutePath(),
        "-C", dir.getAbsolutePath(),
        "."
        };
    
    CommandExecution.execute(cmd);
  }
  
  
  //   private Map<Path, Map<Path, Set<RelativePath>>> availableGeneratedFiles = new HashMap<Path, Map<Path, Set<RelativePath>>>();

  
  
  // from Result
  public void compile(Path javaOutFile, ISourceFileContent javaSource, Path bin, List<Path> path,
		  Set<RelativePath> generatedJavaClasses,
		  Map<Path, Set<RelativePath>> availableGeneratedFilesForSourceFile,
		  Map<Path, Map<Path, ISourceFileContent>> deferredSourceFilesForSourceFile,
		  Map<Path, Integer> generatedFileHashes,
		  boolean generateFiles
		  ) throws IOException, ClassNotFoundException {
	  
    Map<Path, Set<RelativePath>> generatedFiles = availableGeneratedFilesForSourceFile; //result.getAvailableGeneratedFiles().get(result.getSourceFile());
    Set<RelativePath> generatedClasses = new HashSet<RelativePath>(generatedJavaClasses);
    
    if (generatedFiles != null) {
      for (Set<RelativePath> files: generatedFiles.values())
        for (RelativePath file : files)
          if ("class".equals(FileCommands.getExtension(file)))
            generatedClasses.add(file);
    }

    Map<Path, Map<Path, ISourceFileContent>> sourceFiles = deferredSourceFilesForSourceFile; //result.getDeferredSourceFiles().get(result.getSourceFile());
    List<Path> javaOutFiles = new ArrayList<Path>();
    javaOutFiles.add(javaOutFile);

    if (sourceFiles != null)
      for (Entry<Path, Map<Path, ISourceFileContent>> sources : sourceFiles.entrySet())
        for (Entry<Path, ISourceFileContent> source : sources.getValue().entrySet())
          if (source.getValue() instanceof JavaSourceFileContent) {
            JavaSourceFileContent otherJavaSource = (JavaSourceFileContent) source.getValue();
            try {
              //result.writeToFile(source.getKey(), otherJavaSource.getCode(generatedClasses));
            	writeToFile(generateFiles, generatedFileHashes, source.getKey(), otherJavaSource.getCode(generatedClasses));
            	
            	
            } catch (ClassNotFoundException e) {
              throw new ClassNotFoundException("Unresolved import " + e.getMessage() + " in " + source.getKey());
            }
          }
    
    writeToFile(generateFiles, generatedFileHashes, javaOutFile, javaSource.getCode(generatedClasses));
    
    compile(javaOutFiles, bin, path, generatedClasses, generatedFileHashes, generateFiles);
  }

  // from Result
  public void compile(List<Path> javaOutFiles, Path bin, List<Path> path, Set<? extends Path> generatedJavaClasses, Map<Path, Integer> generatedFileHashes, boolean generateFiles) throws IOException {
    if (generateFiles) {
      javac(javaOutFiles, bin, path);
      for (Path cl : generatedJavaClasses)
        generatedFileHashes.put(cl, FileCommands.fileHash(cl));
    }
  }

  private void writeToFile(boolean generateFiles, Map<Path, Integer> generatedFileHashes, Path file, String content) throws IOException { 
	  if (generateFiles) {
	      FileCommands.writeToFile(file, content);
	      generatedFileHashes.put(file, FileCommands.fileHash(file));
	  }
  }
  
  
  
  
}
