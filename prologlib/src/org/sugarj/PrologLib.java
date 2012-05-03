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
import org.strategoxt.HybridInterpreter;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.IErrorLogger;
import org.sugarj.common.JavaCommands;
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

	private ISourceFileContent prologSource;		// XXX: change to a prolog specific sourcefile

	private String relNamespaceName;
	
	
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
		return ensureFile("org/sugarj/prolog/init/initTrans.str");
	}

	@Override
	public String getInitTransModule() {
		return "org/sugarj/prolog/init/initTrans";
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
	    return isApplication(decl, "Sentence");
	  }

	  @Override
	  public boolean isSugarDec(IStrategoTerm decl) {
	    return isApplication(decl, "SugarDec");           
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
	public String getSourceFileExtension() {
		return ".pro";
	}

	@Override
	public String getBinFileExtension() {
		// Return null, as swi prolog is an interpreted language.
		return null;
	}

	@Override
	public String getSugarFileExtension() {
		return ".sugp";
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
		// :- module("foo", [bar/1, baz/2]).
		
		IStrategoTerm dec = isApplication(toplevelDecl, "ModuleDec") ?
				getApplicationSubterm(toplevelDecl, "ModuleDec", 0) : toplevelDecl;
		
		String decName = Term.asJavaString(dec.getSubterm(0).getSubterm(1).getSubterm(0));	// XXX: asJavaString?
		RelativePath moduleFile = environment.createBinPath(getRelNamespaceSep() + decName + ".pro");
		generatedFiles.add(moduleFile);
		prologSource.addBodyDecl(prettyPrint(dec, interp));
/*
 * 	    IStrategoTerm dec =  isApplication(toplevelDecl, "JavaTypeDec") ?
 *  getApplicationSubterm(toplevelDecl, "JavaTypeDec", 0) : toplevelDecl;   // XXX: Extract JavaTypeDec stuff
	    
	    String decName = Term.asJavaString(dec.getSubterm(0).getSubterm(1).getSubterm(0));
	    
	    RelativePath clazz = environment.createBinPath(getRelNamespaceSep() + decName + ".class");
	    
	    generatedJavaClasses.add(clazz);
	    javaSource.addBodyDecl(prettyPrint(dec, interp));

 */
		// XXX: IMPLEMENT THIS
	}

	@Override
	public String prettyPrint(IStrategoTerm term,
			HybridInterpreter interp) throws IOException {
		// TODO Auto-generated method stub
		return null;
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
				name = prettyPrint(toplevelDecl.getSubterm(0), interp);
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
		prologSource = new PrologSourceFileContent();
		// XXX: set optional import?
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkNamespace(IStrategoTerm decl,
			RelativeSourceLocationPath sourceFile, IErrorLogger errorLog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processNamespaceDec(IStrategoTerm toplevelDecl,
			Environment environment, HybridInterpreter interp,
			IErrorLogger errorLog, String packageName,
			RelativeSourceLocationPath sourceFile,
			RelativeSourceLocationPath sourceFileFromResult) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LanguageLibFactory getFactoryForLanguage() {
		return new PrologLibFactory();
	}

	@Override
	public void compile(List<Path> outFiles, Path bin, List<Path> path,
			Set<? extends Path> generatedFiles,
			Map<Path, Integer> generatedFileHashes, boolean generateFiles)
			throws IOException {
		// TODO Auto-generated method stub

	}





	
}
