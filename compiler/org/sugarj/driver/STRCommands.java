package org.sugarj.driver;
import static org.sugarj.driver.Environment.sep;
import static org.sugarj.driver.FileCommands.toCygwinPath;
import static org.sugarj.driver.FileCommands.toWindowsPath;
import static org.sugarj.driver.Log.log;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.spoofax.jsglr.InvalidParseTableException;
import org.strategoxt.lang.StrategoExit;
import org.strategoxt.strj.Main;
import org.sugarj.driver.caching.Cache;
import org.sugarj.driver.caching.ModuleKey;

import aterm.ATerm;

/**
 * This class provides methods for various SDF commands. Each
 * SDF command is represented by a separate method of a similar
 * name.
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class STRCommands {
  
  
  public static Cache<ModuleKey, String> strCache = null;
  
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
        "-I", toCygwinPath(Environment.stdLibDir)
    }));
    
    for (String path : Environment.includePath) {
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
  
  
  public static String compile(String str, String main) throws IOException, InvalidParseTableException {
    ModuleKey key = getModuleKeyForAssimilation(str, main);
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
      JavaCommands.javac(java, dir, Environment.strategoxt_jar);
      FileCommands.delete(java);

      return dir + sep + javaFilename;
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
      if (result != null && !FileCommands.exists(result + ".class"))
        result = null;
      
      if (result != null && CommandExecution.CACHE_INFO)
        log.log("Cache location: '" + result + "'");
    } finally {
      log.endTask(result != null);
    }
    
    return result;
  }


  private static ModuleKey getModuleKeyForAssimilation(String str, String main) throws IOException, InvalidParseTableException {
    log.beginTask("Generating", "Generate module key for current assimilation");
    try {
      String f = FileCommands.newTempFile("aterm");
      SDFCommands.parseImplode(
          Environment.strategoTbl,
          str,
          f,
          "StrategoModule",
          false);

      ATerm aterm = ATermCommands.atermFromFile(f);
      FileCommands.delete(f);

      aterm = ATermCommands.extractTerm(aterm, "Module(_, ?)");

      return new ModuleKey(aterm, main);
    } finally {
      log.endTask();
    }
    
  }


  public static void assimilate(String prog, String in, String out) throws IOException {
    File f = new File(prog);
    String main = f.getName();
    String dir = f.getParent();
    
    JavaCommands.java(dir, main, "-i", in, "-o", out);
  }
}
