package org.sugarj.driver;

import static org.sugarj.common.FileCommands.toWindowsPath;
import static org.sugarj.common.Log.log;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.IOAgent;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr_layout.client.InvalidParseTableException;
import org.spoofax.jsglr_layout.client.SGLR;
import org.spoofax.jsglr_layout.shared.BadTokenException;
import org.spoofax.jsglr_layout.shared.SGLRException;
import org.spoofax.jsglr_layout.shared.TokenExpectedException;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoException;
import org.strategoxt.lang.StrategoExit;
import org.strategoxt.strj.main_strj_0_0;
import org.sugarj.LanguageLib;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.FilteringIOAgent;
import org.sugarj.common.Log;
import org.sugarj.common.path.Path;
import org.sugarj.driver.caching.ModuleKey;
import org.sugarj.driver.caching.ModuleKeyCache;
import org.sugarj.driver.transformations.extraction.extract_str_0_0;
import org.sugarj.stdlib.StdLib;

/**
 * This class provides methods for various SDF commands. Each
 * SDF command is represented by a separate method of a similar
 * name.
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class STRCommands {

  private static IOAgent strjIOAgent = new FilteringIOAgent(Log.CORE | Log.TRANSFORM, 
                                                            Pattern.quote("[ strj | info ]") + ".*", 
                                                            Pattern.quote("[ strj | error ] Compilation failed") + ".*");
  
  private final static Pattern STR_FILE_PATTERN = Pattern.compile(".*\\.str");
  
  private final static Path FAILED_COMPILATION_PATH;
  static {
    try {
      FAILED_COMPILATION_PATH = FileCommands.newTempFile("ctree");
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

  /**
   *  Compiles a {@code *.str} file to a single {@code *.java} file. 
   */
  private static void strj(boolean normalize, Path str, Path out, String main, Collection<Path> paths, LanguageLib langLib) throws IOException {
    
    /*
     * We can include as many paths as we want here, checking the
     * adequacy of the occurring imports is done elsewhere.
     */
    List<String> cmd = new ArrayList<String>(Arrays.asList(new String[] {
        "-i", toWindowsPath(str.getAbsolutePath()),
        "-o", toWindowsPath(out.getAbsolutePath()),
        "-m", main,
        "-p", "sugarj",
        "--library",
        "-O", "0",
    }));
    
    if (normalize)
      cmd.add("-F");
    
    cmd.add("-I");
    cmd.add(StdLib.stdLibDir.getPath());
    cmd.add("-I");
    cmd.add(langLib.getLibraryDirectory().getPath());

    
    for (Path path : paths)
      if (path.getFile().isDirectory()){
        cmd.add("-I");
        cmd.add(path.getAbsolutePath());
      }
    
    
    final ByteArrayOutputStream log = new ByteArrayOutputStream();

    try {
      Context ctx = SugarJContexts.strjContext();
      
      ctx.setIOAgent(strjIOAgent);
      
      ctx.invokeStrategyCLI(main_strj_0_0.instance, "strj", cmd.toArray(new String[cmd.size()]));
    }
    catch (StrategoExit e) {
      if (e.getValue() != 0)
        throw new StrategoException("STRJ failed", e);
    } finally {
      if (log.size() > 0 && !log.toString().contains("Abstract syntax in"))
        throw new StrategoException(log.toString());

    }
  }
  
  
  public static Path compile(Path str,
                              String main,
                              Collection<Path> dependentFiles,
                              SGLR strParser,
                              ModuleKeyCache<Path> strCache,
                              Environment environment,
                              LanguageLib langLib) throws IOException,
                                                          InvalidParseTableException,
                                                          TokenExpectedException,
                                                          BadTokenException,
                                                          SGLRException {
    ModuleKey key = getModuleKeyForAssimilation(str, main, dependentFiles, strParser);
    Path prog = lookupAssimilationInCache(strCache, key);
    StrategoException error = null;
    
    if (prog == null) {
      try {
        prog = generateAssimilator(key, str, main, environment.getIncludePath(), langLib);
      } catch (StrategoException e) {
        prog = FAILED_COMPILATION_PATH;
        error = e;
      } finally {
        if (prog != null && FileCommands.exists(prog) && !FileCommands.isEmptyFile(prog))
          cacheAssimilator(strCache, key, prog, environment);
      }

      if (error != null)
        throw error;
    }
        
    return prog;
  }
    
  private static Path generateAssimilator(ModuleKey key,
                                          Path str,
                                          String main,
                                          Collection<Path> paths,
                                          LanguageLib langLib) throws IOException {
    boolean success = false;
    log.beginTask("Generating", "Generate the assimilator", Log.TRANSFORM);
    try {
      Path prog = FileCommands.newTempFile("ctree");
      log.log("calling STRJ", Log.TRANSFORM);
      strj(true, str, prog, main, paths, langLib);
      success = FileCommands.exists(prog);
      return prog;
    } finally {
      log.endTask(success);
    }
  }
    
  private static void cacheAssimilator(ModuleKeyCache<Path> strCache, ModuleKey key, Path prog, Environment environment) throws IOException {
    if (strCache == null)
      return;
    

    log.beginTask("Caching", "Cache assimilator", Log.CACHING);
    try {
      Path cacheProg = environment.createCachePath(prog.getFile().getName());
      if (FileCommands.exists(prog))
        FileCommands.copyFile(prog, cacheProg);
      else
        cacheProg = prog;
      
      Path oldProg = strCache.putGet(key, cacheProg);
      FileCommands.delete(oldProg);

      log.log("Cache Location: " + cacheProg, Log.CACHING);
    } finally {
      log.endTask();
    }
  }
  
  private static Path lookupAssimilationInCache(ModuleKeyCache<Path> strCache, ModuleKey key) {
    if (strCache == null)
      return null;
    
    Path result = null;
    
    log.beginTask("Searching", "Search assimilator in cache", Log.CACHING);
    try {
      result = strCache.get(key);
      
      if (result == null || !result.getFile().exists())
        return null;

      log.log("Cache location: '" + result + "'", Log.CACHING);
      
      return result;
    } finally {
      log.endTask(result != null);
    }
  }


  private static ModuleKey getModuleKeyForAssimilation(Path str, String main, Collection<Path> dependentFiles, SGLR strParser) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    log.beginTask("Generating", "Generate module key for current assimilation", Log.CACHING);
    try {
      IStrategoTerm aterm = (IStrategoTerm) strParser.parse(FileCommands.readFileAsString(str), str.getAbsolutePath(), "StrategoModule");

      aterm = ATermCommands.getApplicationSubterm(aterm, "Module", 1);

      LinkedList<Path> depList = new LinkedList<Path>();
      for (Path file : dependentFiles)
        if (STR_FILE_PATTERN.matcher(file.getAbsolutePath()).matches() && FileCommands.exists(file))
          depList.add(file);
      
      return new ModuleKey(depList, aterm);
    } catch (Exception e) {
      throw new SGLRException(strParser, "could not parse STR file " + str, e);
    } finally {
      log.endTask();
    }
    
  }

  public static IStrategoTerm assimilate(Path ctree, IStrategoTerm in, HybridInterpreter interp) throws IOException {
    return assimilate("internal-main", ctree, in, interp);
  }
  
  public static IStrategoTerm assimilate(String strategy, Path ctree, IStrategoTerm in, HybridInterpreter interp) throws IOException {
    try {
      interp.load(ctree.getAbsolutePath());
      interp.setCurrent(in);
      
      if (interp.invoke(strategy)) {
        IStrategoTerm term = interp.current();
                
//        IToken left = ImploderAttachment.getLeftToken(in);
//        IToken right = ImploderAttachment.getRightToken(in);
//        String sort = ImploderAttachment.getSort(in);
//        
//        try {
//          term = ATermCommands.makeMutable(term);
//          ImploderAttachment.putImploderAttachment(term, false, sort, left, right);
//        } catch (Exception e) {
//          log.log("origin annotation failed");
//        }
        return term;
      }
      else
        throw new RuntimeException("hybrid interpreter failed");
    }
    catch (InterpreterException e) {
      throw new StrategoException("desugaring failed: " + e.getCause().getMessage(), e);
    }
    catch (Exception e) {
      throw new StrategoException("desugaring failed", e);
    }
  }
  
  /**
   * Filters Stratego statements from the given term
   * and compiles assimilation statements to Stratego.
   * 
   * @param term a file containing a list of SDF 
   *             and Stratego statements.
   * @param str result file
   * @throws InvalidParseTableException 
   */
  public static IStrategoTerm extractSTR(IStrategoTerm term) throws IOException, InvalidParseTableException {
    IStrategoTerm result = null;
    Context extractionContext = SugarJContexts.extractionContext();
    try {
      result = extract_str_0_0.instance.invoke(extractionContext, term);
    }
    catch (StrategoExit e) {
      if (e.getValue() != 0 || result == null)
        throw new RuntimeException("Stratego extraction failed", e);
    } finally {
      SugarJContexts.releaseContext(extractionContext);
    }
    return result;
  }
  
}
