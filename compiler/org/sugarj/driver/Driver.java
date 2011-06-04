package org.sugarj.driver;

import static org.sugarj.driver.ATermCommands.extractSDF;
import static org.sugarj.driver.ATermCommands.extractSTR;
import static org.sugarj.driver.ATermCommands.fixSDF;
import static org.sugarj.driver.ATermCommands.getApplicationSubterm;
import static org.sugarj.driver.ATermCommands.getList;
import static org.sugarj.driver.ATermCommands.getString;
import static org.sugarj.driver.ATermCommands.isApplication;
import static org.sugarj.driver.Environment.bin;
import static org.sugarj.driver.Environment.sep;
import static org.sugarj.driver.Log.log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.text.ParseException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.collections.map.LRUMap;
import org.eclipse.core.runtime.IProgressMonitor;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.client.ParseTable;
import org.spoofax.jsglr.client.imploder.IToken;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.spoofax.terms.Term;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoException;
import org.strategoxt.permissivegrammars.make_permissive;
import org.strategoxt.tools.tools;
import org.sugarj.driver.caching.ModuleKeyCache;
import org.sugarj.driver.transformations.extraction.extraction;
import org.sugarj.stdlib.StdLib;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Driver{
  
  public final static String CACHE_VERSION = "editor-base-0.12";
  
  private static class Key {
    private String source;
    private String moduleName;
    
    private Key(String source, String moduleName) {
      this.source = source;
      this.moduleName = moduleName;
    }
    
    public int hashCode() {
      return source.hashCode() + moduleName.hashCode();
    }
    
    public boolean equals(Object o) {
      return o instanceof Key 
          && ((Key) o).source.equals(source)
          && ((Key) o).moduleName.equals(moduleName);
    }
  }

  private final static int PENDING_TIMEOUT = 120000;

  private static LRUMap resultCache = new LRUMap(50);
  private static Map<String, Entry<String, Driver>> pendingRuns = new HashMap<String, Map.Entry<String,Driver>>();

  private static List<URI> allInputFiles;
  private static List<URI> pendingInputFiles;
  private static List<URI> currentlyProcessing;

  private IProgressMonitor monitor;
  
  private Result driverResult = new Result();
  
  private String javaOutFile;
  private String relPackageName;
  private String relativePath;

  private String currentGrammarSDF;
  private String currentGrammarModule;
  private String currentTransSTR;
  private String currentTransModule;
  private String remainingInput;
  
  // private Collection<String> dependentFiles;

  private List<String> availableSDFImports;
  private List<String> availableSTRImports;
  
  private IStrategoTerm sugaredPackageDecl;
  private List<IStrategoTerm> sugaredImportDecls = new ArrayList<IStrategoTerm>();
  private List<IStrategoTerm> sugaredTypeOrSugarDecls = new ArrayList<IStrategoTerm>();
  
  private IStrategoTerm lastSugaredToplevelDecl;
  
  private RetractableTreeBuilder inputTreeBuilder;
  private JSGLRI sdfParser;
  private JSGLRI strParser;
  private JSGLRI editorServicesParser;
  private HybridInterpreter interp;
  private JSGLRI parser;
  private Context sdfContext;
  private Context makePermissiveContext;
  private Context extractionContext;
  private Context strjContext;
  
  private String currentTransProg;
  
  private boolean interrupt = false;
  
  /**
   * the next parsing and desugaring uses no cache lookup if skipCache.
   */
  private boolean skipCache = false;
  
  private List<String> generatedJavaClasses = new ArrayList<String>();
  
  
  
  static {
    try {
      Environment.init();
      
      if (Environment.cacheDir != null)
        FileCommands.createDir(Environment.cacheDir);
      
      FileCommands.createDir(Environment.bin);
      
      initializeCaches();
    } catch (IOException e) {
      throw new RuntimeException("error while initializin driver", e);
    }
    
    allInputFiles = new ArrayList<URI>();
    pendingInputFiles = new ArrayList<URI>();
    currentlyProcessing = new ArrayList<URI>();
  }
  
  
  
  
  
  private static synchronized Result getResult(String source, String moduleName) {
    return (Result) resultCache.get(new Key(source, moduleName));
  }
  
  private static synchronized Entry<String, Driver> getPendingRun(String file) {
    return pendingRuns.get(file);
  }
  
  private static synchronized void putPendingRun(String file, String source, Driver driver) {
    pendingRuns.put(file, new AbstractMap.SimpleImmutableEntry<String, Driver>(source, driver));
  }
  
  private static void waitForPending(String file) {
    int count = 0;
    Object lock = new Object();
    synchronized (lock) {
      while (true) {
        synchronized (pendingRuns) {
          if (!pendingRuns.containsKey(file))
            return;
        }
        
        if (count > PENDING_TIMEOUT)
          throw new IllegalStateException("pending result timed out for " + file);
        
        count += 100;
        try {
          lock.wait(100);
        } catch (InterruptedException e) {
        }
      }
    }
  }

  private static synchronized void putResult(String source, String moduleName, Result result) {
    resultCache.put(new Key(source, moduleName), result);
    Log.log.log(resultCache.size());
  }
  
  public static Result compile(URI sourceFile, String relativePath, IProgressMonitor monitor) throws IOException, TokenExpectedException, BadTokenException, ParseException, InvalidParseTableException, SGLRException, InterruptedException {
    synchronized (currentlyProcessing) {
      // TODO we need better circular dependency handling
      if (currentlyProcessing.contains(sourceFile))
        throw new IllegalStateException("circular processing");
      currentlyProcessing.add(sourceFile);
    }

    Result res;
    
    try {
      String source = FileCommands.readFileAsString(sourceFile.getPath());
      res = compile(source, relativePath, sourceFile.getPath(), monitor);
    } finally {
      synchronized (currentlyProcessing) {
        currentlyProcessing.remove(sourceFile);
      }
    }

    pendingInputFiles.remove(sourceFile);

    return res;
  }
  
  public static Result compile(String source, String relativePath, String file, IProgressMonitor monitor) throws IOException, TokenExpectedException, BadTokenException, ParseException, InvalidParseTableException, SGLRException, InterruptedException {
    Driver driver = new Driver();
    Entry<String, Driver> pending = null;
    
    synchronized (Driver.class) {
      pending = getPendingRun(file);
      if (pending != null && !pending.getKey().equals(source)) {
        log.log("interrupting " + relativePath);
        pending.getValue().interrupt();
      }

      if (pending == null) {
        Result result = getResult(source, file);
        if (result != null && result.isUpToDate(source.hashCode()))
          return result;
      }
      
      if (pending == null)
        putPendingRun(file, source, driver);
    }
    
    if (pending != null) {
      waitForPending(file);
      return compile(source, relativePath, file, monitor);
    }
    
    try {
      driver.process(source, relativePath, file, monitor);
      storeCaches();
    } finally {
        pendingRuns.remove(file);
        putResult(source, file, driver.driverResult.getSugaredSyntaxTree() == null ? null : driver.driverResult);
    }
    
    return driver.driverResult;
  }
  
  /**
   * Process the given Extensible Java file.
   * 
   * @throws IOException 
   * @throws SGLRException 
   * @throws InvalidParseTableException 
   * @throws ParseException 
   * @throws BadTokenException 
   * @throws TokenExpectedException 
   * @throws InterruptedException 
   */
  private void process(String source, String relativePath, String file, IProgressMonitor monitor) throws IOException, TokenExpectedException, BadTokenException, ParseException, InvalidParseTableException, SGLRException, InterruptedException {
    this.monitor = monitor;
    log.beginTask("processing", "BEGIN PROCESSING " + relativePath);
    boolean success = false;
    try {
      relativePath = FileCommands.dropExtension(relativePath);
      init(relativePath);
      driverResult.setSourceFile(file, source.hashCode());
      
      if (relativePath != null) {
        javaOutFile = Environment.bin + sep + relativePath + ".java";
        driverResult.setGenerationLog(Environment.bin + sep + relativePath + ".gen");
        clearGeneratedStuff();
      }

      remainingInput = source;
  
      initEditorServices();

      boolean done = false;
      while (!done) {
        boolean wocache = Environment.wocache;
        Environment.wocache |= skipCache;
        
        stepped();
        
        // PARSE the next top-level declaration
        IncrementalParseResult parseResult =
            parseNextToplevelDeclaration(remainingInput, true);
        lastSugaredToplevelDecl = parseResult.getToplevelDecl();
        remainingInput = parseResult.getRest();
        
        stepped();
        
        // DESUGAR the parsed top-level declaration
        IStrategoTerm desugared = currentDesugar(lastSugaredToplevelDecl);
        
        // reset cache skipping
        Environment.wocache = wocache;
        
        stepped();
        
        // PROCESS the assimilated top-level declaration
        processToplevelDeclaration(desugared);

        done = parseResult.parsingFinished();
      }
      
      stepped();
            
      // check final grammar and transformation for errors
      if (!Environment.noChecking) {
        checkCurrentGrammar();
      }
      
      stepped();
      
      // need to build current transformation program for editor services
      checkCurrentTransformation();
      
      stepped();
      
      // COMPILE the generated java file
      compileGeneratedJavaFile();
      
      driverResult.setSugaredSyntaxTree(makeSugaredSyntaxTree());
      if (currentTransProg != null)
        driverResult.registerEditorDesugarings(currentTransProg);
      
      success = true;
    } 
    catch (CommandExecution.ExecutionError e) {
      // TODO do something more sensible
      e.printStackTrace();
      success = false;
    }
    finally {
      log.endTask(success, "done processing " + relativePath, "failed processing " + relativePath);
      driverResult.setFailed(!success);
    }
  }

  private void compileGeneratedJavaFile() throws IOException {
    log.beginTask("compilation", "COMPILE the generated java file");
    try {
      List<String> path = new ArrayList<String>(Environment.includePath);
      path.add(StdLib.stdLibDir.getPath());
      path.add(Environment.bin);
      
      driverResult.compileJava(javaOutFile, bin, path, generatedJavaClasses);
    } finally {
      log.endTask();
    }
  }

  private IncrementalParseResult parseNextToplevelDeclaration(String input, boolean recovery)
      throws IOException, ParseException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    int start = inputTreeBuilder.getTokenizer() == null ? 0 : inputTreeBuilder.getTokenizer().getStartOffset();
    log.beginTask("parsing", "PARSE the next toplevel declaration.");
    try {
      IStrategoTerm remainingInputTerm = null;
      
      try {
        remainingInputTerm = currentParse(input, recovery);
      } catch (Exception e) {
        if (recovery) {
          e.printStackTrace();
          remainingInputTerm = currentParse(input, false);
        }
        
        if (remainingInputTerm == null)
          throw e;
      }

      if (remainingInputTerm == null)
        throw new ParseException("could not parse toplevel declaration in:\n"
            + input, -1);

      if (!isApplication(remainingInputTerm, "NextToplevelDeclaration"))
        throw new ATermCommands.MatchError(remainingInputTerm, "NextToplevelDeclaration");
      
      IStrategoTerm toplevelDecl = getApplicationSubterm(remainingInputTerm, "NextToplevelDeclaration", 0);
      IStrategoTerm restTerm = getApplicationSubterm(remainingInputTerm, "NextToplevelDeclaration", 1);
      String rest = getString(restTerm);

      if (input.equals(rest))
        throw new SGLRException(parser.getParser(), "empty toplevel declaration parse rule");
      
      try {
        if (!rest.isEmpty())
          inputTreeBuilder.retract(restTerm);
      } catch (Throwable t) {
        t.printStackTrace();
      }
      
      if (toplevelDecl == null || rest == null)
        throw new ParseException(
            "could not parse next toplevel declaration in:\n"
                + remainingInputTerm.toString(),
            -1);
      
      String tmpFile = FileCommands.newTempFile("aterm");
      FileCommands.writeToFile(tmpFile, toplevelDecl.toString());
      log.log("next toplevel declaration parsed: " + tmpFile);

      return new IncrementalParseResult(toplevelDecl, rest);
    } catch (Exception e) {
      if (!recovery)
        throw new SGLRException(parser.getParser(), "parsing failed", e);
      
      String msg = e.getClass().getName() + " " + e.getLocalizedMessage() != null ? e.getLocalizedMessage() : e.toString();
      
      if (!(e instanceof StrategoException) && !(e instanceof SGLRException))
        e.printStackTrace();
      else
        log.logErr(msg);
      
      if (inputTreeBuilder.getTokenizer().getStartOffset() > start) {
        IToken token = inputTreeBuilder.getTokenizer().getTokenAtOffset(start);
        ((RetractableTokenizer) inputTreeBuilder.getTokenizer()).retractTo(token.getIndex());
        inputTreeBuilder.setOffset(start);
      }
      
      IToken right = inputTreeBuilder.getTokenizer().makeToken(start + input.length() - 1, IToken.TK_STRING, true);
      IToken left = inputTreeBuilder.getTokenizer().getTokenAtOffset(start);
      inputTreeBuilder.getTokenizer().makeToken(inputTreeBuilder.getTokenizer().getStartOffset() - 1, IToken.TK_EOF, true);
      IStrategoTerm term = ATermCommands.factory.makeString(input);
      ImploderAttachment.putImploderAttachment(term, false, "String", left, right);
      ATermCommands.setErrorMessage(term, msg);
      return new IncrementalParseResult(term, "");
    } finally {
      log.endTask();
    }
  }

  
  private void processEditorServicesDec(IStrategoTerm toplevelDecl) throws IOException {
    log.beginTask(
        "processing",
        "PROCESS the desugared editor services declaration.");
    try {
      if (!sugaredTypeOrSugarDecls.contains(lastSugaredToplevelDecl))
        sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);
      
      String extName = null;
      String fullExtName = null;
      boolean isPublic = false;

      IStrategoTerm head = getApplicationSubterm(toplevelDecl, "EditorServicesDec", 0);
      IStrategoTerm body= getApplicationSubterm(toplevelDecl, "EditorServicesDec", 1);
      
      log.beginTask("Extracting name and accessibility of the editor services.");
      try {
        extName =
          SDFCommands.prettyPrintJava(
          getApplicationSubterm(head, "EditorServicesDecHead", 1), interp);    
        
        IStrategoTerm mods = getApplicationSubterm(head, "EditorServicesDecHead", 0);
        
        for (IStrategoTerm t : getList(mods))
          if (isApplication(t, "Public"))
          {
            isPublic = true;
            break;
          }
        
        fullExtName = relPackageNameSep() + extName;

        log.log("The name of the editor services is '" + extName + "'.");
        log.log("The full name of the editor services is '" + fullExtName + "'.");

        if (isPublic)
          log.log("The editor services is public.");
        else
          log.log("The editor services is not public.");
      
        IStrategoTerm services = ATermCommands.getApplicationSubterm(body, "EditorServicesBody", 0);
        
        if (!ATermCommands.isList(services))
          throw new IllegalStateException("editor services are not a list: " + services);
        
        List<IStrategoTerm> editorServices = ATermCommands.getList(services);
        
        // XXX if (currentTransProg != null)
        editorServices = ATermCommands.registerSemanticProvider(editorServices, currentTransProg);
  
        String editorServicesFile = bin + sep + relPackageNameSep() + extName + ".serv";
        String depFile = bin + sep + relPackageNameSep() + extName + ".dep";
        FileCommands.createFile(editorServicesFile);
  
        log.log("writing editor services to " + editorServicesFile);
        
        StringBuffer buf = new StringBuffer();
        
        for (IStrategoTerm service : driverResult.getEditorServices())
          buf.append(service).append('\n');
        
        for (IStrategoTerm service : editorServices) {
          driverResult.addEditorService(service);
          buf.append(service).append('\n');
        }
        
        driverResult.generateFile(editorServicesFile, buf.toString());
        driverResult.writeDependencyFile(depFile);
      } finally {
        log.endTask();
      }
    } finally {
      log.endTask();
    }
  }
  
  private void processPlainDec(IStrategoTerm toplevelDecl) throws IOException {
    log.beginTask(
        "processing",
        "PROCESS the desugared plain declaration.");
    try {
      if (!sugaredTypeOrSugarDecls.contains(lastSugaredToplevelDecl))
        sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);

      
      String extName = null;
      String fullExtName = null;
      boolean isPublic = false;

      IStrategoTerm head = getApplicationSubterm(toplevelDecl, "PlainDec", 0);
      IStrategoTerm body= getApplicationSubterm(toplevelDecl, "PlainDec", 1);
      
      log.beginTask("Extracting name and accessibility.");
      try {
        extName =
          SDFCommands.prettyPrintJava(
          getApplicationSubterm(head, "PlainDecHead", 1), interp);    

        String extension = null;
        if (head.getSubtermCount() >= 3 && isApplication(getApplicationSubterm(head, "PlainDecHead", 2), "Some"))
          extension = Term.asJavaString(
                      getApplicationSubterm(getApplicationSubterm(head, "PlainDecHead", 2), "Some", 0));    
 

        
        IStrategoTerm mods = getApplicationSubterm(head, "PlainDecHead", 0);
        
        for (IStrategoTerm t : getList(mods))
          if (isApplication(t, "Public"))
          {
            isPublic = true;
            break;
          }
        
        fullExtName = relPackageNameSep() + extName + (extension == null ? "" : ("." + extension));

        log.log("The name is '" + extName + "'.");
        log.log("The full name is '" + fullExtName + "'.");

        if (isPublic)
          log.log("The plain file is public.");
        else
          log.log("The plain file is not public.");
      
        String plainContent = Term.asJavaString(ATermCommands.getApplicationSubterm(body, "PlainBody", 0));
        
        String plainFile = bin + sep + relPackageNameSep() + extName + (extension == null ? "" : ("." + extension));
        String depFile = bin + sep + relPackageNameSep() + extName + ".dep";
        FileCommands.createFile(plainFile);
  
        log.log("writing plain content to " + plainFile);
        driverResult.generateFile(plainFile, plainContent);
        driverResult.writeDependencyFile(depFile);
      } finally {
        log.endTask();
      }
    } finally {
      log.endTask();
    }
  }
  
  
  private void processToplevelDeclaration(IStrategoTerm toplevelDecl)
      throws IOException, TokenExpectedException, BadTokenException, ParseException, InvalidParseTableException, SGLRException {
    if (isApplication(toplevelDecl, "PackageDec"))
      processPackageDec(toplevelDecl);
    else {
      if (relPackageName == null)
        checkPackageName(toplevelDecl);
      if (javaOutFile == null)
        javaOutFile = Environment.bin + sep + relPackageNameSep() + FileCommands.fileName(driverResult.getSourceFile()) + ".java";
      try {
        if (isApplication(toplevelDecl, "TypeImportDec") || isApplication(toplevelDecl, "TypeImportOnDemandDec")) {
          if (!Environment.atomicImportParsing)
            processImportDec(toplevelDecl);
          else 
            processImportDecs(toplevelDecl);
        }
        else if (isApplication(toplevelDecl, "JavaTypeDec") || //XXX remove this branch
                 isApplication(toplevelDecl, "ClassDec") ||
                 isApplication(toplevelDecl, "InterfaceDec") ||
                 isApplication(toplevelDecl, "EnumDec") ||
                 isApplication(toplevelDecl, "AnnoDec"))
          processJavaTypeDec(toplevelDecl);
        else if (isApplication(toplevelDecl, "SugarDec"))
          processSugarDec(toplevelDecl);
        else if (isApplication(toplevelDecl, "EditorServicesDec")) 
          processEditorServicesDec(toplevelDecl);
        else if (isApplication(toplevelDecl, "PlainDec")) 
          processPlainDec(toplevelDecl);
        else if (ATermCommands.isList(toplevelDecl))
          /* 
           * Desugarings may generate lists of toplevel declarations. These declarations,
           * however, may not depend on one another.
           */
          for (IStrategoTerm term : ATermCommands.getList(toplevelDecl))
            processToplevelDeclaration(term);
        else if (ATermCommands.isString(toplevelDecl)) {
          if (!sugaredTypeOrSugarDecls.contains(lastSugaredToplevelDecl))
            sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);
        }
        else
          throw new IllegalArgumentException("unexpected toplevel declaration, desugaring probably failed: " + toplevelDecl.toString(5));
      } catch (Exception e) {
        String msg = e.getClass().getName() + " " + e.getLocalizedMessage() != null ? e.getLocalizedMessage() : e.toString();
        
        if (!(e instanceof StrategoException))
          e.printStackTrace();
        else
          log.logErr(msg);

        ATermCommands.setErrorMessage(toplevelDecl, msg);
        if (!sugaredTypeOrSugarDecls.contains(lastSugaredToplevelDecl))
          sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);

      }
    }
  }

  private IStrategoTerm currentParse(String remainingInput, boolean recovery) throws IOException,
      InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    // recompile the current grammar definition
    String currentGrammarTBL = SDFCommands.compile(currentGrammarSDF, currentGrammarModule, driverResult.getFileDependencies(), sdfParser, sdfContext, makePermissiveContext);
    driverResult.setLastParseTable(currentGrammarTBL);
    ParseTable table = org.strategoxt.imp.runtime.Environment.loadParseTable(currentGrammarTBL);
    
    IStrategoTerm parseResult = null;

    parser.setUseRecovery(recovery);
    
    // read next toplevel decl and stop if that fails
    try {
      parseResult = SDFCommands.parseImplode(
          table,
          remainingInput,
          "NextToplevelDeclaration",
          false,
          inputTreeBuilder,
          parser);
    } finally {
      if (recovery)
        driverResult.addBadTokenExceptions(parser.getCollectedErrors());
    }
    
    return parseResult;
  }

  private IStrategoTerm currentDesugar(IStrategoTerm term) throws IOException,
      InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    // assimilate toplevelDec using current transformation

    log.beginTask(
        "desugaring",
        "DESUGAR the current toplevel declaration.");
    try {
      currentTransProg = STRCommands.compile(currentTransSTR, "main", driverResult.getFileDependencies(), strParser, strjContext);

      return STRCommands.assimilate(currentTransProg, term, interp);
    } catch (RuntimeException e) {
      String msg = e.getClass().getName() + " " + e.getLocalizedMessage() != null ? e.getLocalizedMessage() : e.toString();
      
      if (!(e instanceof StrategoException))
        e.printStackTrace();
      else
        log.logErr(msg);

      ATermCommands.setErrorMessage(term, msg);
      return term;
    } finally {
      log.endTask();
    }
  }

  private void processPackageDec(IStrategoTerm toplevelDecl) throws IOException {
    log.beginTask("processing", "PROCESS the desugared package declaration.");
    try {
      sugaredPackageDecl = lastSugaredToplevelDecl;
      
      String packageName =
          SDFCommands.prettyPrintJava(
          getApplicationSubterm(toplevelDecl, "PackageDec", 1), interp);

      log.log("The Java package name is '" + packageName + "'.");

      relPackageName = FileCommands.getRelativeModulePath(packageName);

      log.log("The SDF / Stratego package name is '" + relPackageName + "'.");

      checkPackageName(toplevelDecl);
      
      if (javaOutFile == null)
        javaOutFile = Environment.bin + sep + relPackageNameSep() + FileCommands.fileName(driverResult.getSourceFile()) + ".java";
      driverResult.generateFile(javaOutFile, SDFCommands.prettyPrintJava(toplevelDecl, interp) + "\n");
    } finally {
      log.endTask();
    }
  }
  
  private void checkPackageName(IStrategoTerm toplevelDecl) {
    if (relativePath != null) {
      String packageName = relPackageName == null ? "" : relPackageName.replace('/', '.');
      
      int i = relativePath.lastIndexOf('/');
      String expectedPackage = i >= 0 ? relativePath.substring(0, i) : relativePath;
      expectedPackage = expectedPackage.replace('/', '.');
      if (!packageName.equals(expectedPackage))
        ATermCommands.setErrorMessage(
            toplevelDecl,
            "The declared package " + packageName +
            " does not match the expected package " + expectedPackage + ".");
    }
  }
  
  private void processImportDecs(IStrategoTerm toplevelDecl) throws IOException, TokenExpectedException, BadTokenException, ParseException, InvalidParseTableException, SGLRException {
    List<IStrategoTerm> pendingImports = new ArrayList<IStrategoTerm>();
    pendingImports.add(toplevelDecl);
    
    while (true) {
      IncrementalParseResult res = null;
      IStrategoTerm term = null;
      
      try {
        log.beginSilent();
        res = parseNextToplevelDeclaration(remainingInput, false);
        term = res.getToplevelDecl();
      }
      catch (Throwable t) {
        res = null;
        term = null;
      }
      finally {         
        log.endSilent(); 
      }
    
      if (res != null &&
          term != null &&
          (isApplication(term, "TypeImportDec") ||
           isApplication(term, "TypeImportOnDemandDec"))) {
        remainingInput = res.getRest();
        pendingImports.add(term);
      }
      else {
        if (term != null)
          inputTreeBuilder.retract(term);
        break;
      }
    }
    
    for (IStrategoTerm pendingImport : pendingImports) {
      lastSugaredToplevelDecl = pendingImport;
      processImportDec(pendingImport);
    }
  }

  private void processImportDec(IStrategoTerm toplevelDecl) {
    
    sugaredImportDecls.add(lastSugaredToplevelDecl);
    
    log.beginTask("processing", "PROCESS the desugared import declaration.");
    try {
      String importModule = ModuleSystemCommands.extractImportedModuleName(toplevelDecl, interp);

      // TODO handle import declarations with asterisks, e.g. import foo.*;
      
      String modulePath = FileCommands.getRelativeModulePath(importModule);
  
      if (!modulePath.startsWith("org/sugarj")) {
        URI depUri = ModuleSystemCommands.searchFile(modulePath, ".dep");
        Result res = null;
        URI sourceUri = null;
        
        if (depUri != null) {
          res = Result.readDependencyFile(depUri.getPath());
          
          if (res != null && res.getSourceFile() != null)
            sourceUri = new File(res.getSourceFile()).toURI();
        }
        
        if (sourceUri == null)
          sourceUri = ModuleSystemCommands.locateSourceFile(modulePath);

        if (sourceUri != null && (res == null || pendingInputFiles.contains(res.getSourceFile()) || !res.isUpToDate(res.getSourceFile()))) {
          log.log("Need to compile the imported module first ; processing it now.");
          
          try {
            Result importResult = compile(sourceUri, modulePath, monitor);
            if (importResult.hasFailed())
              ATermCommands.setErrorMessage(toplevelDecl, "problems while compiling " + importModule);
          } catch (Exception e) {
            ATermCommands.setErrorMessage(toplevelDecl, "problems while compiling " + importModule);
          }
            
          log.log("CONTINUE PROCESSING'" + relativePath + "'.");
        }
        
        if (depUri == null)
          depUri = ModuleSystemCommands.searchFile(modulePath, ".dep");
        
        if (depUri != null)
          driverResult.addDependency(depUri.getPath());
      }
      
      boolean success = processImport(modulePath, toplevelDecl);
      
      if (!success)
        ATermCommands.setErrorMessage(toplevelDecl, "module not found " + importModule);
      
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      log.endTask();
    }
  }
  
  private boolean processImport(String modulePath, IStrategoTerm importTerm) throws IOException {
    boolean success = false;
    
    success |= ModuleSystemCommands.importClass(
        modulePath, 
        importTerm, 
        javaOutFile,
        interp, 
        driverResult);

    URI grammarModule = ModuleSystemCommands.importSdf(modulePath);
    if (grammarModule != null) {
      success = true;
      availableSDFImports.add(modulePath);
      buildCompoundSdfModule();
    }
    
    URI strModule = ModuleSystemCommands.importStratego(modulePath);
    if (strModule != null) {
      success = true;
      availableSTRImports.add(modulePath);
      buildCompoundStrModule();
    }
    
    success |= ModuleSystemCommands.importEditorServices(modulePath, driverResult);
    
    return success;
  }

  private void processJavaTypeDec(IStrategoTerm toplevelDecl) throws IOException {
    log.beginTask(
        "processing",
        "PROCESS the desugared Java type declaration.");
    try {
      
      if (!sugaredTypeOrSugarDecls.contains(lastSugaredToplevelDecl))
        sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);

      
      log.beginTask("Generate Java code.");
      try {
        IStrategoTerm dec =  isApplication(toplevelDecl, "JavaTypeDec") ? getApplicationSubterm(toplevelDecl, "JavaTypeDec", 0) : toplevelDecl;
        
        String decName = Term.asJavaString(dec.getSubterm(0).getSubterm(1).getSubterm(0));
        
        String outName = bin + sep + relPackageNameSep() + decName;
        
        generatedJavaClasses.add(outName + ".class");
        driverResult.appendToFile(javaOutFile, SDFCommands.prettyPrintJava(dec, interp) + "\n");
        driverResult.writeDependencyFile(outName + ".dep");
      } finally {
        log.endTask();
      }
    } finally {
      log.endTask();
    }
  }

  private void processSugarDec(IStrategoTerm toplevelDecl) throws IOException,
      InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    log.beginTask(
        "processing",
        "PROCESS the desugared sugar declaration.");
    try {
      if (!sugaredTypeOrSugarDecls.contains(lastSugaredToplevelDecl))
        sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);

      
      boolean isNative;
      String extName = null;
      String fullExtName = null;
      boolean isPublic = false;

      IStrategoTerm head = getApplicationSubterm(toplevelDecl, "SugarDec", 0);
      IStrategoTerm body= getApplicationSubterm(toplevelDecl, "SugarDec", 1);
      
      log.beginTask("Extracting name and accessibility of the sugar.");
      try {
        isNative = isApplication(head, "NativeSugarDecHead");
        
        if (isNative) {
          extName =
            SDFCommands.prettyPrintJava(
            getApplicationSubterm(head, "NativeSugarDecHead", 2), interp);
          
          IStrategoTerm mods = getApplicationSubterm(head, "NativeSugarDecHead", 0);
          
          for (IStrategoTerm t : getList(mods))
            if (isApplication(t, "Public"))
            {
              isPublic = true;
              break;
            }
        }
        else {
          extName =
            SDFCommands.prettyPrintJava(
            getApplicationSubterm(head, "SugarDecHead", 1), interp);    
          
          IStrategoTerm mods = getApplicationSubterm(head, "SugarDecHead", 0);
          
          for (IStrategoTerm t : getList(mods))
            if (isApplication(t, "Public"))
            {
              isPublic = true;
              break;
            }
        }
        
        
        
        fullExtName = relPackageNameSep() + extName;

        log.log("The name of the sugar is '" + extName + "'.");
        log.log("The full name of the sugar is '" + fullExtName + "'.");

        if (isPublic)
          log.log("The sugar is public.");
        else
          log.log("The sugar is not public.");
        
        if (isNative)
          log.log("The sugar is native.");
        else
          log.log("The sugar is not native.");


      } finally {
        log.endTask();
      }
      
      String sdfExtension = bin + sep + relPackageNameSep() + extName + ".sdf";
      String strExtension = bin + sep + relPackageNameSep() + extName + ".str";
      String depFile = bin + sep + relPackageNameSep() + extName + ".dep";
      
      FileCommands.delete(sdfExtension);
      FileCommands.delete(strExtension);

      String sdfImports = " imports " + StringCommands.printListSeparated(availableSDFImports, " ") + "\n";
      String strImports = " imports " + StringCommands.printListSeparated(availableSTRImports, " ") + "\n";
      
      if (isNative) {
        String nativeModule = getString(getApplicationSubterm(body, "NativeSugarBody", 0)); 
        
        if (nativeModule.length() > 1)
            // remove quotes
          nativeModule = nativeModule.substring(1, nativeModule.length() - 1);
          
        if (FileCommands.exists(ModuleSystemCommands.searchFile(nativeModule, ".sdf"))) {
          availableSDFImports.add(nativeModule);
          driverResult.generateFile(
              sdfExtension, 
              "module " + fullExtName + "\n" 
              + sdfImports 
              + "imports " + nativeModule);
        }

        if (FileCommands.exists(ModuleSystemCommands.searchFile(nativeModule, ".str"))) {
          availableSTRImports.add(nativeModule);
          driverResult.generateFile(
              strExtension, 
              "module " + fullExtName + "\n" 
              + strImports
              + "imports " + nativeModule);
        }
      }
      else {
        // this is a list of SDF and Stratego statements
        IStrategoTerm sugarBody = getApplicationSubterm(body, "SugarBody", 0);
  
        IStrategoTerm sdfExtract = fixSDF(extractSDF(sugarBody, extractionContext), interp);
        IStrategoTerm strExtract = extractSTR(sugarBody, extractionContext);
        
        
        String sdfExtensionHead =
          "module " + fullExtName + "\n" 
          + sdfImports
          + (isPublic ? "exports " : "hiddens ") + "\n"
          + "  (/)" + "\n";

        String sdfExtensionContent = SDFCommands.prettyPrintSDF(sdfExtract, interp);

        String sdfSource = SDFCommands.makePermissiveSdf(sdfExtensionHead + sdfExtensionContent, makePermissiveContext);
        driverResult.generateFile(sdfExtension, sdfSource);
        availableSDFImports.add(fullExtName);
        
        if (CommandExecution.FULL_COMMAND_LINE)
          log.log("Wrote SDF file to '" + new File(sdfExtension).getAbsolutePath() + "'.");
        
        String strExtensionTerm = 
            "Module(" + "\"" + fullExtName+ "\"" + ", " 
                      + strExtract + ")" + "\n";

        String strExtensionContent = SDFCommands.prettyPrintSTR(ATermCommands.atermFromString(strExtensionTerm), interp);
        
        int index = strExtensionContent.indexOf('\n');
        if (index >= 0)
          strExtensionContent =
            strExtensionContent.substring(0, index + 1) + "\n"
            + strImports + "\n"
            + strExtensionContent.substring(index + 1);
        else
          strExtensionContent += strImports;
          
        
        driverResult.generateFile(strExtension, strExtensionContent);
        availableSTRImports.add(fullExtName);
        
        if (CommandExecution.FULL_COMMAND_LINE)
          log.log("Wrote Stratego file to '" + new File(strExtension).getAbsolutePath() + "'.");
      }
      
      driverResult.writeDependencyFile(depFile);

      /*
       * adapt current grammar
       */
      if (FileCommands.exists(sdfExtension)) {
        buildCompoundSdfModule();
      }

      /*
       * adapt current transformation
       */
      if (FileCommands.exists(strExtension))
        buildCompoundStrModule();

    } finally {
      log.endTask();
    }
  }
  
  private void buildCompoundSdfModule() throws IOException {
    currentGrammarSDF = FileCommands.newTempFile("sdf");
    currentGrammarModule = FileCommands.fileName(currentGrammarSDF);
    StringBuilder builder = new StringBuilder();
    builder.append("module ").append(currentGrammarModule).append("\n");
    builder.append("imports ");
    for (String m : availableSDFImports)
      builder.append(m).append(" ");
    
    FileCommands.writeToFile(currentGrammarSDF, builder.toString());
  }
  
  private void buildCompoundStrModule() throws IOException {
    currentTransSTR = FileCommands.newTempFile("str");
    currentTransModule = FileCommands.fileName(currentTransSTR);
    StringBuilder builder = new StringBuilder();
    builder.append("module ").append(currentTransModule).append("\n");
    builder.append("imports ");
    for (String m : availableSTRImports)
      builder.append(m).append(" ");
    
    FileCommands.writeToFile(currentTransSTR, builder.toString());
  }

  private void checkCurrentGrammar() throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    log.beginTask("checking grammar", "CHECK current grammar");
    
    try {
      SDFCommands.compile(currentGrammarSDF, currentGrammarModule, driverResult.getFileDependencies(), sdfParser, sdfContext, makePermissiveContext);
    } finally {
      log.endTask();
    }
  }
  
  private void checkCurrentTransformation() throws TokenExpectedException, BadTokenException, IOException, InvalidParseTableException, SGLRException {
    log.beginTask("checking transformation", "CHECK current transformation");
    
    try {
      currentTransProg = STRCommands.compile(currentTransSTR, "main", driverResult.getFileDependencies(), strParser, strjContext);
    } finally {
      log.endTask();
    }
  }
  
  private void initEditorServices() throws IOException, TokenExpectedException, BadTokenException, SGLRException {
    driverResult.addEditorService(
        ATermCommands.atermFromString(
          "Builders(\"sugarj checking\", [SemanticObserver(Strategy(\"sugarj-analyze\"))])"));
    
    IStrategoTerm initEditor = editorServicesParser.parse(new FileInputStream(StdLib.initEditor.getPath()), StdLib.initEditor.getPath());
    
    IStrategoTerm services = ATermCommands.getApplicationSubterm(initEditor, "Module", 2);
    
    if (!ATermCommands.isList(services))
      throw new IllegalStateException("initial editor ill-formed");
    
    for (IStrategoTerm service : ATermCommands.getList(services))
      driverResult.addEditorService(service);
  }
  
  private void init(String relativePath) throws FileNotFoundException, IOException, InvalidParseTableException {
    javaOutFile = null; 
    // FileCommands.createFile(tmpOutdir, relModulePath + ".java");

    this.relativePath = relativePath;

    currentGrammarSDF = StdLib.initGrammar.getPath();
    currentGrammarModule = StdLib.initGrammarModule;

    currentTransSTR = StdLib.initTrans.getPath();
    currentTransModule = StdLib.initTransModule;

    // list of imports that contain SDF extensions
    availableSDFImports = new ArrayList<String>();
    availableSDFImports.add(StdLib.initGrammarModule);

    // list of imports that contain Stratego extensions
    availableSTRImports = new ArrayList<String>();
    availableSTRImports.add(StdLib.initTransModule);

    inputTreeBuilder = new RetractableTreeBuilder();
    
    // XXX need to load ANY parse table, preferably an empty one.
    parser = new JSGLRI(org.strategoxt.imp.runtime.Environment.loadParseTable(StdLib.sdfTbl.getPath()), "Sdf2Module");
    
    sdfParser = new JSGLRI(org.strategoxt.imp.runtime.Environment.loadParseTable(StdLib.sdfTbl.getPath()), "Sdf2Module");
    strParser = new JSGLRI(org.strategoxt.imp.runtime.Environment.loadParseTable(StdLib.strategoTbl.getPath()), "StrategoModule");
    editorServicesParser = new JSGLRI(org.strategoxt.imp.runtime.Environment.loadParseTable(StdLib.editorServicesTbl.getPath()), "Module");

    interp = new HybridInterpreter(); //TODO (ATermCommands.factory);
    sdfContext = tools.init();
    makePermissiveContext = make_permissive.init();
    extractionContext = extraction.init();
    strjContext = org.strategoxt.strj.strj.init();
  }
  
  /**
   * @param args
   * @throws IOException
   */
  public static void main(String[] args) {
    // log.log("This is the extensible java compiler.");
    try {
      String[] sources = handleOptions(args);

      if (Environment.sourcePath.isEmpty())
        Environment.sourcePath.add(".");
      
      URL[] urls = new URL[Environment.sourcePath.size()];
      int i = 0;
      for (String path : Environment.sourcePath)
        urls[i++] = new File(path).toURI().toURL();
      
      ClassLoader loader = new URLClassLoader(urls);
      
      for (String source : sources)
      {
        URL url = loader.getResource(source);
        
        if (url == null)
          throw new FileNotFoundException(source);
        
        URI uri = url.toURI();
        
        allInputFiles.add(uri);
        pendingInputFiles.add(uri);
      }
      
      IProgressMonitor monitor = new PrintProgressMonitor(System.out);
      
      for (final URI source : allInputFiles) {
        monitor.beginTask("compile " + source.getPath(), IProgressMonitor.UNKNOWN);
        Result res = compile(source, null, monitor);
        if (!DriverCLI.processResultCLI(res, source.getPath(), new File(".").getAbsolutePath()))
          throw new RuntimeException("compilation of " + source.getPath() + " failed");
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } catch (CLIError e) {
      Log.log.log(e.getMessage());
      Log.log.log("");
      e.showUsage();
    }

    // kills all remaining subprocesses, if any
    // log.log("The extensible java compiler has done its job and says 'good bye'.");
    System.exit(0);
  }
  
  
  /**
   * This is thrown when a problem during option processing
   * occurs.
   *  
   * @author rendel@informatik.uni-marburg.de
   */
  public static class CLIError extends Error {
    private static final long serialVersionUID = -918505242287737113L;

    private final Options options; 
    
    public CLIError(String message, Options options) {
      super(message);
      this.options = options;
    }
    
    public void showUsage() {
      showUsageMessage(options);
    }
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
  private static String[] handleOptions(String[] args) {
    Options options = specifyOptions();

    try {
      CommandLine line = parseOptions(options, args);
      return processOptions(options, line);
    } catch (org.apache.commons.cli.ParseException e) {
      throw new CLIError(e.getMessage(), options);
    }
  }

  private static void showUsageMessage(Options options) {
    HelpFormatter formatter = new HelpFormatter();
    formatter.printHelp(
        "java -java sugarj.jar [options] source-files",
        options,
        false);
  }
  
  private static String[] processOptions(Options options, CommandLine line) throws org.apache.commons.cli.ParseException {
    if (line.hasOption("help")) {
      // TODO This is not exactly an error ...
      throw new CLIError("help requested", options);
    }

    if (line.hasOption("verbose")) {
      CommandExecution.SILENT_EXECUTION = false;
      CommandExecution.SUB_SILENT_EXECUTION = false;
      CommandExecution.FULL_COMMAND_LINE = true;
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
      for (String path : line.getOptionValue("buildpath").split(Environment.classpathsep))
        Environment.includePath.add(path);

    if (line.hasOption("sourcepath"))
      for (String path : line.getOptionValue("sourcepath").split(Environment.classpathsep))
        Environment.sourcePath.add(path);
 
    if (line.hasOption("d"))
      Environment.bin = line.getOptionValue("d");
    
    if (line.hasOption("cache"))
      Environment.cacheDir = line.getOptionValue("cache");

    if (line.hasOption("read-only-cache"))
      Environment.rocache = true;
    
    if (line.hasOption("write-only-cache"))
      Environment.wocache = true;
    
    if (line.hasOption("gen-java"))
      Environment.generateJavaFile = true;
    
    if (line.hasOption("atomic-imports"))
      Environment.atomicImportParsing = true;

    if (line.hasOption("no-checking"))
      Environment.noChecking = true;

    String[] sources = line.getArgs();
    if (sources.length < 1)
      throw new CLIError("No source files specified.", options);

    return sources;
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
        false, 
        "show verbose output");

    options.addOption(
        null, 
        "silent-execution", 
        false, 
        "try to be silent");

    options.addOption(
        null,
        "sub-silent-execution",
        false,
        "do not display output of subprocesses");

    options.addOption(
        null,
        "full-command-line",
        false,
        "show all arguments to subprocesses");

    options.addOption(
        null, 
        "cache-info", 
        false, 
        "show where files are cached");

    options.addOption(
        null,
        "buildpath",
        true,
        "Specify where to find compiled files. Multiple paths can be given separated by \'" + Environment.classpathsep + "\'.");

    options.addOption(
        null,
        "sourcepath",
        true,
        "Specify where to find source files. Multiple paths can be given separated by \'" + Environment.classpathsep + "\'.");

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
        "imports-changed",
        false,
        "Declare that the imported modules have changed since last compilation.");
    
    options.addOption(
        null,
        "gen-java",
        false,
        "Generate the resulting Java file in the source folder.");

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
    
    return options;
  }

  @SuppressWarnings("unchecked")
  private static synchronized void initializeCaches() throws IOException {
    if (Environment.cacheDir == null)
      return;
    
    String cacheVersion = FileCommands.findFile("version", Environment.cacheDir);
    
    if (cacheVersion == null || !FileCommands.readFileAsString(cacheVersion).equals(CACHE_VERSION)) {
      if (cacheVersion == null)
        cacheVersion = Environment.cacheDir + Environment.sep + "version";
      
      for (File f : new File(Environment.cacheDir).listFiles())
        f.delete();
      
      FileCommands.writeToFile(cacheVersion, CACHE_VERSION);
    }
    
    String sdfCache = FileCommands.findFile("sdfCache", Environment.cacheDir);
    String strCache = FileCommands.findFile("strCache", Environment.cacheDir);
    
    if (SDFCommands.sdfCache == null && sdfCache != null)
      try {
        log.log("load sdf cache from " + sdfCache);
          SDFCommands.sdfCache =
              (ModuleKeyCache<String>) new ObjectInputStream(new FileInputStream(
                  sdfCache)).readObject();
      } 
      catch (Exception e) {
        SDFCommands.sdfCache = new ModuleKeyCache<String>();
        e.printStackTrace();
      }
    else if (SDFCommands.sdfCache == null)
      SDFCommands.sdfCache = new ModuleKeyCache<String>();
    
    if (STRCommands.strCache == null && strCache != null)
      try {
        log.log("load str cache from " + strCache);
        STRCommands.strCache =
            (ModuleKeyCache<String>) new ObjectInputStream(new FileInputStream(
                strCache)).readObject();
      } 
      catch (Exception e) {
        STRCommands.strCache = new ModuleKeyCache<String>();
        e.printStackTrace();
      }
    else if (STRCommands.strCache == null)
      STRCommands.strCache = new ModuleKeyCache<String>();
  }

  
  private static synchronized void storeCaches() throws IOException {
    if (Environment.cacheDir == null || Environment.rocache)
      return;
    
    String cacheVersion = FileCommands.findFile("version", Environment.cacheDir);
    if (cacheVersion == null || !FileCommands.readFileAsString(cacheVersion).equals(CACHE_VERSION)) {
      if (cacheVersion == null)
        cacheVersion = Environment.cacheDir + Environment.sep + "version";
      FileCommands.writeToFile(cacheVersion, CACHE_VERSION);
    }
    
    String sdfCache = FileCommands.findFile("sdfCache", Environment.cacheDir);
    String strCache = FileCommands.findFile("strCache", Environment.cacheDir);

    if (sdfCache == null) {
      sdfCache = Environment.cacheDir + sep + "sdfCache";
      FileCommands.createFile(sdfCache);
    }

    if (strCache == null) {
      strCache = Environment.cacheDir + sep + "strCache";
      FileCommands.createFile(strCache);
    }
    
    
    if (SDFCommands.sdfCache != null) {
      log.log("store sdf cache in " + sdfCache);
      log.log("sdf cache size: " + SDFCommands.sdfCache.size());
      new ObjectOutputStream(new FileOutputStream(sdfCache)).writeObject(SDFCommands.sdfCache);
    }
    
    if (STRCommands.strCache != null) {
      log.log("store str cache in " + strCache);
      log.log("str cache size: " + STRCommands.strCache.size());
      new ObjectOutputStream(new FileOutputStream(strCache)).writeObject(STRCommands.strCache);
    }
  }

  private String relPackageNameSep() {
    if (relPackageName == null || relPackageName.isEmpty())
      return "";
    
    return relPackageName + sep;
  }
  
  /**
   * @return the non-desugared syntax tree of the complete file.
   */
  private IStrategoTerm makeSugaredSyntaxTree() {
    
    // XXX empty lists => no tokens
    IStrategoTerm packageDecl = ATermCommands.makeSome(sugaredPackageDecl, inputTreeBuilder.getTokenizer().getTokenAt(0));
    IStrategoTerm imports = 
      ATermCommands.makeList("JavaImportDec*", ImploderAttachment.getRightToken(packageDecl), sugaredImportDecls);
    IStrategoTerm body =
      ATermCommands.makeList("TypeOrSugarDec*", ImploderAttachment.getRightToken(imports), sugaredTypeOrSugarDecls);
    
    IStrategoTerm term =
      ATermCommands.makeAppl("SugarCompilationUnit", "SugarCompilationUnit", 3,
        packageDecl,
        imports,
        body);
    
    ImploderAttachment.getTokenizer(term).setAst(term);
    ImploderAttachment.getTokenizer(term).initAstNodeBinding();
    
    return term;
  }
  
  public synchronized void interrupt() {
    this.interrupt = true;
  }
  
  private synchronized void stopIfInterrupted() throws InterruptedException {
    if (interrupt || monitor.isCanceled()) {
      monitor.setCanceled(true);
      log.log("interrupted " + relativePath);
      throw new InterruptedException();
    }
  }

  private void stepped() throws InterruptedException {
    stopIfInterrupted();
    monitor.worked(1);
  }
  
  private void clearGeneratedStuff() throws IOException {
    if (driverResult.getGenerationLog() != null && FileCommands.exists(driverResult.getGenerationLog())) {
      BufferedReader br = new BufferedReader(new FileReader(driverResult.getGenerationLog()));
      String line;
      while ((line = br.readLine()) != null)
        FileCommands.delete(line);
      br.close();
      FileCommands.writeToFile(driverResult.getGenerationLog(), "");
    }
  }
}
