package org.sugarj.driver;
import static org.sugarj.driver.Environment.sep;
import static org.sugarj.driver.FileCommands.toWindowsPath;
import static org.sugarj.driver.Log.log;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.client.imploder.IToken;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoExit;
import org.strategoxt.strj.main_strj_0_0;
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
  
  private final static Pattern STR_FILE_PATTERN = Pattern.compile(".*\\.str");

  /**
   *  Compiles a {@code *.str} file to a single {@code *.java} file. 
   */
  private static void strj(String str, String java, String main, Context strjContext) throws IOException {
    
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
        "-I", StdLib.stdLibDir.getPath(),
        "-p", "sugarj",
        "--library",
        "-O", "0"
    }));
    
    for (String path : Environment.includePath)
      if (new File(path).isDirectory()){
        cmd.add("-I");
        cmd.add(path);
      }
    
    try {
      // XXX strj does not create Java file with non-fresh context
      Context c = org.strategoxt.strj.strj.init();
      c.invokeStrategyCLI(main_strj_0_0.instance, "strj", cmd.toArray(new String[cmd.size()]));
    }
    catch (StrategoExit e) {
      if (e.getValue() != 0)
        throw new RuntimeException("STRJ failed", e);
    }
        
//    CommandExecution.executeWithPrefix("strategoxt.jar",
        
        
  }
  
  
  public static String compile(String str, String main, Collection<String> dependentFiles, JSGLRI strParser, Context strjContext) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    ModuleKey key = getModuleKeyForAssimilation(str, main, dependentFiles, strParser);
    String prog = lookupAssimilationInCache(key);
    
    if (prog == null) {
      prog = generateAssimilator(key, str, main, strjContext);
      cacheAssimilator(key, prog);
    }
    return prog;
  }
    
  private static String generateAssimilator(ModuleKey key,
                                            String str,
                                            String main,
                                            Context strjContext) throws IOException {
    log.beginTask("Generating", "Generate the assimilator");
    try {
      String dir = FileCommands.newTempDir();
      FileCommands.createDir(dir + sep + "sugarj");
      String javaFilename = FileCommands.fileName(str).replace("-", "_");
      String java = dir + sep + "sugarj" + sep + javaFilename + ".java";
      strj(str, java, main, strjContext);
      
      if (!JavaCommands.javac(java, dir, Environment.includePath))
        throw new RuntimeException("java compilation failed");
        
      String jarfile = FileCommands.newTempFile("jar");
      JavaCommands.jar(dir, jarfile);

      FileCommands.delete(java);

      return jarfile;
    } finally {
      log.endTask();
    }
  }
    
  private static void cacheAssimilator(ModuleKey key, String prog) throws IOException {
    if (strCache == null || Environment.cacheDir == null)
      return;
    

    log.beginTask("Caching", "Cache assimilator");
    try {
      String cacheProg = Environment.cacheDir + Environment.sep + new File(prog).getName();
      FileCommands.copyFile(prog, cacheProg);
      String oldProg = strCache.putGet(key, cacheProg);
      FileCommands.delete(oldProg);

      if (CommandExecution.CACHE_INFO)
        log.log("Cache Location: " + cacheProg);
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
    
    if (result != null && !new File(result).exists())
      return null;
    
    return result;
  }


  private static ModuleKey getModuleKeyForAssimilation(String str, String main, Collection<String> dependentFiles, JSGLRI strParser) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    log.beginTask("Generating", "Generate module key for current assimilation");
    try {
      IStrategoTerm aterm = strParser.parse(new BufferedInputStream(new FileInputStream(str)), str);

      aterm = ATermCommands.getApplicationSubterm(aterm, "Module", 1);

      LinkedList<String> depList = new LinkedList<String>();
      for (String file : dependentFiles)
        if (STR_FILE_PATTERN.matcher(file).matches())
          depList.add(file);
      
      return new ModuleKey(depList, aterm);
    } catch (Exception e) {
      throw new SGLRException(strParser.getParser(), "could not parse STR file " + str, e);
    } finally {
      log.endTask();
    }
    
  }

  public static IStrategoTerm assimilate(String jarfile, IStrategoTerm in, HybridInterpreter interp) throws IOException {
    return assimilate("internal-main", jarfile, in, interp);
  }
  
  public static IStrategoTerm assimilate(String strategy, String jarfile, IStrategoTerm in, HybridInterpreter interp) throws IOException {
    try {
      HybridInterpreter newInterp = new HybridInterpreter(interp);
      newInterp.loadJars(new File(jarfile).toURI().toURL());
      newInterp.setCurrent(in);
      
      if (newInterp.invoke(strategy)) {
        IStrategoTerm term = newInterp.current();
        
        IToken left = ImploderAttachment.getLeftToken(in);
        IToken right = ImploderAttachment.getRightToken(in);
        String sort = ImploderAttachment.getSort(in);
        
        try {
          term = ATermCommands.makeMutable(term);
          ImploderAttachment.putImploderAttachment(term, false, sort, left, right);
        } catch (Exception e) {
          log.log("origin annotation failed");
        }
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
