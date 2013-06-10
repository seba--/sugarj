package org.sugarj;

import static org.sugarj.common.ATermCommands.getApplicationSubterm;
import static org.sugarj.common.ATermCommands.isApplication;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.Term;
import org.strategoxt.java_front.java_front;
import org.strategoxt.java_front.pp_java_string_0_0;
import org.strategoxt.lang.Context;
import org.sugarj.common.FileCommands;
import org.sugarj.common.path.Path;

public class JavaLanguage extends AbstractBaseLanguage {

  private JavaLanguage() { }
  
  private static JavaLanguage instance = new JavaLanguage();

  Context javaFronCtx = java_front.init();

  public static JavaLanguage getInstance() {
    return instance;
  }
  
  @Override
  public AbstractBaseProcessor createNewProcessor() {
    return new JavaProcessor();
  }

  @Override
  public String getLanguageName() {
    return "Java";
  }

  @Override
  public String getVersion() {
    return "java-0.2";
  }

  @Override
  public String getBinaryFileExtension() {
    return "class";
  }

  @Override
  public String getSugarFileExtension() {
    return "sugj";
  }
  
  @Override
  public String getBaseFileExtension() {
    return "java";
  }

  @Override
  public List<Path> getPackagedGrammars() {
    List<Path> grammars = new LinkedList<Path>(super.getPackagedGrammars());
    grammars.add(ensureFile("org/sugarj/languages/SugarJ.def"));
    grammars.add(ensureFile("org/sugarj/languages/Java-15.def"));
    return Collections.unmodifiableList(grammars);
  }

  @Override
  public Path getInitEditor() {
    return ensureFile("org/sugarj/java/init/initEditor.serv");
  }

  @Override
  public String getInitEditorModuleName() {
    return "org/sugarj/java/init/initEditor";
  }

  @Override
  public Path getInitGrammar() {
    return ensureFile("org/sugarj/java/init/initGrammar.sdf");
  }

  @Override
  public String getInitGrammarModuleName() {
    return "org/sugarj/java/init/initGrammar";
  }

  @Override
  public Path getInitTrans() {
    return ensureFile("org/sugarj/java/init/InitTrans.str");
  }

  @Override
  public String getInitTransModuleName() {
    return "org/sugarj/java/init/InitTrans";
  }

  @Override
  public IStrategoTerm getTransformationApplication(IStrategoTerm decl) {
    return getApplicationSubterm(decl, "TransImportDec", 1);
  }

  @Override
  public IStrategoTerm getTransformationBody(IStrategoTerm decl) {
    IStrategoTerm body = getApplicationSubterm(decl, "TransDec", 1);
    IStrategoTerm sugarBody = getApplicationSubterm(body, "TransBody", 0);
    return sugarBody;
  }

  @Override
  public String getTransformationName(IStrategoTerm decl) throws IOException {
    IStrategoTerm head = getApplicationSubterm(decl, "TransDec", 0);
    String extName = prettyPrint(getApplicationSubterm(head, "TransDecHead", 1));
    return extName;
  }

  @Override
  public boolean isExtensionDecl(IStrategoTerm decl) {
    return isApplication(decl, "ExtensionDec");
  }

  @Override
  public boolean isImportDecl(IStrategoTerm decl) {
    return 
        isApplication(decl, "TypeImportDec") || 
        isApplication(decl, "TypeImportOnDemandDec") ||
        isApplication(decl, "TypeImportAsDec");
  }

  @Override
  public boolean isBaseDecl(IStrategoTerm decl) {
    return isApplication(decl, "ClassDec") 
        || isApplication(decl, "InterfaceDec") 
        || isApplication(decl, "EnumDec") 
        || isApplication(decl, "AnnoDec")
        || isNamespaceDec(decl);
  }

  @Override
  public boolean isModelDec(IStrategoTerm decl) {
    return isApplication(decl, "ModelDec");
  }

  public boolean isNamespaceDec(IStrategoTerm decl) {
    return isApplication(decl, "PackageDec");
  }

  @Override
  public boolean isPlainDecl(IStrategoTerm decl) {
    return isApplication(decl, "PlainDec"); 
  }

  @Override
  public boolean isTransformationApplication(IStrategoTerm decl) {
    return isApplication(decl, "TransImportDec");
  }

  @Override
  public boolean isTransformationDec(IStrategoTerm decl) {
    return isApplication(decl, "TransDec");
  }

  /**
   * Pretty prints the content of a Java AST.
   * 
   * @param aterm
   */
  protected String prettyPrint(IStrategoTerm term) {
    IStrategoTerm string = pp_java_string_0_0.instance.invoke(javaFronCtx, term);
    if (string != null)
      return Term.asJavaString(string);
  
    throw new RuntimeException("pretty printing java AST failed: " + term);
  }

  @Override
  public String getModelName(IStrategoTerm decl) throws IOException {
    IStrategoTerm head = getApplicationSubterm(decl, "ModelDec", 0);
    String extName = prettyPrint(getApplicationSubterm(head, "ModelDecHead", 1));
    return extName;
  }

  private static void exists(Path file) {
    if (FileCommands.exists(file))
      System.out.println(file + " exists.");
    else
      System.err.println(file + " does not exist.");
  }

  public static void main(String args[]) throws URISyntaxException {
    JavaLanguage jl = new JavaLanguage();
  
    for (Path file : jl.getPackagedGrammars())
      exists(file);
  
    exists(jl.getInitGrammar());
    exists(jl.getInitTrans());
    exists(jl.getInitEditor());
    exists(jl.getPluginDirectory());
  }

}
