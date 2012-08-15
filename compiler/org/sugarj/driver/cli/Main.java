/**
 * 
 */
package org.sugarj.driver.cli;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.sugarj.common.Environment;
import org.sugarj.common.Log;
import org.sugarj.common.path.AbsolutePath;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.common.path.SourceLocation;
import org.sugarj.driver.Driver;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.PrintProgressMonitor;
import org.sugarj.driver.Result;
import org.sugarj.LanguageLibFactory;

// cai 15.08.12
// imports to resolve language libraries
import org.sugarj.common.FileCommands;
import org.sugarj.JavaLibFactory;
import org.sugarj.HaskellLibFactory;
import org.sugarj.PrologLibFactory;

/**
 * @author seba
 */
public class Main {

  /**
   * @param args
   * @throws IOException
   */
  public static void main(String[] args) throws Throwable {

    Environment environment = newConsoleEnvironment(args);
    
    Set<RelativeSourceLocationPath> allInputFiles = new HashSet<RelativeSourceLocationPath>();
    Set<RelativeSourceLocationPath> pendingInputFiles = new HashSet<RelativeSourceLocationPath>();
    
    try {
      String[] sources = DriverCLI.handleOptions(args, environment);
      
      for (String source : sources) {
        RelativeSourceLocationPath p = ModuleSystemCommands.locateSourceFile(source, environment.getSourcePath());
        if (p == null) {
          Log.log.logErr("Could not locate source file " + source);
          continue;
        }
        
        // cai 15.08.12
        // existence of language extension for file type was verified here
        // removed because we don't want to call LanguageRegistry
        // which depends on eclipse platform. we delegate the task to
        // Main.resolveLanguageLibrary() in the subsequent loop instead.
        // It will not cause any problem (at the moment) because
        // the variable allInputFiles is used only to compile and
        // the variable pendingInputFiles is not used at all lol

        allInputFiles.add(p);
        pendingInputFiles.add(p);
      }
      
      IProgressMonitor monitor = new PrintProgressMonitor(System.out);
      
      for (final RelativeSourceLocationPath sourceFile : allInputFiles) {
        monitor.beginTask("compile " + sourceFile + "\n", IProgressMonitor.UNKNOWN);
        LanguageLibFactory lang = resolveLanguageLib(sourceFile.getFile());
        if(null==lang) continue;
        Result res = Driver.compile(sourceFile, monitor, lang);
        if (!DriverCLI.processResultCLI(res, sourceFile, new File(".").getAbsolutePath()))
          throw new RuntimeException("compilation of " + sourceFile + " failed");
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } catch (CLIError e) {
      Log.log.log(e.getMessage());
      Log.log.log("");
      e.showUsage();
    }

    // kills all remaining subprocesses, if any
    // log.log("The extensible java compiler has done its job and says 'good bye'.");
    System.exit(0);
  }
  
  // cai 14.08.12
  // without running eclipse platform,
  // set up an environment to suit the expectation of subsequent code.
  // based on
  //   org.sugarj.editor.SugarJParseController.makeProjectEnvironment(IJavaProject)
  // and
  //   org.sugarj.editor.SugarJParseController.setDefaultEnvironmentOptions(Environment)
  private static Environment newConsoleEnvironment(String[] args){
    Environment environment = new Environment();
    environment.setRoot(new AbsolutePath("."));
    environment.setBin(environment.getRoot());
    environment.setCacheDir(new RelativePath(environment.getRoot(), ".sugarjcache"));
    environment.getSourcePath().add(new SourceLocation(new AbsolutePath("."), environment));
    environment.setAtomicImportParsing(true);
    environment.setGenerateJavaFile(true);
    environment.setNoChecking(true);
    environment.getIncludePath().add(new AbsolutePath(strategoJarPath()));
    return environment;
  }

  private static LanguageLibFactory resolveLanguageLib(File source){
    String ext = FileCommands.getExtension(source);
    if("sugj".equals(ext))  return JavaLibFactory.getInstance();
    // cai 09.08.12 TODO recognise extension of SugarHaskell and SugarProlog
    Log.log.logErr("No language library found for source-file extension " + ext);
    return null;
  }
  
  // cai 15.08.12
  // compute path to strategoxt.jar
  // VERY-HARD-coded
  private static String strategoJarPath(){
    return new File(new Main().getClass().getResource("Main.class").getFile())
    .getParentFile().getParentFile().getParentFile().getParentFile()
    .getParentFile().getParent() + "/strategoxt.jar";
  }

}
