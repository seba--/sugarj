package org.sugarj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;




public class JavaLib extends LanguageLib {

	private URI libDir = null;
	private String libTmpDir;
	
	@Override
	public List<URI> getGrammars() {
		List<URI> grammars = new LinkedList<URI>(super.getGrammars());
		grammars.add(ensureFile("org/sugarj/java/SugarJ.def"));
		grammars.add(ensureFile("org/sugarj/java/Java-15.def"));
		return Collections.unmodifiableList(grammars);
	}
	
	@Override
	public URI getInitGrammar() {
		return ensureFile("org/sugarj/java/init/initGrammar.sdf");
	}

	@Override
	public String getInitGrammarModule() {
		return "org/sugarj/java/init/initGrammar";
	}

	@Override
	public URI getInitGrammarAtomicImports() {
		return ensureFile("org/sugarj/java/init/initGrammar_atomicImports.sdf");
	}

	@Override
	public String getInitGrammarAtomicImportsModule() {
		return "org/sugarj/java/init/initGrammar_atomicImports";
	}

	@Override
	public URI getInitGrammarXTBL() {
		return ensureFile("org/sugarj/java/init/initGrammar.xtbl");
	}

	@Override
	public URI getInitTrans() {
		return ensureFile("org/sugarj/java/init/initTrans.str");
	}
	
	@Override
	public String getInitTransModule() {
		return "org/sugarj/java/init/initTrans";
	}

	@Override
	public URI getInitEditor() {
		return ensureFile("org/sugarj/java/init/initEditor.serv");
	}

	@Override
	public String getInitEditorModule() {
		return "org/sugarj/java/init/initEditor";
	}

	/*
	protected void setupDirectories(String tempDirPrefix) {
		try {
			// XXX: possibly modify this to use the implementation's directory?
			libDir = LanguageLib.class.getProtectionDomain().getCodeSource().getLocation().toURI();
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}
		
		try {
										// org.sugarj.stdlib
			File f = File.createTempFile(tempDirPrefix, "");
			f.delete();
			f.mkdir();
			libTmpDir = f.getPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}*/
	
	public URI ensureFile(String resource) {
		if (libDir == null) {	// set up directories first
			try {
				/*String dir = URLEncoder.encode(JavaLib.class.getProtectionDomain().getCodeSource().getLocation().toString(), "UTF-8");
				URL dirURL = new URL(dir);
				System.out.println("java lib dir: " + dir);		// XXX
				System.out.println("java lib dir url: " + dirURL);
				libDir = dirURL.toURI();
				System.out.println("java lib dir uri" + libDir); */
				String dir = JavaLib.class.getProtectionDomain().getCodeSource().getLocation().toString();		//
				dir = dir.replace(" ", "%20");
				libDir = new URI(dir);
				System.out.println("java lib dir uri" + libDir);

			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			
			try {
				File f = File.createTempFile("org.sugarj.javalib", "");
				f.delete();
				f.mkdir();
				libTmpDir = f.getPath();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		File f = new File(libDir.getPath() + File.separator + resource);
		if (f.exists())
			return f.toURI();

		f = new File(libTmpDir + "/" + resource);
		f.getParentFile().mkdirs();

		try {
			InputStream in = LanguageLib.class.getClassLoader().getResourceAsStream(resource);
			if (in == null)
				return  new File(libDir.getPath() + File.separator + resource).toURI();

			FileOutputStream fos = new FileOutputStream(f);
			byte[] bs = new byte[256];
			while (in.read(bs) >= 0)
				fos.write(bs);
			fos.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return f.toURI();
	}

	
	  public static void main(String args[]) throws URISyntaxException {
		JavaLib jl = new JavaLib();
		
		for (URI uri : jl.getGrammars()) 
			exists(uri);


	    exists(jl.getInitGrammar());
	    exists(jl.getInitGrammarAtomicImports());
	    exists(jl.getInitGrammarXTBL());
	    exists(jl.getInitTrans());
	    exists(jl.getInitEditor());
	    exists(jl.libDir);
	  }
	  
	  private static void exists(URI uri) {
	    if (new File(uri).exists())
	      System.out.println(uri.getPath() + " exists.");
	    else
	      System.err.println(uri.getPath() + " does not exist.");
	  }
	
	
	
	
	
	
	
	
	
	/*
	public JavaLib() {
		setupDirectories("org.sugarj.javalib");
		
		initGrammars.initGrammar = ensureFile("org/sugarj/java/init/initGrammar.sdf");
		initGrammars.initGrammarModule = "org/sugarj/java/init/initGrammar";
		initGrammars.initGrammarAtomicImports = ensureFile("org/sugarj/java/init/initGrammar_atomicImports.sdf");
		initGrammars.initGrammarAtomicImportsModule = "org/sugarj/java/init/initGrammar_atomicImports";
		initGrammars.initGrammarXTBL = ensureFile("org/sugarj/java/init/initGrammar.xtbl");
		
		initEditor = ensureFile("org/sugarj/java/init/initEditor.serv");;
		initTrans = ensureFile("org/sugarj/java/init/InitTrans.str");
		
		languageGrammars.add(ensureFile("org/sugarj/java/SugarJ.def"));				
		languageGrammars.add(ensureFile("org/sugarj/java/Java-15.def"));
		languageGrammars.add(ensureFile("org/sugarj/languages/Sdf2.def"));			// language-specific?
		// tbl?
		languageGrammars.add(ensureFile("org/sugarj/languages/Stratego.def"));		// ?
		// tbl?
		languageGrammars.add(ensureFile("org/sugarj/languages/EditorServices.def"));// ?
		// tbl?
		languageGrammars.add(ensureFile("org/sugarj/languages/Plain.def"));			// ?
	} */

}
