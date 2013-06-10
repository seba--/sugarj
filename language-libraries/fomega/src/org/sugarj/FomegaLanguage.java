package org.sugarj;

import static org.sugarj.common.ATermCommands.isApplication;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.Log;
import org.sugarj.common.path.Path;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */

public class FomegaLanguage extends AbstractBaseLanguage {

	private FomegaLanguage() { }
	
	private static FomegaLanguage instance = new FomegaLanguage();
	
	public static FomegaLanguage getInstance() {
		return instance;
	}
	
	/**
	 * @see org.sugarj.AbstractBaseLanguage#createNewProcessor()
	 */
	@Override
	public AbstractBaseProcessor createNewProcessor() {
	  // TODO leave log level unchanged
	  Log.log.setLoggingLevel(Log.ALWAYS);
		return new FomegaProcessor();
	}

  @Override
  public String getLanguageName() {
    return "Fomega";
  }

  @Override
  public String getVersion() {
    return "fomega-0.1f";
  }
  
  @Override
  public String getBinaryFileExtension() {
    return null;
  }

  @Override
  public String getBaseFileExtension() {
    return "pts";
  }

  @Override
  public String getSugarFileExtension() {
    return "sf";
  }

  @Override
  public Path getInitGrammar() {
    return ensureFile("org/sugarj/fomega/initGrammar.sdf");
  }

  @Override
  public String getInitGrammarModuleName() {
    return "org/sugarj/fomega/initGrammar";
  }

  @Override
  public Path getInitTrans() {
    return ensureFile("org/sugarj/fomega/initTrans.str");
  }

  @Override
  public String getInitTransModuleName() {
    return "org/sugarj/fomega/initTrans";
  }

  @Override
  public Path getInitEditor() {
    return ensureFile("org/sugarj/fomega/initEditor.serv");
  }

  @Override
  public String getInitEditorModuleName() {
    return "org/sugarj/fomega/initEditor";
  }

  @Override
  public List<Path> getPackagedGrammars() {
    List<Path> grammars = new LinkedList<Path>(super.getPackagedGrammars());
    grammars.add(ensureFile("org/sugarj/languages/SugarFomega.def"));
    grammars.add(ensureFile("org/sugarj/languages/Fomega.def"));
    return Collections.unmodifiableList(grammars);
  }

  @Override
  public boolean isExtensionDecl(IStrategoTerm decl) {
    if (isApplication(decl, "ExtensionBody"))
      return true;
    return false;
  }

  @Override
  public boolean isImportDecl(IStrategoTerm decl) {
    return isApplication(decl, "Import");   
  }

  @Override
  public boolean isBaseDecl(IStrategoTerm decl) {
    return isApplication(decl, "FomegaBody") || isNamespaceDec(decl);
  }

  @Override
  public boolean isPlainDecl(IStrategoTerm decl) {
    if (isApplication(decl, "PlainDec"))
      return true;
    return false;
  }

  public boolean isNamespaceDec(IStrategoTerm decl) {
    return isApplication(decl, "ModuleDec");
  }
}
