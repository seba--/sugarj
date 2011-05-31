package org.sugarj.driver;
import static org.sugarj.driver.FileCommands.toCygwinPath;
import static org.sugarj.driver.Log.log;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.ITreeBuilder;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.client.ParseTable;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.spoofax.terms.Term;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.imp.nativebundle.SDFBundleCommand;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.java_front.pp_java_string_0_0;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoExit;
import org.strategoxt.permissivegrammars.make_permissive;
import org.strategoxt.stratego_sdf.pp_sdf_string_0_0;
import org.strategoxt.stratego_xtc.stratego_xtc;
import org.strategoxt.strc.pp_stratego_string_0_0;
import org.strategoxt.tools.main_pack_sdf_0_0;
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
public class SDFCommands {
  
  private final static Pattern SDF_FILE_PATTERN = Pattern.compile(".*\\.sdf");
  
  /*
   * timeout for parsing files (in milliseconds)
   */
  private static long PARSE_TIMEOUT = 30000;
  
  static {
    try {
      PARSE_TIMEOUT = Long.parseLong(System.getProperty("org.sugarj.parse_timeout"));
      Log.log.log("set parse timeout to " + PARSE_TIMEOUT);
    } catch (Exception e) {
    }
  }
  
  public static ModuleKeyCache<String> sdfCache = null;
  
  private static void packSdf(String sdf, String def, Context sdfContext) throws IOException {
    
    /*
     * We can include as many paths as we want here, checking the
     * adequacy of the occurring imports is done elsewhere.
     */
    List<String> cmd = new ArrayList<String>(Arrays.asList(new String[] {
//      PACK_SDF,
      "-i", sdf,
      "-o", def,
      "-Idef", StdLib.sugarjDef.getPath(),
      "-Idef", StdLib.javaDef.getPath(),
      "-Idef", StdLib.sdfDef.getPath(),
      "-Idef", StdLib.strategoDef.getPath(),
      "-Idef", StdLib.editorServicesDef.getPath(),
      "-Idef", StdLib.plainDef.getPath(),
      "-I", StdLib.stdLibDir.getPath(),
    }));
    
    for (String path : Environment.includePath) 
      if (new File(path).isDirectory()){
        cmd.add("-I");
        cmd.add(path);
      }
    
    try {
      sdfContext.invokeStrategyCLI(main_pack_sdf_0_0.instance, "pack-sdf", cmd.toArray(new String[cmd.size()]));
    } catch(StrategoExit e) {
      if (e.getValue() != 0) {
        throw new RuntimeException(e);
      }
    }
    
    if (!new File(def).exists())
      throw new RuntimeException("execution of pack-sdf failed");
  }
  
  private static void sdf2Table(String def, String tbl, String module) throws IOException {
    sdf2Table(def, tbl, module, false);
  }
  
  private static void sdf2Table(String def, String tbl, String module, boolean normalize) throws IOException {
    String[] cmd; 
    
    if (!normalize)
      cmd = new String[] {
        "-i", toCygwinPath(def),
        "-o", toCygwinPath(tbl),
        "-m", module
      };
    else
      cmd = new String[] {
        "-i", toCygwinPath(def),
        "-o", toCygwinPath(tbl),
        "-m", module,
        "-n"
      };
    
    IStrategoTerm termArgs[] = new IStrategoTerm[cmd.length];
    for (int i = 0; i < termArgs.length; i++)
      termArgs[i] = ATermCommands.makeString(cmd[i], null);
    
    Context context = stratego_xtc.init();
    SDFBundleCommand.getInstance().init();
    SDFBundleCommand.getInstance().invoke(context, "sdf2table", termArgs);
    
    if (!new File(tbl).exists())
      throw new RuntimeException("execution of sdf2table failed");
  }

  private static void normalizeTable(String def, String module) throws IOException {
    sdf2Table(def, FileCommands.newTempFile("tbl"), module, true);
  }
  
  public static void check(String sdf, String module, Context sdfContext) throws IOException {
    String def = FileCommands.newTempFile("def");
    packSdf(sdf, def, sdfContext);
    normalizeTable(def, module);
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
  public static ParseTable compile(String sdf, String module, Collection<String> dependentFiles, JSGLRI sdfParser, Context sdfContext, Context makePermissiveContext) throws IOException,
      InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    ModuleKey key = getModuleKeyForGrammar(sdf, module, dependentFiles, sdfParser);
    String tbl = lookupGrammarInCache(key);
    if (tbl == null) {
      tbl = generateParseTable(key, sdf, module, sdfContext, makePermissiveContext);
      cacheParseTable(key, tbl);
    }
    
    if (tbl != null)
      log.log("use generated table " + tbl);
    
    return org.strategoxt.imp.runtime.Environment.loadParseTable(tbl);
  }
  
  
  private static void cacheParseTable(ModuleKey key, String tbl) throws IOException {
    if (sdfCache == null || Environment.cacheDir == null)
      return;
    
    log.beginTask("Caching", "Cache parse table");
    try {
      String cacheTbl = Environment.cacheDir + Environment.sep + new File(tbl).getName();
      FileCommands.copyFile(tbl, cacheTbl);
      String oldTbl = sdfCache.putGet(key, cacheTbl);
      FileCommands.delete(oldTbl);

      if (CommandExecution.CACHE_INFO)
        log.log("Cache Location: " + cacheTbl);
    } finally {
      log.endTask();
    }
  }

  private static String lookupGrammarInCache(ModuleKey key) {
    if (sdfCache == null)
      return null;
    
    String result = null;
    
    log.beginTask("Searching", "Search parse table in cache");
    try {
      result = sdfCache.get(key);
    } finally {
      log.endTask(result != null);
    }
    
    if (result != null && !new File(result).exists())
      return null;
    
    return result;
  }
  
  private static ModuleKey getModuleKeyForGrammar(String sdf, String module, Collection<String> dependentFiles, JSGLRI parser) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    log.beginTask("Generating", "Generate module key for current grammar");
    try {
      IStrategoTerm aterm = parser.parse(new FileInputStream(sdf), sdf);

      IStrategoTerm imports = ATermCommands.getApplicationSubterm(aterm, "module", 1);
      IStrategoTerm body = ATermCommands.getApplicationSubterm(aterm, "module", 2);
      IStrategoTerm term = ATermCommands.makeTuple(imports, body);

      LinkedList<String> depList = new LinkedList<String>();
      for (String file : dependentFiles)
        if (SDF_FILE_PATTERN.matcher(file).matches())
          depList.add(file);
      
      return new ModuleKey(depList, term);
    } catch (Exception e) {
      throw new SGLRException(parser.getParser(), "could not parse SDF file " + sdf, e);
    } finally {
      log.endTask();
    }
  }

  private static String generateParseTable(ModuleKey key,
                                           String sdf,
                                           String module,
                                           Context sdfContext,
                                           Context makePermissiveContext)
      throws IOException, InvalidParseTableException {
    log.beginTask("Generating", "Generate the parse table");
    try {
      String tblFile = null;
      
      tblFile = FileCommands.newTempFile("tbl");

      String def = FileCommands.newTempFile("def");
      packSdf(sdf, def, sdfContext);
      sdf2Table(def, tblFile, module);
      return tblFile;
    } finally {
      log.endTask();
    }
  }
  
  public static String makePermissiveSdf(String source, Context context) throws IOException {
    String def = FileCommands.newTempFile("def");
    String permissiveDef = FileCommands.newTempFile("def-permissive");
    
    FileCommands.writeToFile(def, sdfToDef(source));
    makePermissive(def, permissiveDef, context);
    
    return defToSdf(FileCommands.readFileAsString(permissiveDef)); // drop "definition\n"
  }
  
  private static void makePermissive(String def, String permissiveDef, Context context) throws IOException {
    log.beginExecution("make permissive", "-i", def, "-o", permissiveDef);
    try {
      make_permissive.mainNoExit(context, "-i", def, "-o", permissiveDef);
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
  private static IStrategoTerm jsglri(ParseTable table, final String source, String start, ITreeBuilder treeBuilder, final JSGLRI parser) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    parser.setParseTable(table);
    parser.setStartSymbol(start);
    
    if (treeBuilder instanceof RetractableTreeBuilder && ((RetractableTreeBuilder) treeBuilder).isInitialized())
      ((RetractableTokenizer) treeBuilder.getTokenizer()).setKeywordRecognizer(parser.getParseTable().getKeywordRecognizer());
    
    parser.getParser().setTreeBuilder(treeBuilder);

    FutureTask<IStrategoTerm> res = new FutureTask<IStrategoTerm>(new Callable<IStrategoTerm>() {
      @Override
      public IStrategoTerm call() throws Exception {
        return parser.parse(source, "in-file declaration");
      }
    });
    
    try {
      new Thread(res).start();
      return res.get(PARSE_TIMEOUT, TimeUnit.MILLISECONDS);
    } catch (ExecutionException e) {
      if (e.getCause() instanceof SGLRException)
        throw (SGLRException) e.getCause();
      throw new RuntimeException("unexpected execution error", e);
    } catch (InterruptedException e) {
      throw new SGLRException(parser.getParser(), "parser was interrupted", e);
    } catch (TimeoutException e) {
      throw new SGLRException(parser.getParser(), "parser timed out, timeout at " + PARSE_TIMEOUT + "ms", e);
    }
  }
  
//  /**
//   * Parses the given source using the given table and implodes the resulting parse tree.
//   * 
//   * @param tbl
//   * @param source
//   * @param target
//   * @param start
//   * @return
//   * @throws IOException
//   * @throws InvalidParseTableException
//   * @throws SGLRException 
//   * @throws BadTokenException 
//   * @throws TokenExpectedException 
//   */
//  public static boolean parseImplode(String tbl, String source, String target, String start, boolean binary, ITreeBuilder treeBuilder, JSGLRI parser) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
//    return parseImplode(org.strategoxt.imp.runtime.Environment.loadParseTable(tbl), tbl, source, target, start, binary, treeBuilder, parser);
//  }
  
  public static IStrategoTerm parseImplode(ParseTable table, String source, String start, boolean binary, ITreeBuilder treeBuilder, JSGLRI parser) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    return parseImplode(table, "unknown", source, start, binary, treeBuilder, parser);
  }
  
  private static IStrategoTerm parseImplode(ParseTable table, String tbl, String source, String start, boolean binary, ITreeBuilder treeBuilder, JSGLRI parser) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    log.beginExecution("parsing", "parsing source using table " + tbl);

    IStrategoTerm result = null;
    try {
      result = jsglri(table, source, start, treeBuilder, parser);
    }
    finally {
      if (result != null)
        log.endTask();
      else {
        String sourceFile = FileCommands.newTempFile("");
        FileCommands.writeToFile(sourceFile, source.toString());
        log.endTask("failed: " + 
            log.commandLineAsString(new String[] {"jsglri", "-p", tbl, "-i " + sourceFile + "-s", start}));
      }
    }
    
    return result;
  }
  
  /**
   * Pretty prints the content of a Java AST in some file.
   * 
   * @param aterm the name of a file which contains an aterm which encodes a Java AST
   * @throws IOException 
   */
  public static String prettyPrintJava(IStrategoTerm term, HybridInterpreter interp) throws IOException {
    IStrategoTerm string = pp_java_string_0_0.instance.invoke(interp.getCompiledContext(), term);
    if (string != null)
      return Term.asJavaString(string);
    
    throw new RuntimeException("pretty printing java AST failed: " + term);
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
}
