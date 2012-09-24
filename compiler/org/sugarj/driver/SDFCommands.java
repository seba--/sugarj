package org.sugarj.driver;

import static org.sugarj.common.FileCommands.toCygwinPath;
import static org.sugarj.common.Log.log;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr_layout.client.ITreeBuilder;
import org.spoofax.jsglr_layout.client.InvalidParseTableException;
import org.spoofax.jsglr_layout.client.ParseTable;
import org.spoofax.jsglr_layout.client.SGLR;
import org.spoofax.jsglr_layout.shared.BadTokenException;
import org.spoofax.jsglr_layout.shared.SGLRException;
import org.spoofax.jsglr_layout.shared.TokenExpectedException;
import org.spoofax.terms.Term;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.imp.nativebundle.SDFBundleCommand;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoExit;
import org.strategoxt.permissivegrammars.make_permissive;
import org.strategoxt.stratego_sdf.pp_sdf_string_0_0;
import org.strategoxt.stratego_xtc.stratego_xtc;
import org.strategoxt.strc.pp_stratego_string_0_0;
import org.strategoxt.tools.main_pack_sdf_0_0;
import org.sugarj.LanguageLib;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.CommandExecution;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;
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
  
  private final static Pattern SDF_FILE_PATTERN = Pattern.compile(".*\\.sdf");
  
  private static ExecutorService parseExecutorService = Executors.newSingleThreadExecutor();
  
  /*
   * timeout for parsing files (in milliseconds)
   */
  public static long PARSE_TIMEOUT = 86400000; // 24 hours. strj can take a while. (cai 14.08.12)
  
  static {
    try {
      PARSE_TIMEOUT = Long.parseLong(System.getProperty("org.sugarj.parse_timeout"));
      Log.log.log("set parse timeout to " + PARSE_TIMEOUT);
    } catch (Exception e) {
    }
  }
  
  private static void packSdf(Path sdf, Path def, Context sdfContext, Collection<Path> paths, LanguageLib langLib) throws IOException {
    
    /*
     * We can include as many paths as we want here, checking the
     * adequacy of the occurring imports is done elsewhere.
     */
    
    List<String> cmd = new ArrayList<String>(Arrays.asList(new String[]{
        "-i", sdf.getAbsolutePath(),
        "-o", def.getAbsolutePath()
    }));
    
    for (File grammarFile : langLib.getGrammars()) {
      cmd.add("-Idef");
      cmd.add(grammarFile.getPath());
    }
    
    cmd.add("-I");
    cmd.add(langLib.getLibraryDirectory().getPath());
    cmd.add("-I");
    cmd.add(StdLib.stdLibDir.getPath());
    
   
    for (Path path : paths) 
      if (path.getFile().isDirectory()){
        cmd.add("-I");
        cmd.add(path.getAbsolutePath());
      }    
    
    try {
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
    
    Context context = stratego_xtc.init();
    SDFBundleCommand.getInstance().init();
    SDFBundleCommand.getInstance().invoke(context, "sdf2table", termArgs);
    
    if (!tbl.getFile().exists())
      throw new RuntimeException("execution of sdf2table failed");
  }

  private static void normalizeTable(Path def, String module) throws IOException {
    Path tbl = FileCommands.newTempFile("tbl");
    sdf2Table(def, tbl, module, true);
    FileCommands.deleteTempFiles(tbl);
  }
  
  public static void check(Path sdf, String module, Context sdfContext, Collection<Path> paths, LanguageLib langLib) throws IOException {
    Path def = FileCommands.newTempFile("def");
    packSdf(sdf, def, sdfContext, paths, langLib);
    normalizeTable(def, module);
    FileCommands.deleteTempFiles(def);
  }
  
  /**
   * 
   * @return the filename of the compiled .tbl file.
   * @throws IOException
   * @throws InvalidParseTableException
   * @throws SGLRException 
   * @throws BadTokenException 
   * @throws TokenExpectedException 
   */
  public static Path compile(Path sdf,
                              String module, 
                              Collection<Path> dependentFiles, 
                              SGLR sdfParser, 
                              Context sdfContext, 
                              Context makePermissiveContext, 
                              ModuleKeyCache<Path> sdfCache, 
                              Environment environment,
                              LanguageLib langLib) throws IOException,
                                                          InvalidParseTableException, 
                                                          TokenExpectedException, 
                                                          BadTokenException, 
                                                          SGLRException {
    ModuleKey key = getModuleKeyForGrammar(sdf, module, dependentFiles, sdfParser);
    Path tbl = lookupGrammarInCache(sdfCache, key);
    if (tbl == null) {
      tbl = generateParseTable(key, sdf, module, sdfContext, makePermissiveContext, environment.getIncludePath(), langLib);
      cacheParseTable(sdfCache, key, tbl, environment);
    }
    
    if (tbl != null)
      log.log("use generated table " + tbl);
    
    return tbl;
  }
  
  
  private static void cacheParseTable(ModuleKeyCache<Path> sdfCache, ModuleKey key, Path tbl, Environment environment) throws IOException {
    if (sdfCache == null)
      return;
    
    log.beginTask("Caching", "Cache parse table");
    try {
      Path cacheTbl = environment.createCachePath(tbl.getFile().getName());
      FileCommands.copyFile(tbl, cacheTbl);
      
      Path oldTbl = sdfCache.putGet(key, cacheTbl);
      FileCommands.delete(oldTbl);

      if (CommandExecution.CACHE_INFO)
        log.log("Cache Location: " + cacheTbl);
    } finally {
      log.endTask();
    }
  }

  private static Path lookupGrammarInCache(ModuleKeyCache<Path> sdfCache, ModuleKey key) {
    if (sdfCache == null)
      return null;
    
    Path result = null;
    
    log.beginTask("Searching", "Search parse table in cache");
    try {
      result = sdfCache.get(key);
      
      if (result == null || !result.getFile().exists()) {
        System.out.println("\nDidn't find " + result);
        result = null;
        return null;
      }

      if (CommandExecution.CACHE_INFO)
        log.log("Cache location: '" + result + "'");
      
      return result;
    } finally {
      log.endTask(result != null);
    }
  }
  
  private static ModuleKey getModuleKeyForGrammar(Path sdf, String module, Collection<Path> dependentFiles, SGLR parser) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    log.beginTask("Generating", "Generate module key for current grammar");
    try {
      IStrategoTerm aterm = (IStrategoTerm) parser.parse(FileCommands.readFileAsString(sdf), sdf.getAbsolutePath(), "Sdf2Module");

      IStrategoTerm imports = ATermCommands.getApplicationSubterm(aterm, "module", 1);
      IStrategoTerm body = ATermCommands.getApplicationSubterm(aterm, "module", 2);
      IStrategoTerm term = ATermCommands.makeTuple(imports, body);

      LinkedList<Path> depList = new LinkedList<Path>();
      for (Path file : dependentFiles)
        if (SDF_FILE_PATTERN.matcher(file.getAbsolutePath()).matches() && FileCommands.exists(file))
          depList.add(file);
      
      return new ModuleKey(depList, term);
    } catch (Exception e) {
      throw new SGLRException(parser, "could not parse SDF file " + sdf, e);
    } finally {
      log.endTask();
    }
  }

  private static Path generateParseTable(ModuleKey key,
                                         Path sdf,
                                         String module,
                                         Context sdfContext,
                                         Context makePermissiveContext,
                                         Collection<Path> paths,
                                         LanguageLib langLib)
      throws IOException, InvalidParseTableException {
    log.beginTask("Generating", "Generate the parse table");
    try {
      Path tblFile = null;
      
      tblFile = FileCommands.newTempFile("tbl");

      Path def = FileCommands.newTempFile("def");
      packSdf(sdf, def, sdfContext, paths, langLib);
      sdf2Table(def, tblFile, module);
      FileCommands.deleteTempFiles(def);
      return tblFile;
    } finally {
      log.endTask();
    }
  }
  
  public static String makePermissiveSdf(String source, Context context) throws IOException {
    Path def = FileCommands.newTempFile("def");
    Path permissiveDef = FileCommands.newTempFile("def-permissive");
    
    FileCommands.writeToFile(def, sdfToDef(source));
    makePermissive(def, permissiveDef, context);
    
    String s = defToSdf(FileCommands.readFileAsString(permissiveDef)); // drop "definition\n"
    FileCommands.deleteTempFiles(def);
    FileCommands.deleteTempFiles(permissiveDef);
    return s;
  }
  
  private static void makePermissive(Path def, Path permissiveDef, Context context) throws IOException {
    log.beginExecution("make permissive", "-i", def.getAbsolutePath(), "-o", permissiveDef.getAbsolutePath());
    try {
      make_permissive.mainNoExit(context, "-i", def.getAbsolutePath(), "-o", permissiveDef.getAbsolutePath());
    }
    catch (StrategoExit e) {
      if (e.getValue() != 0) {
        org.strategoxt.imp.runtime.Environment.logWarning("make permissive failed", e);
        FileCommands.copyFile(def, permissiveDef);
      }
    }
    finally {
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
   * @throws BadTokenException 
   * @throws TokenExpectedException 
   */
  private static Pair<SGLR, IStrategoTerm> sglr(ParseTable table, final String source, final String start, boolean useRecovery, ITreeBuilder treeBuilder) throws SGLRException {
    if (treeBuilder instanceof RetractableTreeBuilder && ((RetractableTreeBuilder) treeBuilder).isInitialized())
      ((RetractableTokenizer) treeBuilder.getTokenizer()).setKeywordRecognizer(table.getKeywordRecognizer());
    
    final SGLR parser = new SGLR(treeBuilder, table);
    parser.setUseStructureRecovery(useRecovery);

    Callable<IStrategoTerm> parseCallable = new Callable<IStrategoTerm>() {
      @Override
      public IStrategoTerm call() throws Exception {
        return (IStrategoTerm) parser.parse(source, "toplevel declaration", start);
    }};
    
    Future<IStrategoTerm> res = parseExecutorService.submit(parseCallable);
    try {
      IStrategoTerm term = res.get(PARSE_TIMEOUT, TimeUnit.MILLISECONDS);
      return Pair.create(parser, term);
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
  
  public static Pair<SGLR, IStrategoTerm> parseImplode(ParseTable table, String source, String start, boolean useRecovery, ITreeBuilder treeBuilder) throws IOException, SGLRException {
    return parseImplode(table, null, source, start, useRecovery, treeBuilder);
  }
  
  private static Pair<SGLR, IStrategoTerm> parseImplode(ParseTable table, Path tbl, String source, String start, boolean useRecovery, ITreeBuilder treeBuilder) throws IOException, SGLRException {
    log.beginExecution("parsing");

    Pair<SGLR, IStrategoTerm> result = null;
    try {
      result = sglr(table, source, start, useRecovery, treeBuilder);
    }
    finally {
      if (result != null && result.b != null)
        log.endTask();
      else {
        Path sourceFile = FileCommands.newTempFile("");
        FileCommands.writeToFile(sourceFile, source.toString());
        log.endTask("failed: " + 
            log.commandLineAsString(new String[] {"jsglri", "-p", tbl == null ? "unknown" : tbl.getAbsolutePath(), "-i " + sourceFile + "-s", start}));
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
    IStrategoTerm string = pp_sdf_string_0_0.instance.invoke(interp.getCompiledContext(), term);
    if (string != null)
      return Term.asJavaString(string);
    
    throw new RuntimeException("pretty printing SDF AST failed: " + ATermCommands.atermToFile(term));
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
    
    throw new RuntimeException("pretty printing STR AST failed: " + ATermCommands.atermToFile(term));
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
  public static IStrategoTerm extractSDF(IStrategoTerm term, Context context) throws IOException, InvalidParseTableException {
    IStrategoTerm result = null;
    try {
      result = extract_sdf_0_0.instance.invoke(context, term);
    }
    catch (StrategoExit e) {
      if (e.getValue() != 0 || result == null)
        throw new RuntimeException("Stratego extraction failed", e);
    }
    return result;
  }
}
