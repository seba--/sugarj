package org.sugarj.driver;
import static org.sugarj.driver.ATermCommands.atermToFile;
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
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.java_front.pp_java_string_0_0;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoExit;
import org.strategoxt.stratego_sdf.pp_sdf_string_0_0;
import org.strategoxt.stratego_sdf.stratego_sdf;
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
  
  private final static String SDF_2_TABLE = StdLib.binDir.getPath() + "sdf2table";
  
  private final static Pattern SDF_FILE_PATTERN = Pattern.compile(".*\\.sdf");
  
  public static ModuleKeyCache<String> sdfCache = null;
  
  private static void packSdf(String sdf, String def, Context sdfContext) throws IOException {
    
    /*
     * We can include as many paths as we want here, checking the
     * adequacy of the occurring imports is done elsewhere.
     */
    List<String> cmd = new ArrayList<String>(Arrays.asList(new String[] {
//      PACK_SDF,
      "-i", toCygwinPath(sdf),
      "-o", toCygwinPath(def),
      "-Idef", toCygwinPath(StdLib.javaDef.getPath()),
      "-Idef", toCygwinPath(StdLib.sdfDef.getPath()),
      "-Idef", toCygwinPath(StdLib.strategoDef.getPath()),
      "-Idef", toCygwinPath(StdLib.editorServiceDef.getPath()),
      "-I", toCygwinPath(StdLib.stdLibDir.getPath()),
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
    String[] cmd = new String[] {
        "bash",
        SDF_2_TABLE,
        "-i", toCygwinPath(def),
        "-o", toCygwinPath(tbl),
        "-m", module
    };
    
    CommandExecution.executeWithPrefix("sdf2table", cmd);
    
    if (!new File(tbl).exists())
      throw new RuntimeException("execution of sdf2table failed");
  }

  private static void normalizeTable(String def, String module) throws IOException {
    String[] cmd = new String[] {
        "bash",
        SDF_2_TABLE,
        "-i", toCygwinPath(def),
        "-m", module,
        "-n"
    };
    
    CommandExecution.executeWithPrefix("sdf2table", cmd);
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
    
    return org.strategoxt.imp.runtime.Environment.loadParseTable(tbl);
  }
  
  
  private static void cacheParseTable(ModuleKey key, String tbl) {
    if (sdfCache == null)
      return;
    
    log.beginTask("Caching", "Cache parse table");
    try {
      sdfCache.put(key, tbl);
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
      String permissiveDef = FileCommands.newTempFile("def-permissive");
      packSdf(sdf, def, sdfContext);
      makePermissive(def, permissiveDef, makePermissiveContext);
      sdf2Table(permissiveDef, tblFile, module);
      return tblFile;
    } finally {
      log.endTask();
    }
  }
  
  private static void makePermissive(String def, String permissveDef, Context context) throws IOException {
    log.beginExecution("make permissive", "-i", def, "-o", permissveDef);
    try {
      // FIXME how to run 'make_permissive' properly???
      // make_permissive.mainNoExit(context, "-i", def, "-o", permissveDef);
      
      FileCommands.copyFile(def, permissveDef);
    }
    catch (StrategoExit e) {
      if (e.getValue() != 0)
        throw new RuntimeException("make permissive failed", e);
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
  private static boolean jsglri(ParseTable table, String source, String target, String start, ITreeBuilder treeBuilder, JSGLRI parser) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {

    parser.setParseTable(table);
    parser.setStartSymbol(start);
    
    if (treeBuilder instanceof RetractableTreeBuilder && ((RetractableTreeBuilder) treeBuilder).isInitialized())
      ((RetractableTokenizer) treeBuilder.getTokenizer()).setKeywordRecognizer(parser.getParseTable().getKeywordRecognizer());
    
    parser.getParser().setTreeBuilder(treeBuilder);

    IStrategoTerm aterm = null;
    
    aterm = parser.parse(source, source);


    if (aterm != null) {
      atermToFile(aterm, target);
      return true;
    }


    return false;
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
  
  public static boolean parseImplode(ParseTable table, String source, String target, String start, boolean binary, ITreeBuilder treeBuilder, JSGLRI parser) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    return parseImplode(table, "unknown", source, target, start, binary, treeBuilder, parser);
  }
  
  private static boolean parseImplode(ParseTable table, String tbl, String source, String target, String start, boolean binary, ITreeBuilder treeBuilder, JSGLRI parser) throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    log.beginExecution("parsing", "parsing source using table " + tbl + " writing to " + target);

    boolean result = false;
    try {
      result = jsglri(table, source, target, start, treeBuilder, parser);
    }
    finally {
      if (result)
        log.endTask();
      else {
        String sourceFile = FileCommands.newTempFile("");
        FileCommands.writeToFile(sourceFile, source);
        log.endTask("failed: " + 
            log.commandLineAsString(new String[] {"jsglri", "-p", tbl, "-i " + sourceFile + " -o", target, "-s", start}));
      }
    }
    
    return result;
  }
  
  
  
  public static void ppAterm(String aterm) throws IOException {
//    String[] cmd = new String[] {
//        PP_ATERM,
//        "-i", toCygwinPath(aterm)
//    };
    
    // CommandExecution.execute(cmd);
    
    StringBuffer buf = new StringBuffer();
    ATermCommands.atermFromFile(aterm).writeAsString(buf, -1);
    log.log(buf.toString());
  }
  

  /**
   * Pretty prints the content of a Java AST in some file.
   * 
   * @param aterm the name of a file which contains an aterm which encodes a Java AST
   * @throws IOException 
   */
  public static String prettyPrintJava(String aterm, HybridInterpreter interp) throws IOException {
    IStrategoTerm term = ATermCommands.atermFromFile(aterm);
    return prettyPrintJava(term, interp);
  }  
  
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
  public static String prettyPrintSDF(String aterm, HybridInterpreter interp) throws IOException {
    IStrategoTerm term = ATermCommands.atermFromFile(aterm);
    return prettyPrintSDF(term, interp);
  }
  
  public static String prettyPrintSDF(IStrategoTerm term, HybridInterpreter interp) {
    IStrategoTerm string = pp_sdf_string_0_0.instance.invoke(interp.getCompiledContext(), term);
    if (string != null)
      return Term.asJavaString(string);
    
    throw new RuntimeException("pretty printing SDF AST failed: " + term);
  }
  
  /**
   * Pretty prints the content of the given Stratego file. 
   * 
   * @param aterm
   * @return
   * @throws IOException 
   */
  public static String prettyPrintSTR(String aterm, HybridInterpreter interp) throws IOException {
    IStrategoTerm term = ATermCommands.atermFromFile(aterm);
    return prettyPrintSTR(term, interp);
  }
  
  public static String prettyPrintSTR(IStrategoTerm term, HybridInterpreter interp) {
    IStrategoTerm string = pp_stratego_string_0_0.instance.invoke(interp.getCompiledContext(), term);
    if (string != null)
      return Term.asJavaString(string);
    
    throw new RuntimeException("pretty printing SDF AST failed: " + term);
  }
  
}
