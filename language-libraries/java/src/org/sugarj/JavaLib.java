package org.sugarj;

import static org.sugarj.common.ATermCommands.getApplicationSubterm;
import static org.sugarj.common.ATermCommands.isApplication;
import static org.sugarj.common.Log.log;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.Term;
import org.strategoxt.HybridInterpreter;
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

  private Set<RelativePath> generatedJavaClasses = new HashSet<RelativePath>();

  private Path javaOutFile;

  private JavaSourceFileContent javaSource;

  private String relPackageName;

  private Path sourcePath;

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

  public String extractImportedModuleName(IStrategoTerm toplevelDecl) {
    String name = null;
    if (isApplication(toplevelDecl, "TypeImportDec"))
      name = prettyPrint(toplevelDecl.getSubterm(0));
    else if (isApplication(toplevelDecl, "TypeImportOnDemandDec"))
      name = prettyPrint(toplevelDecl.getSubterm(0)) + ".*";
    else if (isApplication(toplevelDecl, "TypeImportAsDec"))
      name = prettyPrint(toplevelDecl.getSubterm(1));
    else if (isApplication(toplevelDecl, "TransImportDec"))
      name = getTransformedModulePath(toplevelDecl.getSubterm(1));
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
  public void processLanguageSpecific(IStrategoTerm toplevelDecl, Environment environment) throws IOException {
    IStrategoTerm dec = isApplication(toplevelDecl, "JavaTypeDec") ? getApplicationSubterm(toplevelDecl, "JavaTypeDec", 0) : toplevelDecl;

    String decName = Term.asJavaString(dec.getSubterm(0).getSubterm(1).getSubterm(0));
    String expectedDecName = FileCommands.fileName(javaOutFile);
    if (expectedDecName != null && !expectedDecName.equals(decName))
      setErrorMessage(toplevelDecl, "Declaration name '" + decName + "'" + " does not match the file name '" + expectedDecName + "'.", null);

    RelativePath clazz = environment.createOutPath(getRelativeNamespaceSep() + decName + ".class");

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
      javaOutFile = environment.createOutPath(getRelativeNamespaceSep() + FileCommands.fileName(sourceFileFromResult) + "." + JavaLibFactory.getInstance().getOriginalFileExtension()); // XXX:
                                              
    // moved here before depOutFile==null check
    javaSource.setNamespaceDecl(prettyPrint(toplevelDecl));
    checkPackageName(toplevelDecl, sourceFileFromResult, errorLog);
  }

  public void setJavaOutFile(Path javaOutFile) {
    this.javaOutFile = javaOutFile;
  }

  @Override
  public void setupSourceFile(RelativePath sourceFile, Environment environment) {
    javaOutFile = environment.createOutPath(FileCommands.dropExtension(sourceFile.getRelativePath()) + "." + JavaLibFactory.getInstance().getOriginalFileExtension());
    javaSource = new JavaSourceFileContent();
    
    for (Path dir : environment.getSourcePath())
      if (sourceFile.getBasePath().equals(dir))
        sourcePath = dir;
  }

  @Override
  public JavaLibFactory getFactoryForLanguage() {
    return JavaLibFactory.getInstance();
  }

  @Override
  public void compile(List<Path> javaOutFiles, Path bin, List<Path> path) throws IOException {
    JavaCommands.javac(javaOutFiles, sourcePath, bin, path);
  }

  @Override
  public String getImportedModulePath(IStrategoTerm toplevelDecl) {
    String importModule = extractImportedModuleName(toplevelDecl);
    String modulePath = getRelativeModulePath(importModule);

    return modulePath;
  }
  
  @Override
  public String getImportLocalName(IStrategoTerm decl) {
    IStrategoTerm opt = null;
    if (isApplication(decl, "TransImportDec")) 
      opt = getApplicationSubterm(decl, "TransImportDec", 0);
    else if (isApplication(decl, "TypeImportAsDec"))
      opt = getApplicationSubterm(decl, "TypeImportAsDec", 0);
    
    if (opt != null && isApplication(opt, "Some"))
      return getModulePath(getApplicationSubterm(getApplicationSubterm(opt, "Some", 0), "ImportAs", 0));
    
    return null;
  }
  
  @Override
  public IStrategoTerm reconstructImport(String modulePath, IStrategoTerm decl) {
    IStrategoTerm localName = null;
    if (isApplication(decl, "TransImportDec")) 
      localName = getApplicationSubterm(decl, "TransImportDec", 0);
    else if (isApplication(decl, "TypeImportAsDec"))
      localName = getApplicationSubterm(decl, "TypeImportAsDec", 0);
    
    if (localName == null || isApplication(localName, "None"))
      return
        ATermCommands.makeAppl("TypeImportDec", "TypeImportDec", 1, 
          ATermCommands.makeAppl("Id", "Id", 1, ATermCommands.makeString(modulePath)));

    return 
      ATermCommands.makeAppl("TypeImportAsDec", "TypeImportAsDec", 2,
        localName,
        ATermCommands.makeAppl("Id", "Id", 1, ATermCommands.makeString(modulePath)));
  }
  
  @Override
  public String getModulePath(IStrategoTerm decl) {
    return getRelativeModulePath(prettyPrint(decl));
  }

  private String getRelativeModulePath(String module) {
    if (module == null)
      return null;
    return module.replace(".", Environment.sep);
  }

  @Override
  public void addImportedModule(IStrategoTerm toplevelDecl, boolean checked) throws IOException {
    String imp = extractImportedModuleName(toplevelDecl).replace('/', '.');
    if (checked)
      javaSource.addCheckedImport(imp);
    else
      javaSource.addImport(imp);
  }

  @Override
  public String getExtensionName(IStrategoTerm decl) throws IOException {
    IStrategoTerm head = getApplicationSubterm(decl, "ExtensionDec", 0);
    String extName = prettyPrint(getApplicationSubterm(head, "ExtensionDecHead", 1));
    return extName;
  }

  private String prettyPrint(IStrategoTerm term) {
    return getFactoryForLanguage().prettyPrint(term);
  }

  @Override
  public boolean isModuleExternallyResolvable(String relModulePath) {
    if (relModulePath.endsWith("*"))
      return true;
    try {
      return getClass().getClassLoader().loadClass(relModulePath.replace('/', '.')) != null;
    } catch (ClassNotFoundException e) {
      return false;
    }
  }
}
