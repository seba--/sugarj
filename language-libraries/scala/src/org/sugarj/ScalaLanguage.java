package org.sugarj;

import static org.sugarj.common.ATermCommands.isApplication;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.path.Path;

/**
 * @author Florian Jakob &lt;f_jakob@rbg.informatik.tu-darmstadt.de&gt;
 */

public class ScalaLanguage extends AbstractBaseLanguage {

	private ScalaLanguage() { }

	private static ScalaLanguage instance = new ScalaLanguage();

	public static ScalaLanguage getInstance() {
		return instance;
	}

	/**
	 * @see org.sugarj.AbstractBaseLanguage#createNewProcessor()
	 */
	@Override
	public AbstractBaseProcessor createNewProcessor() {
		return new ScalaProcessor();
	}

  @Override
  public String getVersion() {
    return "scala-0.1.0";
  }

  @Override
  public String getLanguageName() {
    return "Scala";
  }

  @Override
  public String getBinaryFileExtension() {
    return "class";
  }

  @Override
  public String getSugarFileExtension() {
    return "sugsc";
  }

  @Override
  public String getBaseFileExtension() {
    return "scala";
  }

  @Override
  public List<Path> getPackagedGrammars() {
    List<Path> grammars = new LinkedList<Path>(super.getPackagedGrammars());
    grammars.add(ensureFile("org/sugarj/languages/SugarScala.def"));
    grammars.add(ensureFile("org/sugarj/languages/Scala.def"));
    return Collections.unmodifiableList(grammars);
  }

  @Override
  public Path getInitEditor() {
    return ensureFile("org/sugarj/scala/initEditor.serv");
  }

  @Override
  public String getInitEditorModuleName() {
    return "org/sugarj/scala/initEditor";
  }

  @Override
  public Path getInitGrammar() {
    return ensureFile("org/sugarj/scala/initGrammar.sdf");
  }

  @Override
  public String getInitGrammarModuleName() {
    return "org/sugarj/scala/initGrammar";
  }

  @Override
  public Path getInitTrans() {
    return ensureFile("org/sugarj/scala/initTrans.str");
  }

  @Override
  public String getInitTransModuleName() {
    return "org/sugarj/scala/initTrans";
  }

  @Override
  public boolean isExtensionDecl(IStrategoTerm decl) {
    return false;
  }

  @Override
  public boolean isImportDecl(IStrategoTerm decl) {
    return isApplication(decl, "Import");
  }

  @Override
  public boolean isBaseDecl(IStrategoTerm decl) {
    String[] baseDecls = {"Class", "Object", "CaseClass", "CaseObject", "Trait"};
    for (String baseDecl: baseDecls) {
      if (isApplication(decl, baseDecl)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean isPlainDecl(IStrategoTerm decl) {
    if (isApplication(decl, "PlainDec"))
      return true;
    return false;
  }

  public boolean isNamespaceDec(IStrategoTerm toplevelDecl) {
    // TODO
    return false;
  }
}
