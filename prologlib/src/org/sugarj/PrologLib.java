package org.sugarj;

import static org.sugarj.common.ATermCommands.getApplicationSubterm;
import static org.sugarj.common.ATermCommands.isApplication;
import static org.sugarj.common.Environment.sep;
import static org.sugarj.common.Log.log;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.Term;
import org.spoofax.terms.TermFactory;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.java_front.pp_java_string_0_0;
import org.strategoxt.lang.Context;
import org.strategoxt.stratego_gpp.abox2text_0_1;
import org.strategoxt.stratego_gpp.ast2abox_0_1;
import org.strategoxt.stratego_gpp.ast2box_0_1;
import org.strategoxt.stratego_gpp.box2text_string_0_1;
import org.strategoxt.stratego_gpp.parse_pptable_file_0_0;
import org.strategoxt.stratego_lib.list_1_0;
import org.strategoxt.stratego_sglr.tuple_2_0;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.IErrorLogger;
import org.sugarj.common.JavaCommands;
import org.sugarj.common.path.AbsolutePath;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;
import org.sugarj.driver.sourcefilecontent.PrologSourceFileContent;

public class PrologLib extends LanguageLib implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6271882490466636509L;
	private transient File libDir;
	private transient File libTmpDir;
	
	
	private Set<RelativePath> generatedFiles = new HashSet<RelativePath>();

	private Path prologOutFile;

	private PrologSourceFileContent prologSource;

	private String relNamespaceName;
	
	private IStrategoTerm pptable = null;
	private File prettyPrint = null;
	
	private File getPrettyPrint() {
		if (prettyPrint == null)
			prettyPrint = ensureFile("org/sugarj/languages/Prolog.pp");
		
		return prettyPrint;
	}
	
	@Override
	public List<File> getGrammars() {
		List<File> grammars = new LinkedList<File>(super.getGrammars());
		grammars.add(ensureFile("org/sugarj/languages/SugarProlog.def"));
		grammars.add(ensureFile("org/sugarj/languages/Prolog.def"));
		return Collections.unmodifiableList(grammars);
	}
	
	@Override
	public File getInitGrammar() {
		return ensureFile("org/sugarj/prolog/init/initGrammar.sdf");
	}

	@Override
	public String getInitGrammarModule() {
		return "org/sugarj/prolog/init/initGrammar";
	}

	@Override
	public File getInitTrans() {
		return ensureFile("org/sugarj/prolog/init/InitTrans.str");
	}

	@Override
	public String getInitTransModule() {
		return "org/sugarj/prolog/init/InitTrans";
	}

	@Override
	public File getInitEditor() {
		// TODO Create a real prolog editor
		return ensureFile("org/sugarj/prolog/init/initEditor.serv");
	}

	@Override
	public String getInitEditorModule() {
		// TODO Create a real prolog editor
		return "org/sugarj/prolog/init/initEditor";
	}

	@Override
	public File getLibraryDirectory() {
		// XXX: Do we need this in a language library? Just setup code, extract?
		if (libDir == null) {	// set up directories first
			String thisClassPath = "org/sugarj/PrologLib.class";
			URL thisClassURL = PrologLib.class.getClassLoader().getResource(thisClassPath);
			
			System.out.println(thisClassURL);
			
			if (thisClassURL.getProtocol().equals("bundleresource"))
			  try {
			    thisClassURL = FileLocator.resolve(thisClassURL);
			  } catch (IOException e) {
			    e.printStackTrace();
			  }
			
			String classPath = thisClassURL.getPath();
			String binPath = classPath.substring(0, classPath.length() - thisClassPath.length());
			
			libDir = new File(binPath);
		}
		
		return libDir;
	}
	
	private File getTmpLibraryDirectory() {
		if (libTmpDir == null)
			try {
				File f = File.createTempFile("org.sugarj.prologlib", "");
				f.delete();
				f.mkdir();
				libTmpDir = f;
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		return libTmpDir;
	}

	@Override
	public File ensureFile(String resource) {
		// XXX: Do we need this in the language library? -> Extract
		File f = new File(getLibraryDirectory().getPath() + File.separator + resource);
		
		System.out.println("prologlib ensure file: " + f);
		
		if (f.exists())
			return f;

		f = new File(getTmpLibraryDirectory().getPath() + "/" + resource);
		System.out.println("f does not exist, making temp file " + f);
		f.getParentFile().mkdirs();

		try {
			InputStream in = LanguageLib.class.getClassLoader().getResourceAsStream(resource);
			if (in == null)
				return  new File(getLibraryDirectory().getPath() + File.separator + resource);

			FileOutputStream fos = new FileOutputStream(f);
			byte[] bs = new byte[256];
			while (in.read(bs) >= 0)
				fos.write(bs);
			fos.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return f;
	}

	
	  public static void main(String args[]) throws URISyntaxException {
		PrologLib pl = new PrologLib();
		
		for (File file : pl.getGrammars()) 
			exists(file);


	    exists(pl.getInitGrammar());
	    exists(pl.getInitTrans());
	    exists(pl.getInitEditor());
	    exists(pl.libDir);
	  }
	  
	  private static void exists(File file) {
	    if (file.exists())
	      System.out.println(file.getPath() + " exists.");
	    else
	      System.err.println(file.getPath() + " does not exist.");
	  }
	  
	  // ---
	  
	  @Override
	  public boolean isLanguageSpecificDec(IStrategoTerm decl) {
	    //return isApplication(decl, "Sentence");
		return isApplication(decl, "NonUnitClause") || 
				isApplication(decl, "UnitClause") ||
				isApplication(decl, "Query") ||
				isApplication(decl, "Command");
	  }

	  @Override
	  public boolean isSugarDec(IStrategoTerm decl) {
	    return isApplication(decl, "SugarDec");           
	  }
	  
	  @Override
	  public boolean isNamespaceDec(IStrategoTerm decl) {
		  return isApplication(decl, "ModuleDec");
	  }
	  
	  @Override
	  public boolean isEditorService(IStrategoTerm decl) {
	    return isApplication(decl, "EditorServicesDec");   
	  }

	  @Override
	  public boolean isImport(IStrategoTerm decl) {
	    return isApplication(decl, "ModuleImport");
	  }

	  @Override
	  public boolean isPlain(IStrategoTerm decl) {
	    return isApplication(decl, "PlainDec");        
	  }

	@Override
	public String getGeneratedFileExtension() {
		return ".pro";
	}

	@Override
	public String getSugarFileExtension() {
		//return ".sugp";		// XXX: CHANGE THIS BACK
		return ".sugj";
	}

	@Override
	public void init() {
		prologOutFile = null;
		prologSource = null;
	}

	@Override
	public ISourceFileContent getSource() {
		return prologSource;
	}

	@Override
	public Path getOutFile() {
		return prologOutFile;
	}

	@Override
	public Set<RelativePath> getGeneratedFiles() {
		return generatedFiles;
	}

	@Override
	public void processLanguageSpecific(IStrategoTerm toplevelDecl,
			Environment environment, HybridInterpreter interp)
			throws IOException {
		// XXX: What do I actually need to do here?
		// XXX: No types, so probably nothing??
		// :- module("foo", [bar/1, baz/2]).
		
		/*
		IStrategoTerm dec = isApplication(toplevelDecl, "ModuleDec") ?
				getApplicationSubterm(toplevelDecl, "ModuleDec", 0) : toplevelDecl;

		//String decName = Term.asJavaString(dec.getSubterm(0).getSubterm(1).getSubterm(0));	// XXX: asJavaString?
		String decName = dec.getSubterm(0).getSubterm(1).getSubterm(0).toString();
		RelativePath moduleFile = environment.createBinPath(getRelNamespaceSep() + decName + ".pro");
		generatedFiles.add(moduleFile);
		*/
		IStrategoTerm dec = toplevelDecl;
		
		prologSource.addBodyDecl(prettyPrint(dec, interp));
		
/*
 * 	    IStrategoTerm dec =  isApplication(toplevelDecl, "JavaTypeDec") ?
 *  getApplicationSubterm(toplevelDecl, "JavaTypeDec", 0) : toplevelDecl;   // XXX: Extract JavaTypeDec stuff
	    
	    String decName = Term.asJavaString(dec.getSubterm(0).getSubterm(1).getSubterm(0));
	    
	    RelativePath clazz = environment.createBinPath(getRelNamespaceSep() + decName + ".class");
	    
	    generatedJavaClasses.add(clazz);
	    javaSource.addBodyDecl(prettyPrint(dec, interp));

 */
		
	}

	
	private IStrategoTerm initializePrettyPrinter(Context ctx) {
		if (pptable == null) {
			IStrategoTerm pptable_file = ATermCommands.makeString(getPrettyPrint().getAbsolutePath(), null);
			pptable = parse_pptable_file_0_0.instance.invoke(org.strategoxt.stratego_gpp.stratego_gpp.init(), pptable_file);
		}
		
		return pptable;
	}
	
	@Override
	public String prettyPrint(IStrategoTerm term,
			HybridInterpreter interp) throws IOException {
		
		/*
		 * parse_pptable_file_0_0.class  invoke(context, atermcommads.makeString(filename))
ast2abox_0_1.class   invoke(context, term, table)
abox2text_0_1.class    invoke(context, prolog-term, width integer)
		 */
		
		
		// XXX: This might need some fixing.
		
		System.err.println("+++++++++++++++++++++++ pretty-printing prolog");
		Context ctx = interp.getCompiledContext();		
		IStrategoTerm ppTable = initializePrettyPrinter(ctx);
		System.err.println("pptable: " + ppTable);
		TermFactory tf = new TermFactory();
		IStrategoTerm ppt_list = tf.makeList(ppTable);
		IStrategoTerm ppAbox = ast2abox_0_1.instance.invoke(ctx, term, ppt_list);		
		System.err.println("abox: " + ppAbox);
		IStrategoTerm ppText = box2text_string_0_1.instance.invoke(ctx, ppAbox, ATermCommands.atermFromString("80"));
		String pretty = ATermCommands.getString(ppText);
		System.err.println("pptext: " + pretty);
		return pretty;
		
		
		/*
		 * 		System.err.println("---\n prettyprint context:");
		Context ctx = interp.getCompiledContext();
		System.err.println(ctx);
		System.err.println("prettyprint term:");
		System.err.println(term);
		//IStrategoTerm string = pp_java_string_0_0.instance.invoke(interp.getCompiledContext(), term);
		IStrategoTerm string = pp_java_string_0_0.instance.invoke(ctx, term);
		System.err.println("prettyprint string:");
		System.err.println(string);
	    if (string != null)
	      return Term.asJavaString(string);
	    
	    throw new RuntimeException("pretty printing java AST failed: " + term);

		 */
		
	}

	@Override
	public String extractImportedModuleName(IStrategoTerm toplevelDecl, HybridInterpreter interp)
			throws IOException {
/*
 * 	    String name = null;
	    log.beginTask("Extracting", "Extract name of imported module");
	    try {
	      if (isApplication(toplevelDecl, "TypeImportDec"))
	        name = prettyPrint(toplevelDecl.getSubterm(0), interp);
	      
	      if (isApplication(toplevelDecl, "TypeImportOnDemandDec"))
	        name = prettyPrint(toplevelDecl.getSubterm(0), interp) + ".*";
	    } finally {
	      log.endTask(name);
	    }
	    return name;

 */
		// java implementation above
		// only one kind of import in prolog
		
		String name = null;
		log.beginTask("Extracting", "Extract name of imported module");
		try {
			if (isApplication(toplevelDecl, "ModuleImport"))
				name = prettyPrint(toplevelDecl.getSubterm(0).getSubterm(0), interp);
		} finally {
			log.endTask(name);
		}
		
		return name;
	}

	@Override
	public void setupSourceFile(RelativePath sourceFile, Environment environment) {

/*
 * 	    javaOutFile = environment.createBinPath(FileCommands.dropExtension(sourceFile.getRelativePath()) + ".java");
	    javaSource = new JavaSourceFileContent();
	    javaSource.setOptionalImport(false);
		
 */
		prologOutFile = environment.createBinPath(FileCommands.dropExtension(sourceFile.getRelativePath()) + ".pro");
		prologSource = new PrologSourceFileContent(this);
		prologSource.setOptionalImport(false);
		
	}



	@Override
	public String getNamespace() {
		return relNamespaceName;
	}

	@Override
	public String getRelNamespaceSep() {
		// XXX: Is there a namespace separator in prolog? Or even any notion of compound namespaces?
		// XXX: From swi prolog doc: Modules are organised in a single and flat namespace and therefore module names must be chosen with some care to avoid conflicts.
		return "";
	}

	@Override
	public void checkSourceOutFile(Environment environment,
			RelativeSourceLocationPath sourceFile) {
		if (prologOutFile == null) 
			prologOutFile = environment.createBinPath(getRelNamespaceSep() + FileCommands.fileName(sourceFile) + ".pro");
	}

	@Override
	public void checkNamespace(IStrategoTerm decl,
			RelativeSourceLocationPath sourceFile, IErrorLogger errorLog) {
		if (relNamespaceName == null)
			checkNamespaceName(decl, sourceFile, errorLog);
	}
	
	private void checkNamespaceName(IStrategoTerm toplevelDecl, RelativeSourceLocationPath sourceFile, IErrorLogger errorLog) {
		if (sourceFile != null) {
			String namespaceName = relNamespaceName == null ? "" : relNamespaceName;
			
			String rel = FileCommands.dropExtension(sourceFile.getRelativePath());
			int i = rel.lastIndexOf('/');
			
			String expectedNamespace = (i >= 0 ? rel.substring(0, i) : rel);
			
			if (!namespaceName.equals(expectedNamespace)) {
				setErrorMessage(
						toplevelDecl,
						"The declared namespace '" + namespaceName + "'" +
						" does not match the expected namespace '" + expectedNamespace + "'.", errorLog);
			}
		}
	}
	
	@Override
	public void processNamespaceDec(IStrategoTerm toplevelDecl,
			Environment environment, HybridInterpreter interp,
			IErrorLogger errorLog, String packageName,
			RelativeSourceLocationPath sourceFile,
			RelativeSourceLocationPath sourceFileFromResult) throws IOException {

		relNamespaceName = getRelativeModulePath(packageName);
		log.log("The SDF / Stratego package name is '" + relNamespaceName + "'.");
		
		checkNamespaceName(toplevelDecl, sourceFile, errorLog);
		
		if (prologOutFile == null) 
			prologOutFile = environment.createBinPath(getRelNamespaceSep() + FileCommands.fileName(sourceFileFromResult) + ".pro");
		
		prologSource.setNamespaceDecl(prettyPrint(toplevelDecl, interp));
		
	}
	
	
	/*
	 * 	  public void processNamespaceDec(IStrategoTerm toplevelDecl, Environment environment, HybridInterpreter interp, IErrorLogger errorLog, String packageName, RelativeSourceLocationPath sourceFile, RelativeSourceLocationPath sourceFileFromResult) throws IOException {
	    relPackageName = getRelativeModulePath(packageName);
	
	    log.log("The SDF / Stratego package name is '" + relPackageName + "'.");
	
	    checkPackageName(toplevelDecl, sourceFile, errorLog);
	
	    if (javaOutFile == null)
	      javaOutFile = environment.createBinPath(getRelNamespaceSep() + FileCommands.fileName(sourceFileFromResult) + ".java");			// XXX: Can we just reuse sourceFile here?
	
	    // moved here before depOutFile==null check
	    javaSource.setNamespaceDecl(prettyPrint(toplevelDecl, interp));

	 */

	@Override
	public LanguageLibFactory getFactoryForLanguage() {
		return new PrologLibFactory();
	}

	@Override
	public void compile(List<Path> sourceFiles, Path bin, List<Path> path,	// 'path' is library path?
			Set<? extends Path> generatedFiles,
			Map<Path, Integer> generatedFileHashes, HybridInterpreter interp,
			boolean generateFiles)
			throws IOException {

		if (generateFiles) {
			for (Path file : sourceFiles) {
				/*String copiedFileName = bin.getFile().getAbsolutePath() + File.separator + file.getFile().getName();
				System.err.println("###################### file name: " + copiedFileName);
				File destFile = new File(copiedFileName);
				Path p2 = new AbsolutePath(destFile.getAbsolutePath());
				FileCommands.copyFile(file, p2);*/
				// XXX: do nothing here?
				System.err.println("prolog;     no compilation neccessary, file: " + file);
			}
			for (Path cl : generatedFiles) {
				generatedFileHashes.put(cl, FileCommands.fileHash(cl));
			}
		}

	}
	
	@Override
	public String getImportedModulePath(IStrategoTerm toplevelDecl,
			HybridInterpreter interp) throws IOException {
		//String importModuleName = extractImportedModuleName(toplevelDecl, interp);
		String modulePath = prettyPrint(toplevelDecl.getSubterm(0).getSubterm(0), interp);
		
		return modulePath;
		
		//return getRelativeModulePath(importModuleName);
		
	}
	
	private String getRelativeModulePath(String moduleName) {
		return moduleName.replace("/", Environment.sep);
	}
	
	@Override
	public void addImportModule(IStrategoTerm toplevelDecl,
			HybridInterpreter interp) throws IOException {
		prologSource.addImport(prologSource.getImport(extractImportedModuleName(toplevelDecl, interp), toplevelDecl));	
	}

	@Override
	public void addCheckedImportModule(IStrategoTerm toplevelDecl,
			HybridInterpreter interp) throws IOException {
		prologSource.addCheckedImport(prologSource.getImport(extractImportedModuleName(toplevelDecl, interp), toplevelDecl));	
	}
	
	private void setErrorMessage(IStrategoTerm toplevelDecl, String msg, IErrorLogger errorLog) {
	    // XXX: Merge with setErrorMessage from Driver
	    errorLog.logError(msg);
	    ATermCommands.setErrorMessage(toplevelDecl, msg);
	  }

	@Override
	public String extractNamespaceName(IStrategoTerm toplevelDecl,
			HybridInterpreter interp) throws IOException {
		String moduleName = prettyPrint(getApplicationSubterm(toplevelDecl, "ModuleDec", 0), interp);
		return moduleName;
	}

	
	
}
