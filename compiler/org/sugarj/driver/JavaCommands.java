package org.sugarj.driver;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

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

  public static boolean javac(Path java, Path dir, Collection<String> cp) throws IOException {
    return javac(java, dir, cp.toArray(new String[] {}));
  }

  public static boolean javac(Path java, Path dir, String... cp) throws IOException {
    StringBuilder cpBuilder = new StringBuilder();
    
    for (int i = 0; i < cp.length; i++) {
      cpBuilder.append(FileCommands.toWindowsPath(cp[i]));
      
      if (i < cp.length - 1)
        cpBuilder.append(Environment.classpathsep);
    }
    
    if(cp.length > 0)
      cpBuilder.append(Environment.classpathsep);
    
    cpBuilder.append(dir);
    
    String[] cmd = new String[] {
        "-cp", cpBuilder.toString(),
        "-d", FileCommands.toWindowsPath(dir.getAbsolutePath()),
        "-source", "1.5",
        "-nowarn",
        FileCommands.toWindowsPath(java.getAbsolutePath())
    };
    
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
    
    CommandExecution.executeWithPrefix(main, cmd);
  }
  
  
  public static void jar(Path dir, Path output) {
    String[] cmd = {
        "jar",
        "cf",
        output.getAbsolutePath(),
        "-C", dir.getAbsolutePath(),
        "."
        };
    
    CommandExecution.execute(cmd);
  }
  
}
