package org.sugarj.driver;

import static org.sugarj.driver.ATermCommands.atermFromFile;
import static org.sugarj.driver.ATermCommands.atermToFile;
import static org.sugarj.driver.ATermCommands.extractSDF;
import static org.sugarj.driver.ATermCommands.extractSTR;
import static org.sugarj.driver.ATermCommands.fixSDF;
import static org.sugarj.driver.ATermCommands.getApplicationSubterm;
import static org.sugarj.driver.ATermCommands.getList;
import static org.sugarj.driver.ATermCommands.getString;
import static org.sugarj.driver.ATermCommands.isApplication;
import static org.sugarj.driver.Environment.bin;
import static org.sugarj.driver.Environment.includePath;
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
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr.client.ParseTable;
import org.spoofax.jsglr.client.imploder.ImploderAttachment;
import org.spoofax.jsglr.client.imploder.Token;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.spoofax.terms.StrategoListIterator;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.imp.runtime.parser.JSGLRI;
import org.strategoxt.lang.Context;
import org.strategoxt.permissivegrammars.make_permissive;
import org.strategoxt.stratego_sdf.stratego_sdf;
import org.sugarj.driver.caching.ModuleKeyCache;
import org.sugarj.stdlib.StdLib;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Driver{
  
  public static class Result {
    private Map<String, Integer> fileDependencyHashes = new HashMap<String, Integer>();
    private Map<String, Integer> generatedFileHashes = new HashMap<String, Integer>();
    private Set<IStrategoTerm> editorServices = new HashSet<IStrategoTerm>();
    private Set<BadTokenException> collectedErrors = new HashSet<BadTokenException>();
    private IStrategoTerm sugaredSyntaxTree = null;
    private String generatedClassFile;

    private void addFileDependency(String file) throws IOException {
      fileDependencyHashes.put(file, FileCommands.fileHash(file));
    }
    
    public Collection<String> getFileDependencies() {
      return fileDependencyHashes.keySet();
    }
    
    private void generateFile(String file, String content) throws IOException {
      FileCommands.writeToFile(file, content);
      generatedFileHashes.put(file, FileCommands.fileHash(file));
    }
    
    private void appendToFile(String file, String content) throws IOException {
      FileCommands.appendToFile(file, content);
      generatedFileHashes.put(file, FileCommands.fileHash(file));
    }
    
    private void addEditorService(IStrategoTerm service) {
      editorServices.add(service);
    }
    
    public Set<IStrategoTerm> getEditorServices() {
      return editorServices;
    }
    
    private boolean isUpToDate() throws IOException {
      if (!new File(generatedClassFile).exists())
        return false;

      for (Entry<String, Integer> entry : fileDependencyHashes.entrySet())
        if (FileCommands.fileHash(entry.getKey()) != entry.getValue())
          return false;
      
      for (Entry<String, Integer> entry : generatedFileHashes.entrySet())
        if (FileCommands.fileHash(entry.getKey()) != entry.getValue())
          return false;
      
      return true;
    }
    
    private void addBadTokenExceptions(Collection<? extends BadTokenException> exceptions) {
      collectedErrors.addAll(exceptions);
    }
    
    public Set<BadTokenException> getCollectedErrors() {
      return collectedErrors;
    }
    
    private void setSugaredSyntaxTree(IStrategoTerm sugaredSyntaxTree) {
      this.sugaredSyntaxTree = sugaredSyntaxTree;
    }
    
    public IStrategoTerm getSugaredSyntaxTree() {
      return sugaredSyntaxTree;
    }

    private void compileJava(String javaOutFile, String bin, List<String> path, String relPackageName) throws IOException {
      generatedClassFile = 
        bin + sep 
        + (relPackageName == null || relPackageName.isEmpty() ? "" : (relPackageName + sep))
        + FileCommands.fileName(javaOutFile) + ".class";
      
      JavaCommands.javac(javaOutFile, bin, path);
    }
    
    private void registerEditorDesugarings(String jarfile) throws IOException {
      IStrategoTerm builder =
        ATermCommands.atermFromString(
            "Builders(\"desugaring provider\", " +
              "[SemanticProvider(\"" + 
                  jarfile.replace("\\", "\\\\").replace("\"", "\\\"") + "\")])");
      editorServices.add(builder);
    }
  }
  
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
  
  private static Map<Key, Result> resultCache = new HashMap<Key, Result>();

  private static List<URI> allInputFiles;
  private static List<String> pendingInputFiles;
  private static List<String> currentlyProcessing;

  private Result driverResult = new Result();
  
  private String moduleName;
  private String javaOutDir;
  private String javaOutFile;
  private String relPackageName;
  private String mainModuleName;

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
  private HybridInterpreter interp;
  private JSGLRI parser;
  private Context sdfContext;
  private Context makePermissiveContext;
  private String currentTransProg;
  
  /**
   * the next parsing and desugaring uses no cache lookup if skipCache.
   */
  private boolean skipCache = false;
  
  private static synchronized Result getResult(String source, String moduleName) {
    return resultCache.get(new Key(source, moduleName));
  }
  
  private static synchronized void putResult(String source, String moduleName, Result result) {
    resultCache.put(new Key(source, moduleName), result);
  }
  
  public static Result compile(URI sourceFile) throws IOException, TokenExpectedException, BadTokenException, ParseException, InvalidParseTableException, SGLRException {
    String source = FileCommands.readFileAsString(sourceFile.getPath());
    String moduleName = FileCommands.fileName(sourceFile);
    return compile(source, moduleName);
  }
  
  public static Result compile(String source, String moduleName) throws IOException, TokenExpectedException, BadTokenException, ParseException, InvalidParseTableException, SGLRException {
    Result result = getResult(source, moduleName);
    if (result != null && result.isUpToDate())
      return result;
    
    initialize();
    Driver driver = new Driver();
    driver.process(source, moduleName);
    storeCaches();
    putResult(source, moduleName, driver.driverResult);
    return driver.driverResult;
  }
  
  /**
   * Process the given Extensible Java file.
   * 
   * @param moduleFileName
   *        the file to process.
   * @param outdir
   *        the directory to write the output into.
   * @throws IOException 
   * @throws SGLRException 
   * @throws InvalidParseTableException 
   * @throws ParseException 
   * @throws BadTokenException 
   * @throws TokenExpectedException 
   */
  private void process(String source, String moduleName) throws IOException, TokenExpectedException, BadTokenException, ParseException, InvalidParseTableException, SGLRException {
    log.beginTask("processing", "BEGIN PROCESSING " + moduleName);
    try {
      this.moduleName = moduleName;

      // TODO we need better circular dependency handling
      if (currentlyProcessing.contains(moduleName))
        throw new IllegalStateException("circular processing");

      currentlyProcessing.add(moduleName);

      javaOutDir = FileCommands.newTempDir();
      javaOutFile = null; 
      // FileCommands.createFile(tmpOutdir, relModulePath + ".java");

      mainModuleName = moduleName;

      currentGrammarSDF = StdLib.initGrammar.getPath();
      currentGrammarModule = StdLib.initGrammarModule;

      currentTransSTR = StdLib.initTrans.getPath();
      currentTransModule = StdLib.initTransModule;

      remainingInput = source;

      // list of imports that contain SDF extensions
      availableSDFImports = new ArrayList<String>();

      // list of imports that contain Stratego extensions
      availableSTRImports = new ArrayList<String>();

      inputTreeBuilder = new RetractableTreeBuilder();
      interp = new HybridInterpreter();
      sdfContext = stratego_sdf.init();
      makePermissiveContext = make_permissive.init();
      
      // XXX need to load ANY parse table, preferable an empty one.
      parser = new JSGLRI(org.strategoxt.imp.runtime.Environment.loadParseTable(StdLib.sdfTbl.getPath()), "Sdf2Module");
      
      sdfParser = new JSGLRI(org.strategoxt.imp.runtime.Environment.loadParseTable(StdLib.sdfTbl.getPath()), "Sdf2Module");
      strParser = new JSGLRI(org.strategoxt.imp.runtime.Environment.loadParseTable(StdLib.strategoTbl.getPath()), "StrategoModule");
      
      boolean done = false;
      while (!done) {
        boolean wocache = Environment.wocache;
        Environment.wocache |= skipCache;
        
        // PARSE the next top-level declaration
        IncrementalParseResult parseResult =
            parseNextToplevelDeclaration(remainingInput, true);
        lastSugaredToplevelDecl = parseResult.getToplevelDecl();
        remainingInput = parseResult.getRest();
        
        // DESUGAR the parsed top-level declaration
        IStrategoTerm desugared = currentDesugar(lastSugaredToplevelDecl);
        
        // reset cache skipping
        Environment.wocache = wocache;
        
        // PROCESS the assimilated top-level declaration
        processToplevelDeclaration(desugared);

        done = parseResult.parsingFinished();
      }
      
      if (Environment.generateJavaFile) {
        String f = Environment.bin + sep + relPackageNameSep() + mainModuleName + ".java";
        driverResult.generateFile(f, FileCommands.readFileAsString(javaOutFile));
        log.log("Wrote generated Java file to " + f);
      }
      
      // check final grammar and transformation for errors
      if (!Environment.noChecking) {
        checkCurrentGrammar();
        checkCurrentTransformation();
      }
      
      // COMPILE the generated java file
      compileGeneratedJavaFile();
      currentlyProcessing.remove(moduleName);
      pendingInputFiles.remove(moduleName);
      
      driverResult.setSugaredSyntaxTree(makeSugaredSyntaxTree());
      if (currentTransProg != null)
        driverResult.registerEditorDesugarings(currentTransProg);
    }
    catch (CommandExecution.ExecutionError e) {
      // TODO do something more sensible
      e.printStackTrace();
    }
    finally {
      log.endTask();
    }
  }

  private void compileGeneratedJavaFile() throws IOException {
    log.beginTask("compilation", "COMPILE the generated java file");
    try {
      List<String> path = new ArrayList<String>(Environment.includePath);
      path.add(StdLib.stdLibDir.getPath());
      path.add(javaOutDir);
      
      driverResult.compileJava(javaOutFile, bin, path, relPackageName);
    } finally {
      log.endTask();
    }
  }

  private IncrementalParseResult parseNextToplevelDeclaration(String input, boolean recovery)
      throws IOException, ParseException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    log.beginTask("parsing", "PARSE the next toplevel declaration.");
    try {
      IStrategoTerm remainingInputTerm = currentParse(input, recovery);

      if (remainingInputTerm == null)
        throw new ParseException("could not parse toplevel declaration in:\n"
            + input, -1);

      IStrategoTerm toplevelDecl = getApplicationSubterm(remainingInputTerm, "NextToplevelDeclaration", 0);
      IStrategoTerm restTerm = getApplicationSubterm(remainingInputTerm, "NextToplevelDeclaration", 1);
      String rest = getString(restTerm);

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

      return new IncrementalParseResult(toplevelDecl, rest);
    } finally {
      log.endTask();
    }
  }

  
  private void processEditorServicesDec(IStrategoTerm toplevelDecl) throws IOException {
    log.beginTask(
        "processing",
        "PROCESS the desugared editor services declaration.");
    try {
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

        if (extName.equals(mainModuleName))
          driverResult.appendToFile(
              javaOutFile,
              "/* auto-generated dummy class as replacement\n" + 
              " * for extracted editor services.\n" +
              " */\n" +
              (isPublic ? "public " : "") + "class " + mainModuleName + "{}\n");

        

        if (isPublic)
          log.log("The editor services is public.");
        else
          log.log("The editor services is not public.");
      
        log.log("The body of the editor services is:");
        log.log(body.toString());
        
        IStrategoTerm services = ATermCommands.getApplicationSubterm(body, "EditorServicesBody", 0);
        
        if (services.getTermType() != IStrategoTerm.LIST)
          throw new IllegalStateException("editor services are not a list: " + services);

  
        String editorServicesFile = bin + sep + relPackageNameSep() + extName + ".serv";
        FileCommands.createFile(editorServicesFile);
  
        log.log("writing editor services to " + editorServicesFile);
        
        StringBuffer buf = new StringBuffer();
        
        for (IStrategoTerm service : driverResult.getEditorServices())
          buf.append(service).append('\n');
        
        for (IStrategoTerm service : StrategoListIterator.iterable((IStrategoList) services)) {
          driverResult.addEditorService(service);
          buf.append(service).append('\n');
        }
        
        driverResult.generateFile(editorServicesFile, buf.toString());
        
  
        
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
      if (javaOutFile == null)
        javaOutFile = javaOutDir + sep + relPackageNameSep() + mainModuleName + ".java";
      
      if (isApplication(toplevelDecl, "TypeImportDec") || isApplication(toplevelDecl, "TypeImportOnDemandDec")) {
        if (!Environment.atomicImportParsing)
          processImportDec(toplevelDecl);
        else 
          processImportDecs(toplevelDecl);
      }
      else if (isApplication(toplevelDecl, "JavaTypeDec"))
        processJavaTypeDec(toplevelDecl);
      else if (isApplication(toplevelDecl, "SugarDec"))
        processSugarDec(toplevelDecl);
      else if (isApplication(toplevelDecl, "EditorServicesDec")) 
        processEditorServicesDec(toplevelDecl);
      else
        throw new ParseException("unexpected input at toplevel:\n"
            + "toplevel declaration: " + toplevelDecl, -1);
    }
  }

  private IStrategoTerm currentParse(String remainingInput, boolean recovery) throws IOException,
      InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    // recompile the current grammar definition
    ParseTable currentGrammarTBL;
    
    currentGrammarTBL = SDFCommands.compile(currentGrammarSDF, currentGrammarModule, driverResult.getFileDependencies(), sdfParser, sdfContext, makePermissiveContext);

    String remainingInputParsed = FileCommands.newTempFile("aterm");

    parser.setUseRecovery(recovery);
    
    // read next toplevel decl and stop if that fails
    boolean success = false;
    try {
      success = SDFCommands.parseImplode(
          currentGrammarTBL,
          remainingInput,
          remainingInputParsed,
          "NextToplevelDeclaration",
          false,
          inputTreeBuilder,
          parser);
    } finally {
      if (recovery)
        driverResult.addBadTokenExceptions(parser.getCollectedErrors());
    }
    
    if (!success) return null;

    IStrategoTerm remainingInputTerm = atermFromFile(remainingInputParsed);
    FileCommands.delete(remainingInputParsed);

    return remainingInputTerm;
  }

  private IStrategoTerm currentDesugar(IStrategoTerm term) throws IOException,
      InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException {
    // assimilate toplevelDec using current transformation
    log.beginTask(
        "desugaring",
        "DESUGAR the current toplevel declaration.");
    try {
      currentTransProg = STRCommands.compile(currentTransSTR, "main", driverResult.getFileDependencies(), strParser);

      return STRCommands.assimilate(currentTransProg, term, interp);
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

      javaOutFile =
          javaOutDir + sep + relPackageNameSep() + mainModuleName + ".java";
      
      driverResult.generateFile(javaOutFile, SDFCommands.prettyPrintJava(toplevelDecl, interp) + "\n");
    } finally {
      log.endTask();
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
      catch (Throwable t) { }
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
    
    for (IStrategoTerm pendingImport : pendingImports)
      processImportDec(pendingImport);
  }

  private void processImportDec(IStrategoTerm toplevelDecl) throws IOException, TokenExpectedException, BadTokenException, ParseException, InvalidParseTableException, SGLRException {
    
    sugaredImportDecls.add(lastSugaredToplevelDecl);
    
    if (javaOutFile == null)
      javaOutFile = javaOutDir + sep + mainModuleName + ".java";
    
    log.beginTask("processing", "PROCESS the desugared import declaration.");
    try {
      String importModule = extractImportedModuleName(toplevelDecl);

      log.beginTask("Generate Java code");
      try {
        driverResult.appendToFile(javaOutFile, SDFCommands.prettyPrintJava(toplevelDecl, interp) + "\n");
      } finally {
        log.endTask();
      }

      // TODO handle import declarations with asterisks, e.g. import foo.*;
      
      String importModuleRelativePath = FileCommands.getRelativeModulePath(importModule);
      boolean isStdLibModule = importModuleRelativePath.startsWith("org/sugarj/"); 
      
      List<URI> files = searchClassFiles(importModuleRelativePath, isStdLibModule);

      URI importModuleSourceFile = null;
      importModuleSourceFile = searchSugjFile(importModuleRelativePath, false);
      if (importModuleSourceFile == null)
        importModuleSourceFile = searchJavaFile(importModuleRelativePath, false);

      if (// the imported module was given as input by the user
          importModuleSourceFile != null && pendingInputFiles.contains(FileCommands.fileName(importModuleSourceFile)) ||
          // class file could not be found
          files.isEmpty() && !isStdLibModule && !importModuleRelativePath.endsWith("*") && importModuleSourceFile != null ||
          // source file is newer then the class file
          importModuleSourceFile != null && !files.isEmpty() && new File(importModuleSourceFile).lastModified() > new File(files.get(0)).lastModified()) {

        log.log("Need to compile the imported module first ; processing it now.");
        compile(importModuleSourceFile);
        log.log("CONTINUE PROCESSING'" + moduleName + "'.");
        
        // try again
        files = searchClassFiles(importModuleRelativePath, isStdLibModule);
      }
      
      if (!files.isEmpty()) {
        log.log("Found imported module on the class path.");
        log.log(files.get(0).toString());
      }
      else {
        String msg = "module not found " + importModule;
        for (int i = ImploderAttachment.getLeftToken(toplevelDecl).getIndex(),  
               max = ImploderAttachment.getRightToken(toplevelDecl).getIndex(); i <= max; i++)
          ((Token) inputTreeBuilder.getTokenizer().getTokenAt(i)).setError(msg);
        
        log.log("no module found");
      }
      
      
      for (URI importModuleClassFileURI : files)
      {
        URL importModuleClassFile = importModuleClassFileURI.toURL();
        driverResult.addFileDependency(importModuleClassFile.getPath());
        
        if (importModuleSourceFile != null)
          driverResult.addFileDependency(importModuleSourceFile.getPath());
        
        log.log(importModuleClassFile.toString());
        
        String thisRelativePath = importModuleRelativePath;
        
        if (thisRelativePath.endsWith("*"))
        {
          thisRelativePath = thisRelativePath.substring(0, thisRelativePath.length() - 1);
          thisRelativePath += FileCommands.fileName(importModuleClassFile);
        }
        
	      URL importModuleSDFFile =
	        new URL(importModuleClassFile.getProtocol() + ":" +
	                importModuleClassFile.getPath().substring(0, importModuleClassFile.getPath().length() - 5) + "sdf"); 
	      //searchSdfFile(importModuleRelativePath, isStdLibModule);

	      URL importModuleSTRFile = 
	        new URL(importModuleClassFile.getProtocol() + ":" +
	                importModuleClassFile.getPath().substring(0, importModuleClassFile.getPath().length() - 5) + "str");
	      //searchStrFile(importModuleRelativePath, isStdLibModule);
	      
	      URL importModuleSERVFile = 
          new URL(importModuleClassFile.getProtocol() + ":" +
                  importModuleClassFile.getPath().substring(0, importModuleClassFile.getPath().length() - 5) + "serv");
	
	      if (new File(importModuleSDFFile.getPath()).exists()) {
	        driverResult.addFileDependency(importModuleSDFFile.getPath());
	        
	        log.beginTask("Incorporation", "Incorporate the imported grammar " + thisRelativePath);
	        try {
	          // build extension of current grammar
	          String newGrammarName = 
	            FileCommands.hashFileName("sugarj", currentGrammarModule + thisRelativePath);
	            
	
	          String newGrammar =
	              Environment.tmpDir + sep + newGrammarName + ".sdf";
	
	          String grammar = 
	            "module " + newGrammarName + "\n"
            + "imports " + currentGrammarModule + "\n"
            + "        " + thisRelativePath;
	          
	          driverResult.generateFile(newGrammar, grammar);
	
	          currentGrammarModule = newGrammarName;
	          currentGrammarSDF = newGrammar;
	
	          availableSDFImports.add(thisRelativePath);
	        } finally {
	          log.endTask();
	        }
	      }
	      

	
	      if (new File(importModuleSTRFile.getPath()).exists()) {
	        driverResult.addFileDependency(importModuleSTRFile.getPath());
	        
	        log.beginTask(
	            "Incorporation",
	            "Incorporate the imported desugaring rules " + thisRelativePath);
	        try {
	          // build extension of current transformation
	          String newTransName =
	            FileCommands.hashFileName("sugarj", currentTransModule + thisRelativePath);
	
	          String newTrans = Environment.tmpDir + sep + newTransName + ".str";
	
	          String trans =
	            "module " + newTransName + "\n"
              + "imports " + currentTransModule + "\n"
              + "        " + thisRelativePath;
	          
	          driverResult.generateFile(newTrans, trans);
	
	          currentTransModule = newTransName;
	          currentTransSTR = newTrans;
	
	          availableSTRImports.add(thisRelativePath);
	
	          /*
	           * do not delete any files here, since they are still
	           * imported into the new grammar
	           */
	        } finally {
	          log.endTask();
	        }
	      }
	      
	      if (new File(importModuleSERVFile.getPath()).exists()) {
          driverResult.addFileDependency(importModuleSERVFile.getPath());
          
          log.beginTask("Incorporation", "Incorporate the imported editor services " + thisRelativePath);
          try {
            BufferedReader reader = new BufferedReader(new FileReader(importModuleSERVFile.getPath()));
            String line;
            
            while ((line = reader.readLine()) != null)
              driverResult.addEditorService(ATermCommands.atermFromString(line));
          } finally {
            log.endTask();
          }
        }
      }
      
    } finally {
      log.endTask();
    }
  }

  private String extractImportedModuleName(IStrategoTerm toplevelDecl) throws IOException {
    String name = null;
    log.beginTask("Extracting", "Extract name of imported module");
    try {
      if (isApplication(toplevelDecl, "TypeImportDec"))
        name = SDFCommands.prettyPrintJava(toplevelDecl.getSubterm(0), interp);
      
      if (isApplication(toplevelDecl, "TypeImportOnDemandDec"))
        name = SDFCommands.prettyPrintJava(toplevelDecl.getSubterm(0), interp) + ".*";
    } finally {
      log.endTask(name);
    }
    return name;
  }


  private URI searchFile(String what, String where, String extension, String relativePath, Set<String> searchPath, boolean searchStdLib) throws MalformedURLException {
    URI result = null;
    log.beginTask("Searching", "Search for " + what);
    try {
      ClassLoader cl = createClassLoader(where, searchPath, searchStdLib);
      URL url = cl.getResource(relativePath + extension);
      if (url != null)
        result = url.toURI();
    } catch (URISyntaxException e) {
      e.printStackTrace();
    } finally {
      log.endTask(result != null);
    }
    
    return result;
  }
  
//  private URL searchClassFile(String relativePath, boolean searchStdLib) throws MalformedURLException {
//    return searchFile("class file", "compiled files", ".class", relativePath, includePath, searchStdLib);
//  }
  
  private List<URI> searchClassFiles(String relativePath, boolean searchStdLib) throws MalformedURLException {
    List<URI> res = new ArrayList<URI>();
    
    URI classURL = searchFile("class file", "compiled files", ".class", relativePath, includePath, searchStdLib);
    
    if (classURL != null)
    {
      res.add(classURL);
      return res;
    }
    
    List<String> path = new ArrayList<String>(includePath);
    path.add(StdLib.stdLibDir.getPath());
    
    if (relativePath.endsWith("/*"))
      return ResourceList.getResources(relativePath, path, "class");
    
    return res;
  }

  private URI searchJavaFile(String relativePath, boolean searchStdLib) throws MalformedURLException {
    return searchFile("java file", "source files", ".java", relativePath, Environment.srcPath, searchStdLib);
  }

  private URI searchSugjFile(String relativePath, boolean searchStdLib) throws MalformedURLException {
    return searchFile("SugarJ file", "source files", ".sugj", relativePath, Environment.srcPath, searchStdLib);
  }

//  private URL searchSdfFile(String relativePath, boolean searchStdLib) throws MalformedURLException {
//    return searchFile("compiled grammar", "compiled files", SDF_OUTPUT_EXTENSION, relativePath, includePath, searchStdLib);
//  }

//  private URL searchStrFile(String relativePath, boolean searchStdLib) throws MalformedURLException {
//    return searchFile("compiled desugaring", "compiled files", STR_OUTPUT_EXTENSION, relativePath, includePath, searchStdLib);
//  }
  
  private ClassLoader createClassLoader(String what, Collection<String> path, boolean searchStdLib) throws MalformedURLException {
    // log.beginTask("Creating", "Create a class loader for " + what);
    try {
      URL[] urls = new URL[path.size() + 1];
      
      int i = 0;
      for (String include : path)
        urls[i++] = new File(include).toURI().toURL();

      urls[urls.length - 1] = new File(StdLib.stdLibDir.getPath()).toURI().toURL();
      
      /*
       * we use 'null' as the parent class loader purposely, so
       * that only the given urls are searched.
       */
      return new URLClassLoader(urls, null);
    } finally {
      // log.endTask();
    }
  }
  
  private void processJavaTypeDec(IStrategoTerm toplevelDecl) throws IOException {
    log.beginTask(
        "processing",
        "PROCESS the desugared Java type declaration.");
    try {
      
      sugaredTypeOrSugarDecls.add(lastSugaredToplevelDecl);
      
      log.beginTask("Generate Java code.");
      try {
        IStrategoTerm dec = getApplicationSubterm(toplevelDecl, "JavaTypeDec", 0);
        driverResult.appendToFile(javaOutFile, SDFCommands.prettyPrintJava(dec, interp) + "\n");
      } finally {
        log.endTask();
      }
    } finally {
      log.endTask();
    }
  }

  private void processSugarDec(IStrategoTerm toplevelDecl) throws IOException,
      InvalidParseTableException {
    log.beginTask(
        "processing",
        "PROCESS the desugared sugar declaration.");
    try {
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

        if (extName.equals(mainModuleName))
          driverResult.appendToFile(
              javaOutFile,
              "/* auto-generated dummy class as replacement\n" + 
              " * for extracted sugar.\n" +
              " */\n" +
              (isPublic ? "public " : "") + "class " + mainModuleName + "{}\n");

        

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
      
      String sdfExtension =
          bin + sep + relPackageNameSep()
              + extName + ".sdf";
  
      FileCommands.createFile(sdfExtension);
  
      String strExtension =
          bin + sep + relPackageNameSep()
              + extName + ".str";
  
      FileCommands.createFile(strExtension);

      String sdfImports = "imports " + StringCommands.printListSeparated(availableSDFImports, " ") + "\n";
      String strImports = "imports " + StringCommands.printListSeparated(availableSTRImports, " ") + "\n";
      
      if (isNative) {
        String nativeModule = getString(getApplicationSubterm(body, "NativeSugarBody", 0)); 
        
        if (nativeModule.length() > 1)
            // remove quotes
          nativeModule = nativeModule.substring(1, nativeModule.length() - 1);
            
          availableSDFImports.add(nativeModule);
          availableSTRImports.add(nativeModule);
        
        driverResult.generateFile(
            sdfExtension, 
            "module " + fullExtName + "\n" 
            + sdfImports 
            + "imports " + nativeModule);
        
        driverResult.generateFile(
            strExtension, 
            "module " + fullExtName + "\n" 
            + strImports
            + "imports " + nativeModule);
      }
      else {
        // this is a list of SDF and Stratego statements
        IStrategoTerm sugarBody = getApplicationSubterm(body, "SugarBody", 0);
        String bodyFile = FileCommands.newTempFile("aterm");
        atermToFile(sugarBody, bodyFile);
  
        String sdfExtractTmp = FileCommands.newTempFile("sdf");
        String sdfExtract = FileCommands.newTempFile("sdf");
        String strExtract = FileCommands.newTempFile("str");
  
        extractSDF(bodyFile, sdfExtractTmp);
        fixSDF(sdfExtractTmp, sdfExtract);
        extractSTR(bodyFile, strExtract);
  
        FileCommands.delete(bodyFile);
        FileCommands.delete(sdfExtractTmp);
        
        String sdfExtensionHead =
          "module " + fullExtName + "\n" + sdfImports
                + (isPublic ? "exports " : "hiddens ") + "\n";

        String sdfExtensionContent = SDFCommands.prettyPrintSDF(sdfExtract, interp);

        driverResult.generateFile(sdfExtension, sdfExtensionHead + sdfExtensionContent);

        String strExtensionTerm = FileCommands.newTempFile("aterm");

        driverResult.generateFile(strExtensionTerm, 
            "Module(" + "\"" + fullExtName+ "\"" + ", " 
                      + atermFromFile(strExtract) + ")" + "\n");

        String strExtensionContent = SDFCommands.prettyPrintSTR(strExtensionTerm, interp);
        
        int index = strExtensionContent.indexOf('\n');
        if (index >= 0)
          strExtensionContent =
            strExtensionContent.substring(0, index + 1) + "\n"
            + strImports + "\n"
            + strExtensionContent.substring(index + 1);
        else
          strExtensionContent += strImports;
          
        
        driverResult.generateFile(strExtension, strExtensionContent);
        
        availableSDFImports.add(fullExtName);
        availableSTRImports.add(fullExtName);
      }


      if (CommandExecution.FULL_COMMAND_LINE) {
        System.out.println("  Wrote SDF file to '" + new File(sdfExtension).getAbsolutePath() + "'.");
        System.out.println("  Wrote Stratego file to '" + new File(strExtension).getAbsolutePath() + "'.");
      }
      
      String currentGrammarName =
        FileCommands.hashFileName("sugarj", currentGrammarModule + fullExtName);

      currentGrammarSDF =
          Environment.tmpDir + sep + currentGrammarName + ".sdf";

      driverResult.generateFile(currentGrammarSDF, 
          "module " + currentGrammarName + "\n"
          + "imports " + currentGrammarModule + "\n" 
          + "        " + fullExtName);
      currentGrammarModule = currentGrammarName;


      String currentTransName =
        FileCommands.hashFileName("sugarj", currentTransModule + fullExtName);

      currentTransSTR = Environment.tmpDir + sep + currentTransName + ".str";

      driverResult.generateFile(currentTransSTR,
          "module " + currentTransName + "\n" 
          + "imports " + currentTransModule + "\n"
          + "        " + fullExtName);
      currentTransModule = currentTransName;
      
      skipCache = true;
    } finally {
      log.endTask();
    }
  }

  private void checkCurrentGrammar() throws IOException, InvalidParseTableException {
    log.beginTask("checking grammar", "CHECK current grammar");
    
    try {
      boolean wocache = Environment.wocache;
      Environment.wocache = true;
      SDFCommands.check(currentGrammarSDF, currentGrammarModule, sdfContext);
      Environment.wocache = wocache;
    } finally {
      log.endTask();
    }
  }
  
  private void checkCurrentTransformation() throws IOException, InvalidParseTableException, TokenExpectedException, BadTokenException, SGLRException{
    log.beginTask("checking transformation", "CHECK current transformation");
    
    try {
      boolean wocache = Environment.wocache;
      Environment.wocache = true;
      STRCommands.compile(currentTransSTR, "main", driverResult.getFileDependencies(), strParser);
      Environment.wocache = wocache;
    } finally {
      log.endTask();
    }
  }
  
  private static void initialize() throws IOException {
    Environment.init();
    
    if (Environment.cacheDir != null)
      FileCommands.createDir(Environment.cacheDir);
    
    FileCommands.createDir(Environment.bin);
    
    initializeCaches();
    
    allInputFiles = new ArrayList<URI>();
    pendingInputFiles = new ArrayList<String>();
    currentlyProcessing = new ArrayList<String>();
  }
  
  /**
   * @param args
   * @throws IOException
   */
  public static void main(String[] args) {
    // log.log("This is the extensible java compiler.");
    try {
      initialize();
      
      String[] sources = handleOptions(args);

      URL[] urls = new URL[Environment.srcPath.size()];
      int i = 0;
      for (String path : Environment.srcPath)
        urls[i++] = new File(path).toURI().toURL();

      ClassLoader loader = new URLClassLoader(urls);
      
      for (String source : sources)
      {
        URL url = loader.getResource(source);
        
        if (url == null)
          throw new FileNotFoundException(source);
        
        URI uri = url.toURI();
        
        allInputFiles.add(uri);
        pendingInputFiles.add(FileCommands.fileName(uri));
      }
      
      for (URI source : allInputFiles)
        compile(source);
      
      storeCaches();
      
    } catch (Exception e) {
      e.printStackTrace();
    } catch (CLIError e) {
      System.out.println(e.getMessage());
      System.out.println();
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
        Environment.srcPath.add(path);
 
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
        "no-checing",
        false,
        "Do not check resulting SDF and Stratego files.");
    
    return options;
  }

  @SuppressWarnings("unchecked")
  private static synchronized void initializeCaches() throws IOException {
    if (Environment.cacheDir == null)
      return;
    
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
}
