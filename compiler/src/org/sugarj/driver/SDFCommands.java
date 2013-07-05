package org.sugarj.driver;

import static org.sugarj.common.FileCommands.toCygwinPath;
import static org.sugarj.common.Log.log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

import org.spoofax.interpreter.library.IOAgent;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.ITreeBuilder;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.client.ParseTable;
import org.spoofax.jsglr.client.SGLR;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.spoofax.terms.Term;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.imp.nativebundle.SDFBundleCommand;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoExit;
import org.strategoxt.permissivegrammars.make_permissive;
import org.strategoxt.stratego_gpp.box2text_string_0_1;
import org.strategoxt.stratego_sdf.pp_sdf_box_0_0;
import org.strategoxt.strc.pp_stratego_string_0_0;
import org.strategoxt.tools.main_pack_sdf_0_0;
import org.sugarj.AbstractBaseLanguage;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.FilteringIOAgent;
import org.sugarj.common.Log;
import org.sugarj.common.path.AbsolutePath;
import org.sugarj.common.path.Path;
import org.sugarj.driver.caching.ModuleKey;
import org.sugarj.driver.caching.ModuleKeyCache;
import org.sugarj.driver.transformations.extraction.extract_sdf_0_0;
import org.sugarj.stdlib.StdLib;
import org.sugarj.util.Pair;

/**
 * This class provides methods for various SDF commands. Each
 * SDF command is represented by a separate method of a similar
 * name.
 * 
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class SDFCommands {
  
  public final static boolean USE_PERMISSIVE_GRAMMARS = false;
  
  private final static Pattern SDF_FILE_PATTERN = Pattern.compile(".*\\.sdf");
  
  private static ExecutorService parseExecutorService = Executors.newSingleThreadExecutor();
  
  /*
   * timeout for parsing files (in milliseconds)
   */
  public static long PARSE_TIMEOUT = 10000;
  static {
    try {
      PARSE_TIMEOUT = Long.parseLong(System.getProperty("org.sugarj.parse_timeout"));
      Log.log.log("set parse timeout to " + PARSE_TIMEOUT, Log.PARSE);
    } catch (Exception e) {
    }
  }
  
  private static IOAgent packSdfIOAgent = new FilteringIOAgent(Log.PARSE | Log.DETAIL, "  including .*");
  private static IOAgent sdf2tableIOAgent = new FilteringIOAgent(Log.PARSE | Log.DETAIL, "Invoking native tool .*");
  private static IOAgent makePermissiveIOAgent = new FilteringIOAgent(Log.PARSE | Log.DETAIL, "[ make_permissive | info ].*");
  
  private static void packSdf(
      Path sdf, 
      Path def, 
      Collection<Path> paths, 
      ModuleKeyCache<Path> sdfCache, 
      Environment environment, 
      AbstractBaseLanguage baseLang) throws IOException {
    /*
     * We can include as many paths as we want here, checking the
     * adequacy of the occurring imports is done elsewhere.
     */
    List<String> cmd = new ArrayList<String>(Arrays.asList(new String[]{
        "-i", FileCommands.nativePath(sdf.getAbsolutePath()),
        "-o", FileCommands.nativePath(def.getAbsolutePath())
    }));
    
    for (Path grammarFile : baseLang.getPackagedGrammars()) {
      Map<String, Integer> map = new HashMap<String, Integer>();
      map.put(grammarFile.getAbsolutePath(), FileCommands.fileHash(grammarFile));
      ModuleKey key = new ModuleKey(map, ""); 
      Path permissiveGrammar = lookupGrammarInCache(sdfCache, key);
      if (permissiveGrammar == null) {
        permissiveGrammar = FileCommands.newTempFile("def");
        makePermissive(new AbsolutePath(grammarFile.getAbsolutePath()), permissiveGrammar);
        permissiveGrammar = cacheParseTable(sdfCache, key, permissiveGrammar, environment);
      }
      
      cmd.add("-Idef");
      cmd.add(FileCommands.nativePath(permissiveGrammar.getAbsolutePath()));
    }
    
    cmd.add("-I");
    cmd.add(FileCommands.nativePath(baseLang.getPluginDirectory().getAbsolutePath()));
    cmd.add("-I");
    cmd.add(FileCommands.nativePath(StdLib.stdLibDir.getAbsolutePath()));
    
    for (Path path : paths) 
      if (path.getFile().isDirectory()) {
        cmd.add("-I");
        cmd.add(FileCommands.nativePath(path.getAbsolutePath()));
      }
    
    // Pack-sdf requires a fresh context each time, because it caches grammars, which leads to a heap overflow.
    Context sdfContext = org.strategoxt.tools.tools.init(); 
    try {
      sdfContext.setIOAgent(packSdfIOAgent);
      sdfContext.invokeStrategyCLI(main_pack_sdf_0_0.instance, "pack-sdf", cmd.toArray(new String[cmd.size()]));
    } catch(StrategoExit e) {
      if (e.getValue() != 0) {
        throw new RuntimeException(e);
      }
    }
    
    if (!def.getFile().exists())
      throw new RuntimeException("execution of pack-sdf failed");
  }
  
  private static void sdf2Table(Path def, Path tbl, String module) throws IOException {
    sdf2Table(def, tbl, module, false);
  }
  
  private static void sdf2Table(Path def, Path tbl, String module, boolean normalize) throws IOException {
    String[] cmd; 
    
    if (!normalize)
      cmd = new String[] {
        "-i", toCygwinPath(def.getAbsolutePath()),
        "-o", toCygwinPath(tbl.getAbsolutePath()),
        "-m", module
      };
    else
      cmd = new String[] {
        "-i", toCygwinPath(def.getAbsolutePath()),
        "-o", toCygwinPath(tbl.getAbsolutePath()),
        "-m", module,
        "-n"
      };
    
    IStrategoTerm termArgs[] = new IStrategoTerm[cmd.length];
    for (int i = 0; i < termArgs.length; i++)
      termArgs[i] = ATermCommands.makeString(cmd[i], null);
    
    Context xtcContext = SugarJContexts.xtcContext();
    try {
      xtcContext.setIOAgent(sdf2tableIOAgent);
      SDFBundleCommand.getInstance().init();
      SDFBundleCommand.getInstance().invoke(xtcContext, "sdf2table", termArgs);
    } finally {
      SugarJContexts.releaseContext(xtcContext);
    }
    
    if (!tbl.getFile().exists())
      throw new RuntimeException("execution of sdf2table failed");
  }

  private static void normalizeTable(Path def, String module) throws IOException {
    Path tbl = FileCommands.newTempFile("tbl");
    sdf2Table(def, tbl, module, true);
    FileCommands.deleteTempFiles(tbl);
  }
  
  public static void check(Path sdf, String module, Collection<Path> paths, ModuleKeyCache<Path> sdfCache, Environment environment, AbstractBaseLanguage baseLang) throws IOException {
    Path def = FileCommands.newTempFile("def");
    packSdf(sdf, def, paths, sdfCache, environment, baseLang);
    normalizeTable(def, module);
    FileCommands.deleteTempFiles(def);
  }
  
  /**
   * 
   * @return the filename of the compiled .tbl file.
   * @throws IOException
   * @throws InvalidParseTableException
   * @throws SGLRException 
   * @throws TokenExpectedException 
   */
  public static Path compile(Path sdf,
                              String module, 
                              Map<Path, Integer> dependentFiles, 
                              SGLR sdfParser, 
                              ModuleKeyCache<Path> sdfCache, 
                              Environment environment,
                              AbstractBaseLanguage baseLang) throws IOException,
                                                          InvalidParseTableException, 
                                                          TokenExpectedException, 
                                                          SGLRException {
    ModuleKey key = getModuleKeyForGrammar(sdf, module, dependentFiles, sdfParser);
    Path tbl = lookupGrammarInCache(sdfCache, key);
    if (tbl == null) {
      tbl = generateParseTable(key, sdf, module, environment.getIncludePath(), sdfCache, environment, baseLang);
      tbl = cacheParseTable(sdfCache, key, tbl, environment);
    }
    
    if (tbl != null)
      log.log("use generated table " + tbl, Log.CACHING);
    
    return tbl;
  }
  
  
  private static Path cacheParseTable(ModuleKeyCache<Path> sdfCache, ModuleKey key, Path tbl, Environment environment) throws IOException {
    if (sdfCache == null)
      return tbl;
    
    log.beginTask("Caching", "Cache parse table", Log.CACHING);
    try {
      Path cacheTbl = environment.createCachePath(tbl.getFile().getName());
      FileCommands.copyFile(tbl, cacheTbl);
      
      Path oldTbl = sdfCache.putGet(key, cacheTbl);
      FileCommands.delete(oldTbl);

      log.log("Cache Location: " + cacheTbl, Log.CACHING);
      return cacheTbl;
    } finally {
      log.endTask();
    }
  }

  private static Path lookupGrammarInCache(ModuleKeyCache<Path> sdfCache, ModuleKey key) {
    if (sdfCache == null)
      return null;
    
    Path result = null;
    
    log.beginTask("Searching", "Search parse table in cache", Log.CACHING);
    try {
      result = sdfCache.get(key);
      
      if (result == null || !result.getFile().exists()) {
        result = null;
        return null;
      }

      log.log("Cache location: '" + result + "'", Log.CACHING);
      
      return result;
    } finally {
      log.endTask(result != null);
    }
  }
  
  private static ModuleKey getModuleKeyForGrammar(Path sdf, String module, Map<Path, Integer> dependentFiles, SGLR parser) throws IOException, InvalidParseTableException, TokenExpectedException, SGLRException {
    log.beginTask("Generating", "Generate module key for current grammar", Log.CACHING);
    try {
      IStrategoTerm aterm = (IStrategoTerm) parser.parse(FileCommands.readFileAsString(sdf), sdf.getAbsolutePath(), "Sdf2Module");

      IStrategoTerm imports = ATermCommands.getApplicationSubterm(aterm, "module", 1);
      IStrategoTerm body = ATermCommands.getApplicationSubterm(aterm, "module", 2);
      IStrategoTerm term = ATermCommands.makeTuple(imports, body);

      return new ModuleKey(dependentFiles, SDF_FILE_PATTERN, term);
    } catch (Exception e) {
      throw new SGLRException(parser, "could not parse SDF file " + sdf, e);
    } finally {
      log.endTask();
    }
  }

  private static Path generateParseTable(ModuleKey key,
                                         Path sdf,
                                         String module,
                                         Collection<Path> paths,
                                         ModuleKeyCache<Path> sdfCache,
                                         Environment environment,
                                         AbstractBaseLanguage baseLang)
      throws IOException, InvalidParseTableException {
    log.beginTask("Generating", "Generate the parse table", Log.PARSE);
    try {
      Path tblFile = null;
      
      tblFile = FileCommands.newTempFile("tbl");

      Path def = FileCommands.newTempFile("def");
      packSdf(sdf, def, paths, sdfCache, environment, baseLang);
      sdf2Table(def, tblFile, module);
      FileCommands.deleteTempFiles(def);
      return tblFile;
    } finally {
      log.endTask();
    }
  }
  
  public static String makePermissiveSdf(String source) throws IOException {
    Path def = FileCommands.newTempFile("def");
    Path permissiveDef = FileCommands.newTempFile("def-permissive");
    
    FileCommands.writeToFile(def, sdfToDef(source));
    makePermissive(def, permissiveDef);
    
    String s = defToSdf(FileCommands.readFileAsString(permissiveDef)); // drop "definition\n"
    FileCommands.deleteTempFiles(def);
    FileCommands.deleteTempFiles(permissiveDef);
    return s;
  }
  
  private static void makePermissive(Path def, Path permissiveDef) throws IOException {
    if (!USE_PERMISSIVE_GRAMMARS) {
      FileCommands.copyFile(def, permissiveDef);
      return;
    } 
      
    log.beginExecution("make permissive", Log.PARSE, "-i", def.getAbsolutePath(), "-o", permissiveDef.getAbsolutePath());
    Context mpContext = SugarJContexts.makePermissiveContext();
    mpContext.setIOAgent(makePermissiveIOAgent);
    try {
      make_permissive.mainNoExit(mpContext, "-i", def.getAbsolutePath(), "-o", permissiveDef.getAbsolutePath());
    }
    catch (StrategoExit e) {
      if (e.getValue() != 0) {
        org.strategoxt.imp.runtime.Environment.logWarning("make permissive failed", e);
        FileCommands.copyFile(def, permissiveDef);
      }
    }
    finally {
      SugarJContexts.releaseContext(mpContext);
      log.endTask();
    }
  }
 
  /**
   * Parses the given source using the given table and implodes the resulting parse tree.
   * 
   * @param tbl
   * @param source
   * @param target
   * @param start
   * @return
   * @throws IOException
   * @throws InvalidParseTableException
   * @throws SGLRException 
   * @throws TokenExpectedException 
   */
  private static Pair<SGLR, Pair<IStrategoTerm, Integer>> sglr(ParseTable table, final String source, final Path sourceFile, final String start, boolean useRecovery, final boolean parseMax, ITreeBuilder treeBuilder) throws SGLRException {
    if (treeBuilder instanceof RetractableTreeBuilder && ((RetractableTreeBuilder) treeBuilder).isInitialized())
      ((RetractableTokenizer) treeBuilder.getTokenizer()).setKeywordRecognizer(table.getKeywordRecognizer());
    
    final SGLR parser = new SGLR(treeBuilder, table);
    parser.setUseStructureRecovery(useRecovery);

    Callable<Pair<IStrategoTerm, Integer>> parseCallable = new Callable<Pair<IStrategoTerm, Integer>>() {
      @Override
      public Pair<IStrategoTerm, Integer> call() throws Exception {
        Object o = parser.parseMax(source, sourceFile.getAbsolutePath(), start);
        if (o instanceof IStrategoTerm)
          return Pair.create((IStrategoTerm) o, source.length());
        else {
          Object[] os = (Object[]) o;
          return Pair.create((IStrategoTerm) os[0], (Integer) os[1]);
        }
    }};
    
    Future<Pair<IStrategoTerm, Integer>> res = parseExecutorService.submit(parseCallable);
    try {
      Pair<IStrategoTerm, Integer> result = res.get(PARSE_TIMEOUT, TimeUnit.MILLISECONDS);
      return Pair.create(parser, result);
    } catch (ExecutionException e) {
      if (e.getCause() instanceof SGLRException)
        throw (SGLRException) e.getCause();
      throw new RuntimeException("unexpected execution error", e);
    } catch (InterruptedException e) {
      throw new SGLRException(parser, "parser was interrupted", e);
    } catch (TimeoutException e) {
      res.cancel(true);
      throw new SGLRException(parser, "parser timed out, timeout at " + PARSE_TIMEOUT + "ms", e);
    }
  }
  
  public static Pair<SGLR, Pair<IStrategoTerm, Integer>> parseImplode(ParseTable table, String source, Path sourceFile, String start, boolean useRecovery, boolean parseMax, ITreeBuilder treeBuilder) throws IOException, SGLRException {
    return parseImplode(table, null, source, sourceFile, start, useRecovery, parseMax, treeBuilder);
  }
  
  private static Pair<SGLR, Pair<IStrategoTerm, Integer>> parseImplode(ParseTable table, Path tbl, String source, Path sourceFile, String start, boolean useRecovery, boolean parseMax, ITreeBuilder treeBuilder) throws IOException, SGLRException {
    log.beginExecution("parsing", Log.PARSE);

    Pair<SGLR, Pair<IStrategoTerm, Integer>> result = null;
    try {
      result = sglr(table, source, sourceFile, start, useRecovery, parseMax, treeBuilder);
    }
    finally {
      if (result != null && result.b != null)
        log.endTask();
      else {
        Path tmpSourceFile = FileCommands.newTempFile("");
        FileCommands.writeToFile(tmpSourceFile, source.toString());
        log.endTask("failed: " + 
            log.commandLineAsString(new String[] {"jsglri", "-p", tbl == null ? "unknown" : tbl.getAbsolutePath(), "-i " + tmpSourceFile + "-s", start}));
      }
    }
    
    return result;
  }
  

  /**
   * Pretty prints the content of the given SDF file. 
   * 
   * @param aterm
   * @return
   * @throws IOException 
   */
  public static String prettyPrintSDF(IStrategoTerm term, HybridInterpreter interp) throws IOException {
    Context ctx = interp.getCompiledContext();
    IStrategoTerm boxTerm = pp_sdf_box_0_0.instance.invoke(ctx, term);
    if (boxTerm != null) {
      IStrategoTerm textTerm = box2text_string_0_1.instance.invoke(ctx, boxTerm, ATermCommands.factory.makeInt(80));
      if (textTerm != null)
        return ATermCommands.getString(textTerm);
    }
    
    throw new ATermCommands.PrettyPrintError(term, "pretty printing SDF AST failed");
  }
  
  /**
   * Pretty prints the content of the given Stratego file. 
   * 
   * @param aterm
   * @return
   * @throws IOException 
   */
  public static String prettyPrintSTR(IStrategoTerm term, HybridInterpreter interp) throws IOException {
    IStrategoTerm string = pp_stratego_string_0_0.instance.invoke(interp.getCompiledContext(), term);
    if (string != null)
      return Term.asJavaString(string);
    
    throw new ATermCommands.PrettyPrintError(term, "pretty printing STR AST failed: " + ATermCommands.atermToFile(term));
  }
  
  private static String sdfToDef(String sdf) {
    return "definition\n" + sdf;
  }
  
  private static String defToSdf(String def) {
    return def.substring(11);
  }
  
  
  /**
   * Filters SDF statements from the given term and
   * compiles assimilation statements to SDF.
   * 
   * @param term a file containing a list of SDF 
   *             and Stratego statements.
   * @param sdf result file
   * @throws InvalidParseTableException 
   */
  public static IStrategoTerm extractSDF(IStrategoTerm term) throws IOException, InvalidParseTableException {
    IStrategoTerm result = null;
    Context extractContext = SugarJContexts.extractionContext();
    try {
      result = extract_sdf_0_0.instance.invoke(extractContext, term);
    }
    catch (StrategoExit e) {
      if (e.getValue() != 0 || result == null)
        throw new RuntimeException("Stratego extraction failed", e);
    } finally {
      SugarJContexts.releaseContext(extractContext);
    }
    return result;
  }
}
