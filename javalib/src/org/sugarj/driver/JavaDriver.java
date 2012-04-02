package org.sugarj.driver;

import static org.sugarj.common.ATermCommands.getApplicationSubterm;
import static org.sugarj.common.ATermCommands.isApplication;
import static org.sugarj.IEnvironment.sep;
import static org.sugarj.driver.Log.log;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.Term;
import org.strategoxt.HybridInterpreter;
import org.sugarj.LanguageDriver;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.driver.sourcefilecontent.JavaSourceFileContent;

// TODO: Move to java library

public class JavaDriver extends LanguageDriver {
  private String relPackageName;
  private Set<RelativePath> generatedJavaClasses = new HashSet<RelativePath>();
  private JavaSourceFileContent javaSource;
  private Path javaOutFile;

  
  @Override
  public void processLanguageSpecific(IStrategoTerm toplevelDecl, Environment environment, HybridInterpreter interp) throws IOException {
    IStrategoTerm dec =  isApplication(toplevelDecl, "JavaTypeDec") ? getApplicationSubterm(toplevelDecl, "JavaTypeDec", 0) : toplevelDecl;   // XXX: Extract JavaTypeDec stuff
    
    String decName = Term.asJavaString(dec.getSubterm(0).getSubterm(1).getSubterm(0));
    
    RelativePath clazz = environment.createBinPath(getRelPackageNameSep() + decName + ".class");
    
    generatedJavaClasses.add(clazz);
    javaSource.addBodyDecl(SDFCommands.prettyPrintJava(dec, interp));
  }
  
  
  
  public String getRelPackageNameSep() {
    if (relPackageName == null || relPackageName.isEmpty())
      return "";
    
    return relPackageName + sep;
  }
  
  public Set<RelativePath> getGeneratedJavaClasses() {
    return generatedJavaClasses;
  }
    
  public JavaSourceFileContent getJavaSource() {
    return javaSource;
  }
  
  public Path getJavaOutFile() {
    return javaOutFile;
  }
  
  public void setJavaOutFile(Path javaOutFile) {
    this.javaOutFile = javaOutFile;
  }
  
  public String getRelPackageName() {
    return relPackageName;
  }
  
  public void setupSourceFile(RelativePath sourceFile, Environment environment) {
    javaOutFile = environment.createBinPath(FileCommands.dropExtension(sourceFile.getRelativePath()) + ".java");
    javaSource = new JavaSourceFileContent();
    javaSource.setOptionalImport(false);
  }
  
  public void init() {
    javaOutFile = null;
    javaSource = null;
  }
  
  public void checkPackageName(IStrategoTerm toplevelDecl, RelativeSourceLocationPath sourceFile, Result driverResult) {
    if (sourceFile != null) {
      String packageName = relPackageName == null ? "" : relPackageName.replace('/', '.');
      
      String rel = FileCommands.dropExtension(sourceFile.getRelativePath());
      int i = rel.lastIndexOf('/');
      String expectedPackage = i >= 0 ? rel.substring(0, i) : rel;
      expectedPackage = expectedPackage.replace('/', '.');
      if (!packageName.equals(expectedPackage))
        setErrorMessage(
            toplevelDecl,
            "The declared package '" + packageName + "'" +
            " does not match the expected package '" + expectedPackage + "'.", driverResult);
    }
  }
  
  public void processPackageDec(IStrategoTerm toplevelDecl, Environment environment, HybridInterpreter interp, Result driverResult, String packageName, RelativeSourceLocationPath sourceFile) throws IOException {
    relPackageName = FileCommands.getRelativeModulePath(packageName);

    log.log("The SDF / Stratego package name is '" + relPackageName + "'.");

    checkPackageName(toplevelDecl, sourceFile, driverResult);
    
    if (javaOutFile == null)
      javaOutFile = environment.createBinPath(getRelPackageNameSep() + FileCommands.fileName(driverResult.getSourceFile()) + ".java");

    // moved here before depOutFile==null check
    javaSource.setPackageDecl(SDFCommands.prettyPrintJava(toplevelDecl, interp));
  }
  
  
  private void setErrorMessage(IStrategoTerm toplevelDecl, String msg, Result driverResult) {
    // XXX: Merge with setErrorMessage from Driver
    driverResult.logError(msg);
    ATermCommands.setErrorMessage(toplevelDecl, msg);
  }
   
  public String getSourcecodeExtension() {
    return ".java";
  }
  
  public void checkPackage(IStrategoTerm decl, RelativeSourceLocationPath sourceFile, Result driverResult) {
    if (relPackageName == null)
      checkPackageName(decl, sourceFile, driverResult);
  }
  
  public void checkSourceOutFile(Environment environment, Result driverResult) {
    if (javaOutFile == null)
      setJavaOutFile(environment.createBinPath(getRelPackageNameSep() + FileCommands.fileName(driverResult.getSourceFile()) + getSourcecodeExtension()));
  }
  
  
  // ----------------
  public boolean isLanguageSpecificDec(IStrategoTerm decl) {
    return  isApplication(decl, "ClassDec") ||
            isApplication(decl, "InterfaceDec") ||
            isApplication(decl, "EnumDec") ||
            isApplication(decl, "AnnoDec");
  }
  
  public boolean isSugarDec(IStrategoTerm decl) {
    return isApplication(decl, "SugarDec");
  }
  
  public boolean isEditorService(IStrategoTerm decl) {
    return isApplication(decl, "EditorServicesDec");
  }
  
  public boolean isImport(IStrategoTerm decl) {
    return isApplication(decl, "TypeImportDec") || isApplication(decl, "TypeImportOnDemandDec");
  }
  
  public boolean isPlain(IStrategoTerm decl) {
    return isApplication(decl, "PlainDec");         // XXX: Decide what to do with "Plain"--leave in the language or create a new "Plain" language
  }
}
