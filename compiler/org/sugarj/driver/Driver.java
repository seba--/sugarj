package org.sugarj.driver;
import static org.sugarj.driver.ATermCommands.atermFromFile;
import static org.sugarj.driver.ATermCommands.atermToFile;
import static org.sugarj.driver.ATermCommands.extractJava;
import static org.sugarj.driver.ATermCommands.extractSDF;
import static org.sugarj.driver.ATermCommands.extractSTR;
import static org.sugarj.driver.ATermCommands.extractString;
import static org.sugarj.driver.ATermCommands.extractTerm;
import static org.sugarj.driver.ATermCommands.fixSDF;
import static org.sugarj.driver.ATermCommands.match;
import static org.sugarj.driver.Environment.bin;
import static org.sugarj.driver.Environment.includePath;
import static org.sugarj.driver.Environment.sep;
import static org.sugarj.driver.Log.log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
import java.util.Iterator;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.spoofax.jsglr.InvalidParseTableException;
import org.sugarj.driver.caching.Cache;
import org.sugarj.driver.caching.ModuleKey;

import aterm.ATerm;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class Driver{

  // TODO change when going binary
  private static final String SDF_OUTPUT_EXTENSION = ".sdf";
  private static final String STR_OUTPUT_EXTENSION = ".str";

  private static String getRelativeModulePath(String module) {
    return module.replace(".", sep);
  }

  public static String printListSeparated(List<String> l, String sep) {
    StringBuilder b = new StringBuilder();

    for (Iterator<String> it = l.iterator(); it.hasNext();) {
      b.append(it.next());
      if (it.hasNext())
        b.append(sep);
    }

    return b.toString();
  }

  private static List<URI> allInputFiles = new ArrayList<URI>();
  private static List<URI> pendingInputFiles = new ArrayList<URI>();
  private static List<URI> currentlyProcessing = new ArrayList<URI>();

  /**
   * denotes that the imported modules changed.
   */
  private static boolean importsChanged = false;

  private static boolean genJava = false;
  
  private URI sourceFile;
  private String javaOutDir;
  private String javaOutFile;
  private String relPackageName;
  private String mainModuleName;

  private String currentGrammarSDF;
  private String currentGrammarXTBL;
  private String currentGrammarModule;
  private String currentTransSTR;
  private String currentTransModule;
  private String remainingInput;

  private List<String> availableSDFImports;
  private List<String> availableSTRImports;
  
  /**
   * the next parsing and desugaring uses no cache lookup if skipCache.
   */
  private boolean skipCache = false;
  
  /**
   * Process the given Extensible Java file.
   * 
   * @param moduleFileName
   *        the file to process.
   * @param outdir
   *        the directory to write the output into.
   */
  private void process(URI source) {
    log.beginTask("processing", "BEGIN PROCESSING " + source);
    try {
      sourceFile = source;

      // TODO we need better circular dependency handling
      if (currentlyProcessing.contains(sourceFile))
        throw new IllegalStateException("circular processing");

      currentlyProcessing.add(sourceFile);

      javaOutDir = FileCommands.newTempDir();
      javaOutFile = null; 
      // FileCommands.createFile(tmpOutdir, relModulePath + ".java");

      mainModuleName = FileCommands.fileName(sourceFile.getPath());

      currentGrammarSDF = Environment.initGrammar;
      currentGrammarModule = Environment.initGrammarModule;
      if (Environment.xtblCompilation)
        currentGrammarXTBL = Environment.initGrammarXTBL;

      currentTransSTR = Environment.initTrans;
      currentTransModule = Environment.initTransModule;

      remainingInput = FileCommands.newTempFile("sugj-rest");
      FileCommands.copyFile(sourceFile.getPath(), remainingInput);

      // list of imports that contain SDF extensions
      availableSDFImports = new ArrayList<String>();

      // list of imports that contain Stratego extensions
      availableSTRImports = new ArrayList<String>();


      boolean done = false;
      while (!done) {
        boolean wocache = Environment.wocache;
        Environment.wocache |= skipCache;
        
        // PARSE the next top-level declaration
        IncrementalParseResult parseResult =
            parseNextToplevelDeclaration(remainingInput);
        ATerm parsed = parseResult.getToplevelDecl();
        FileCommands.writeToFile(remainingInput, parseResult.getRest());

        // ASSIMILATE the parsed top-level declaration
        ATerm desugared = currentDesugar(parsed);
        
        // reset cache skipping
        Environment.wocache = wocache;
        
        // PROCESS the assimilated top-level declaration
        processToplevelDeclaration(desugared);

        done = parseResult.parsingFinished();
      }
      
      if (genJava) {
        String f = new File(sourceFile).getParent() + sep + mainModuleName + ".java";
        FileCommands.copyFile(javaOutFile, f);
        log.log("Wrote generated Java file to " + f);
      }
      
      // check final grammar and transformation for errors
      Environment.wocache = true;
      checkCurrentGrammar();
      checkCurrentTransformation();
      
      // COMPILE the generated java file
      compileGeneratedJavaFile();
      currentlyProcessing.remove(sourceFile);
      pendingInputFiles.remove(sourceFile);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      
      log.endTask();
    }
  }

  private void compileGeneratedJavaFile() throws IOException {
    log.beginTask("compilation", "COMPILE the generated java file");
    try {
      JavaCommands.javac(javaOutFile, bin, javaOutDir, bin, Environment.stdLibDir);
    } finally {
      log.endTask();
    }
  }

  private IncrementalParseResult parseNextToplevelDeclaration(String filename)
      throws IOException, ParseException, InvalidParseTableException {
    log.beginTask("parsing", "PARSE the next toplevel declaration.");
    try {
      ATerm remainingInputTerm = currentParse(filename);

      if (remainingInputTerm == null)
        throw new ParseException("could not parse toplevel declaration in:\n"
            + filename, -1);

      ATerm toplevelDecl = extractTerm(remainingInputTerm, "NextToplevelDeclaration(?, _)");
      String rest = extractString(remainingInputTerm, "NextToplevelDeclaration(_, ?)");
      
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

  private void processToplevelDeclaration(ATerm toplevelDecl)
      throws IOException, ClassNotFoundException, InvalidParseTableException,
      ParseException {
    if (match(toplevelDecl, "PackageDec(_, _)"))
      processPackageDec(toplevelDecl);
    else {
      if (javaOutFile == null)
        javaOutFile = javaOutDir + sep + relPackageNameSep() + mainModuleName + ".java";
      
      if (match(toplevelDecl, "TypeImportDec(_)") || match(toplevelDecl, "TypeImportOnDemandDec(_)")) {
        if (!Environment.atomicImportParsing)
          processImportDec(toplevelDecl);
        else 
          processImportDecs(toplevelDecl);
      }
      else if (match(toplevelDecl, "JavaTypeDec(_)"))
        processJavaTypeDec(toplevelDecl);
      else if (match(toplevelDecl, "SugarDec(_,_)"))
        processSugarDec(toplevelDecl);
      else
        throw new ParseException("unexpected input at toplevel:\n"
            + "toplevel declaration: " + toplevelDecl, -1);
    }
  }

  private ATerm currentParse(String remainingInput) throws IOException,
      InvalidParseTableException {
    // recompile the current grammar definition
    String currentGrammarTBL;
    
    if (!Environment.xtblCompilation)
      currentGrammarTBL = SDFCommands.compile(currentGrammarSDF, currentGrammarModule);
    else
      currentGrammarTBL = SDFCommands.finalizeXtbl(currentGrammarXTBL);

    String remainingInputParsed = FileCommands.newTempFile("aterm");

    // read next toplevel decl and stop if that fails
    if (!SDFCommands.parseImplode(
        currentGrammarTBL,
        remainingInput,
        remainingInputParsed,
        "NextToplevelDeclaration",
        false))
      return null;

    ATerm remainingInputTerm = atermFromFile(remainingInputParsed);
    FileCommands.delete(remainingInputParsed);

    return remainingInputTerm;
  }

  private ATerm currentDesugar(ATerm term) throws IOException,
      InvalidParseTableException {
    // assimilate toplevelDec using current transformation
    log.beginTask(
        "desugaring",
        "DESUGAR the current toplevel declaration.");
    try {
      String toplevelIn = FileCommands.newTempFile("aterm");
      String toplevelOut = FileCommands.newTempFile("aterm");

      String currentTransProg = STRCommands.compile(currentTransSTR, "main");

      atermToFile(term, toplevelIn);
      STRCommands.assimilate(currentTransProg, toplevelIn, toplevelOut);
      term = atermFromFile(toplevelOut);

      FileCommands.delete(toplevelIn);
      FileCommands.delete(toplevelOut);

      return term;
    } finally {
      log.endTask();
    }
  }

  private void processPackageDec(ATerm toplevelDecl) throws IOException {
    log.beginTask("processing", "PROCESS the desugared package declaration.");
    try {
      String packageName =
          SDFCommands.prettyPrintJavaTerm(extractTerm(
              toplevelDecl,
              "PackageDec(_, ?)"));

      log.log("The Java package name is '" + packageName + "'.");

      relPackageName = getRelativeModulePath(packageName);

      log.log("The SDF / Stratego package name is '" + relPackageName + "'.");

      javaOutFile =
          javaOutDir + sep + relPackageNameSep() + mainModuleName + ".java";
      FileCommands.createFile(javaOutFile);

      FileCommands.appendToFile(
          javaOutFile,
          SDFCommands.prettyPrintJavaTerm(toplevelDecl) + "\n");
    } finally {
      log.endTask();
    }
  }
  
  private void processImportDecs(ATerm toplevelDecl) throws IOException, ClassNotFoundException, ParseException, InvalidParseTableException {
    List<ATerm> pendingImports = new ArrayList<ATerm>();
    pendingImports.add(toplevelDecl);
    
    while (true) {
      IncrementalParseResult res = null;
      ATerm term = null;
      
      try {
        log.beginSilent();
        res = parseNextToplevelDeclaration(remainingInput);
        term = res.getToplevelDecl();
      }
      catch (Throwable t) { }
      finally {         
        log.endSilent(); 
      }
    
      if (res != null &&
          term != null &&
          (match(term, "TypeImportDec(_)") ||
           match(term, "TypeImportOnDemandDec(_)"))) {
        FileCommands.writeToFile(remainingInput, res.getRest());
        pendingImports.add(term);
      }
      else
        break;
    }
    
    for (ATerm pendingImport : pendingImports)
      processImportDec(pendingImport);
  }

  private void processImportDec(ATerm toplevelDecl) throws IOException,
      ClassNotFoundException, ParseException, InvalidParseTableException {
    
    if (javaOutFile == null)
      javaOutFile = javaOutDir + sep + mainModuleName + ".java";
    
    log.beginTask("processing", "PROCESS the desugared import declaration.");
    try {
      String importModule = extractImportedModuleName(toplevelDecl);

      log.beginTask("Generate Java code");
      try {
        FileCommands.appendToFile(
            javaOutFile,
            SDFCommands.prettyPrintJavaTerm(toplevelDecl) + "\n");
      } finally {
        log.endTask();
      }

      // TODO handle import declarations with asterisks, e.g. import foo.*;
      
      String importModuleRelativePath = getRelativeModulePath(importModule);
      boolean isStdLibModule = importModuleRelativePath.startsWith("org/sugarj/"); 
      
      // indicates whether a sugar is imported
      boolean newSyntax = false;
      
      List<URI> files = searchClassFiles(importModuleRelativePath, isStdLibModule);

      URI importModuleSourceFile = null;
      importModuleSourceFile = searchSugjFile(importModuleRelativePath, false);
      if (importModuleSourceFile == null)
        importModuleSourceFile = searchJavaFile(importModuleRelativePath, false);

      if (// the imported module was given as input by the user
          importModuleSourceFile != null && pendingInputFiles.contains(importModuleSourceFile) ||
          // class file could not be found
          files.isEmpty() && !isStdLibModule && !importModuleRelativePath.endsWith("*") && importModuleSourceFile != null) {

        log.log("Need to compile the imported module first ; processing it now.");
        new Driver().process(importModuleSourceFile);
        log.log("CONTINUE PROCESSING'" + sourceFile + "'.");
        
        // try again
        files = searchClassFiles(importModuleRelativePath, isStdLibModule);
  
        if (files.isEmpty())
          throw new ClassNotFoundException("could not find imported module "
              + importModule);
      }
      
      if (!files.isEmpty())
        log.log("Found imported module on the class path.");
      
      
      for (URI importModuleClassFileURI : files)
      {
        URL importModuleClassFile = importModuleClassFileURI.toURL();
        
        String thisRelativePath = importModuleRelativePath;
        
        if (thisRelativePath.endsWith("*"))
        {
          thisRelativePath = thisRelativePath.substring(0, thisRelativePath.length() - 1);
          thisRelativePath += FileCommands.fileName(importModuleClassFile.getPath());
        }
        
	      URL importModuleSDFFile =
	        new URL(importModuleClassFile.getProtocol() + ":" +
	                importModuleClassFile.getFile().substring(0, importModuleClassFile.getPath().length() - 5) + "sdf"); 
	      //searchSdfFile(importModuleRelativePath, isStdLibModule);

	      URL importModuleXTBLFile =
          new URL(importModuleClassFile.getProtocol() + ":" +
                  importModuleClassFile.getFile().substring(0, importModuleClassFile.getPath().length() - 5) + "xtbl");
	      
	      URL importModuleSTRFile = 
	        new URL(importModuleClassFile.getProtocol() + ":" +
	                importModuleClassFile.getFile().substring(0, importModuleClassFile.getPath().length() - 5) + "str");
	      //searchStrFile(importModuleRelativePath, isStdLibModule);
	
	      
	      
	      if (new File(importModuleSDFFile.getPath()).exists()) {
	        newSyntax = true;
	        
	        log.beginTask("Incorporation", "Incorporate the imported grammar " + thisRelativePath);
	        try {
	          // build extension of current grammar
	          String newGrammarName = 
	            FileCommands.hashFileName("sugarj", currentGrammarModule + thisRelativePath);
	            
	
	          String newGrammar =
	              Environment.tmpDir + sep + newGrammarName + ".sdf";
	
	          FileCommands.writeToFile(newGrammar, "module " + newGrammarName
	              + "\n" + "imports " + currentGrammarModule + "\n" + "        "
	              + thisRelativePath);
	
	          currentGrammarModule = newGrammarName;
	          currentGrammarSDF = newGrammar;
	
	          availableSDFImports.add(thisRelativePath);
	        } finally {
	          log.endTask();
	        }
	      }
	      
	      if (Environment.xtblCompilation && 
	          new File(importModuleXTBLFile.getPath()).exists() &&
	          !isStdLibModule) {
          newSyntax = true;
          
          log.beginTask("Incorporation", "Incorporate the imported pre-compiled grammar " + thisRelativePath);
          try {
            String newXtbl = FileCommands.newTempFile("xtbl");
            SDFCommands.composeXtbl(currentGrammarXTBL, importModuleXTBLFile.getPath(), newXtbl);
            currentGrammarXTBL = newXtbl;
          } finally {
            log.endTask();
          }
        }
	      
	      
	
	      if (new File(importModuleSTRFile.getPath()).exists()) {
	        newSyntax = true;
	        
	        log.beginTask(
	            "Incorporation",
	            "Incorporate the imported desugaring rules " + thisRelativePath);
	        try {
	          // build extension of current transformation
	          String newTransName =
	            FileCommands.hashFileName("sugarj", currentTransModule + thisRelativePath);
	
	          String newTrans = Environment.tmpDir + sep + newTransName + ".str";
	
	          FileCommands.writeToFile(newTrans, "module " + newTransName + "\n"
	              + "imports " + currentTransModule + "\n" + "        "
	              + thisRelativePath);
	
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
	      
	      if (importsChanged && newSyntax || importModuleSourceFile != null && allInputFiles.contains(importModuleSourceFile))
	        skipCache = true;
      }
      
    } finally {
      log.endTask();
    }
  }

  private String extractImportedModuleName(ATerm toplevelDecl) throws IOException {
    String name = null;
    log.beginTask("Extracting", "Extract name of imported module");
    try {
      if (match(toplevelDecl, "TypeImportDec(_)"))
        name = extractJava(toplevelDecl, "TypeImportDec(?)");
      
      if (match(toplevelDecl, "TypeImportOnDemandDec(_)"))
        name = extractJava(toplevelDecl, "TypeImportOnDemandDec(?)") + ".*";
    } finally {
      log.endTask(name);
    }
    return name;
  }


  private URI searchFile(String what, String where, String extension, String relativePath, List<String> searchPath, boolean searchStdLib) throws MalformedURLException {
    URI result = null;
    log.beginTask("Searching", "Search for " + what);
    try {
      ClassLoader cl = createClassLoader(where, searchPath, searchStdLib);
      result = cl.getResource(relativePath + extension).toURI();
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
    path.add(Environment.stdLibDir);
    
    if (relativePath.endsWith("/*"))
      return ResourceList.getResources(relativePath, path, "class");
    
    return res;
  }

  private URI searchJavaFile(String relativePath, boolean searchStdLib) throws MalformedURLException {
    return searchFile("java file", "source files", ".java", relativePath, Environment.srcPath, searchStdLib);
  }

  private URI searchSugjFile(String relativePath, boolean searchStdLib) throws MalformedURLException {
    return searchFile("extensible java file", "source files", ".sugj", relativePath, Environment.srcPath, searchStdLib);
  }

//  private URL searchSdfFile(String relativePath, boolean searchStdLib) throws MalformedURLException {
//    return searchFile("compiled grammar", "compiled files", SDF_OUTPUT_EXTENSION, relativePath, includePath, searchStdLib);
//  }

//  private URL searchStrFile(String relativePath, boolean searchStdLib) throws MalformedURLException {
//    return searchFile("compiled desugaring", "compiled files", STR_OUTPUT_EXTENSION, relativePath, includePath, searchStdLib);
//  }
  
  private ClassLoader createClassLoader(String what, List<String> path, boolean searchStdLib) throws MalformedURLException {
    log.beginTask("Creating", "Create a class loader for " + what);
    try {
      URL[] urls = new URL[path.size() + 1];
      
      int i = 0;
      for (String include : path)
        urls[i++] = new File(include).toURI().toURL();

      urls[urls.length - 1] = new File(Environment.stdLibDir).toURI().toURL();
      
      /*
       * we use 'null' as the parent class loader purposely, so
       * that only the given urls are searched.
       */
      return new URLClassLoader(urls, null);
    } finally {
      log.endTask();
    }
  }
  
  private void processJavaTypeDec(ATerm toplevelDecl) throws IOException {
    log.beginTask(
        "processing",
        "PROCESS the desugared Java type declaration.");
    try {
      log.beginTask("Generate Java code.");
      try {
        FileCommands.appendToFile(
            javaOutFile,
            SDFCommands.prettyPrintJavaTerm(extractTerm(
                toplevelDecl,
                "JavaTypeDec(?)"))
                + "\n");
      } finally {
        log.endTask();
      }
    } finally {
      log.endTask();
    }
  }

  private void processSugarDec(ATerm toplevelDecl) throws IOException,
      InvalidParseTableException {
    log.beginTask(
        "processing",
        "PROCESS the desugared sugar declaration.");
    try {
      boolean isNative;
      String extName = null;
      String fullExtName = null;
      boolean isPublic = false;

      log.beginTask("Extracting name and accessibility of the sugar.");
      try {
        isNative = !match(toplevelDecl, "SugarDec(SugarDecHead(_,_), _)");
        
        if (isNative) {
          extName =
            SDFCommands.prettyPrintJavaTerm(extractTerm(
                toplevelDecl,
                "SugarDec(NativeSugarDecHead(_, _, ?), _)"));
          
          isPublic =
            match(
                toplevelDecl,
                "SugarDec(NativeSugarDecHead([Public], _, _) ,_)");
        }
        else {
          extName =
            SDFCommands.prettyPrintJavaTerm(extractTerm(
                toplevelDecl,
                "SugarDec(SugarDecHead(_, ?), _)"));
          
          isPublic =
            match(
                toplevelDecl,
                "SugarDec(SugarDecHead([Public], _) ,_)");
        }
        
        
        
        fullExtName = relPackageNameSep() + extName;

        log.log("The name of the sugar is '" + extName + "'.");
        log.log("The full name of the sugar is '" + fullExtName + "'.");

        if (extName.equals(mainModuleName))
          FileCommands.appendToFile(
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

      String sdfImports = "imports " + printListSeparated(availableSDFImports, " ") + "\n";
      String strImports = "imports " + printListSeparated(availableSTRImports, " ") + "\n";
      
      if (Environment.xtblCompilation)
        sdfImports = "";
      
      if (isNative) {
        String nativeModule = extractTerm(toplevelDecl, "SugarDec(_,NativeSugarBody(?))").toString();
        
        if (nativeModule.length() > 1)
            // remove quotes
          nativeModule = nativeModule.substring(1, nativeModule.length() - 1);
            
          availableSDFImports.add(nativeModule);
          availableSTRImports.add(nativeModule);
        
        FileCommands.writeToFile(
            sdfExtension, 
            "module " + fullExtName + "\n" 
            + sdfImports 
            + "imports " + nativeModule);
        
        FileCommands.writeToFile(
            strExtension, 
            "module " + fullExtName + "\n" 
            + strImports
            + "imports " + nativeModule);
      }
      else {
        // this is a list of SDF and Stratego statements
        ATerm body =
            extractTerm(toplevelDecl, "SugarDec(_,SugarBody(?))");
        String bodyFile = FileCommands.newTempFile("aterm");
        atermToFile(body, bodyFile);
  
        String sdfExtractTmp = FileCommands.newTempFile("sdf");
        String sdfExtract = FileCommands.newTempFile("sdf");
        String strExtract = FileCommands.newTempFile("str");
  
        extractSDF(bodyFile, sdfExtractTmp);
        fixSDF(sdfExtractTmp, sdfExtract);
        extractSTR(bodyFile, strExtract);
  
        FileCommands.delete(bodyFile);
        FileCommands.delete(sdfExtractTmp);
        
        SDFCommands.prettyPrintSDF(sdfExtract, sdfExtension);

        String sdfExtensionHead =
          "module " + fullExtName + "\n" + sdfImports
                + (isPublic ? "exports " : "hiddens ") + "\n";

        String sdfExtensionContent = FileCommands.readFileAsString(sdfExtension);
        
        FileCommands.writeToFile(sdfExtension, sdfExtensionHead
            + sdfExtensionContent);

        String strExtensionTerm = FileCommands.newTempFile("aterm");

        FileCommands.writeToFile(strExtensionTerm, "Module(\"" + fullExtName
            + "\"" + ", " + atermFromFile(strExtract) + ")" + "\n");

        SDFCommands.prettyPrintSTR(strExtensionTerm, strExtension);

        FileCommands.insert(strImports, strExtension, 2);
        
        availableSDFImports.add(fullExtName);
        availableSTRImports.add(fullExtName);
      }


      if (CommandExecution.FULL_COMMAND_LINE) {
        System.out.println("  Wrote SDF file to '" + sdfExtension + "'.");
        System.out.println("  Wrote Stratego file to '" + strExtension + "'.");
      }
      
      String currentGrammarName =
        FileCommands.hashFileName("sugarj", currentGrammarModule + fullExtName);

      currentGrammarSDF =
          Environment.tmpDir + sep + currentGrammarName + ".sdf";

      FileCommands.writeToFile(currentGrammarSDF, "module "
          + currentGrammarName + "\n" + "imports " + currentGrammarModule
          + "\n" + "        " + fullExtName);
      currentGrammarModule = currentGrammarName;

      if (Environment.xtblCompilation) {
        String xtblExtension =
          bin + sep + relPackageNameSep()
              + extName + ".xtbl";
        
        SDFCommands.compileXtbl(sdfExtension, xtblExtension, fullExtName);
        
        String newXtbl = FileCommands.newTempFile("xtbl");
        SDFCommands.composeXtbl(currentGrammarXTBL, xtblExtension, newXtbl);
        currentGrammarXTBL = newXtbl;
      }

      String currentTransName =
        FileCommands.hashFileName("sugarj", currentTransModule + fullExtName);

      currentTransSTR = Environment.tmpDir + sep + currentTransName + ".str";

      FileCommands.writeToFile(currentTransSTR, "module " + currentTransName
          + "\n" + "imports " + currentTransModule + "\n" + "        "
          + fullExtName);
      currentTransModule = currentTransName;
      
      skipCache = true;
    } finally {
      log.endTask();
    }
  }

  private void checkCurrentGrammar() throws IOException, InvalidParseTableException{
    if (Environment.xtblCompilation)
      // we already checked this when separately compiling the parse table
      return;
    
    log.beginTask("checking grammar", "CHECK current grammar");
    
    try {
      SDFCommands.check(currentGrammarSDF, currentGrammarModule);
    } finally {
      log.endTask();
    }
  }
  
  private void checkCurrentTransformation() throws IOException, InvalidParseTableException{
    log.beginTask("checking transformation", "CHECK current transformation");
    
    try {
      STRCommands.compile(currentTransSTR, "main");
    } finally {
      log.endTask();
    }
  }
  
  /**
   * @param args
   * @throws ClassNotFoundException
   * @throws IOException
   */
  public static void main(String[] args) {
    // log.log("This is the extensible java compiler.");
    try {
      String[] sources = handleOptions(args);
      Environment.init();
      
      if (Environment.cacheDir != null)
        FileCommands.createDir(Environment.cacheDir);
      
      FileCommands.createDir(Environment.bin);
      
      initializeCaches();
      
      allInputFiles = new ArrayList<URI>();
      pendingInputFiles = new ArrayList<URI>();
      
      for (String source : sources)
      {
        URI uri = new File(source).toURI();
        allInputFiles.add(uri);
        pendingInputFiles.add(uri);
      }
      
      for (URI source : allInputFiles)
        new Driver().process(source);
      
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
    
    if (line.hasOption("imports-changed"))
      importsChanged = true;
    
    if (line.hasOption("gen-java"))
      genJava = true;
    
    if (line.hasOption("stdlibdir"))
      Environment.stdLibDir = line.getOptionValue("stdlibdir");
    
    if (line.hasOption("xtbl"))
      Environment.xtblCompilation = true;
    
    if (line.hasOption("atomic-imports"))
      Environment.atomicImportParsing = true;
    
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
        "stdlibdir",
        true,
        "Specifiy the directory containing the standard library.");

    options.addOption(
        null,
        "xtbl",
        false,
        "Separately compile parse tables.");

    options.addOption(
        null,
        "atomic-imports",
        false,
        "Parse all import statements simultaneously.");
    
    return options;
  }

  @SuppressWarnings("unchecked")
  public static void initializeCaches() throws IOException, ClassNotFoundException {
    if (Environment.cacheDir == null)
      return;
    
    String sdfCache = FileCommands.findFile("sdfCache", Environment.cacheDir);
    String strCache = FileCommands.findFile("strCache", Environment.cacheDir);

    if (sdfCache != null)
      SDFCommands.sdfCache =
          (Cache<ModuleKey, String>) new ObjectInputStream(new FileInputStream(
              sdfCache)).readObject();
    else
      SDFCommands.sdfCache = new Cache<ModuleKey, String>();
    
    if (strCache != null)
      STRCommands.strCache =
          (Cache<ModuleKey, String>) new ObjectInputStream(new FileInputStream(
              strCache)).readObject();
    else
      STRCommands.strCache = new Cache<ModuleKey, String>();
  }

  
  public static void storeCaches() throws IOException {
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

    if (SDFCommands.sdfCache != null)
      new ObjectOutputStream(new FileOutputStream(sdfCache)).writeObject(SDFCommands.sdfCache);
    
    if (STRCommands.strCache != null)
      new ObjectOutputStream(new FileOutputStream(strCache)).writeObject(STRCommands.strCache);
  }

  private String relPackageNameSep() {
    if (relPackageName == null || relPackageName.isEmpty())
      return "";
    
    return relPackageName + sep;
  }
  
}
