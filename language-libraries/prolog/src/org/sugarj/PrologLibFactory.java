package org.sugarj;

import static org.sugarj.common.ATermCommands.getApplicationSubterm;
import static org.sugarj.common.ATermCommands.isApplication;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;

public class PrologLibFactory extends LanguageLibFactory {

  private PrologLibFactory() { }
  
  private static PrologLibFactory instance = new PrologLibFactory();
  
  public static PrologLibFactory getInstance() {
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
	public LanguageLib createLanguageLibrary() {
		return new PrologLib();
	}

  @Override
  public String getGeneratedFileExtension() {
    return "pro";
  }

  @Override
  public String getSugarFileExtension() {
    return "sugp";
  }

  @Override
  public List<File> getDefaultGrammars() {
  	List<File> grammars = new LinkedList<File>(super.getDefaultGrammars());
  	grammars.add(ensureFile("org/sugarj/languages/SugarProlog.def"));
  	grammars.add(ensureFile("org/sugarj/languages/Prolog.def"));
  	return Collections.unmodifiableList(grammars);
  }

  @Override
  public File getInitEditor() {
  	return ensureFile("org/sugarj/prolog/init/initEditor.serv");
  }

  @Override
  public String getInitEditorModuleName() {
  	return "org/sugarj/prolog/init/initEditor";
  }

  @Override
  public File getInitGrammar() {
  	return ensureFile("org/sugarj/prolog/init/initGrammar.sdf");
  }

  @Override
  public String getInitGrammarModuleName() {
  	return "org/sugarj/prolog/init/initGrammar";
  }

  @Override
  public File getInitTrans() {
  	return ensureFile("org/sugarj/prolog/init/InitTrans.str");
  }

  @Override
  public String getInitTransModuleName() {
  	return "org/sugarj/prolog/init/InitTrans";
  }

  @Override
  public boolean isExtensionDec(IStrategoTerm decl) {
    return isApplication(decl, "ExtensionBody");
  }

  @Override
  public boolean isImportDec(IStrategoTerm decl) {
    return isApplication(decl, "ModuleImport");
  }

  @Override
  public boolean isLanguageSpecificDec(IStrategoTerm decl) {
    return isApplication(decl, "NonUnitClause") || isApplication(decl, "UnitClause") || isApplication(decl, "Query") || isApplication(decl, "Command") || isApplication(decl, "ModuleReexport");
  }

  @Override
  public boolean isNamespaceDec(IStrategoTerm decl) {
    return isApplication(decl, "ModuleDec") || isApplication(decl, "SugarModuleDec");
  }

  @Override
  public boolean isPlainDec(IStrategoTerm decl) {
    return isApplication(decl, "PlainDec");
  }

  @Override
  public IStrategoTerm getExtensionBody(IStrategoTerm decl) {
    IStrategoTerm sugarBody = getApplicationSubterm(decl, "ExtensionBody", 0);
  
    return sugarBody;
  
  }
}
