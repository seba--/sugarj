package org.sugarj;

import static org.sugarj.common.ATermCommands.getApplicationSubterm;
import static org.sugarj.common.ATermCommands.isApplication;
import static org.sugarj.common.Log.log;

import java.io.File;
import java.io.IOException;
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
import org.strategoxt.HybridInterpreter;
import org.strategoxt.lang.Context;
import org.strategoxt.stratego_gpp.parse_pptable_file_0_0;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.IErrorLogger;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;
import org.sugarj.driver.sourcefilecontent.PrologSourceFileContent;
import org.sugarj.driver.sourcefilecontent.PrologSourceFileContent.PrologModuleImport;

public class PrologLib extends LanguageLib implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6271882490466636509L;
	private transient File libDir;
	
	private Set<RelativePath> generatedFiles = new HashSet<RelativePath>();

	private Path prologOutFile;

	private PrologSourceFileContent prologSource;

	private String decName;
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
				isApplication(decl, "Command") ||
				isApplication(decl, "ModuleReexport");				
	  }

	  @Override
	  public boolean isSugarDec(IStrategoTerm decl) {
	    return isApplication(decl, "SugarBody");           
	  }
	  
	  @Override
	  public boolean isNamespaceDec(IStrategoTerm decl) {
		  return isApplication(decl, "ModuleDec") ||
				  isApplication(decl, "SugarModuleDec");
	  }
	  
	  @Override
	  public boolean isEditorServiceDec(IStrategoTerm decl) {
	    return isApplication(decl, "EditorServicesDec");   
	  }

	  @Override
	  public boolean isImportDec(IStrategoTerm decl) {
	    return isApplication(decl, "ModuleImport");
	  }

	  @Override
	  public boolean isPlainDec(IStrategoTerm decl) {
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
		// Nothing to do here for prolog
		IStrategoTerm dec = toplevelDecl;
		
		// TODO: Implement reexport handling in a more sensible way
		
		if (isApplication(dec, "ModuleReexport")) 
			prologSource.addReexport(prettyPrint(dec, interp));
		else 
			prologSource.addBodyDecl(prettyPrint(dec, interp));
	}

	
	private IStrategoTerm initializePrettyPrinter(Context ctx) {
		if (pptable == null) {
			IStrategoTerm pptable_file = ATermCommands.makeString(getPrettyPrint().getAbsolutePath());
			pptable = parse_pptable_file_0_0.instance.invoke(org.strategoxt.stratego_gpp.stratego_gpp.init(), pptable_file);
		}
		
		return pptable;
	}
	
	@Override
	public String prettyPrint(IStrategoTerm term, HybridInterpreter interp) throws IOException {
		IStrategoTerm ppTable = initializePrettyPrinter(interp.getCompiledContext());
		return ATermCommands.prettyPrint(ppTable, term, interp);
	}

//	@Override
//	public String extractImportedModuleName(IStrategoTerm toplevelDecl, HybridInterpreter interp)
//			throws IOException {
///*
// * 	    String name = null;
//	    log.beginTask("Extracting", "Extract name of imported module");
//	    try {
//	      if (isApplication(toplevelDecl, "TypeImportDec"))
//	        name = prettyPrint(toplevelDecl.getSubterm(0), interp);
//	      
//	      if (isApplication(toplevelDecl, "TypeImportOnDemandDec"))
//	        name = prettyPrint(toplevelDecl.getSubterm(0), interp) + ".*";
//	    } finally {
//	      log.endTask(name);
//	    }
//	    return name;
//
// */
//		// java implementation above
//		// only one kind of import in prolog
//		
//		String name = null;
//		log.beginTask("Extracting", "Extract name of imported module");
//		try {
//			if (isApplication(toplevelDecl, "ModuleImport"))
//				name = prettyPrint(toplevelDecl.getSubterm(0).getSubterm(0), interp);
//		} finally {
//			log.endTask(name);
//		}
//		
//		return name;
//	}

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
	public String getRelativeNamespace() {
		// XXX: Is there a namespace separator in prolog? Or even any notion of compound namespaces?
		// XXX: From swi prolog doc: Modules are organised in a single and flat namespace and therefore module names must be chosen with some care to avoid conflicts.
		// XXX: SugarProlog will implement different namespace handling.
		return relNamespaceName + "/";
	}	
	
	@Override
	public void processNamespaceDec(IStrategoTerm toplevelDecl,
			Environment environment, HybridInterpreter interp,
			IErrorLogger errorLog,
			RelativeSourceLocationPath sourceFile,
			RelativeSourceLocationPath sourceFileFromResult) throws IOException {
		
		String moduleName = null;
		if (isApplication(toplevelDecl, "ModuleDec")) {
			moduleName = prettyPrint(getApplicationSubterm(toplevelDecl, "ModuleDec", 0), interp);
			prologSource.setModuleDecl(prettyPrint(toplevelDecl, interp));
		} else if (isApplication(toplevelDecl, "SugarModuleDec")) {
			moduleName = prettyPrint(getApplicationSubterm(toplevelDecl, "SugarModuleDec", 0), interp);
			prologSource.setModuleDecl(":-module(" + moduleName + ", []).");	// XXX: Ideally, a module only used for defining sugar should not be generated nor imported at all
		}
		relNamespaceName = FileCommands.dropFilename(sourceFile.getRelativePath());
		decName = getRelativeModulePath(moduleName);
		log.log("The SDF / Stratego package name is '" + relNamespaceName + "'.");
		
		
		if (prologOutFile == null) 
			prologOutFile = environment.createBinPath(getRelativeNamespace() + FileCommands.fileName(sourceFileFromResult) + ".pro");
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
		String modulePath = prettyPrint(toplevelDecl.getSubterm(0).getSubterm(0), interp);
		
		return modulePath;		
	}
	
	private String getRelativeModulePath(String moduleName) {
		return moduleName.replace("/", Environment.sep);
	}
	
	@Override
	public void addImportModule(IStrategoTerm toplevelDecl,
			HybridInterpreter interp, boolean checked) throws IOException {
		
		String importedModuleName = prettyPrint(toplevelDecl.getSubterm(0).getSubterm(0), interp);
		PrologModuleImport imp = prologSource.getImport(importedModuleName, toplevelDecl);
		
		if (checked)
			prologSource.addCheckedImport(imp);
		else
			prologSource.addImport(imp);	
	}
	
//	@Override
//	public String extractNamespaceName(IStrategoTerm toplevelDecl,
//			HybridInterpreter interp) throws IOException {
//		String moduleName = prettyPrint(getApplicationSubterm(toplevelDecl, "ModuleDec", 0), interp);
//		return moduleName;
//	}

	@Override
	public String getSugarName(IStrategoTerm decl, HybridInterpreter interp)
			throws IOException {
        return decName;
	}

	@Override
	public int getSugarAccessibility(IStrategoTerm decl) {
		return LanguageLib.PUBLIC_SUGAR;	//XXX: implemented only public sugar in prolog
	}

	@Override
	public IStrategoTerm getSugarBody(IStrategoTerm decl) {
		IStrategoTerm sugarBody = getApplicationSubterm(decl, "SugarBody", 0);
		
		return sugarBody;

	}
	
	
	@Override
	public String getLanguageName() {
		return "Prolog";
	}


	
	
}
