package org.sugarj;

import static org.sugarj.common.ATermCommands.getApplicationSubterm;
import static org.sugarj.common.ATermCommands.isApplication;
import static org.sugarj.common.Log.log;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.Term;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.java_front.pp_java_string_0_0;
import org.strategoxt.lang.Context;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.IErrorLogger;
import org.sugarj.common.JavaCommands;
import org.sugarj.common.Log;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.java.JavaSourceFileContent;

public class JavaLib extends LanguageLib implements Serializable {

  private static final long serialVersionUID = 1817193221140795776L;

  private transient File libDir;

  private Set<RelativePath> generatedJavaClasses = new HashSet<RelativePath>();

  private Path javaOutFile;

  private JavaSourceFileContent javaSource;

  private String relPackageName;

  private Path sourcePath;

  public String getVersion() {
    return "java-0.2";
  }

  @Override
  public List<File> getGrammars() {
    List<File> grammars = new LinkedList<File>(super.getGrammars());
    grammars.add(ensureFile("org/sugarj/languages/SugarJ.def"));
    grammars.add(ensureFile("org/sugarj/languages/Java-15.def"));
    return Collections.unmodifiableList(grammars);
  }

  @Override
  public File getInitGrammar() {
    return ensureFile("org/sugarj/java/init/initGrammar.sdf");
  }

  @Override
  public String getInitGrammarModule() {
    return "org/sugarj/java/init/initGrammar";
  }

  @Override
  public File getInitTrans() {
    return ensureFile("org/sugarj/java/init/InitTrans.str");
  }

  @Override
  public String getInitTransModule() {
    return "org/sugarj/java/init/InitTrans";
  }

  @Override
  public File getInitEditor() {
    return ensureFile("org/sugarj/java/init/initEditor.serv");
  }

  @Override
  public String getInitEditorModule() {
    return "org/sugarj/java/init/initEditor";
  }

  @Override
  public File getLibraryDirectory() {
    if (libDir == null) { // set up directories first
      String thisClassPath = "org/sugarj/JavaLib.class";
      URL thisClassURL = JavaLib.class.getClassLoader().getResource(thisClassPath);

      if (thisClassURL.getProtocol().equals("bundleresource"))
        try {
          thisClassURL = FileLocator.resolve(thisClassURL);
        } catch (IOException e) {
          e.printStackTrace();
        }

      String classPath = thisClassURL.getPath();
      String binPath = classPath.substring(0, classPath.length() - thisClassPath.length());

      libDir = new File(binPath);
    }

    return libDir;
  }

  public static void main(String args[]) throws URISyntaxException {
    JavaLib jl = new JavaLib();

    for (File file : jl.getGrammars())
      exists(file);

    exists(jl.getInitGrammar());
    exists(jl.getInitTrans());
    exists(jl.getInitEditor());
    exists(jl.libDir);
  }

  private static void exists(File file) {
    if (file.exists())
      System.out.println(file.getPath() + " exists.");
    else
      System.err.println(file.getPath() + " does not exist.");
  }

  @Override
  public String getGeneratedFileExtension() {
    return "class";
  }

  @Override
  public String getSugarFileExtension() {
    return "sugj";
  }
  
  @Override
  public String getOriginalFileExtension() {
    return "java";
  }


  private void checkPackageName(IStrategoTerm toplevelDecl, RelativePath sourceFile, IErrorLogger errorLog) {
    if (sourceFile != null) {
      String packageName = relPackageName == null ? "" : relPackageName.replace('/', '.');

      String rel = FileCommands.dropExtension(sourceFile.getRelativePath());
      int i = rel.lastIndexOf('/');
      String expectedPackage = i >= 0 ? rel.substring(0, i) : rel;
      expectedPackage = expectedPackage.replace('/', '.');
      if (!packageName.equals(expectedPackage))
        setErrorMessage(toplevelDecl, "The declared package '" + packageName + "'" + " does not match the expected package '" + expectedPackage + "'.", errorLog);
    }
  }

  public String extractImportedModuleName(IStrategoTerm toplevelDecl) throws IOException {
    String name = null;
    if (isApplication(toplevelDecl, "TypeImportDec"))
      name = prettyPrint(toplevelDecl.getSubterm(0));
    else if (isApplication(toplevelDecl, "TypeImportOnDemandDec"))
      name = prettyPrint(toplevelDecl.getSubterm(0)) + ".*";
    return name;
  }

  public Set<RelativePath> getGeneratedFiles() {
    return generatedJavaClasses;
  }

  // was: getRelPackageName
  public String getNamespace() {
    return relPackageName;
  }

  public String extractNamespaceName(IStrategoTerm toplevelDecl, HybridInterpreter interp) throws IOException {
    String packageName = prettyPrint(getApplicationSubterm(toplevelDecl, "PackageDec", 1));

    return packageName;
  }

  @Override
  public Path getOutFile() {
    return javaOutFile;
  }

  @Override
  public String getRelativeNamespace() {
    return relPackageName;
  }

  @Override
  public JavaSourceFileContent getSource() {
    return javaSource;
  }

  @Override
  public boolean isEditorServiceDec(IStrategoTerm decl) {
    return isApplication(decl, "EditorServicesDec");
  }

  @Override
  public boolean isImportDec(IStrategoTerm decl) {
    return isApplication(decl, "TypeImportDec") || isApplication(decl, "TypeImportOnDemandDec");
  }

    @Override
  public boolean isLanguageSpecificDec(IStrategoTerm decl) {
    return isApplication(decl, "ClassDec") || isApplication(decl, "InterfaceDec") || isApplication(decl, "EnumDec") || isApplication(decl, "AnnoDec");
  }

  @Override
  public boolean isPlainDec(IStrategoTerm decl) {
    return isApplication(decl, "PlainDec"); 
  }

  @Override
  public boolean isSugarDec(IStrategoTerm decl) {
    return isApplication(decl, "SugarDec");
  }

  @Override
  public boolean isNamespaceDec(IStrategoTerm decl) {
    return isApplication(decl, "PackageDec");
  }
  
  @Override
  public boolean isModelDec(IStrategoTerm decl) {
    return isApplication(decl, "ModelDec");
  }

  @Override
  public boolean isTransformationDec(IStrategoTerm decl) {
    return isApplication(decl, "TransDec");
  }

  /**
   * Pretty prints the content of a Java AST in some file.
   * 
   * @param aterm
   *          the name of a file which contains an aterm which encodes a Java
   *          AST
   * @throws IOException
   */
  @Override
  public String prettyPrint(IStrategoTerm term) throws IOException {
    Context ctx = interp.getCompiledContext();
    IStrategoTerm string = pp_java_string_0_0.instance.invoke(ctx, term);
    if (string != null)
      return Term.asJavaString(string);

    throw new RuntimeException("pretty printing java AST failed: " + term);
  }

  @Override
  public void processLanguageSpecific(IStrategoTerm toplevelDecl, Environment environment) throws IOException {
    IStrategoTerm dec = isApplication(toplevelDecl, "JavaTypeDec") ? getApplicationSubterm(toplevelDecl, "JavaTypeDec", 0) : toplevelDecl;

    String decName = Term.asJavaString(dec.getSubterm(0).getSubterm(1).getSubterm(0));

    RelativePath clazz = environment.createBinPath(getRelativeNamespaceSep() + decName + ".class");

    generatedJavaClasses.add(clazz);
    javaSource.addBodyDecl(prettyPrint(dec));
  }

  @Override
  public void processNamespaceDec(IStrategoTerm toplevelDecl, Environment environment, IErrorLogger errorLog, RelativePath sourceFile, RelativePath sourceFileFromResult) throws IOException {
    String packageName = extractNamespaceName(toplevelDecl, interp);

    relPackageName = getRelativeModulePath(packageName);

    log.log("The SDF / Stratego package name is '" + relPackageName + "'.", Log.DETAIL);

    checkPackageName(toplevelDecl, sourceFile, errorLog);

    if (javaOutFile == null)
      javaOutFile = environment.createBinPath(getRelativeNamespaceSep() + FileCommands.fileName(sourceFileFromResult) + "." + getOriginalFileExtension()); // XXX:
                                              
    // moved here before depOutFile==null check
    javaSource.setNamespaceDecl(prettyPrint(toplevelDecl));
    checkPackageName(toplevelDecl, sourceFileFromResult, errorLog);
  }

  public void setJavaOutFile(Path javaOutFile) {
    this.javaOutFile = javaOutFile;
  }

  @Override
  public void setupSourceFile(RelativePath sourceFile, Environment environment) {
    javaOutFile = environment.createBinPath(FileCommands.dropExtension(sourceFile.getRelativePath()) + "." + getOriginalFileExtension());
    javaSource = new JavaSourceFileContent();
    javaSource.setOptionalImport(false);
    
    for (Path dir : environment.getSourcePath())
      if (sourceFile.getBasePath().equals(dir))
        sourcePath = dir;
  }

  @Override
  public LanguageLibFactory getFactoryForLanguage() {
    return JavaLibFactory.getInstance();
  }

  @Override
  protected void compile(List<Path> javaOutFiles, Path bin, List<Path> path, boolean generateFiles) throws IOException {
    if (generateFiles)
      JavaCommands.javac(javaOutFiles, sourcePath, bin, path);
  }

  @Override
  public String getImportedModulePath(IStrategoTerm toplevelDecl) throws IOException {
    String importModule = extractImportedModuleName(toplevelDecl);
    String modulePath = getRelativeModulePath(importModule);

    return modulePath;
  }

  private String getRelativeModulePath(String module) {
    return module.replace(".", Environment.sep);
  }

  @Override
  public void addImportModule(IStrategoTerm toplevelDecl, boolean checked) throws IOException {
    String imp = extractImportedModuleName(toplevelDecl).replace('/', '.');
    if (checked)
      javaSource.addCheckedImport(imp);
    else
      javaSource.addImport(imp);
  }

  @Override
  public String getSugarName(IStrategoTerm decl) throws IOException {
    IStrategoTerm head = getApplicationSubterm(decl, "SugarDec", 0);
    String extName = prettyPrint(getApplicationSubterm(head, "SugarDecHead", 1));
    return extName;
  }

  @Override
  public IStrategoTerm getSugarBody(IStrategoTerm decl) {
    IStrategoTerm body = getApplicationSubterm(decl, "SugarDec", 1);
    IStrategoTerm sugarBody = getApplicationSubterm(body, "SugarBody", 0);
    return sugarBody;
  }

  @Override
  public String getModelName(IStrategoTerm decl) throws IOException {
    IStrategoTerm head = getApplicationSubterm(decl, "ModelDec", 0);
    String extName = prettyPrint(getApplicationSubterm(head, "ModelDecHead", 1));
    return extName;
  }

  @Override
  public String getTransformationName(IStrategoTerm decl) throws IOException {
    IStrategoTerm head = getApplicationSubterm(decl, "TransDec", 0);
    String extName = prettyPrint(getApplicationSubterm(head, "TransDecHead", 1));
    return extName;
  }

  @Override
  public IStrategoTerm getTransformationBody(IStrategoTerm decl) {
    IStrategoTerm body = getApplicationSubterm(decl, "TransDec", 1);
    IStrategoTerm sugarBody = getApplicationSubterm(body, "TransBody", 0);
    return sugarBody;
  }

  @Override
  public String getLanguageName() {
    return "Java";
  }

  @Override
  public boolean isModuleResolvable(String relModulePath) {
    if (relModulePath.endsWith("*"))
      return true;
    try {
      return getClass().getClassLoader().loadClass(relModulePath.replace('/', '.')) != null;
    } catch (ClassNotFoundException e) {
      return false;
    }
  }

  @Override
  public String getEditorName(IStrategoTerm decl) throws IOException {
    IStrategoTerm head = getApplicationSubterm(decl, "EditorServicesDec", 0);
    return prettyPrint(getApplicationSubterm(head, "EditorServicesDecHead", 1));
  }

  @Override
  public IStrategoTerm getEditorServices(IStrategoTerm decl) {
    IStrategoTerm body = getApplicationSubterm(decl, "EditorServicesDec", 1);
    return ATermCommands.getApplicationSubterm(body, "EditorServicesBody", 0);
  }
}
