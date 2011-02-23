package org.sugarj.driver;
import static org.sugarj.driver.Environment.sep;
import static org.sugarj.driver.FileCommands.toCygwinPath;
import static org.sugarj.driver.FileCommands.toWindowsPath;
import static org.sugarj.driver.Log.log;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.lang.StrategoExit;
import org.strategoxt.strj.Main;
import org.sugarj.driver.caching.ModuleKey;
import org.sugarj.driver.caching.ModuleKeyCache;
import org.sugarj.stdlib.StdLib;

/**
 * This class provides methods for various SDF commands. Each
 * SDF command is represented by a separate method of a similar
 * name.
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class STRCommands {
  
  
  public static ModuleKeyCache<String> strCache = null;
  
  /**
   *  Compiles a {@code *.str} file to a single {@code *.java} file. 
   */
  private static void strj(String str, String java, String main) throws IOException {
    
    /*
     * We can include as many paths as we want here, checking the
     * adequacy of the occurring imports is done elsewhere.
     */
    
    
    List<String> cmd = new ArrayList<String>(Arrays.asList(new String[] {
//        "java",
//        "-Xss4M",
//        "-jar", toWindowsPath(Environment.strategoxt_jar),
        "-i", toWindowsPath(str),
        "-o", toWindowsPath(java),
        "-m", main,
        "-I", toCygwinPath(StdLib.stdLibDir.getPath())
    }));
    
    for (String path : Environment.includePath)
      if (new File(path).isDirectory()){
        cmd.add("-I");
        cmd.add(path);
      }
    
    try {
    Main.mainNoExit(cmd.toArray(new String[cmd.size()]));
    }
    catch (StrategoExit e) {
      if (e.getValue() != 0)
        throw new RuntimeException("STRJ failed", e);
    }
        
//    CommandExecution.executeWithPrefix("strategoxt.jar",
        
        
  }
  
  
  public static String compile(String str, String main, Collection<String> dependentFiles, JSGLRI strParser) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    ModuleKey key = getModuleKeyForAssimilation(str, main, dependentFiles, strParser);
    String prog = lookupAssimilationInCache(key);
    
    if (prog == null) {
      prog = generateAssimilator(key, str, main);
      cacheAssimilator(key, prog);
    }
    return prog;
  }
    
  private static String generateAssimilator(ModuleKey key,
                                            String str,
                                            String main) throws IOException {
    log.beginTask("Generating", "Generate the assimilator");
    try {
      String dir = null;
      
      if (Environment.cacheDir != null)
        dir = FileCommands.createDir(Environment.cacheDir, key.hashCode());
      else
        dir = FileCommands.newTempDir();
      
      String javaFilename = FileCommands.fileName(str).replace("-", "_");
      String java = dir + sep + javaFilename + ".java";
      strj(str, java, main);
      JavaCommands.javac(java, dir, Environment.includePath);

      String jarfile = FileCommands.newTempFile("jar");
      JavaCommands.jar(dir, jarfile);

      FileCommands.delete(java);

      return jarfile;
    } finally {
      log.endTask();
    }
  }
    
  private static void cacheAssimilator(ModuleKey key, String prog) {
    if (strCache == null)
      return;
    
    log.beginTask("Caching", "Cache assimilator");
    try {
      strCache.put(key, prog);
      FileCommands.keepFiles.add(new File(prog).getParent());

      if (CommandExecution.CACHE_INFO)
        log.log("Cache Location: " + prog);
    } finally {
      log.endTask();
    }
  }
  
  private static String lookupAssimilationInCache(ModuleKey key) {
    if (strCache == null)
      return null;
    
    String result = null;
    
    log.beginTask("Searching", "Search assimilator in cache");
    try {
      result = strCache.get(key);
      
      // Ignore non-existing files
      if (result != null && !FileCommands.exists(result))
        result = null;
      
      if (result != null && CommandExecution.CACHE_INFO)
        log.log("Cache location: '" + result + "'");
    } finally {
      log.endTask(result != null);
    }
    
    return result;
  }


  private static ModuleKey getModuleKeyForAssimilation(String str, String main, Collection<String> dependentFiles, JSGLRI strParser) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    log.beginTask("Generating", "Generate module key for current assimilation");
    try {
      IStrategoTerm aterm = strParser.parse(new BufferedInputStream(new FileInputStream(str)), str);

      aterm = ATermCommands.getApplicationSubterm(aterm, "Module", 1);

      return new ModuleKey(dependentFiles, aterm);
    } finally {
      log.endTask();
    }
    
  }


  public static void assimilate(String jarfile, String in, String out, HybridInterpreter interp) throws IOException {
    IStrategoTerm result = assimilate(jarfile, ATermCommands.atermFromFile(in), interp);
    ATermCommands.atermToFile(result, out);
  }
  
  public static IStrategoTerm assimilate(String jarfile, IStrategoTerm in, HybridInterpreter interp) throws IOException {
    try {
      HybridInterpreter newInterp = new HybridInterpreter(interp);
      newInterp.loadJars(new File(jarfile).toURI().toURL());
      newInterp.setCurrent(in);
      
      if (newInterp.invoke("internal-main")) {
        IStrategoTerm term = newInterp.current();
        return term;
      }
      else
        throw new RuntimeException("hybrid interpreter failed");
    }
    catch (Exception e) {
      throw new RuntimeException("desugaring failed", e);
    }
  }
}
