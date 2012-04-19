package org.sugarj;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.sugarj.common.Environment;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;
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
	
	
	public abstract ICompilerCommands getCompilerCommands();
	
	
	
	public abstract String getSourceFileExtension();
	public abstract String getBinFileExtension();
	public abstract String getSugarFileExtension();
	
}
