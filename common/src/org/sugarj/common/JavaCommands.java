package org.sugarj.common;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jdt.core.compiler.batch.BatchCompiler;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;

/**
 * 
 * Provides methods related to processing Java. Mainly, we provide
 * a method for compiling Java code.
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 *
 */
public class JavaCommands {

  public static List<Path> javac(Path sourceFile, Path dir, Collection<Path> cp) throws IOException {
    ArrayList<Path> sourceFiles = new ArrayList<Path>();
    sourceFiles.add(sourceFile);
    return javac(sourceFiles, dir, cp);
  }
  
  public static List<Path> javac(List<Path> sourceFiles, Path dir, Collection<Path> cp) throws IOException {
    return javac(sourceFiles, null, dir, cp.toArray(new Path[cp.size()]));
  }

  public static List<Path> javac(List<Path> sourceFiles, Path sourcePath, Path dir, Collection<Path> cp) throws IOException {
    return javac(sourceFiles, sourcePath, dir, cp.toArray(new Path[cp.size()]));
  }

  /**
   * @return list of generated class files.
   */
  public static List<Path> javac(List<Path> sourceFiles, Path sourcePath, Path dir, Path... cp) throws IOException {
    StringBuilder cpBuilder = new StringBuilder();
    
    for (int i = 0; i < cp.length; i++) {
      cpBuilder.append(FileCommands.toWindowsPath(cp[i].getAbsolutePath()));
      
      if (i < cp.length - 1)
        cpBuilder.append(Environment.classpathsep);
    }
    
    if(cp.length > 0)
      cpBuilder.append(Environment.classpathsep);
    
    cpBuilder.append(dir);
    

    int argNum = 8 + (sourcePath == null ? 0 : 2);
    int next = 0;
    String[] cmd = new String[argNum + sourceFiles.size()];
    cmd[next++] = "-cp";
    cmd[next++] = cpBuilder.toString();
    cmd[next++] = "-d";
    cmd[next++] = FileCommands.toWindowsPath(dir.getAbsolutePath());
    cmd[next++] = "-source";
    cmd[next++] = "1.5";
    cmd[next++] = "-nowarn";
    cmd[next++] = "-verbose";
    if (sourcePath != null) {
      cmd[next++] = "-sourcepath";
      cmd[next++] = sourcePath.getAbsolutePath();
    }
      
    
    
    for (int i = 0; i < sourceFiles.size(); i++)
      cmd[i + next] = FileCommands.toWindowsPath(sourceFiles.get(i).getAbsolutePath());
    
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    
    // this is EJC
    boolean ok = BatchCompiler.compile(
        cmd,
        new PrintWriter(baos),
        new PrintWriter(Log.err),
        null);
    
    if (!ok)
      throw new RuntimeException("Java compilation failed");
    
    String output = baos.toString();
    List<Path> generatedFiles = new LinkedList<Path>();
    int index = 0;
    while ((index = output.indexOf("[writing", index)) >= 0) {
      index += "[writing".length();
      while (output.charAt(index) == ' ')
        index++;
      int to = output.indexOf(' ', index);
      String generatedPath = output.substring(index, to);
      generatedFiles.add(new RelativePath(dir, generatedPath));
    }
    
    return generatedFiles;
  }

  /**
   * Runs a compiled java program, linking against  {@code strategoxt.jar},
   * and providing a bunch of parameters. 
   */
  public static void java(Path dir, String main, Collection<String> paths, String... args) throws IOException {
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
    
    new CommandExecution(true).executeWithPrefix(main, cmd);
  }
  
  
  public static void jar(Path dir, Path output) {
    String[] cmd = {
        "jar",
        "cf",
        output.getAbsolutePath(),
        "-C", dir.getAbsolutePath(),
        "."
        };
    
    new CommandExecution(true).execute(cmd);
  }
  
}
