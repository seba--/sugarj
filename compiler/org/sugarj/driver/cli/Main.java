package org.sugarj.driver.cli;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.sugarj.LanguageLibFactory;
import org.sugarj.LanguageLibRegistry;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;
import org.sugarj.common.path.AbsolutePath;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.common.path.SourceLocation;
import org.sugarj.driver.Driver;
import org.sugarj.driver.ModuleSystemCommands;
import org.sugarj.driver.PrintProgressMonitor;
import org.sugarj.driver.Result;

/**
 * @author seba
 */
public class Main {

  public static void main(String[] args) throws Throwable {

    Environment environment = getConsoleEnvironment();
    
    Set<RelativeSourceLocationPath> allInputFiles = new HashSet<RelativeSourceLocationPath>();
    
    try {
      String[] sources = DriverCLI.handleOptions(args, environment);
      
      for (String source : sources) {
        RelativeSourceLocationPath sourceLocation = ModuleSystemCommands.locateSourceFile(source, environment.getSourcePath());
        
        if (sourceLocation == null) {
          Log.log.logErr("Could not locate source file \"" + source +"\".", Log.ALWAYS);
          continue;
        }

        allInputFiles.add(sourceLocation);
      }
      
      IProgressMonitor monitor = new PrintProgressMonitor(System.out);
      
      for (final RelativeSourceLocationPath sourceFile : allInputFiles) {
        LanguageLibFactory lang = LanguageLibRegistry.getInstance().getLanguageLib(FileCommands.getExtension(sourceFile));
        if (null == lang)
          throw new RuntimeException("Unknown file extension \"" + FileCommands.getExtension(sourceFile) + "\".");
        
        Result res = Driver.compile(sourceFile, monitor, lang);
    
        if (!DriverCLI.processResultCLI(res, sourceFile, new File(".").getAbsolutePath()))
          throw new RuntimeException("compilation of " + sourceFile + " failed");
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } catch (CLIError e) {
      Log.log.log(e.getMessage(), Log.ALWAYS);
      Log.log.log("", Log.ALWAYS);
      e.showUsage();
    }
    
    System.exit(0);
  }
  
  // without running eclipse platform,
  // set up a default environment reasonable for command-line execution.
  private static Environment getConsoleEnvironment() {
    Environment environment = new Environment();
    environment.setCacheDir(new RelativePath(new AbsolutePath(FileCommands.TMP_DIR), ".sugarjcache"));
    environment.getSourcePath().add(new SourceLocation(new AbsolutePath("."), environment));
    environment.setAtomicImportParsing(true);
    environment.setGenerateJavaFile(true);
    environment.setNoChecking(true);
    
    for (String cp : System.getProperty("java.class.path").split(System.getProperty("path.separator"))) {
      if (cp.length() > 0)
        environment.getIncludePath().add(new AbsolutePath(cp));
    }
    return environment;
  }

}
