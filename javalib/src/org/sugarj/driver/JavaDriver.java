package org.sugarj.driver;

import static org.sugarj.common.ATermCommands.getApplicationSubterm;
import static org.sugarj.common.ATermCommands.isApplication;
import static org.sugarj.common.Environment.sep;
import static org.sugarj.common.Log.log;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.Term;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.java_front.pp_java_string_0_0;
import org.strategoxt.lang.Context;
import org.strategoxt.tools.tools;
import org.sugarj.IResult;
import org.sugarj.LanguageDriver;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
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
    
    RelativePath clazz = environment.createBinPath(getRelNamespaceSep() + decName + ".class");
    
    generatedJavaClasses.add(clazz);
    javaSource.addBodyDecl(prettyPrint(dec, interp));
  }
  
  
  // was: getRelPackageNameSep
  // XXX: Think of a better name
  public String getRelNamespaceSep() {
    if (relPackageName == null || relPackageName.isEmpty())
      return "";
    
    return relPackageName + sep;
  }
  
  // was: getGeneratedJavaClasses
  // XXX: think of a better name (classes -> binary files? compiled files?)
  public Set<RelativePath> getCompiledFiles() {
    return generatedJavaClasses;
  }
    
  public JavaSourceFileContent getSource() {
    return javaSource;
  }
  
  public Path getOutFile() {
    return javaOutFile;
  }
  
  public void setJavaOutFile(Path javaOutFile) {
    this.javaOutFile = javaOutFile;
  }
  
  // was: getRelPackageName
  public String getNamespace() {
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
  
  public void checkPackageName(IStrategoTerm toplevelDecl, RelativeSourceLocationPath sourceFile, IResult driverResult) {
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
  
  // was: processPackageDec
  public void processNamespaceDec(IStrategoTerm toplevelDecl, Environment environment, HybridInterpreter interp, IResult driverResult, String packageName, RelativeSourceLocationPath sourceFile) throws IOException {
    relPackageName = FileCommands.getRelativeModulePath(packageName);

    log.log("The SDF / Stratego package name is '" + relPackageName + "'.");

    checkPackageName(toplevelDecl, sourceFile, driverResult);
    
    if (javaOutFile == null)
      javaOutFile = environment.createBinPath(getRelNamespaceSep() + FileCommands.fileName(driverResult.getSourceFile()) + ".java");

    // moved here before depOutFile==null check
    javaSource.setPackageDecl(prettyPrint(toplevelDecl, interp));
  }
  
  
  private void setErrorMessage(IStrategoTerm toplevelDecl, String msg, IResult driverResult) {
    // XXX: Merge with setErrorMessage from Driver
    driverResult.logError(msg);
    ATermCommands.setErrorMessage(toplevelDecl, msg);
  }
   
  public String getSourcecodeExtension() {
    return ".java";
  }
  
  // was: checkPackage
  public void checkNamespace(IStrategoTerm decl, RelativeSourceLocationPath sourceFile, IResult driverResult) {
    if (relPackageName == null)
      checkPackageName(decl, sourceFile, driverResult);
  }
  
  public void checkSourceOutFile(Environment environment, IResult driverResult) {
    if (javaOutFile == null)
      setJavaOutFile(environment.createBinPath(getRelNamespaceSep() + FileCommands.fileName(driverResult.getSourceFile()) + getSourcecodeExtension()));
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
  
  
  /**
   * Pretty prints the content of a Java AST in some file.
   * 
   * @param aterm the name of a file which contains an aterm which encodes a Java AST
   * @throws IOException 
   */
  // XXX: This should be abstracted and moved to the language implementation
  // Where to get pp_java_string_0_0 ? What should be changed to allow other languages' pretty printers?
  // What to do with Term.asJavaString ?
  public String prettyPrint(IStrategoTerm term, HybridInterpreter interp) throws IOException {
	System.err.println("---\n prettyprint context:");
	Context ctx = interp.getCompiledContext();
	System.err.println(ctx);
	System.err.println("prettyprint term:");
	System.err.println(term);
	//IStrategoTerm string = pp_java_string_0_0.instance.invoke(interp.getCompiledContext(), term);
	IStrategoTerm string = pp_java_string_0_0.instance.invoke(ctx, term);
	System.err.println("prettyprint string:");
	System.err.println(string);
    if (string != null)
      return Term.asJavaString(string);
    
    throw new RuntimeException("pretty printing java AST failed: " + term);
  }
  
  
  
  
  
  
  // XXX: move this to language driver?
  // XXX: Think of a good name -- what does this actually do?
  // from ModuleSystemCommands
  public String extractImportedModuleName(IStrategoTerm toplevelDecl, HybridInterpreter interp) throws IOException {
    String name = null;
    log.beginTask("Extracting", "Extract name of imported module");
    try {
      if (isApplication(toplevelDecl, "TypeImportDec"))
        name = prettyPrint(toplevelDecl.getSubterm(0), interp);
      
      if (isApplication(toplevelDecl, "TypeImportOnDemandDec"))
        name = prettyPrint(toplevelDecl.getSubterm(0), interp) + ".*";
    } finally {
      log.endTask(name);
    }
    return name;
  }

  
  
  
}
