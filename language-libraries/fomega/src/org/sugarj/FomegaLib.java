package org.sugarj;

import static org.sugarj.common.ATermCommands.getApplicationSubterm;
import static org.sugarj.common.ATermCommands.isApplication;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.IErrorLogger;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.fomega.FomegaSourceFileContent;
import org.sugarj.languagelib.SourceFileContent;
import org.sugarj.languagelib.SourceImport;

/**
 * @author Florian Lorenzen <florian.lorenzen at tu-berlin de>
 */
public class FomegaLib extends LanguageLib {

  private static final long serialVersionUID = 6325786656556068937L;

  private FomegaSourceFileContent sourceContent;
  private Set<RelativePath> generatedModules = new HashSet<RelativePath>();
  
  private String relNamespaceName;
  private Path outFile;
  private String moduleName;

  private IStrategoTerm ppTable;
  
  @Override
  public List<File> getDefaultGrammars() {
    List<File> grammars = new LinkedList<File>(super.getDefaultGrammars());
    grammars.add(ensureFile("org/sugarj/languages/SugarFomega.def"));
    grammars.add(ensureFile("org/sugarj/languages/Fomega.def"));
    return Collections.unmodifiableList(grammars);
  }
  
  @Override
  public File getInitGrammar() {
    return ensureFile("org/sugarj/fomega/initGrammar.sdf");
  }

  @Override
  public String getInitGrammarModuleName() {
    return "org/sugarj/fomega/initGrammar";
  }

  @Override
  public File getInitTrans() {
    return ensureFile("org/sugarj/fomega/initTrans.str");
  }

  @Override
  public String getInitTransModuleName() {
    return "org/sugarj/fomega/initTrans";
  }

  @Override
  public File getInitEditor() {
    return ensureFile("org/sugarj/fomega/initEditor.serv");
  }

  @Override
  public String getInitEditorModuleName() {
    return "org/sugarj/fomega/initEditor";
  }

  @Override
  public SourceFileContent getSource() {
    return sourceContent;
  }

  @Override
  public Path getOutFile() {
    return outFile;
  }

  @Override
  public Set<RelativePath> getGeneratedFiles() {
    return generatedModules;
  }
  
  @Override
  public String getRelativeNamespace() {
    return relNamespaceName;
  }

  @Override
  public boolean isNamespaceDec(IStrategoTerm decl) {
    return isApplication(decl, "ModuleDec");
  }

  @Override
  public boolean isLanguageSpecificDec(IStrategoTerm decl) {
    return isApplication(decl, "FomegaBody");
  }

  @Override
  public boolean isExtensionDec(IStrategoTerm decl) {
    if (isApplication(decl, "ExtensionBody")) {
      sourceContent.setHasNonfomegaDecl(true);
      return true;
    }
    return false;
  }

  @Override
  public boolean isImportDec(IStrategoTerm decl) {
    return isApplication(decl, "Import");   
  }

  @Override
  public boolean isPlainDec(IStrategoTerm decl) {
    if (isApplication(decl, "PlainDec")) {   
      sourceContent.setHasNonfomegaDecl(true);
      return true;
    }
    return false;
  }
  
  @Override
  public LanguageLibFactory getFactoryForLanguage() {
    return FomegaLibFactory.getInstance();
  }


  
  /*
   * processing stuff follows here
   */
  
  @Override
  public void setupSourceFile(RelativePath sourceFile, Environment environment) {
    outFile = environment.createOutPath(FileCommands.dropExtension(sourceFile.getRelativePath()) + ".pts-source");
    sourceContent = new FomegaSourceFileContent();
  }

  @Override
  public void processNamespaceDec(IStrategoTerm toplevelDecl, Environment environment, IErrorLogger errorLog, RelativePath sourceFile, RelativePath sourceFileFromResult) throws IOException {
    String qualifiedModuleName = prettyPrint(getApplicationSubterm(toplevelDecl, "ModuleDec", 0));
    String qualifiedModulePath = qualifiedModuleName.replace('.', '/');
    String declaredModuleName = FileCommands.fileName(qualifiedModulePath);
    moduleName = FileCommands.dropExtension(FileCommands.fileName(sourceFile.getRelativePath()));
    String declaredRelNamespaceName = FileCommands.dropFilename(qualifiedModulePath);
    relNamespaceName = FileCommands.dropFilename(sourceFile.getRelativePath());
    
    RelativePath objectFile = environment.createOutPath(getRelativeNamespaceSep() + moduleName + "." + getFactoryForLanguage().getGeneratedFileExtension());
    generatedModules.add(objectFile);
    
    sourceContent.setNamespaceDecl(prettyPrint(toplevelDecl));
    
    if (!declaredRelNamespaceName.equals(relNamespaceName))
      setErrorMessage(toplevelDecl,
                      "The declared namespace '" + declaredRelNamespaceName + "'" +
                      " does not match the expected namespace '" + relNamespaceName + "'.", errorLog);
    
    if (!declaredModuleName.equals(moduleName))
      setErrorMessage(toplevelDecl,
                      "The declared module name '" + declaredModuleName + "'" +
                      " does not match the expected module name '" + moduleName + "'.", errorLog);
  }

  @Override
  public void processLanguageSpecific(IStrategoTerm toplevelDecl, Environment environment) throws IOException {
//    IStrategoTerm term = getApplicationSubterm(toplevelDecl, "FomegaBody", 0);
    String text = null;
    try {
      text = prettyPrint(toplevelDecl);
    } catch (NullPointerException e) {
      ATermCommands.setErrorMessage(toplevelDecl, "pretty printing Fomega failed");
    }
    if (text != null)
      sourceContent.addBodyDecl(text);
  }

  @Override
  public String getImportedModulePath(IStrategoTerm toplevelDecl) {
    return prettyPrint(getApplicationSubterm(toplevelDecl, "Import", 1)).replace('.', '/');
  }
  
  @Override
  public void addImportedModule(IStrategoTerm toplevelDecl, boolean checked) throws IOException {
    SourceImport imp = new SourceImport(getImportedModulePath(toplevelDecl), prettyPrint(toplevelDecl));
    if (checked)
      sourceContent.addCheckedImport(imp);
    else
      sourceContent.addImport(imp);
  }
  
  @Override
  public String getExtensionName(IStrategoTerm decl) throws IOException {
    return moduleName;
  }

  @Override
  public IStrategoTerm getExtensionBody(IStrategoTerm decl) {
    return getApplicationSubterm(decl, "ExtensionBody", 0);
  }

  public String prettyPrint(IStrategoTerm term) {
    if (ppTable == null) 
      ppTable = ATermCommands.readPrettyPrintTable(ensureFile("org/sugarj/languages/Fomega.pp").getAbsolutePath());
    
    return ATermCommands.prettyPrint(ppTable, term, interp);
  }
  
  @Override
  public void compile(List<Path> outFiles, Path bin, List<Path> includePaths) throws IOException {
    for (Path out : outFiles) {
      RelativePath relOut = (RelativePath) out;
      Path compilePath = new RelativePath(bin, FileCommands.dropExtension(relOut.getRelativePath()) + ".pts");
      FileCommands.copyFile(out, compilePath);
    }
  }

  @Override
  public boolean isModuleExternallyResolvable(String relModulePath) {
    return false;
  }
}
