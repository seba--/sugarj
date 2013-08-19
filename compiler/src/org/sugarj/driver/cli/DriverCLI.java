package org.sugarj.driver.cli;

import static org.spoofax.jsglr.client.imploder.ImploderAttachment.getLeftToken;
import static org.spoofax.jsglr.client.imploder.ImploderAttachment.getRightToken;
import static org.spoofax.jsglr.client.imploder.ImploderAttachment.getTokenizer;
import static org.spoofax.terms.Term.tryGetConstructor;
import static org.sugarj.common.Log.log;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.spoofax.interpreter.core.Tools;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.MultiBadTokenException;
import org.spoofax.jsglr.client.ParseTimeoutException;
import org.spoofax.jsglr.client.imploder.IToken;
import org.spoofax.jsglr.client.imploder.ITokenizer;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.jsglr.client.imploder.Token;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.spoofax.terms.TermVisitor;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.imp.runtime.Environment;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.CommandExecution;
import org.sugarj.common.Log;
import org.sugarj.common.path.AbsolutePath;
import org.sugarj.common.path.Path;
import org.sugarj.driver.Result;
import org.sugarj.driver.STRCommands;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 *
 * large chunk copied and adapted from org.strategoxt.imp.runtime.parser.ParseErrorHandler
 */
public class DriverCLI {
  
  private static final String CONSOLE_CMD = "sugarj";
  
  private static class Error {
    public String msg;
    public int lineStart;
    public int lineEnd;
    public int columnStart;
    public int columEnd;
    
    Error(String msg, IToken left, IToken right) {
      this.msg = msg;
      this.lineStart = left.getLine();
      this.columnStart = left.getColumn();
      this.lineEnd = right.getLine();
      this.columEnd = right.getColumn();
    }
    
    /**
     * start of file error
     * @param msg
     */
    Error(String msg) {
      this.msg = msg;
      this.lineStart = 0;
      this.columnStart = 0;
      this.lineEnd = 0;
      this.columEnd = 0;
    }
  }
  
  public static boolean processResultCLI(Result res, Path file, String project) throws IOException {
    if (res == null) {
      log.log("compilation failed", Log.ALWAYS);
      return false;
    }
    
    boolean success = res.getCollectedErrors().isEmpty();
    
    for (String s : res.getCollectedErrors())
      log.log(s, Log.ALWAYS);
    for (BadTokenException e : res.getParseErrors())
      log.log("syntax error: line " + e.getLineNumber() + " column " + e.getColumnNumber() + ": " + e.getMessage(), Log.ALWAYS);
    
    if (res.getSugaredSyntaxTree() == null)
      return success;
    
    IToken tok = ImploderAttachment.getRightToken(res.getSugaredSyntaxTree());
    
    IStrategoTerm tuple = ATermCommands.makeTuple(
        tok,
        res.getSugaredSyntaxTree(), 
        ATermCommands.makeString(file.getAbsolutePath(), tok), 
        ATermCommands.makeString(project, tok));
    
    List<Error> errors = gatherNonFatalErrors(res.getSugaredSyntaxTree());
    success &= errors.isEmpty();
    
    for (Error error : errors)
      log.log("error: line " + error.lineStart + " column " + error.columnStart + " to line " + error.lineEnd + " column " + error.columEnd + ":\n  " + error.msg, Log.ALWAYS);

    
    IStrategoTerm errorTree = STRCommands.assimilate("sugarj-analyze", res.getDesugaringsFile(), tuple, new HybridInterpreter());
    
    assert errorTree.getTermType() == IStrategoTerm.TUPLE && errorTree.getSubtermCount() == 4 :
      "error in sugarj-analyze, did not return tuple with 4 elements";
    
    IStrategoList semErrors = Tools.termAt(errorTree, 1);
    IStrategoList warnings = Tools.termAt(errorTree, 2);
    IStrategoList notes = Tools.termAt(errorTree, 3);
    
    success &= semErrors.isEmpty() && warnings.isEmpty() && notes.isEmpty();
    
    for (IStrategoTerm error : semErrors.getAllSubterms())
      if (error.getTermType() == IStrategoTerm.LIST)
        for (IStrategoTerm deepError : error.getAllSubterms())
          reportCLI(deepError, "error");
      else
        reportCLI(error, "error");
    for (IStrategoTerm warning : warnings.getAllSubterms())
      if (warning.getTermType() == IStrategoTerm.LIST)
        for (IStrategoTerm deepWarning : warning.getAllSubterms())
          reportCLI(deepWarning, "warning");
      else
        reportCLI(warning, "warning");
    for (IStrategoTerm note : notes.getAllSubterms())
      if (note.getTermType() == IStrategoTerm.LIST)
        for (IStrategoTerm deepNote : note.getAllSubterms())
          reportCLI(deepNote, "note");
      else
        reportCLI(note, "note");
    
    // System.out.println(ATermCommands.atermToFile(errorTree));
    
    return success;
  }
  
  private static void reportCLI(IStrategoTerm pairOrList, String kind) throws IOException {
    assert pairOrList.getTermType() == IStrategoTerm.TUPLE && pairOrList.getSubtermCount() == 2;
    
    IStrategoTerm term = Tools.termAt(pairOrList, 0);
    IStrategoString msg = Tools.termAt(pairOrList, 1);
    
    IToken left = ImploderAttachment.getLeftToken(term);
    IToken right = ImploderAttachment.getRightToken(term);
    
    if (left == null && right != null)
      left = right;
    else if (left != null && right == null)
      right = left;
    
    if (left == null || right == null)
      log.log("error: " + msg + "\n  in tree " + ATermCommands.atermToFile(term), Log.ALWAYS);
    else
      log.log("error: line " + left.getLine() + " column " + left.getColumn() + " to line " + right.getLine() + " column " + right.getColumn() + ":\n  " + msg, Log.ALWAYS);
  }
  
  
  
  /**
   * Report WATER + INSERT errors from parse tree
   */
  private static List<Error> gatherNonFatalErrors(IStrategoTerm top) {
    List<Error> errors = new ArrayList<Error>();
    ITokenizer tokenizer = getTokenizer(top);
    if (tokenizer == null)
      return errors;
    for (int i = 0, max = tokenizer.getTokenCount(); i < max; i++) {
      IToken token = tokenizer.getTokenAt(i);
      String error = token.getError();
      if (error != null) {
        if (error == ITokenizer.ERROR_SKIPPED_REGION) {
          i = findRightMostWithSameError(token, null);
          reportSkippedRegion(token, tokenizer.getTokenAt(i), errors);
        } else if (error.startsWith(ITokenizer.ERROR_WARNING_PREFIX)) {
          i = findRightMostWithSameError(token, null);
          reportWarningAtTokens(token, tokenizer.getTokenAt(i), error, errors);
        } else if (error.startsWith(ITokenizer.ERROR_WATER_PREFIX)) {
          i = findRightMostWithSameError(token, ITokenizer.ERROR_WATER_PREFIX);
          reportErrorAtTokens(token, tokenizer.getTokenAt(i), error, errors);
        } else {
          i = findRightMostWithSameError(token, null);
          // UNDONE: won't work for multi-token errors (as seen in SugarJ)
          reportErrorAtTokens(token, tokenizer.getTokenAt(i), error, errors);
        }
      }
    }
    gatherAmbiguities(top, errors);
    
    return errors;
  }

  private static int findRightMostWithSameError(IToken token, String prefix) {
    String expectedError = token.getError();
    ITokenizer tokenizer = token.getTokenizer();
    int i = token.getIndex();
    for (int max = tokenizer.getTokenCount(); i + 1 < max; i++) {
      String error = tokenizer.getTokenAt(i + 1).getError();
      if (error != expectedError
          && (error == null || prefix == null || !error.startsWith(prefix)))
        break;
    }
    return i;
  }

  
    /**
     * Report recoverable errors (e.g., inserted brackets).
     * 
     * @param outerBeginOffset  The begin offset of the enclosing construct.
     */
  private static void gatherAmbiguities(IStrategoTerm term, final List<Error> errors) {
    new TermVisitor() {
      IStrategoTerm ambStart;
      
      public void preVisit(IStrategoTerm term) {
        if (ambStart == null && Environment.getTermFactory().makeConstructor("amb", 1) == tryGetConstructor(term)) {
          reportAmbiguity(term, errors);
          ambStart = term;
        }
      }
      
      @Override
      public void postVisit(IStrategoTerm term) {
        if (term == ambStart) ambStart = null;
      }
    }.visit(term);
  }
  
  private static void reportAmbiguity(IStrategoTerm amb, List<Error> errors) {
    reportWarningAtTokens(getLeftToken(amb), getRightToken(amb),
        "Fragment is ambiguous", errors);
  }
  

  private static void reportSkippedRegion(IToken left, IToken right, List<Error> errors) {
    // Report entire region
    reportErrorAtTokens(left, right, ITokenizer.ERROR_SKIPPED_REGION, errors);
  }


  private static void reportTokenExpected(ITokenizer tokenizer, TokenExpectedException exception, List<Error> errors) {
    String message = exception.getShortMessage();
    reportErrorNearOffset(tokenizer, exception.getOffset(), message, errors);
  }
  
  private static void reportBadToken(ITokenizer tokenizer, BadTokenException exception, List<Error> errors) {
    String message;
    if (exception.isEOFToken() || tokenizer.getTokenCount() <= 1) {
      message = exception.getShortMessage();
    } else {
      IToken token = tokenizer.getTokenAtOffset(exception.getOffset());
      token = findNextNonEmptyToken(token);
      message = ITokenizer.ERROR_WATER_PREFIX + ": " + token.toString().trim();
    }
    reportErrorNearOffset(tokenizer, exception.getOffset(), message, errors);
  }
  
  private static void reportMultiBadToken(ITokenizer tokenizer, MultiBadTokenException exception, List<Error> errors) {
    for (BadTokenException e : exception.getCauses()) {
      reportException(tokenizer, e, errors); // use double dispatch
    }
  }
  
  private static void reportTimeOut(ITokenizer tokenizer, ParseTimeoutException exception, List<Error> errors) {
    String message = "Internal parsing error: " + exception.getMessage();
    reportErrorAtFirstLine(message, errors);
    reportMultiBadToken(tokenizer, exception, errors);
  }
  
  private static void reportException(ITokenizer tokenizer, Exception exception, List<Error> errors) {
    try {
      throw exception;
    } catch (ParseTimeoutException e) {
      reportTimeOut(tokenizer, (ParseTimeoutException) exception, errors);
    } catch (TokenExpectedException e) {
      reportTokenExpected(tokenizer, (TokenExpectedException) exception, errors);
    } catch (MultiBadTokenException e) {
      reportMultiBadToken(tokenizer, (MultiBadTokenException) exception, errors);
    } catch (BadTokenException e) {
      reportBadToken(tokenizer, (BadTokenException) exception, errors);
    } catch (Exception e) {
      String message = "Internal parsing error: " + exception;
      reportErrorAtFirstLine(message, errors);
    }
  }

  private static void reportErrorNearOffset(ITokenizer tokenizer, int offset, String message, List<Error> errors) {
    IToken errorToken = tokenizer.getErrorTokenOrAdjunct(offset);
    reportErrorAtTokens(errorToken, errorToken, message, errors);
  }
   
  private static IToken findNextNonEmptyToken(IToken token) {
    ITokenizer tokenizer = token.getTokenizer();
    IToken result = null;
    for (int i = token.getIndex(), max = tokenizer.getTokenCount(); i < max; i++) {
      result = tokenizer.getTokenAt(i);
      if (result.getLength() != 0 && !Token.isWhiteSpace(result)) break;
    }
    return result;
  }
  
  private static void reportErrorAtTokens(final IToken left, final IToken right, String message, List<Error> errors) {
    if (left.getStartOffset() > right.getEndOffset()) {
      reportErrorNearOffset(left.getTokenizer(), left.getStartOffset(), message, errors);
    } else {
      errors.add(new Error(message, left, right));
    }
  }
  
  private static void reportWarningAtTokens(final IToken left, final IToken right, final String message, List<Error> errors) {
    errors.add(new Error(message, left, right));
  }
  
  private static void reportErrorAtFirstLine(String message, List<Error> errors) {
    errors.add(new Error(message));
  }

  /**
   * Parses and processes command line options. This method may
   * set paths and flags in {@link CommandExecution} and
   * {@link Environment} in the process.
   * 
   * @param args
   *        the command line arguments to be parsed
   * @return the source file to be processed
   * @throws CLIError
   *         when the command line is not correct
   */
  public static String[] handleOptions(String[] args, org.sugarj.common.Environment environment) {
    Options options = specifyOptions();
  
    try {
      CommandLine line = parseOptions(options, args);
      return processOptions(options, line, environment);
    } catch (org.apache.commons.cli.ParseException e) {
      throw new CLIError(e.getMessage(), options);
    }
  }

  static void showUsageMessage(Options options) {
    HelpFormatter formatter = new HelpFormatter();
    formatter.printHelp(
        CONSOLE_CMD + " [options] source-files",
        options,
        false);
  }
  
  // cai 24.09.12
  // constructs an AbsolutePath object from command-line argument
  // paths that are not acceptable verbatim are prepended with a dot
  // cf. org.sugarj.common.path.AbsolutePath.acceptable()
  private static AbsolutePath pathArgument(String path){
    if (!AbsolutePath.acceptable(path)) {
      if (path.startsWith(File.separator) || path.startsWith("/"))
        path = "." + path;
      else
        path = "./" + path;
    }
    return new AbsolutePath(path);
  }

  private static String[] processOptions(Options options, CommandLine line, org.sugarj.common.Environment environment) throws org.apache.commons.cli.ParseException {
    if (line.hasOption("help"))
      throw new CLIError("help requested", options);
  
    if (line.hasOption("verbose")) {
      int level = 0;
      for (String option : line.getOptionValues("verbose"))
        if ("SILENT".equals(option))
          ;
        else if ("CORE".equals(option))
          level |= Log.CORE;
        else if ("PARSE".equals(option))
          level |= Log.PARSE;
        else if ("TRANSFORM".equals(option))
          level |= Log.TRANSFORM;
        else if ("IMPORT".equals(option))
          level |= Log.IMPORT;
        else if ("BASELANG".equals(option))
          level |= Log.BASELANG;
        else if ("CACHING".equals(option))
          level |= Log.CACHING;
        else if ("DETAIL".equals(option))
          level |= Log.DETAIL;
        else if ("DEBUG".equals(option))
          level |= Log.ALWAYS;
        else 
          throw new CLIError("Unknown verbosity level " + option, options);
      Log.log.setLoggingLevel(level);
    }
  
    if (line.hasOption("silent-execution"))
      CommandExecution.SILENT_EXECUTION = true;
  
    if (line.hasOption("sub-silent-execution"))
      CommandExecution.SUB_SILENT_EXECUTION = true;
  
    if (line.hasOption("full-command-line"))
      CommandExecution.FULL_COMMAND_LINE = true;
  
    if (line.hasOption("cache-info"))
      CommandExecution.CACHE_INFO = true;
  
    if (line.hasOption("buildpath"))
      for (String path : line.getOptionValue("buildpath").split(org.sugarj.common.Environment.classpathsep))
        environment.addToIncludePath(pathArgument(path));
  
    if (line.hasOption("sourcepath")) {
      List<Path> sourcePath = new LinkedList<Path>();
      for (String path : line.getOptionValue("sourcepath").split(org.sugarj.common.Environment.classpathsep))
        sourcePath.add(pathArgument(path));
      environment.setSourcePath(sourcePath);
    }
  
    if (line.hasOption("d"))
      environment.setBin(pathArgument(line.getOptionValue("d")));
    
    if (line.hasOption("cache"))
      environment.setCacheDir(pathArgument(line.getOptionValue("cache")));
  
    if (line.hasOption("gen-files"))
      environment.setGenerateFiles(true);
    
    if (line.hasOption("atomic-imports"))
      environment.setAtomicImportParsing(true);
  
    if (line.hasOption("no-checking"))
      environment.setNoChecking(true);
    
    if (line.hasOption("language")) {
      String[] langNames = line.getOptionValues("language");
      activateBaseLanguage(langNames);
    }
  
    String[] sources = line.getArgs();
    if (sources.length < 1)
      throw new CLIError("No source files specified.", options);
  
    return sources;
  }

  private static void activateBaseLanguage(String[] langNames) {
    for (String langName : langNames) {
      String clName = "org.sugarj." + langName.toLowerCase() + ".Activator";
      try {
        Class<?> cl = DriverCLI.class.getClassLoader().loadClass(clName);
        cl.newInstance();
      } catch (Exception e) {
        Log.log.logErr("Could not load base language " + langName + ": " + e.getMessage(), Log.ALWAYS);
      }
    }
  }

  private static CommandLine parseOptions(Options options, String[] args) throws org.apache.commons.cli.ParseException {
    CommandLineParser parser = new GnuParser();
    return parser.parse(options, args);
  }

  private static Options specifyOptions() {
    Options options = new Options();
  
    options.addOption(
        "v", 
        "verbose", 
        true, 
        "Verbosity. Values are SILENT, CORE, PARSE, TRANSFORM, IMPORT, BASELANG, CACHING, DETAIL, and DEBUG. Use multiple times to activate verbosity for multiple features.");
  
    options.addOption(
        null, 
        "silent-execution", 
        false, 
        "Try to be silent");
  
    options.addOption(
        null,
        "sub-silent-execution",
        false,
        "Do not display output of subprocesses");
  
    options.addOption(
        null,
        "full-command-line",
        false,
        "Show all arguments to subprocesses");
  
    options.addOption(
        null, 
        "cache-info", 
        false, 
        "Show where files are cached");
  
    options.addOption(
        "cp",
        "buildpath",
        true,
        "Specify where to find compiled files. Multiple paths can be given separated by \'" + org.sugarj.common.Environment.classpathsep + "\'.");
  
    options.addOption(
        null,
        "sourcepath",
        true,
        "Specify where to find source files. Multiple paths can be given separated by \'" + org.sugarj.common.Environment.classpathsep + "\'.");
  
    options.addOption(
        "d", 
        null,
        true, 
        "Specify where to place compiled files");
  
    options.addOption(
        null, 
        "help", 
        false, 
        "Print this synopsis of options");
    
    options.addOption(
        null,
        "cache",
        true,
        "Specifiy a directory for caching.");
    
    options.addOption(
        null,
        "read-only-cache",
        false,
        "Specify the cache to be read-only.");
  
    options.addOption(
        null,
        "write-only-cache",
        false,
        "Specify the cache to be write-only.");
    
    options.addOption(
        null,
        "gen-files",
        false,
        "Generate files?");
  
    options.addOption(
        null,
        "atomic-imports",
        false,
        "Parse all import statements simultaneously.");
  
    options.addOption(
        null,
        "no-checking",
        false,
        "Do not check resulting SDF and Stratego files.");
    
    options.addOption(
        "l",
        "language",
        true,
        "Specify a base language to activate.");
    
    return options;
  }
}
