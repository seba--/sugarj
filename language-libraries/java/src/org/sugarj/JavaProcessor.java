package org.sugarj;

import static org.sugarj.common.ATermCommands.getApplicationSubterm;
import static org.sugarj.common.ATermCommands.isApplication;
import static org.sugarj.common.Log.log;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.Term;
import org.strategoxt.HybridInterpreter;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.JavaCommands;
import org.sugarj.common.Log;
import org.sugarj.common.StringCommands;
import org.sugarj.common.errors.SourceCodeException;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;

public class JavaProcessor extends AbstractBaseProcessor implements Serializable {

  private static final long serialVersionUID = 1817193221140795776L;

  private String moduleHeader;
  private List<String> imports = new LinkedList<String>();
  private List<String> body = new LinkedList<String>();

  private Environment environment;
  private RelativePath sourceFile;
  private Path javaOutFile;

  private String relPackageName;

  private Path sourcePath;

  private void checkPackageName(IStrategoTerm toplevelDecl, RelativePath sourceFile) {
    if (sourceFile != null) {
      String packageName = relPackageName == null ? "" : relPackageName.replace('/', '.');

      String rel = FileCommands.dropExtension(sourceFile.getRelativePath());
      int i = rel.lastIndexOf('/');
      String expectedPackage = i >= 0 ? rel.substring(0, i) : rel;
      expectedPackage = expectedPackage.replace('/', '.');
      if (!packageName.equals(expectedPackage))
        throw new RuntimeException("The declared package '" + packageName + "'" + " does not match the expected package '" + expectedPackage + "'.");
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

  public String extractNamespaceName(IStrategoTerm toplevelDecl, HybridInterpreter interp) throws IOException {
    String packageName = prettyPrint(getApplicationSubterm(toplevelDecl, "PackageDec", 1));

    return packageName;
  }

  @Override
  public Path getGeneratedSourceFile() {
    return javaOutFile;
  }

  @Override
  public String getNamespace() {
    return relPackageName;
  }

  @Override
  public String getGeneratedSource() {
    if (body.isEmpty())
      return "";
    
    return moduleHeader + "\n"
         + StringCommands.printListSeparated(imports, "\n") + "\n"
         + StringCommands.printListSeparated(body, "\n");
  }

  @Override
  public List<String> processBaseDecl(IStrategoTerm toplevelDecl) throws IOException {
    if (getLanguage().isNamespaceDec(toplevelDecl)) {
      processNamespaceDecl(toplevelDecl);
      return Collections.emptyList();
    }

    IStrategoTerm dec = isApplication(toplevelDecl, "JavaTypeDec") ? getApplicationSubterm(toplevelDecl, "JavaTypeDec", 0) : toplevelDecl;

    String decName = Term.asJavaString(dec.getSubterm(0).getSubterm(1).getSubterm(0));
    String expectedDecName = FileCommands.fileName(javaOutFile);
    if (expectedDecName != null && !expectedDecName.equals(decName))
      throw new RuntimeException("Declaration name '" + decName + "'" + " does not match the file name '" + expectedDecName + "'.");

    body.add(prettyPrint(dec));
    
    // TODO return list of qualified types that occur in the decl, e.g., java.util.String
    return Collections.emptyList();
  }

  private void processNamespaceDecl(IStrategoTerm toplevelDecl) throws IOException {
    String packageName = extractNamespaceName(toplevelDecl, interp);

    relPackageName = getRelativeModulePath(packageName);

    log.log("The SDF / Stratego package name is '" + relPackageName + "'.", Log.DETAIL);

    checkPackageName(toplevelDecl, sourceFile);

    if (javaOutFile == null)
      javaOutFile = environment.createOutPath(getRelativeNamespaceSep() + FileCommands.fileName(sourceFile) + "." + JavaLanguage.getInstance().getBaseFileExtension()); // XXX:
                                              
    // moved here before depOutFile==null check
    moduleHeader = prettyPrint(toplevelDecl);
  }

  public void setJavaOutFile(Path javaOutFile) {
    this.javaOutFile = javaOutFile;
  }

  @Override
  public void init(RelativePath sourceFile, Environment environment) {
    this.environment = environment;
    this.sourceFile = sourceFile;
    javaOutFile = environment.createOutPath(FileCommands.dropExtension(sourceFile.getRelativePath()) + "." + JavaLanguage.getInstance().getBaseFileExtension());
    
    for (Path dir : environment.getSourcePath())
      if (sourceFile.getBasePath().equals(dir))
        sourcePath = dir;
  }

  @Override
  public JavaLanguage getLanguage() {
    return JavaLanguage.getInstance();
  }

  @Override
  public List<Path> compile(List<Path> javaOutFiles, Path bin, List<Path> path) throws IOException, SourceCodeException {
    return JavaCommands.javac(javaOutFiles, sourcePath, bin, path);
  }

  @Override
  public String getModulePathOfImport(IStrategoTerm toplevelDecl) {
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
  public void processModuleImport(IStrategoTerm toplevelDecl) throws IOException {
    imports.add(prettyPrint(toplevelDecl));
  }

  @Override
  public String getExtensionName(IStrategoTerm decl) throws IOException {
    IStrategoTerm head = getApplicationSubterm(decl, "ExtensionDec", 0);
    String extName = prettyPrint(getApplicationSubterm(head, "ExtensionDecHead", 1));
    return extName;
  }

  private String prettyPrint(IStrategoTerm term) {
    return getLanguage().prettyPrint(term);
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

  @Override
  public IStrategoTerm getExtensionBody(IStrategoTerm decl) {
    IStrategoTerm body = getApplicationSubterm(decl, "ExtensionDec", 1);
    IStrategoTerm sugarBody = getApplicationSubterm(body, "ExtensionBody", 0);
    return sugarBody;
  }
}
