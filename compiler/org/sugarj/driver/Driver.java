package org.sugarj.driver;

import static org.sugarj.common.ATermCommands.fixSDF;
import static org.sugarj.common.ATermCommands.getApplicationSubterm;
import static org.sugarj.common.ATermCommands.isApplication;
import static org.sugarj.common.Log.log;
import static org.sugarj.driver.SDFCommands.extractSDF;
import static org.sugarj.driver.STRCommands.extractSTR;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.SoftReference;
import java.text.ParseException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr_layout.client.ITreeBuilder;
import org.spoofax.jsglr_layout.client.InvalidParseTableException;
import org.spoofax.jsglr_layout.client.ParseTable;
import org.spoofax.jsglr_layout.client.SGLR;
import org.spoofax.jsglr_layout.client.imploder.ImploderAttachment;
import org.spoofax.jsglr_layout.client.imploder.TreeBuilder;
import org.spoofax.jsglr_layout.shared.BadTokenException;
import org.spoofax.jsglr_layout.shared.SGLRException;
import org.spoofax.jsglr_layout.shared.TokenExpectedException;
import org.spoofax.terms.Term;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.lang.StrategoException;
import org.sugarj.LanguageLib;
import org.sugarj.LanguageLibFactory;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.ATermCommands.PrettyPrintError;
import org.sugarj.common.CommandExecution;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;
import org.sugarj.common.StringCommands;
import org.sugarj.common.path.AbsolutePath;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.driver.caching.ModuleKeyCache;
import org.sugarj.driver.declprovider.SourceToplevelDeclarationProvider;
import org.sugarj.driver.declprovider.TermToplevelDeclarationProvider;
import org.sugarj.driver.declprovider.ToplevelDeclarationProvider;
import org.sugarj.driver.transformations.primitive.SugarJPrimitivesLibrary;
import org.sugarj.stdlib.StdLib;
import org.sugarj.util.Pair;
import org.sugarj.util.ProcessingListener;
import org.sugarj.util.Renaming;


/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Driver{
  
  private final static int PENDING_TIMEOUT = 30000;

  private static Map<Path, SoftReference<Result>> resultCache = new HashMap<Path, SoftReference<Result>>(); // new LRUMap(50);

  private static Map<Path, Entry<ToplevelDeclarationProvider, Driver>> pendingRuns = new HashMap<Path, Map.Entry<ToplevelDeclarationProvider,Driver>>();
  private static List<Path> pendingInputFiles = new ArrayList<Path>();
  private static List<ProcessingListener> processingListener = new LinkedList<ProcessingListener>();

  private List<Driver> currentlyProcessing;
  private Set<Path> circularLinks = new HashSet<Path>();
  private boolean dependsOnModel = false;

  private IProgressMonitor monitor;
  
  private Environment environment;
  
  private Result driverResult;
  
  private Path depOutFile;

  private RelativePath sourceFile;
  private ToplevelDeclarationProvider declProvider;

  private Path currentGrammarSDF;
  private String currentGrammarModule;
  private Path currentTransSTR;
  private String currentTransModule;
  private List<String> availableSDFImports;
  private List<String> availableSTRImports;
  
  private IStrategoTerm sugaredNamespaceDecl;
  private IStrategoTerm desugaredNamespaceDecl;
  private List<IStrategoTerm> sugaredImportDecls = new ArrayList<IStrategoTerm>();
  private List<IStrategoTerm> desugaredImportDecls = new ArrayList<IStrategoTerm>();
  private List<IStrategoTerm> sugaredTypeOrSugarDecls = new ArrayList<IStrategoTerm>();
  
  private IStrategoTerm lastSugaredToplevelDecl;
  
  private SGLR sdfParser;
  private SGLR strParser;
  private SGLR editorServicesParser;
  private SGLR parser;
  
  /**
   * cache location -> language library -> cache
   */
  private static Map<Path, Map<String,ModuleKeyCache<Path>>> sdfCaches;
  private static Map<Path, Map<String,ModuleKeyCache<Path>>> strCaches;
  
  private ModuleKeyCache<Path> sdfCache;
  private ModuleKeyCache<Path> strCache;
  
  private Path currentGrammarTBL;
  private Path currentTransProg;
  
  private boolean interrupt = false;
  
  private boolean inDesugaredDeclList;
  
  private LanguageLib langLib;
  
  
  public Driver(Environment env, LanguageLibFactory langLibFactory, List<Driver> currentlyProcessing) {
    this.environment = env;
    this.langLib = langLibFactory.createLanguageLibrary();
    this.currentlyProcessing = currentlyProcessing;
    this.driverResult = new Result(environment.doGenerateFiles());
    
    langLib.setInterpreter(new HybridInterpreter());
//    stratego_aterm.registerInterop(langLib.getInterpreter().getContext(), langLib.getInterpreter().getCompiledContext());
//    stratego_gpp.registerInterop(langLib.getInterpreter().getContext(), langLib.getInterpreter().getCompiledContext());
    langLib.getInterpreter().addOperatorRegistry(new SugarJPrimitivesLibrary(this, environment, driverResult, monitor));

    try {      
      if (environment.getCacheDir() != null)
        FileCommands.createDir(environment.getCacheDir());
      
      FileCommands.createDir(environment.getBin());
      
      initializeCaches(environment, false);
      sdfCache = selectCache(sdfCaches, langLibFactory, environment);
      strCache = selectCache(strCaches, langLibFactory, environment);
    } catch (IOException e) {
      throw new RuntimeException("error while initializing driver", e);
    }
  }  
  
  private static synchronized Result getResult(Path file) {
    SoftReference<Result> res = resultCache.get(file);
    if (res != null) {
      if (res.get() == null)
        resultCache.remove(file);
      return res.get();
    }
    return null;
  }
  
  private static synchronized Entry<ToplevelDeclarationProvider, Driver> getPendingRun(Path file) {
    return pendingRuns.get(file);
  }
  
  private static synchronized void putPendingRun(Path file, ToplevelDeclarationProvider declProvider, Driver driver) {
    pendingRuns.put(file, new AbstractMap.SimpleImmutableEntry<ToplevelDeclarationProvider, Driver>(declProvider, driver));
  }
  
  public static synchronized void addProcessingDoneListener(ProcessingListener listener) {
    processingListener.add(listener);
  }
  
  public static synchronized void removeProcessingDoneListener(ProcessingListener listener) {
    processingListener.remove(listener);
  }
  
  private static void waitForPending(Path file) {
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

  private static synchronized void putResult(Path file, Result result) {
    resultCache.put(file, new SoftReference<Result>(result));
  }

  public static Result run(RelativePath sourceFile, Environment env, IProgressMonitor monitor, LanguageLibFactory langLibFactory) throws IOException, TokenExpectedException, ParseException, InvalidParseTableException, SGLRException, InterruptedException {
    return run(sourceFile, env, monitor, langLibFactory, new LinkedList<Driver>());
  }

  public static Result run(RelativePath sourceFile, Environment env, IProgressMonitor monitor, LanguageLibFactory langLibFactory, List<Driver> currentlyProcessing) throws IOException, TokenExpectedException, ParseException, InvalidParseTableException, SGLRException, InterruptedException {
    return run(FileCommands.readFileAsString(sourceFile), sourceFile, env, monitor, langLibFactory, currentlyProcessing);
  }

  public static Result run(String source, RelativePath sourceFile, Environment env, IProgressMonitor monitor, LanguageLibFactory langLibFactory) throws IOException, TokenExpectedException, ParseException, InvalidParseTableException, SGLRException, InterruptedException {
    return run(source, sourceFile, env, monitor, langLibFactory, new LinkedList<Driver>());
  }
  
  public static Result run(String source, RelativePath sourceFile, Environment env, IProgressMonitor monitor, LanguageLibFactory langLibFactory, List<Driver> currentlyProcessing) throws IOException, TokenExpectedException, ParseException, InvalidParseTableException, SGLRException, InterruptedException {
    Driver driver = new Driver(env, langLibFactory, currentlyProcessing);
    return run(driver, new SourceToplevelDeclarationProvider(driver, source), sourceFile, monitor);
  }

  public static Result run(IStrategoTerm source, RelativePath sourceFile, Environment env, IProgressMonitor monitor, LanguageLibFactory langLibFactory, List<Driver> currentlyProcessing) throws IOException, TokenExpectedException, ParseException, InvalidParseTableException, SGLRException, InterruptedException {
    Driver driver = new Driver(env, langLibFactory, currentlyProcessing);
    return run(driver, new TermToplevelDeclarationProvider(source), sourceFile, monitor);
  }
  
  private static Result run(Driver driver, ToplevelDeclarationProvider declProvider, RelativePath sourceFile, IProgressMonitor monitor) throws IOException, TokenExpectedException, ParseException, InvalidParseTableException, SGLRException, InterruptedException {
    Entry<ToplevelDeclarationProvider, Driver> pending = null;
    
    pending = getPendingRun(sourceFile);
    if (pending != null && !pending.getKey().equals(declProvider) && pending.getValue().environment.doGenerateFiles() == driver.environment.doGenerateFiles()) {
      log.log("interrupting " + sourceFile, Log.CORE);
      pending.getValue().interrupt();
    }

    if (pending == null) {
      Result result = getResult(sourceFile);
      if (result == null || result != null && result.hasPersistentVersionChanged()) {
        result = ModuleSystemCommands.locateResult(FileCommands.dropExtension(sourceFile.getRelativePath()), driver.environment);
        if (result != null && result.getSugaredSyntaxTree() != null)
          putResult(sourceFile, result);
      }
      
      if (result != null &&
          (driver.environment.doGenerateFiles() || result.getSugaredSyntaxTree() != null) &&
          result.isUpToDate(declProvider.getSourceHashCode(), driver.environment))
        return result;
    }
    
    if (pending == null)
      putPendingRun(sourceFile, declProvider, driver);
    
    if (pending != null) {
      waitForPending(sourceFile);
      return run(driver, declProvider, sourceFile, monitor);
    }
    
    try {
      synchronized (processingListener) {
        for (ProcessingListener listener : processingListener)
          listener.processingStarts(sourceFile);
      }
    
      driver.process(declProvider, sourceFile, monitor);
      Driver.storeCaches(driver.environment);
    
      synchronized (processingListener) {
        for (ProcessingListener listener : processingListener)
          listener.processingDone(driver.driverResult);
      }
    } catch (Exception e) {
      org.strategoxt.imp.runtime.Environment.logException(e);
    } finally {
      pendingRuns.remove(sourceFile);

    //if (env.doGenerateFiles())
      putResult(sourceFile, driver.driverResult != null && driver.driverResult.getSugaredSyntaxTree() != null ? driver.driverResult : null);
    }

    return driver.driverResult;
  }
  
  private void init(ToplevelDeclarationProvider declProvider, RelativePath sourceFile, IProgressMonitor monitor) throws FileNotFoundException, IOException, InvalidParseTableException {
    this.monitor = monitor;
    environment.getIncludePath().add(new AbsolutePath(langLib.getLibraryDirectory().getAbsolutePath()));
  
    depOutFile = null;
  
    this.sourceFile = sourceFile;
    this.declProvider = declProvider;
    
    currentGrammarSDF = new AbsolutePath(langLib.getInitGrammar().getPath());
    currentGrammarModule = langLib.getInitGrammarModule();
    
    currentTransSTR = new AbsolutePath(langLib.getInitTrans().getPath());
    currentTransModule = langLib.getInitTransModule();
    
    // list of imports that contain SDF extensions
    availableSDFImports = new ArrayList<String>();    
    availableSDFImports.add(langLib.getInitGrammarModule());
  
    // list of imports that contain Stratego extensions
    availableSTRImports = new ArrayList<String>();
    availableSTRImports.add(langLib.getInitTransModule());
  
    sdfParser = new SGLR(new TreeBuilder(), ATermCommands.parseTableManager.loadFromFile(StdLib.sdfTbl.getPath()));
    strParser = new SGLR(new TreeBuilder(), ATermCommands.parseTableManager.loadFromFile(StdLib.strategoTbl.getPath()));
    editorServicesParser = new SGLR(new TreeBuilder(), ATermCommands.parseTableManager.loadFromFile(StdLib.editorServicesTbl.getPath()));
  }

  /**
   * Process the given Extensible Java file.
   * 
   * @throws IOException 
   * @throws SGLRException 
   * @throws InvalidParseTableException 
   * @throws ParseException 
   * @throws TokenExpectedException 
   * @throws InterruptedException 
   */
  private void process(ToplevelDeclarationProvider declProvider, RelativePath sourceFile, IProgressMonitor monitor) throws IOException, TokenExpectedException, ParseException, InvalidParseTableException, SGLRException, InterruptedException {
    List<Renaming> originalRenamings = new LinkedList<Renaming>(environment.getRenamings());
    currentlyProcessing.add(this);
    
    log.beginTask("processing", "Process " + sourceFile.getRelativePath(), Log.CORE);
    boolean success = false;
    try {
      init(declProvider, sourceFile, monitor);
      driverResult.setSourceFile(this.sourceFile, declProvider.getSourceHashCode());
      
      if (sourceFile != null) {
        langLib.setupSourceFile(sourceFile, environment);

        depOutFile = environment.createBinPath(FileCommands.dropExtension(sourceFile.getRelativePath()) + ".dep");
        Path genLog = environment.createBinPath(FileCommands.dropExtension(sourceFile.getRelativePath()) + ".gen");
        driverResult.setGenerationLog(genLog);
//        clearGeneratedStuff();
      }

      initEditorServices();

      boolean done = false;
      while (!done) {
        stepped();
        
        // PARSE the next top-level declaration
        lastSugaredToplevelDecl = declProvider.getNextToplevelDecl(true);
        
        stepped();
        
        IStrategoTerm analyzed = currentAnalyze(lastSugaredToplevelDecl);
        analyzed = ATermCommands.copyTokens(lastSugaredToplevelDecl, analyzed);
        lastSugaredToplevelDecl = analyzed;
        
        stepped();
        
        // DESUGAR the parsed top-level declaration
        IStrategoTerm desugared = currentDesugar(analyzed);
        
        stepped();
        
        // RENAME the desugared top-level declaration
        IStrategoTerm renamed = currentRename(desugared);
        
        stepped();
        
        // PROCESS the assimilated top-level declaration
        processToplevelDeclaration(renamed);

        done = !declProvider.hasNextToplevelDecl();
      }
      
      stepped();
            
      // check final grammar and transformation for errors
      if (!environment.isNoChecking()) {
        checkCurrentGrammar();
      }
      
      stepped();
      
      // need to build current transformation program for editor services
      checkCurrentTransformation();
      
      stepped();

      driverResult.setSugaredSyntaxTree(makeSugaredSyntaxTree());
      driverResult.registerParseTable(currentGrammarTBL);
      driverResult.registerEditorDesugarings(currentTransProg);

      // COMPILE the generated java file
      if (circularLinks.isEmpty())
        compileGeneratedFiles();
      else {
        Result delegate = null;
        for (Driver dr : currentlyProcessing)
          if (circularLinks.contains(dr.sourceFile)) {
            delegate = dr.driverResult;
            break;
          }
        if (delegate != null)
          driverResult.delegateCompilation(delegate, langLib.getOutFile(), langLib.getSource(), langLib.getGeneratedFiles());
        else if (!dependsOnModel)
          throw new IllegalStateException("Could not delegate compilation of circular dependency to other compiler instance.");
      }
        
      if (environment.doGenerateFiles())
        driverResult.writeDependencyFile(depOutFile);

      success = true;
    } 
    finally {
      log.endTask(success, "done processing " + sourceFile, "failed to process " + sourceFile);
      driverResult.setFailed(!success);
      currentlyProcessing.remove(this);
      environment.setRenamings(originalRenamings);
    }
  }

  private void compileGeneratedFiles() throws IOException {
    boolean good = false;
    log.beginTask("compilation", "COMPILE generated " + langLib.getFactoryForLanguage().getLanguageName() + " files", Log.CORE);
    try {
      try {
        langLib.compile(
            langLib.getOutFile(), 
            langLib.getSource(),
            environment.getBin(), 
            new ArrayList<Path>(environment.getIncludePath()), 
            langLib.getGeneratedFiles(),
            driverResult.getAvailableGeneratedFiles(),
            driverResult.getDeferredSourceFiles(),
            driverResult.getGeneratedFileHashes(), 
            driverResult.isGenerateFiles());
      } catch (ClassNotFoundException e) {
        setErrorMessage("Could not resolve imported class " + e.getMessage());
        // throw new RuntimeException(e);
      }
      good = true;
    } finally {
      log.endTask(good, "compilation succeeded", "compilation failed");
    }
  }

  private void processToplevelDeclaration(IStrategoTerm toplevelDecl)
      throws IOException, TokenExpectedException, ParseException, InvalidParseTableException, SGLRException {
    if (langLib.isNamespaceDec(toplevelDecl))
      processNamespaceDec(toplevelDecl);
    else {
      if (depOutFile == null) {
        // does this ever occur?
        assert false;
        depOutFile = environment.createBinPath(langLib.getRelativeNamespaceSep() + FileCommands.fileName(driverResult.getSourceFile()) + ".dep");
      }
      try {
        if (langLib.isImportDec(toplevelDecl) || langLib.isTransformationApplication(toplevelDecl)) {
          if (inDesugaredDeclList || !environment.isAtomicImportParsing())
            processImportDec(toplevelDecl);
          else 
            processImportDecs(toplevelDecl);
        }
        else if (langLib.isLanguageSpecificDec(toplevelDecl))
          processLanguageDec(toplevelDecl);
        else if (langLib.isSugarDec(toplevelDecl))
          processSugarDec(toplevelDecl);
        else if (langLib.isEditorServiceDec(toplevelDecl)) 
          processEditorServicesDec(toplevelDecl);
        else if (langLib.isPlainDec(toplevelDecl))   // XXX: Decide what to do with "Plain"--leave in the language or create a new "Plain" language
          processPlainDec(toplevelDecl);
        else if (langLib.isTransformationDec(toplevelDecl))
          processTransformationDec(toplevelDecl);
        else if (langLib.isModelDec(toplevelDecl))
          processModelDec(toplevelDecl);
        else if (ATermCommands.isList(toplevelDecl)) {
          /* 
           * Desugarings may generate lists of toplevel declarations.
           */
          List<IStrategoTerm> list = ATermCommands.getList(toplevelDecl);
//          sortForImports(list);

          boolean old = inDesugaredDeclList;
          inDesugaredDeclList = true;
          
          try {
            for (IStrategoTerm term : list)
              processToplevelDeclaration(term);
          } finally {
            inDesugaredDeclList = old;
          }
        }
        else if (ATermCommands.isString(toplevelDecl)) {
          if (!sugaredTypeOrSugarDecls.contains(lastSugaredToplevelDecl))
            sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);
        }
        else
          throw new IllegalArgumentException("unexpected toplevel declaration, desugaring probably failed: " + toplevelDecl.toString(20));
      } catch (Exception e) {
        String msg = e.getClass().getName() + " " + e.getLocalizedMessage() != null ? e.getLocalizedMessage() : e.toString();
        
        if (!(e instanceof StrategoException))
          e.printStackTrace();

        setErrorMessage(msg);
        if (!sugaredTypeOrSugarDecls.contains(lastSugaredToplevelDecl))
          sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);

      }
    }
  }


  
  private void processEditorServicesDec(IStrategoTerm toplevelDecl) throws IOException {
    log.beginTask("processing", "PROCESS editor services.", Log.CORE);
    try {
      if (!sugaredTypeOrSugarDecls.contains(lastSugaredToplevelDecl))
        sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);
      
      String extName = langLib.getEditorName(toplevelDecl);
      String fullExtName = getFullRenamedDeclarationName(extName);
      checkModuleName(extName);

      log.log("The name of the editor services is '" + extName + "'.", Log.DETAIL);
      log.log("The full name of the editor services is '" + fullExtName + "'.", Log.DETAIL);
    
      generateModel(fullExtName, toplevelDecl);
      if (dependsOnModel)
        return;
      
      IStrategoTerm services = langLib.getEditorServices(toplevelDecl);
      
      if (!ATermCommands.isList(services))
        throw new IllegalStateException("editor services are not a list: " + services);
      
      List<IStrategoTerm> editorServices = ATermCommands.getList(services);
      
      // XXX if (currentTransProg != null)
      editorServices = ATermCommands.registerSemanticProvider(editorServices, currentTransProg);

      Path editorServicesFile = environment.createBinPath(langLib.getRelativeNamespaceSep() + extName + ".serv");
      
      log.log("writing editor services to " + editorServicesFile, Log.DETAIL);
      
      StringBuffer buf = new StringBuffer();
      
      for (IStrategoTerm service : driverResult.getEditorServices())
        buf.append(service).append('\n');
      
      for (IStrategoTerm service : editorServices) {
//        driverResult.addEditorService(service);
        buf.append(service).append('\n');
      }
      
      driverResult.generateFile(editorServicesFile, buf.toString());
    } finally {
      log.endTask();
    }
  }
  
  private void processPlainDec(IStrategoTerm toplevelDecl) throws IOException {
    log.beginTask("processing", "PROCESS plain declaration.", Log.CORE);
    try {
      if (!sugaredTypeOrSugarDecls.contains(lastSugaredToplevelDecl))
        sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);

      IStrategoTerm head = getApplicationSubterm(toplevelDecl, "PlainDec", 0);
      IStrategoTerm body= getApplicationSubterm(toplevelDecl, "PlainDec", 1);
      
      String extName = ATermCommands.getString(getApplicationSubterm(head, "PlainDecHead", 1));
      checkModuleName(extName);

      String extension = null;
      if (head.getSubtermCount() >= 3 && isApplication(getApplicationSubterm(head, "PlainDecHead", 2), "Some"))
        extension = Term.asJavaString(getApplicationSubterm(getApplicationSubterm(head, "PlainDecHead", 2), "Some", 0));    

      String fullExtName = getFullRenamedDeclarationName(extName);
      fullExtName = fullExtName + (extension == null ? "" : ("." + extension));
      
      log.log("The name is '" + extName + "'.", Log.DETAIL);
      log.log("The full name is '" + fullExtName + "'.", Log.DETAIL);

      generateModel(fullExtName, toplevelDecl);
      if (dependsOnModel)
        return;
      
      String plainContent = Term.asJavaString(ATermCommands.getApplicationSubterm(body, "PlainBody", 0));
      
      String ext = extension == null ? "" : ("." + extension);
      Path plainFile = environment.createBinPath(langLib.getRelativeNamespaceSep() + extName + ext);
      FileCommands.createFile(plainFile);

      log.log("writing plain content to " + plainFile, Log.DETAIL);
      driverResult.generateFile(plainFile, plainContent);
    } finally {
      log.endTask();
    }
  }
  
  
  public Pair<IStrategoTerm, Integer> currentParse(String remainingInput, ITreeBuilder treeBuilder, boolean recovery) throws IOException, InvalidParseTableException, TokenExpectedException, SGLRException {
    
    currentGrammarTBL = SDFCommands.compile(currentGrammarSDF, currentGrammarModule, driverResult.getFileDependencies(), sdfParser, sdfCache, environment, langLib);
    driverResult.addFileDependency(currentGrammarTBL);

    ParseTable table = ATermCommands.parseTableManager.loadFromFile(currentGrammarTBL.getAbsolutePath());
    
    Pair<SGLR, Pair<IStrategoTerm, Integer>> parseResult = null;

    // read next toplevel decl and stop if that fails
    try {
      parseResult = SDFCommands.parseImplode(
          table,
          remainingInput,
          sourceFile,
          "ToplevelDeclaration",
          recovery,
          true,
          treeBuilder);
//    } catch (SGLRException e) {
//      this.parser = e.getParser();
//      log.logErr(e.getMessage(), Log.DETAIL);
//      return null;
    } finally {
      if (parseResult != null)
        this.parser = parseResult.a;
      
      if (recovery && parser != null) {
        for (BadTokenException e : parser.getCollectedErrors())
          driverResult.logParseError(e);
      }
    }
    
    return parseResult.b;
  }

  private IStrategoTerm currentAnalyze(IStrategoTerm term) throws IOException, InvalidParseTableException, TokenExpectedException, SGLRException {
  // assimilate toplevelDec using current transformation
  
    log.beginTask("analyze", "ANALYZE toplevel declaration.", Log.CORE);
    try {
      currentTransProg = STRCommands.compile(currentTransSTR, "main", driverResult.getFileDependencies(), strParser, strCache, environment, langLib);
      driverResult.addFileDependency(currentTransProg);
    
      return STRCommands.assimilate("analyze-main", currentTransProg, term, langLib.getInterpreter());
    } catch (StrategoException e) {
      String msg = e.getClass().getName() + " " + e.getLocalizedMessage() != null ? e.getLocalizedMessage() : e.toString();
      
      log.logErr(msg, Log.DETAIL);
      setErrorMessage(msg);
      return term;
    } finally {
      log.endTask();
    }
  }

  private IStrategoTerm currentDesugar(IStrategoTerm term) throws IOException,
      InvalidParseTableException, TokenExpectedException, SGLRException {
    // assimilate toplevelDec using current transformation

    log.beginTask("desugaring", "DESUGAR toplevel declaration.", Log.CORE);
    try {
      if (currentTransProg == null)
        return term;
      
      return STRCommands.assimilate(currentTransProg, term, langLib.getInterpreter());
    } catch (StrategoException e) {
      String msg = e.getClass().getName() + " " + e.getLocalizedMessage() != null ? e.getLocalizedMessage() : e.toString();
      
      log.logErr(msg, Log.DETAIL);
      setErrorMessage(msg);
      return term;
    } finally {
      log.endTask();
    }
  }

  /**
   * Apply current renamings stored in environment to the given term.
   */
  public IStrategoTerm currentRename(IStrategoTerm term) throws IOException, InvalidParseTableException, TokenExpectedException, SGLRException {
    try {
      if (currentTransProg == null)
        return term;
      
      IStrategoTerm result = STRCommands.assimilate("apply-renamings", currentTransProg, term, langLib.getInterpreter());
      return result == null ? term : result;
    } catch (StrategoException e) {
      String msg = e.getClass().getName() + " " + e.getLocalizedMessage() != null ? e.getLocalizedMessage() : e.toString();

      log.logErr(msg, Log.DETAIL);
      setErrorMessage(msg);
      return term;
    }
  }

  
  private void processNamespaceDec(IStrategoTerm toplevelDecl) throws IOException {
    log.beginTask("processing", "PROCESS namespace declaration.", Log.CORE);
    try {
      sugaredNamespaceDecl = lastSugaredToplevelDecl;
      desugaredNamespaceDecl = toplevelDecl;

      langLib.processNamespaceDec(toplevelDecl, environment, driverResult, sourceFile, driverResult.getSourceFile());    
      if (depOutFile == null)
        depOutFile = environment.createBinPath(langLib.getRelativeNamespaceSep() + FileCommands.fileName(driverResult.getSourceFile()) + ".dep");
      
    } finally {
      log.endTask();
    }
  }

  
  private void processImportDecs(IStrategoTerm toplevelDecl) throws IOException, TokenExpectedException, ParseException, InvalidParseTableException, SGLRException {
    List<IStrategoTerm> pendingImports = new ArrayList<IStrategoTerm>();
    pendingImports.add(toplevelDecl);
    
    while (declProvider.hasNextToplevelDecl()) {
      IStrategoTerm term = null;
      
      try {
        log.beginSilent();
        term = declProvider.getNextToplevelDecl(false);
      }
      catch (Throwable t) {
        term = null;
      }
      finally {         
        log.endSilent(); 
      }
    
      if (term != null && (langLib.isImportDec(term) || langLib.isTransformationApplication(term)))
        pendingImports.add(term);
      else {
        declProvider.retract(term);
        break;
      }
    }
    
    for (IStrategoTerm pendingImport : pendingImports) {
      lastSugaredToplevelDecl = pendingImport;
      processImportDec(pendingImport);
    }
  }

  private void processImportDec(IStrategoTerm toplevelDecl) {
    
    if (!sugaredImportDecls.contains(lastSugaredToplevelDecl))
      sugaredImportDecls.add(lastSugaredToplevelDecl);
    desugaredImportDecls.add(toplevelDecl);
    
    log.beginTask("processing", "PROCESS import declaration.", Log.CORE);
    try {
      String modulePath;
      boolean isCircularImport;
      if (!langLib.isTransformationApplication(toplevelDecl)) {
        modulePath = langLib.getImportedModulePath(toplevelDecl);
        
        isCircularImport = prepareImport(toplevelDecl, modulePath);
        
        String localModelName = langLib.getImportLocalName(toplevelDecl);
        
        if (localModelName != null)
          environment.getRenamings().add(0, new Renaming(Collections.<String>emptyList(), localModelName, FileCommands.fileName(modulePath)));
      } else {
        IStrategoTerm appl = langLib.getTransformationApplication(toplevelDecl);
        IStrategoTerm model = getApplicationSubterm(appl, "TransApp", 1);
        IStrategoTerm transformation = getApplicationSubterm(appl, "TransApp", 0);
        
        ImportCommands imp = new ImportCommands(langLib, environment, this, driverResult, new STRCommands(strParser, strCache, environment, langLib));
        Pair<String, Boolean> transformationResult = imp.transformModel(model, transformation, lastSugaredToplevelDecl);
        if (transformationResult == null)
          return ;
        
        modulePath = transformationResult.a;
        isCircularImport = transformationResult.b;
        
        String localModelName = langLib.getImportLocalName(toplevelDecl);
        
        if (localModelName != null)
          environment.getRenamings().add(0, new Renaming(Collections.<String>emptyList(), localModelName, FileCommands.fileName(modulePath)));
        else
          environment.getRenamings().add(0, new Renaming(ImportCommands.getTransformationApplicationModelPath(appl, langLib), modulePath));
        
        IStrategoTerm reconstructedImport = langLib.reconstructImport(modulePath, toplevelDecl);
        desugaredImportDecls.remove(toplevelDecl);
        desugaredImportDecls.add(reconstructedImport);
        toplevelDecl = reconstructedImport;
      }
      
      if (isCircularImport)
        return;
      boolean codeImportSuccess = processImport(modulePath, toplevelDecl);
      boolean modelImportSuccess = processModelImport(modulePath);
      if (modelImportSuccess && !codeImportSuccess)
        dependsOnModel = true;
      boolean success = codeImportSuccess || modelImportSuccess;
      
      if (!success)
        setErrorMessage("module not found: " + modulePath);
      
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      log.endTask();
    }
  }

  /**
   * Prepare import:
   *  - locate pre-existing result and/or source file
   *  - determine whether the import is circular
   *  - initiate subcompilation of imported source file if necessary
   *  - add appropriate dependencies to driverResult 
   * 
   * @param toplevelDecl
   * @param modulePath
   * @return true iff the import is circular.
   * @throws IOException
   * @throws InterruptedException 
   * @throws SGLRException 
   * @throws InvalidParseTableException 
   * @throws ParseException 
   * @throws TokenExpectedException 
   */
  protected boolean prepareImport(IStrategoTerm toplevelDecl, String modulePath) throws IOException, TokenExpectedException, ParseException, InvalidParseTableException, SGLRException, InterruptedException {
    boolean isCircularImport = false;
    
    if (!modulePath.startsWith("org/sugarj")) { // module is not in sugarj standard library
      Result res = ModuleSystemCommands.locateResult(modulePath, environment);
      RelativePath importSourceFile;
      if (res != null && res.getSourceFile() != null)
        importSourceFile = res.getSourceFile();
      else
        importSourceFile = ModuleSystemCommands.locateSourceFileOrModel(modulePath, environment.getSourcePath(), langLib, environment);

      boolean sourceFileAvailable = importSourceFile != null;
      boolean requiresUpdate = res == null || res.getSourceFile() == null || pendingInputFiles.contains(res.getSourceFile()) || !res.isUpToDate(res.getSourceFile(), environment);
      
      if (sourceFileAvailable && requiresUpdate && !environment.doGenerateFiles()) {
        // This is a parser run. Required module needs to be compiled before.
        log.log("Module outdated, compile first: " + modulePath + ".", Log.IMPORT);
        setErrorMessage("module outdated, compile first: " + modulePath);
      }
      else if (sourceFileAvailable && requiresUpdate && getCircularImportResult(importSourceFile) != null) {
        // Circular import. Assume source file does not provide syntactic sugar.
        log.log("Circular import detected: " + modulePath + ".", Log.IMPORT);
        langLib.addImportedModule(toplevelDecl, false);
        isCircularImport = true;
        circularLinks.add(importSourceFile);
      }
      else if (sourceFileAvailable && requiresUpdate && environment.doGenerateFiles()) {
        // This is a compiler run. Required module needs recompilation.
        log.log("Need to compile imported module " + modulePath + " first.", Log.IMPORT);
        
        res = subcompile(toplevelDecl, importSourceFile);
        if (res == null || res.hasFailed())
          setErrorMessage("Problems while compiling " + modulePath);
          
        log.log("CONTINUE PROCESSING'" + sourceFile + "'.", Log.CORE);
      }
      
      if (isCircularImport) {
        driverResult.addCircularDependency(getCircularImportResult(importSourceFile));
      }
      
      if (!isCircularImport && res != null) {
        if (res.getPersistentPath() == null || res.hasPersistentVersionChanged())
          setErrorMessage("Result is inconsitent with persistent version.");
        driverResult.addDependency(res);
      }
      
      if (!isCircularImport && importSourceFile != null)
        // if importSourceFile is delegated to something currently being processed
        for (Driver dr : currentlyProcessing)
          if (dr.driverResult.isDelegateOf(importSourceFile)) {
            langLib.addImportedModule(toplevelDecl, false);
            isCircularImport = true;
            
            if (dr != this)
              circularLinks.add(dr.sourceFile);
            
            break;
          }
    }
    
    return isCircularImport;
  }
  
  /**
   * Checks if the given source file is a circular import.
   * Checks the ongoing driver runs to determine whether the source file in turn imports the current source file.
   * 
   * @return null if the import is not circular. The path to the imported file's driver result otherwise.
   */
  private Path getCircularImportResult(RelativePath importSourceFile) {
    for (Driver dr : currentlyProcessing)
      if (dr.sourceFile.equals(importSourceFile))
        return dr.depOutFile;
    
    return null;
  }

  /**
   * Subcompile source file.
   * @param toplevelDecl
   * @param importSourceFile
   * @return
   * @throws InterruptedException
   */
  public Result subcompile(IStrategoTerm toplevelDecl, RelativePath importSourceFile) throws InterruptedException {
    try {
      if ("model".equals(FileCommands.getExtension(importSourceFile))) {
        IStrategoTerm term = ATermCommands.atermFromFile(importSourceFile.getAbsolutePath());
        return run(term, importSourceFile, environment, monitor, langLib.getFactoryForLanguage(), currentlyProcessing);
      }
      else
        return run(importSourceFile, environment, monitor, langLib.getFactoryForLanguage(), currentlyProcessing);
    } catch (IOException e) {
      setErrorMessage("Problems while compiling " + importSourceFile);
    } catch (TokenExpectedException e) {
      setErrorMessage("Problems while compiling " + importSourceFile);
    } catch (ParseException e) {
      setErrorMessage("Problems while compiling " + importSourceFile);
    } catch (InvalidParseTableException e) {
      setErrorMessage("Problems while compiling " + importSourceFile);
    } catch (SGLRException e) {
      setErrorMessage("Problems while compiling " + importSourceFile);
    }
    return null;
  }
  
  private boolean processImport(String modulePath, IStrategoTerm importTerm) throws IOException {
    boolean success = false;
    
    Path clazz = ModuleSystemCommands.importBinFile(modulePath, environment, langLib, driverResult);
    if (clazz != null || langLib.isModuleResolvable(modulePath)) {
      success = true;
      langLib.addImportedModule(importTerm, true);
    }

    Path sdf = ModuleSystemCommands.importSdf(modulePath, environment, driverResult);
    if (sdf != null) {
      success = true;
      availableSDFImports.add(modulePath);
      buildCompoundSdfModule();
    }
    
    Path str = ModuleSystemCommands.importStratego(modulePath, environment, driverResult);
    if (str != null) {
      success = true;
      availableSTRImports.add(modulePath);
      buildCompoundStrModule();
    }
    
    success |= ModuleSystemCommands.importEditorServices(modulePath, environment, driverResult);
    
    return success;
  }
  
  private boolean processModelImport(String modulePath) throws IOException {
    RelativePath model = ModuleSystemCommands.importModel(modulePath, environment, driverResult);
    if (model != null) {
//      availableModels.add(model);
      return true;
    }
    
    return false;
  }

  private void processLanguageDec(IStrategoTerm toplevelDecl) throws IOException {
    log.beginTask("processing", "PROCESS " + langLib.getFactoryForLanguage().getLanguageName() + " declaration.", Log.CORE);
    try {
      
      if (!sugaredTypeOrSugarDecls.contains(lastSugaredToplevelDecl))
        sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);
      
      generateModel(FileCommands.dropExtension(sourceFile.getRelativePath()), toplevelDecl);
      if (dependsOnModel)
        return;
      
      log.beginTask("Generate " + langLib.getFactoryForLanguage().getLanguageName() + " code.", Log.LANGLIB);
      try {
        langLib.processLanguageSpecific(toplevelDecl, environment);
      } finally {
        log.endTask();
      }
    } finally {
      log.endTask();
    }
  }

  private void processSugarDec(IStrategoTerm toplevelDecl) throws IOException, InvalidParseTableException, TokenExpectedException, SGLRException {
    log.beginTask("processing", "PROCESS sugar declaration.", Log.CORE);
    try {
      if (!sugaredTypeOrSugarDecls.contains(lastSugaredToplevelDecl))
        sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);

      String extName = langLib.getSugarName(toplevelDecl);
      String fullExtName = getFullRenamedDeclarationName(extName);
      checkModuleName(extName);

      log.log("The name of the sugar is '" + extName + "'.", Log.DETAIL);
      log.log("The full name of the sugar is '" + fullExtName + "'.", Log.DETAIL);
      
      generateModel(fullExtName, toplevelDecl);
      if (dependsOnModel)
        return;
      
      Path sdfExtension = environment.createBinPath(langLib.getRelativeNamespaceSep() + extName + ".sdf");
      Path strExtension = environment.createBinPath(langLib.getRelativeNamespaceSep() + extName + ".str");
      
      String sdfImports = " imports " + StringCommands.printListSeparated(availableSDFImports, " ") + "\n";
      String strImports = " imports " + StringCommands.printListSeparated(availableSTRImports, " ") + "\n";
      
      // this is a list of SDF and Stratego statements
      
      IStrategoTerm sugarBody = langLib.getSugarBody(toplevelDecl);

      IStrategoTerm sdfExtract = fixSDF(extractSDF(sugarBody), langLib.getInterpreter());
      IStrategoTerm strExtract = extractSTR(sugarBody);
      
      String sdfExtensionHead =
        "module " + fullExtName + "\n" 
        + sdfImports
        + "exports " + "\n"
        + "  (/)" + "\n";

      String sdfExtensionContent = SDFCommands.prettyPrintSDF(sdfExtract, langLib.getInterpreter());

      String sdfSource = SDFCommands.makePermissiveSdf(sdfExtensionHead + sdfExtensionContent);
      driverResult.generateFile(sdfExtension, sdfSource);
      availableSDFImports.add(fullExtName);
      
      if (CommandExecution.FULL_COMMAND_LINE && environment.doGenerateFiles())
        log.log("Wrote SDF file to '" + sdfExtension.getAbsolutePath() + "'.", Log.DETAIL);
      
      String strExtensionString = "Module(" + "\"" + fullExtName+ "\"" + ", " + strExtract + ")" + "\n";
      IStrategoTerm strExtensionTerm = ATermCommands.atermFromString(strExtensionString);
      try {
        strExtensionTerm = STRCommands.assimilate("strip-annos", currentTransProg, strExtensionTerm, langLib.getInterpreter());
      } catch (Exception e) {
        e.printStackTrace();
      }
      String strExtensionContent = SDFCommands.prettyPrintSTR(strExtensionTerm, langLib.getInterpreter());
      
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
      
      if (CommandExecution.FULL_COMMAND_LINE && environment.doGenerateFiles())
        log.log("Wrote Stratego file to '" + strExtension.getAbsolutePath() + "'.", Log.DETAIL);
      
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

    } catch (PrettyPrintError e) {
      setErrorMessage(e.getMsg());
    } finally {
      log.endTask();
    }
  }
  
  private void processTransformationDec(IStrategoTerm toplevelDecl) throws IOException {
    log.beginTask("processing", "PROCESS transformation declaration.", Log.CORE);
    try {
      if (!sugaredTypeOrSugarDecls.contains(lastSugaredToplevelDecl))
        sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);

      String extName = langLib.getTransformationName(toplevelDecl);
      String fullExtName = getFullRenamedDeclarationName(extName);
      checkModuleName(extName);
      
      Path strExtension = environment.createBinPath(langLib.getRelativeNamespaceSep() + extName + ".str");
      IStrategoTerm transBody = langLib.getTransformationBody(toplevelDecl);
      if (isApplication(transBody, "TransformationDef")) 
        transBody = ATermCommands.factory.makeListCons(ATermCommands.makeAppl("Rules", "Rules", 1, transBody.getSubterm(0)), (IStrategoList) transBody.getSubterm(1));
      
      log.log("The name of the transformation is '" + extName + "'.", Log.DETAIL);
      log.log("The full name of the transformation is '" + fullExtName + "'.", Log.DETAIL);
      
      generateModel(fullExtName, toplevelDecl);
      if (dependsOnModel)
        return;
      
      String qualifiedMain = "main-" + fullExtName.replace('/', '_');
      IStrategoTerm renamedTransBody = STRCommands.renameRules(transBody, "main", qualifiedMain);
      
      String strImports = " imports " + StringCommands.printListSeparated(availableSTRImports, " ") + "\n";
      String strExtensionTerm = "Module(" + "\"" + fullExtName+ "\"" + ", " + renamedTransBody + ")" + "\n";
      String strExtensionContent = SDFCommands.prettyPrintSTR(ATermCommands.atermFromString(strExtensionTerm), langLib.getInterpreter());
      
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
      
      if (environment.doGenerateFiles())
        log.log("Wrote Stratego file to '" + strExtension.getAbsolutePath() + "'.", Log.DETAIL);
      
      /*
       * adapt current transformation
       */
      if (FileCommands.exists(strExtension))
        buildCompoundStrModule();

    } finally {
      log.endTask();
    }
  }
  
  private String getFullRenamedDeclarationName(String declName) {
    String fullExtName = langLib.getRelativeNamespaceSep() + declName;
    
//    for (Renaming ren : environment.getRenamings())
//      fullExtName = StringCommands.rename(fullExtName, ren);

//    fullExtName = fullExtName.replace("$", "-");
    return fullExtName;
  }
  
  private void processModelDec(IStrategoTerm toplevelDecl) throws IOException {
    log.beginTask("processing", "PROCESS model declaration.", Log.CORE);
    try {
      if (!sugaredTypeOrSugarDecls.contains(lastSugaredToplevelDecl))
        sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);
  
      String modelName = langLib.getModelName(toplevelDecl);
      String fullModelName = getFullRenamedDeclarationName(modelName);
      checkModuleName(modelName);
  
      log.log("The name of the model is '" + modelName + "'.", Log.DETAIL);
//      checkToplevelDeclarationName(modelName.replace("-", "$"), "model", toplevelDecl);
      
      generateModel(fullModelName, toplevelDecl);
    } finally {
      log.endTask();
    }
  }
  
  private void generateModel(String fullModelName, IStrategoTerm body) throws IOException {
    log.beginTask("Generate model.", Log.DETAIL);
    try {
      RelativePath modelOutFile = environment.createBinPath(fullModelName + ".model");
      
      IStrategoTerm modelTerm = makeDesugaredSyntaxTree(body);
      String string = ATermCommands.atermToString(modelTerm);
      driverResult.generateFile(modelOutFile, string);
      
      if (modelOutFile.equals(sourceFile))
        driverResult.setSourceFile(sourceFile, string.hashCode());
    } finally {
      log.endTask();
    }
  }
  
  private void buildCompoundSdfModule() throws IOException {
    FileCommands.deleteTempFiles(currentGrammarSDF);
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
    FileCommands.deleteTempFiles(currentTransSTR);
    currentTransSTR = FileCommands.newTempFile("str");
    currentTransModule = FileCommands.fileName(currentTransSTR);
    StringBuilder builder = new StringBuilder();
    builder.append("module ").append(currentTransModule).append("\n");
    builder.append("imports ");
    for (String m : availableSTRImports)
      builder.append(m).append(" ");
    
    FileCommands.writeToFile(currentTransSTR, builder.toString());
  }

  private void checkCurrentGrammar() throws IOException, InvalidParseTableException, TokenExpectedException, SGLRException {
    log.beginTask("checking grammar", "CHECK current grammar", Log.CORE);
    
    try {
      SDFCommands.compile(currentGrammarSDF, currentGrammarModule, driverResult.getFileDependencies(), sdfParser, sdfCache, environment, langLib);
    } finally {
      log.endTask();
    }
  }
  
  private void checkCurrentTransformation() throws TokenExpectedException, IOException, InvalidParseTableException, SGLRException {
    log.beginTask("checking transformation", "CHECK current transformation", Log.CORE);
    
    try {
      currentTransProg = STRCommands.compile(currentTransSTR, "main", driverResult.getFileDependencies(), strParser, strCache, environment, langLib);
    } catch (StrategoException e) {
      String msg = e.getClass().getName() + " " + e.getLocalizedMessage() != null ? e.getLocalizedMessage() : e.toString();
      log.logErr(msg, Log.DETAIL);
      setErrorMessage(msg);
    } finally {
      log.endTask();
    }
  }
    
  private void checkModuleName(String decName) {
    String expectedDecName = FileCommands.fileName(langLib.getOutFile());
    if (expectedDecName != null && !expectedDecName.equals(decName))
      setErrorMessage("Declaration name " + decName + " does not match file name " + expectedDecName);
  }

  private void initEditorServices() throws IOException, TokenExpectedException, SGLRException, InterruptedException {
    IStrategoTerm stdEditor = (IStrategoTerm) editorServicesParser.parse(FileCommands.readFileAsString(StdLib.stdEditor), StdLib.stdEditor.getPath(), "Module");
    IStrategoTerm initEditor = (IStrategoTerm) editorServicesParser.parse(FileCommands.readFileAsString(langLib.getInitEditor()), langLib.getInitEditor().getPath(), "Module");

    IStrategoTerm stdServices = ATermCommands.getApplicationSubterm(stdEditor, "Module", 2);
    IStrategoTerm services = ATermCommands.getApplicationSubterm(initEditor, "Module", 2);
    
    if (!ATermCommands.isList(stdServices))
      throw new IllegalStateException("standard editor ill-formed");
    if (!ATermCommands.isList(services))
      throw new IllegalStateException("initial editor ill-formed");
    
    for (IStrategoTerm service : ATermCommands.getList(stdServices))
      driverResult.addEditorService(service);
    for (IStrategoTerm service : ATermCommands.getList(services))
      driverResult.addEditorService(service);
  }
  
  @SuppressWarnings("unchecked")
  private static synchronized void initializeCaches(Environment environment, boolean force) throws IOException {
    if (environment.getCacheDir() == null)
      return;
    
    Path stdlibVersion = environment.createCachePath("version");
    if (!stdlibVersion.getFile().exists() || !FileCommands.readFileAsString(stdlibVersion).equals(StdLib.VERSION)) {
      for (File f : environment.getCacheDir().getFile().listFiles())
        f.delete();
      FileCommands.writeToFile(stdlibVersion, StdLib.VERSION);
    }
    
    Path sdfCachePath = environment.createCachePath("sdfCaches");
    Path strCachePath = environment.createCachePath("strCaches");
    
    if (sdfCaches == null || force)
      sdfCaches = new HashMap<Path, Map<String,ModuleKeyCache<Path>>>();
    if (strCaches == null || force)
      strCaches = new HashMap<Path, Map<String, ModuleKeyCache<Path>>>();
    
    ObjectInputStream sdfIn = null;
    ObjectInputStream strIn = null;
    try{
      sdfIn = new ObjectInputStream(new FileInputStream(sdfCachePath.getFile()));
      if (!sdfCaches.containsKey(environment.getCacheDir())) {
        Map<String, ModuleKeyCache<Path>> sdfLocalCaches = (Map<String, ModuleKeyCache<Path>>) sdfIn.readObject();
        sdfCaches.put(environment.getCacheDir(), sdfLocalCaches);
      }
      strIn = new ObjectInputStream(new FileInputStream(strCachePath.getFile()));
      if (!strCaches.containsKey(environment.getCacheDir())) {
        Map<String, ModuleKeyCache<Path>> strLocalCaches = (Map<String, ModuleKeyCache<Path>>) strIn.readObject();
        strCaches.put(environment.getCacheDir(), strLocalCaches);
      }
    } catch (Exception e) {
      sdfCaches.put(environment.getCacheDir(), new HashMap<String, ModuleKeyCache<Path>>());
      strCaches.put(environment.getCacheDir(), new HashMap<String, ModuleKeyCache<Path>>());
      for (File f : environment.getCacheDir().getFile().listFiles())
        f.delete();
    } finally {
      if (sdfIn != null)
        sdfIn.close();
      if (strIn != null)
        strIn.close();
    }
  }

  private static ModuleKeyCache<Path> selectCache(Map<Path, Map<String, ModuleKeyCache<Path>>> caches, LanguageLibFactory langLibFactory, Environment environment) throws IOException {
    if (caches == null)
      return null;
    synchronized (caches) {
      ModuleKeyCache<Path> cache = caches.get(environment.getCacheDir()).get(langLibFactory.getLanguageName());
      Path versionPath = environment.createCachePath(langLibFactory.getLanguageName() + ".version");
      if (cache != null &&
          (!FileCommands.exists(versionPath) || !langLibFactory.getVersion().equals(FileCommands.readFileAsString(versionPath))))
        cache = null;
      if (cache == null) {
        cache = new ModuleKeyCache<Path>(caches);
        FileCommands.writeToFile(versionPath, langLibFactory.getVersion());
        caches.get(environment.getCacheDir()).put(langLibFactory.getLanguageName(), cache);
      }
      return cache;
    }
  }
  
//TODO is this needed?
//  private static ModuleKeyCache<Path> reallocate(ModuleKeyCache<Path> cache, Environment env) {
//    ModuleKeyCache<Path> res = new ModuleKeyCache<Path>();
//    
//    for (Entry<ModuleKey, Path> e : cache.entrySet()) {
//      Map<Path, Integer> imports = new HashMap<Path, Integer>();
//      for (Entry<Path, Integer> e2 : e.getKey().imports.entrySet())
//        imports.put(Path.reallocate(e2.getKey(), env), e2.getValue());
//      
//      res.put(new ModuleKey(imports, e.getKey().body), Path.reallocate(e.getValue(), env));
//    }
//    
//    return res;
//  }


  private static synchronized void storeCaches(Environment environment) throws IOException {
    if (environment.getCacheDir() == null)
      return;
    
    Path cacheVersion = environment.createCachePath("version");
    FileCommands.writeToFile(cacheVersion, StdLib.VERSION);
    
    Path sdfCachePath = environment.createCachePath("sdfCaches");
    Path strCachePath = environment.createCachePath("strCaches");

    if (!sdfCachePath.getFile().exists())
      FileCommands.createFile(sdfCachePath);

    if (!strCachePath.getFile().exists())
      FileCommands.createFile(strCachePath);
    
    if (sdfCaches != null) {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(sdfCachePath.getFile()));
      try {
        oos.writeObject(sdfCaches.get(environment.getCacheDir()));
      } finally {
        oos.close();
      }
    }
    
    if (strCaches != null) {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(strCachePath.getFile()));
      try {
        oos.writeObject(strCaches.get(environment.getCacheDir()));
      } finally {
        oos.close();
      }
    }
  }


  
  /**
   * @return the non-desugared syntax tree of the complete file.
   */
  private IStrategoTerm makeSugaredSyntaxTree() {
    // XXX empty lists => no tokens
    IStrategoTerm packageDecl = ATermCommands.makeSome(sugaredNamespaceDecl, declProvider.getStartToken());
    IStrategoTerm imports = 
      ATermCommands.makeList("JavaImportDec*", ImploderAttachment.getRightToken(packageDecl), sugaredImportDecls);
    IStrategoTerm body =
      ATermCommands.makeList("TypeOrSugarDec*", ImploderAttachment.getRightToken(imports), sugaredTypeOrSugarDecls);
    
    IStrategoTerm term =
      ATermCommands.makeAppl("CompilationUnit", "CompilationUnit", 3,
        packageDecl,
        imports,
        body);
    
    if (ImploderAttachment.getTokenizer(term) != null) {
      ImploderAttachment.getTokenizer(term).setAst(term);
      ImploderAttachment.getTokenizer(term).initAstNodeBinding();
    }
    
    return term;
  }
  
  /**
   * @return the desugared syntax tree of the complete file.
   */
  private IStrategoTerm makeDesugaredSyntaxTree(IStrategoTerm bodyTerm) {
    IStrategoTerm packageDecl = ATermCommands.makeSome(desugaredNamespaceDecl, declProvider.getStartToken());
    IStrategoTerm imports =
      ATermCommands.makeList("JavaImportDec*", ImploderAttachment.getRightToken(packageDecl), desugaredImportDecls);
    IStrategoTerm body =
      ATermCommands.makeList("TypeOrSugarDec*", ImploderAttachment.getRightToken(imports), bodyTerm);
    
    IStrategoTerm term =
      ATermCommands.makeAppl("CompilationUnit", "CompilationUnit", 3,
        packageDecl,
        imports,
        body);
    
    return term;
  }

  
  public synchronized void interrupt() {
    this.interrupt = true;
  }
  
  private synchronized void stopIfInterrupted() throws InterruptedException {
    if (interrupt || monitor.isCanceled()) {
      monitor.setCanceled(true);
      log.log("interrupted " + sourceFile, Log.CORE);
      throw new InterruptedException("Compilation interrupted");
    }
  }

  private void stepped() throws InterruptedException {
    stopIfInterrupted();
    monitor.worked(1);
  }
  
  private void clearGeneratedStuff() throws IOException {
    if (environment.doGenerateFiles() && driverResult.getGenerationLog() != null && FileCommands.exists(driverResult.getGenerationLog())) {

      ObjectInputStream ois = null;
      
      try {
        ois = new ObjectInputStream(new FileInputStream(driverResult.getGenerationLog().getFile()));
        while (true) {
          try {
            Path p = (Path) ois.readObject();
            FileCommands.delete(p);
          } catch (ClassNotFoundException e) { 
          }
        }
      } catch (EOFException e) {
      } catch (Exception e) {
        e.printStackTrace();
      } finally {
        if (ois != null)
          ois.close();
        FileCommands.delete(driverResult.getGenerationLog());
      }
    }
  }
  
  public void setErrorMessage(IStrategoTerm toplevelDecl, String msg) {
    driverResult.logError(msg);
    ATermCommands.setErrorMessage(toplevelDecl, msg);
  }

  public void setErrorMessage(String msg) {
    setErrorMessage(lastSugaredToplevelDecl, msg);
  }

  private void sortForImports(List<IStrategoTerm> list) {
    Collections.sort(list, new Comparator<IStrategoTerm>() {
      @Override
      public int compare(IStrategoTerm o1, IStrategoTerm o2) {
        boolean imp1 = langLib.isImportDec(o1);
        boolean imp2 = langLib.isImportDec(o2);
        if (imp1 && imp2 || !imp1 && !imp2)
          return 0;
        return imp1 ? -1 : 1;
      }
    });
  }
  
  public IStrategoTerm getNamespaceDec() {
    return sugaredNamespaceDecl;
  }
  
  public LanguageLib getLanguageLib() {
    return langLib;
  }
  
  public String getModuleName() {
    return FileCommands.fileName(sourceFile);
  }
  
  public List<IStrategoTerm> getSugaredImportDecls() {
    return sugaredImportDecls;
  }

  public SGLR getParser() {
    return parser;
  }

  public IStrategoTerm getTreeForErrorMarking() {
    return lastSugaredToplevelDecl;
  }
  
  public Result getCurrentResult() {
    return driverResult;
  }
}
