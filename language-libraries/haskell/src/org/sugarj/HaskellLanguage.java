package org.sugarj;

import static org.sugarj.common.ATermCommands.getApplicationSubterm;
import static org.sugarj.common.ATermCommands.isApplication;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */

public class HaskellLanguage extends AbstractBaseLanguage {

	private HaskellLanguage() { }
	
	private static HaskellLanguage instance = new HaskellLanguage();
	
	public static HaskellLanguage getInstance() {
		return instance;
	}
	
	/**
	 * @see org.sugarj.AbstractBaseLanguage#createNewProcessor()
	 */
	@Override
	public AbstractBaseProcessor createNewProcessor() {
		return new HaskellProcessor();
	}

  @Override
  public String getVersion() {
    return "haskell-0.1a";
  }
  
  @Override
  public String getLanguageName() {
    return "Haskell";
  }

  @Override
  public String getGeneratedFileExtension() {
    return "o";
  }

  @Override
  public String getSugarFileExtension() {
    return "shs";
  }
  
  @Override
  public String getOriginalFileExtension() {
    return "hs";
  }

  @Override
  public List<File> getDefaultGrammars() {
    List<File> grammars = new LinkedList<File>(super.getDefaultGrammars());
    grammars.add(ensureFile("org/sugarj/languages/SugarHaskell.def"));
    grammars.add(ensureFile("org/sugarj/languages/Haskell.def"));
    return Collections.unmodifiableList(grammars);
  }

  @Override
  public File getInitEditor() {
    return ensureFile("org/sugarj/haskell/initEditor.serv");
  }

  @Override
  public String getInitEditorModuleName() {
    return "org/sugarj/haskell/initEditor";
  }

  @Override
  public File getInitGrammar() {
    return ensureFile("org/sugarj/haskell/initGrammar.sdf");
  }

  @Override
  public String getInitGrammarModuleName() {
    return "org/sugarj/haskell/initGrammar";
  }

  @Override
  public File getInitTrans() {
    return ensureFile("org/sugarj/haskell/initTrans.str");
  }

  @Override
  public String getInitTransModuleName() {
    return "org/sugarj/haskell/initTrans";
  }

  @Override
  public boolean isExtensionDec(IStrategoTerm decl) {
    if (isApplication(decl, "ExtensionBody"))
      return true;
    return false;
  }

  @Override
  public boolean isImportDec(IStrategoTerm decl) {
    return isApplication(decl, "Import");   
  }

  @Override
  public boolean isLanguageSpecificDec(IStrategoTerm decl) {
    return isApplication(decl, "HaskellBody");
  }

  @Override
  public boolean isNamespaceDec(IStrategoTerm decl) {
    return isApplication(decl, "ModuleDec");
  }

  @Override
  public boolean isPlainDec(IStrategoTerm decl) {
    if (isApplication(decl, "PlainDec"))
      return true;
    return false;
  }

  @Override
  public IStrategoTerm getExtensionBody(IStrategoTerm decl) {
    return getApplicationSubterm(decl, "ExtensionBody", 0);
  }

}
