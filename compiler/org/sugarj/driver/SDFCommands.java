package org.sugarj.driver;
import static org.sugarj.driver.ATermCommands.atermToFile;
import static org.sugarj.driver.FileCommands.toCygwinPath;
import static org.sugarj.driver.Log.log;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.spoofax.jsglr.InvalidParseTableException;
import org.spoofax.jsglr.ParseTableManager;
import org.spoofax.jsglr.SGLR;
import org.spoofax.jsglr.SGLRException;
import org.strategoxt.stratego_aterm.pp_aterm_box_0_0;
import org.strategoxt.stratego_sglr.implode_asfix_0_0;
import org.strategoxt.tools.main_pack_sdf_0_0;
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
public class SDFCommands {
  
  private final static String PACK_SDF = "pack-sdf";
  private final static String SGLRI = "sglri";
  private final static String SDF_2_TABLE = "sdf2table";
  private final static String SDF_XTBL = "sdf-xtbl";
  private final static String XTBL_COMPOSE = "xtbl-compose";
  private final static String XTBL_FINALIZE = "xtbl-finalize";
  private final static String PP_ATERM = "pp-aterm";
  private final static String PP_SDF = "pp-sdf";
  private final static String PP_STRATEGO = "pp-stratego";
  private final static String PP_JAVA = "pp-java";
  private final static String IMPLODE_ASFIX = "implode-asfix";
  
  public static Cache<ModuleKey, String> sdfCache = null;
  
  private static void packSdf(String sdf, String def) throws IOException {
    
    /*
     * We can include as many paths as we want here, checking the
     * adequacy of the occurring imports is done elsewhere.
     */
    String[] cmd = new String[]{
//      PACK_SDF,
      "-i", toCygwinPath(sdf),
      "-o", toCygwinPath(def),
      "-Idef", toCygwinPath(Environment.javaDef),
      "-Idef", toCygwinPath(Environment.sdfDef),
      "-Idef", toCygwinPath(Environment.strategoDef),
      "-I", toCygwinPath(Environment.stdLibDir),
      "-I", toCygwinPath(Environment.bin)
    };
    
    StrategyInvoker.invoke(main_pack_sdf_0_0.instance, 
                           false, 
                           CommandExecution.SILENT_EXECUTION || CommandExecution.SUB_SILENT_EXECUTION, 
                           cmd);
    
    // CommandExecution.execute(cmd);
    
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
  
  private static void sdfXtbl(String def, String xtbl, String module) throws IOException {
    String[] cmd = new String[] {
        SDF_XTBL,
        "-i", toCygwinPath(def),
        "-o", toCygwinPath(xtbl),
        "-m", module,
        "-q", module,
        "--internal-layout"
    };
    
    CommandExecution.executeWithPrefix("sdf-xtbl", cmd);
    
    if (!new File(xtbl).exists())
      throw new RuntimeException("execution of sdf-xtbl failed");
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
  
  public static void check(String sdf, String module) throws IOException {
    String def = FileCommands.newTempFile("def");
    packSdf(sdf, def);
    normalizeTable(def, module);
  }
  
  /**
   * 
   * @return the filename of the compiled .tbl file.
   * @throws IOException
   * @throws InvalidParseTableException
   */
  public static String compile(String sdf, String module) throws IOException,
      InvalidParseTableException {
    ModuleKey key = getModuleKeyForGrammar(sdf, module);
    String tbl = lookupGrammarInCache(key);
    if (tbl == null) {
      tbl = generateParseTable(key, sdf, module);
      cacheParseTable(key, tbl);
    }
    return tbl;
  }
  
  public static void compileXtbl(String sdf,
                                 String xtbl,
                                 String module) throws IOException {
    log.beginTask("Generating", "Compile the parse table separately");
    try {
      String def = FileCommands.newTempFile("def");
      packSdf(sdf, def);
      sdfXtbl(def, xtbl, module);
    } finally {
      log.endTask();
    }
  }

  public static void composeXtbl(String xtbl1,
                                 String xtbl2,
                                 String xtblOut) {
    String[] cmd = new String[] {
        XTBL_COMPOSE,
        "-o", toCygwinPath(xtblOut),
        toCygwinPath(xtbl1),
        toCygwinPath(xtbl2)
    };
    
    CommandExecution.executeWithPrefix("xtbl-compose", cmd);
    
    if (!new File(xtblOut).exists())
      throw new RuntimeException("execution of xtbl-compose failed");
  }

  public static String finalizeXtbl(String xtbl) throws IOException {
    String tbl = FileCommands.newTempFile("tbl");
    
    String[] cmd = new String[] {
        XTBL_FINALIZE,
        "-i", toCygwinPath(xtbl),
        "-o", toCygwinPath(tbl)
    };
    
    CommandExecution.executeWithPrefix("xtbl-finalize", cmd);
    
    if (!new File(tbl).exists())
      throw new RuntimeException("execution of xtbl-finalize failed");
    
    return tbl;
  }

  private static void cacheParseTable(ModuleKey key, String tbl) {
    if (sdfCache == null)
      return;
    
    log.beginTask("Caching", "Cache parse table");
    try {
      sdfCache.put(key, tbl);
      FileCommands.keepFiles.add(tbl);

      if (CommandExecution.CACHE_INFO)
        log.log("Cache Location: " + tbl);
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
      
      // Ignore non-existing files
      if (result != null && !FileCommands.exists(result))
        result = null;
      
      if (result != null && CommandExecution.CACHE_INFO)
        log.log("Cache location: " + result);
    } finally {
      log.endTask(result != null);
    }
    
    return result;
  }
  
  private static ModuleKey getModuleKeyForGrammar(String sdf, String module) throws IOException, InvalidParseTableException {
    log.beginTask("Generating", "Generate module key for current grammar");
    try {
      String f = FileCommands.newTempFile("aterm");
      parseImplode(Environment.sdfTbl, sdf, f, "Sdf2Module", false);

      ATerm aterm = ATermCommands.atermFromFile(f);

      ATerm imports = ATermCommands.extractTerm(aterm, "module(_, ?, _)");
      ATerm body = ATermCommands.extractTerm(aterm, "module(_, _, ?)");
      ATerm importsBody = ATermCommands.injectTerms("(?,?)", imports, body);

      return new ModuleKey(importsBody, "", Environment.bin);
    } finally {
      log.endTask();
    }
  }

  private static String generateParseTable(ModuleKey key,
                                           String sdf,
                                           String module)
      throws IOException {
    log.beginTask("Generating", "Generate the parse table");
    try {
      String tbl = null;
      
      if (Environment.cacheDir != null)
        tbl = FileCommands.createFile(Environment.cacheDir, key.hashCode());
      else
        tbl = FileCommands.newTempFile("tbl");

      String def = FileCommands.newTempFile("def");
      packSdf(sdf, def);
      sdf2Table(def, tbl, module);
      return tbl;
    } finally {
      log.endTask();
    }
  }
  
  private static ATerm jsglrParse(String tbl, String source, String start) throws IOException, InvalidParseTableException {
    ParseTableManager ptm = new ParseTableManager();
    SGLR sglr = new SGLR(ptm.getFactory(), ptm.loadFromFile(tbl));
    sglr.getDisambiguator().setFilterCycles(true);
    sglr.getDisambiguator().setFilterAny(true);
    sglr.getDisambiguator().setHeuristicFilters(false);

    try {
      return sglr.parse(new BufferedInputStream(new FileInputStream(source)), start);
    }
    catch (SGLRException e) {
      e.printStackTrace();
      return null;
    }
  }
  
  /**
   * 
   * Parses the given source file using the given parse table
   * and start symbol. Should the parsing succeed, the resulting
   * aterm is written into the target file.
   * 
   * @param tbl
   * @param source
   * @param target
   * @param start
   * @return true iff parsing succeeded.
   * @throws IOException
   * @throws InvalidParseTableException
   */
  private static boolean jsglr(String tbl, String source, String target, String start) throws IOException, InvalidParseTableException {
    log.beginExecution("parsing", "parsing " + source + " using table " + tbl + " writing to " + target);

    ATerm aterm = jsglrParse(tbl, source, start);

    if (aterm != null && !"-".equals(aterm)) {
      atermToFile(aterm, target);

      log.endTask();
      
      return true;
    }

    log.endTask("failed: " + 
                log.commandLineAsString(new String[] {"sglr", "p", tbl, "-i", source, "-o", target, "-s", start}));

    return false;
  }
  
  /**
   * 
   * Parses the given source file using the given parse table
   * and start symbol. Should the parsing succeed, the resulting
   * aterm is written into the target file.
   * 
   * @param tbl
   * @param source
   * @param target
   * @param start
   * @return true iff parsing succeeded.
   * @throws IOException
   * @throws InvalidParseTableException
   */
  private static void sglri(String tbl, String source, String target, String start) throws IOException, InvalidParseTableException {
    log.beginExecution("parsing", "parsing " + source + " using table " + tbl + " writing to " + target);

    try {
      String[] cmd;
      
      if (Environment.xtblCompilation)
        cmd = new String[] {
          SGLRI,
          "-p", tbl,
          "-i", source,
          "-o", target
        };
      else 
        cmd = new String[] {
          SGLRI,
          "-p", tbl,
          "-i", source,
          "-o", target,
          "-s", start
        };
      
      CommandExecution.execute(cmd);
      
    } finally {
      log.endTask();
    }
  }
  
  
  private static void implodeAsfix(String aterm, String outTerm, boolean binaryOutput) throws IOException {
    List<String> args = new ArrayList<String>();
    
    // args.add(IMPLODE_ASFIX);
    args.add("-i"); args.add(toCygwinPath(aterm));
    args.add("-o"); args.add(toCygwinPath(outTerm));
    
    if (binaryOutput)
      args.add("-b");

    StrategyInvoker.invoke(implode_asfix_0_0.instance, 
                           true, 
                           CommandExecution.SILENT_EXECUTION || CommandExecution.SUB_SILENT_EXECUTION,
                           args.toArray(new String[]{}));
    
    // CommandExecution.execute(args);
    
    if (!new File(outTerm).exists())
      throw new RuntimeException("execution of implode-asfix failed");
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
   */
  private static boolean jsglri(String tbl, String source, String target, String start, boolean binary) throws IOException, InvalidParseTableException {
    String term = FileCommands.newTempFile("aterm");
    
    if (!jsglr(tbl, source, term, start))
      return false;
    
    implodeAsfix(term, target, binary);
    FileCommands.delete(term);
    
    return true;
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
   */
  public static boolean parseImplode(String tbl, String source, String target, String start, boolean binary) throws IOException, InvalidParseTableException {
//    String term = FileCommands.newTempFile("aterm");
//    
//    if (!jsglr(tbl, source, term, start))
//      return false;
//
//    implodeAsfix(term, target, binary);
//    FileCommands.delete(term);
    
    sglri(tbl, source, target, start);

    
    return true;
  }
  
  
  
  public static void ppAterm(String aterm) throws IOException {
//    String[] cmd = new String[] {
//        PP_ATERM,
//        "-i", toCygwinPath(aterm)
//    };
    
    // CommandExecution.execute(cmd);
    
    StrategyInvoker.invoke(pp_aterm_box_0_0.instance, 
                           false, 
                           CommandExecution.SILENT_EXECUTION || CommandExecution.SUB_SILENT_EXECUTION,
                           "-i", 
                           toCygwinPath(aterm));
    
  }
  
  public static String prettyPrintJavaTerm(ATerm aterm) throws IOException {
    String in = FileCommands.newTempFile("aterm");
    String out = FileCommands.newTempFile("java-snippet");
    atermToFile(aterm, in);
    prettyPrintJava(in, out);
    
    String res = FileCommands.readFileAsString(out).trim();
    
    FileCommands.delete(in);
    FileCommands.delete(out);
    
    return res;
  }

  /**
   * Pretty prints the content of the given SDF file. 
   * 
   * @param aterm
   * @return
   * @throws IOException 
   */
  public static void prettyPrintSDF(String aterm, String txt) throws IOException {
    String[] cmd = new String[] {
        PP_SDF,
        "-i", toCygwinPath(aterm),
        "-o", toCygwinPath(txt)
    };
    
    // StrategyInvoker.invoke(pp_sdf_string_0_0.instance, cmd);
    
    CommandExecution.execute(cmd);
  }
  
  public static String prettyPrintSTR(ATerm aterm) throws IOException {
    String in = FileCommands.newTempFile("aterm");
    String out = FileCommands.newTempFile("str-snippet");
    atermToFile(aterm, in);
    prettyPrintSTR(in, out);
    
    String res = FileCommands.readFileAsString(out).trim();
    
    FileCommands.delete(in);
    FileCommands.delete(out);
    
    return res;
  }
  
  
  /**
   * Pretty prints the content of the given STR file.
   * 
   * @param str
   * @return
   * @throws IOException 
   */
  public static void prettyPrintSTR(String aterm, String txt) throws IOException {
    String[] cmd = new String[] {
        PP_STRATEGO,
        "-i", toCygwinPath(aterm),
        "-o", toCygwinPath(txt),
        "-a"
    };
    
//    org.strategoxt.strc.Main.init();
//    org.strategoxt.stratego_lib.Main.init();
//    org.strategoxt.stratego_xtc.Main.init();
//    StrategyInvoker.invoke(pp_stratego.pp_stratego_io_0_0.instance, cmd);
//    
//    FileCommands.trimQuotes(toCygwinPath(txt));

    CommandExecution.execute(cmd);
  }
  
  /**
   * Pretty prints the content of a Java AST in some file.
   * 
   * @param aterm the name of a file which contains an aterm which encodes a Java AST
   * @throws IOException 
   */
  public static void prettyPrintJava(String aterm, String txt) throws IOException {
    String[] cmd = new String[] {
        PP_JAVA,
        "-i", toCygwinPath(aterm),
        "-o", toCygwinPath(txt)
    };
   
// TODO would have to call StringExplode or something
//    StrategyInvoker.invoke(pp_java5_to_string_0_0.instance, 
//                           true, 
//                           CommandExecution.SILENT_EXECUTION || CommandExecution.SUB_SILENT_EXECUTION,
//                           cmd);
//    
//    FileCommands.trimQuotes(toCygwinPath(txt));

    CommandExecution.execute(cmd);
  }  
}
