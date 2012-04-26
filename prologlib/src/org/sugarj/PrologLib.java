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
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.HybridInterpreter;
import org.sugarj.common.Environment;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.driver.PrologCommands;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;

public class PrologLib extends LanguageLib implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6271882490466636509L;
	private transient File libDir;
	private transient File libTmpDir;
	
	
	// XXX: Name!
	private Set<RelativePath> generatedJavaClasses = new HashSet<RelativePath>();

	private Path prologOutFile;

	private ISourceFileContent prologSource;		// XXX: change to a prolog specific sourcefile

	private String relPackageName;
	
	private static PrologCommands prologCommands;

	
	
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
		// XXX: ?
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
	    return isApplication(decl, "SugarDec");           // XXX: Add to prolog
	  }
	  
	  @Override
	  public boolean isEditorService(IStrategoTerm decl) {
	    return isApplication(decl, "EditorServicesDec");    // XXX: Add to prolog
	  }

	  @Override
	  public boolean isImport(IStrategoTerm decl) {
	    return isApplication(decl, "ModuleImport");
	  }

	  @Override
	  public boolean isPlain(IStrategoTerm decl) {
	    return isApplication(decl, "PlainDec");         // XXX: Add to prolog
	  }

	@Override
	public ICompilerCommands getCompilerCommands() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSourceFileExtension() {
		return ".pro";
	}

	@Override
	public String getBinFileExtension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSugarFileExtension() {
		return ".sugp";
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ISourceFileContent getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Path getOutFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<RelativePath> getGeneratedFiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void processLanguageSpecific(IStrategoTerm toplevelDecl,
			Environment environment, HybridInterpreter interp)
			throws IOException {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setupSourceFile(RelativePath sourceFile, Environment environment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkSourceOutFile(Environment environment, IResult driverResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNamespace() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRelNamespaceSep() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void checkNamespace(IStrategoTerm decl,
			RelativeSourceLocationPath sourceFile, IResult driverResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processNamespaceDec(IStrategoTerm toplevelDecl,
			Environment environment, HybridInterpreter interp,
			IResult driverResult, String packageName,
			RelativeSourceLocationPath sourceFile) throws IOException {
		// TODO Auto-generated method stub
		
	}

	
}
