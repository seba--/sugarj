package org.sugarj;

import static org.sugarj.common.ATermCommands.isApplication;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.path.Path;

public class PrologLanguage extends AbstractBaseLanguage {

  private PrologLanguage() { }
  
  private static PrologLanguage instance = new PrologLanguage();
  
  public static PrologLanguage getInstance() {
    return instance;
  }

  @Override
  public String getVersion() {
    return "prolog-0.1a";
  }

  @Override
  public String getLanguageName() {
    return "Prolog";
  }

	@Override
	public AbstractBaseProcessor createNewProcessor() {
		return new PrologProcessor();
	}

  @Override
  public String getBinaryFileExtension() {
    return null;
  }
  
  @Override
  public String getBaseFileExtension() {
    return "pro";
  }

  @Override
  public String getSugarFileExtension() {
    return "sugp";
  }

  @Override
  public List<Path> getPackagedGrammars() {
  	List<Path> grammars = new LinkedList<Path>(super.getPackagedGrammars());
  	grammars.add(ensureFile("org/sugarj/languages/SugarProlog.def"));
  	grammars.add(ensureFile("org/sugarj/languages/Prolog.def"));
  	return Collections.unmodifiableList(grammars);
  }

  @Override
  public Path getInitEditor() {
  	return ensureFile("org/sugarj/prolog/init/initEditor.serv");
  }

  @Override
  public String getInitEditorModuleName() {
  	return "org/sugarj/prolog/init/initEditor";
  }

  @Override
  public Path getInitGrammar() {
  	return ensureFile("org/sugarj/prolog/init/initGrammar.sdf");
  }

  @Override
  public String getInitGrammarModuleName() {
  	return "org/sugarj/prolog/init/initGrammar";
  }

  @Override
  public Path getInitTrans() {
  	return ensureFile("org/sugarj/prolog/init/InitTrans.str");
  }

  @Override
  public String getInitTransModuleName() {
  	return "org/sugarj/prolog/init/InitTrans";
  }

  @Override
  public boolean isExtensionDecl(IStrategoTerm decl) {
    return isApplication(decl, "ExtensionBody");
  }

  @Override
  public boolean isImportDecl(IStrategoTerm decl) {
    return isApplication(decl, "ModuleImport");
  }

  @Override
  public boolean isBaseDecl(IStrategoTerm decl) {
    return isApplication(decl, "NonUnitClause")
        || isApplication(decl, "UnitClause") 
        || isApplication(decl, "Query") 
        || isApplication(decl, "Command") 
        || isApplication(decl, "ModuleReexport")
        || isNamespaceDec(decl);
  }

  public boolean isNamespaceDec(IStrategoTerm decl) {
    return isApplication(decl, "ModuleDec") || isApplication(decl, "SugarModuleDec");
  }

  @Override
  public boolean isPlainDecl(IStrategoTerm decl) {
    return isApplication(decl, "PlainDec");
  }
}
