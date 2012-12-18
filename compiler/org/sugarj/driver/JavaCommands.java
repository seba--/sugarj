package org.sugarj.driver;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jdt.core.compiler.batch.BatchCompiler;
import org.sugarj.driver.path.Path;

/**
 * 
 * Provides methods related to processing Java. Mainly, we provide
 * a method for compiling Java code.
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 *
 */
public class JavaCommands {

  public static boolean javac(Path sourceFile, Path dir, Collection<Path> cp) throws IOException {
    ArrayList<Path> sourceFiles = new ArrayList<Path>();
    sourceFiles.add(sourceFile);
    return javac(sourceFiles, dir, cp);
  }
  
  public static boolean javac(List<Path> sourceFiles, Path dir, Collection<Path> cp) throws IOException {
    return javac(sourceFiles, dir, cp.toArray(new Path[cp.size()]));
  }

  public static boolean javac(List<Path> sourceFiles, Path dir, Path... cp) throws IOException {
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
