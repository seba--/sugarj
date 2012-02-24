package org.sugarj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.sugarj.stdlib.StdLib;


public abstract class LanguageLib {
	//protected URI initGrammar;
/*	protected URI initTrans;
	protected URI initEditor;
	protected List<URI> languageGrammars = new ArrayList<URI>();		// sugar + language ???
	
	public URI libDir;
	protected String libTmpDir; */

	
	// XXX: ^^^ -- remove 
	
	public List<URI> getGrammars() {
		return Arrays.asList(new URI[]{StdLib.sdfDef, StdLib.strategoDef, StdLib.editorServicesDef, StdLib.plainDef});
	}
	
	public abstract URI getInitGrammar();    // XXX: change to file
	public abstract String getInitGrammarModule();
	public abstract URI getInitGrammarAtomicImports();
	public abstract String getInitGrammarAtomicImportsModule();
	public abstract URI getInitGrammarXTBL();
	public abstract URI getInitTrans();
	public abstract String getInitTransModule();
	public abstract URI getInitEditor();
	public abstract String getInitEditorModule();
	
	protected abstract URI ensureFile(String resource);
	
	// XXX: vvv -- remove
	
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
	
/*	public URI ensureFile(String resource) {
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
	*/
}
