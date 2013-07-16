package org.sugarj.common;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jdt.core.compiler.batch.BatchCompiler;
import org.sugarj.common.errors.SourceCodeException;
import org.sugarj.common.errors.SourceLocation;
import org.sugarj.common.path.AbsolutePath;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.util.Pair;

/**
 * 
 * Provides methods related to processing Java. Mainly, we provide
 * a method for compiling Java code.
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 *
 */
public class JavaCommands {
  
  public static List<Path> javac(Path sourceFile, Path dir, Collection<Path> cp) throws IOException, SourceCodeException {
    ArrayList<Path> sourceFiles = new ArrayList<Path>();
    sourceFiles.add(sourceFile);
    return javac(sourceFiles, dir, cp);
  }
  
  public static List<Path> javac(List<Path> sourceFiles, Path dir, Collection<Path> cp) throws IOException, SourceCodeException {
    return javac(sourceFiles, null, dir, cp.toArray(new Path[cp.size()]));
  }

  public static List<Path> javac(List<Path> sourceFiles, Path sourcePath, Path dir, Collection<Path> cp) throws IOException, SourceCodeException {
    return javac(sourceFiles, sourcePath, dir, cp.toArray(new Path[cp.size()]));
  }

  /**
   * @return list of generated class files.
   */
  public static List<Path> javac(List<Path> sourceFiles, Path sourcePath, Path dir, Path... cp) throws IOException, SourceCodeException {
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
    
    ByteArrayOutputStream stdOutBA = new ByteArrayOutputStream();
    ByteArrayOutputStream errOutBA = new ByteArrayOutputStream();
    
    // this is EJC
    boolean ok = BatchCompiler.compile(
        cmd,
        new PrintWriter(stdOutBA),
        new PrintWriter(errOutBA),
        null);

    String stdOut = stdOutBA.toString();
    String errOut = errOutBA.toString();
    
    if (!ok) {
      List<Pair<SourceLocation, String>> errors = parseJavacErrors(errOut);
      throw new SourceCodeException(errors);
    }
    
    List<Path> generatedFiles = new LinkedList<Path>();
    int index = 0;
    while ((index = stdOut.indexOf("[writing", index)) >= 0) {
      index += "[writing".length();
      while (stdOut.charAt(index) == ' ')
        index++;
      int to = stdOut.indexOf(' ', index);
      String generatedPath = stdOut.substring(index, to);
      generatedFiles.add(new RelativePath(dir, generatedPath));
    }
    
    return generatedFiles;
  }

  private final static String ERR_PAT = " ERROR in ";
  private final static String LINE_PAT = "(at line ";
  /**
   * @param stdOut
   */
  private static List<Pair<SourceLocation, String>> parseJavacErrors(String s) {
    List<Pair<SourceLocation, String>> errors = new LinkedList<Pair<SourceLocation,String>>();
    int index = 0;
    while ((index = s.indexOf(" ERROR in ", index)) >= 0) {
      int fileStart = index + ERR_PAT.length();
      int fileEnd = s.indexOf(LINE_PAT, fileStart) - 1;
      String file = s.substring(fileStart, fileEnd);
      int lineStart = fileEnd + LINE_PAT.length() + 1;
      int lineEnd = s.indexOf(")", lineStart);
      int line = Integer.parseInt(s.substring(lineStart, lineEnd));
      int colMarkerStart = s.indexOf("\n", s.indexOf("\n", lineEnd) + 1);
      int colMarkerEnd = s.indexOf("\n", colMarkerStart + 1);
      int colStart = s.indexOf("^", colMarkerStart);
      int colEnd = s.lastIndexOf("^", colMarkerEnd);
      int msgStart = colMarkerEnd + 1;
      int msgEnd = s.indexOf("\n", msgStart);
      String msg = s.substring(msgStart, msgEnd);
      errors.add(Pair.create(new SourceLocation(new AbsolutePath(file), line, line, colStart, colEnd), msg));
      index = msgEnd + 1;
    }
    return errors;
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
