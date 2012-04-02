package org.sugarj;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.sugarj.stdlib.StdLib;


public abstract class LanguageLib implements Serializable {

  private static final long serialVersionUID = -6712835686318143995L;

  public List<File> getGrammars() {
		return Arrays.asList(new File[]{StdLib.sdfDef, StdLib.strategoDef, StdLib.editorServicesDef, StdLib.plainDef, StdLib.commonDef});
	}
	
	public abstract File getInitGrammar();   
	public abstract String getInitGrammarModule();
	// public abstract File getInitGrammarAtomicImports();           // TODO: remove
	// public abstract String getInitGrammarAtomicImportsModule();   // TODO: remove
	// public abstract File getInitGrammarXTBL();                    // TODO: remove
	public abstract File getInitTrans();
	public abstract String getInitTransModule();
	public abstract File getInitEditor();
	public abstract String getInitEditorModule();
	
	public abstract File getLibraryDirectory();
	
	protected abstract File ensureFile(String resource);
	
}
