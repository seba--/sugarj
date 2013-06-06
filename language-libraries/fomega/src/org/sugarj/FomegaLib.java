package org.sugarj;

import static org.sugarj.common.ATermCommands.getApplicationSubterm;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.IErrorLogger;
import org.sugarj.common.StringCommands;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;

/**
 * @author Florian Lorenzen <florian.lorenzen at tu-berlin de>
 */
public class FomegaLib extends LanguageLib {

  private static final long serialVersionUID = 6325786656556068937L;

  private String moduleHeader;
  private List<String> imports = new LinkedList<String>();
  private List<String> body = new LinkedList<String>();
  
  private Set<RelativePath> generatedModules = new HashSet<RelativePath>();
  
  private String relNamespaceName;
  private Path outFile;
  private String moduleName;

  private IStrategoTerm ppTable;
  
  @Override
  public String getGeneratedSource() {
    return moduleHeader + "\n"
         + StringCommands.printListSeparated(imports, "\n")
         + StringCommands.printListSeparated(body, "\n");
  }

  @Override
  public Path getOutFile() {
    return outFile;
  }

  @Override
  public String getRelativeNamespace() {
    return relNamespaceName;
  }

  @Override
  public LanguageLibFactory getFactoryForLanguage() {
    return FomegaLibFactory.getInstance();
  }


  
  /*
   * processing stuff follows here
   */
  
  @Override
  public void init(RelativePath sourceFile, Environment environment) {
    outFile = environment.createOutPath(FileCommands.dropExtension(sourceFile.getRelativePath()) + ".pts-source");
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
    
    moduleHeader = prettyPrint(toplevelDecl);
    
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
      body.add(text);
  }

  @Override
  public String getModulePathOfImport(IStrategoTerm toplevelDecl) {
    return prettyPrint(getApplicationSubterm(toplevelDecl, "Import", 1)).replace('.', '/');
  }
  
  @Override
  public void addModuleImport(IStrategoTerm toplevelDecl, boolean checked) throws IOException {
    imports.add(prettyPrint(toplevelDecl));
  }
  
  public String prettyPrint(IStrategoTerm term) {
    if (ppTable == null) 
      ppTable = ATermCommands.readPrettyPrintTable(getFactoryForLanguage().ensureFile("org/sugarj/languages/Fomega.pp").getAbsolutePath());
    
    return ATermCommands.prettyPrint(ppTable, term, interp);
  }
  
  @Override
  public List<Path> compile(List<Path> outFiles, Path bin, List<Path> includePaths) throws IOException {
    List<Path> generatedFiles = new LinkedList<Path>();
    for (Path out : outFiles) {
      RelativePath relOut = (RelativePath) out;
      Path compilePath = new RelativePath(bin, FileCommands.dropExtension(relOut.getRelativePath()) + ".pts");
      FileCommands.copyFile(out, compilePath);
      generatedFiles.add(compilePath);
    }
    return generatedFiles;
  }

  @Override
  public boolean isModuleExternallyResolvable(String relModulePath) {
    return false;
  }

  @Override
  public String getExtensionName(IStrategoTerm decl) throws IOException {
    return moduleName;
  }
}
