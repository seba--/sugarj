package org.sugarj;

import static org.sugarj.common.ATermCommands.getApplicationSubterm;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.CommandExecution;
import org.sugarj.common.CommandExecution.ExecutionError;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.IErrorLogger;
import org.sugarj.common.Log;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.haskell.HaskellSourceFileContent;
import org.sugarj.languagelib.SourceFileContent;
import org.sugarj.languagelib.SourceImport;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class HaskellLib extends LanguageLib {

  private static final long serialVersionUID = -8916207157344649789L;
  
  private final String GHC_COMMAND = "ghc";

  private HaskellSourceFileContent sourceContent;
  private Path outFile;
  private Set<RelativePath> generatedModules = new HashSet<RelativePath>();
  
  private String relNamespaceName;
  private String moduleName;

  private IStrategoTerm ppTable;

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
  public LanguageLibFactory getFactoryForLanguage() {
    return HaskellLibFactory.getInstance();
  }


  
  /*
   * processing stuff follows here
   */
  
  @Override
  public void setupSourceFile(RelativePath sourceFile, Environment environment) {
    outFile = environment.createOutPath(FileCommands.dropExtension(sourceFile.getRelativePath()) + "." + HaskellLibFactory.getInstance().getOriginalFileExtension());
    sourceContent = new HaskellSourceFileContent();
  }

  @Override
  public void processNamespaceDec(IStrategoTerm toplevelDecl, Environment environment, IErrorLogger errorLog, RelativePath sourceFile, RelativePath sourceFileFromResult) throws IOException {
    String qualifiedModuleName = prettyPrint(getApplicationSubterm(toplevelDecl, "ModuleDec", 0));
    String qualifiedModulePath = qualifiedModuleName.replace('.', '/');
    String declaredModuleName = FileCommands.fileName(qualifiedModulePath);
    moduleName = FileCommands.dropExtension(FileCommands.fileName(sourceFile.getRelativePath()));
    String declaredRelNamespaceName = FileCommands.dropFilename(qualifiedModulePath);
    relNamespaceName = FileCommands.dropFilename(sourceFile.getRelativePath());
    
    RelativePath objectFile = environment.createOutPath(getRelativeNamespaceSep() + moduleName + "." + HaskellLibFactory.getInstance().getGeneratedFileExtension());
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
    IStrategoTerm term = getApplicationSubterm(toplevelDecl, "HaskellBody", 0);
    String text = null;
    try {
      text = prettyPrint(term);
    } catch (NullPointerException e) {
      ATermCommands.setErrorMessage(toplevelDecl, "pretty printing Haskell failed");
    }
    if (text != null)
      sourceContent.addBodyDecl(text);
  }

  @Override
  public String getImportedModulePath(IStrategoTerm toplevelDecl) {
    return prettyPrint(getApplicationSubterm(toplevelDecl, "Import", 2)).replace('.', '/');
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

  private String prettyPrint(IStrategoTerm term) {
    if (ppTable == null) 
      ppTable = ATermCommands.readPrettyPrintTable(getFactoryForLanguage().ensureFile("org/sugarj/languages/Haskell.pp").getAbsolutePath());
    
    return ATermCommands.prettyPrint(ppTable, term, interp);
  }
  
  @Override
  public void compile(List<Path> outFiles, Path bin, List<Path> includePaths) throws IOException {
    List<String> cmds = new LinkedList<String>();
    cmds.add(GHC_COMMAND);
    
    for (Path outFile : outFiles)
      cmds.add(outFile.getAbsolutePath());
    
    cmds.add("-i");
    if (!includePaths.isEmpty()) {
      StringBuilder searchPath = new StringBuilder("-i");
      for (Path path : includePaths)
        if (new File(path.getAbsolutePath()).isDirectory())
          searchPath.append(path.getAbsolutePath()).append(":");
      searchPath.deleteCharAt(searchPath.length() - 1);
      cmds.add(searchPath.toString());
    }
    
    new CommandExecution(false).execute(cmds.toArray(new String[cmds.size()]));
  }

  @Override
  public boolean isModuleExternallyResolvable(String relModulePath) {
    boolean oldSilent = CommandExecution.SILENT_EXECUTION;
    CommandExecution.SILENT_EXECUTION = true;
    String[] cmds = new String[]{
      "ghc-pkg", 
      "find-module", relModulePath.replace('/', '.'),
      "--simple-output"
    };
    
    String[][] msg;
    try {
       msg = new CommandExecution(true).execute(cmds);
    } catch (ExecutionError e) {
      Log.log.logErr("Command execution failed: " + Arrays.toString(e.getCmds()), Log.ALWAYS);
      return false;
    } finally {
      CommandExecution.SILENT_EXECUTION = oldSilent;
    }
    
    return msg.length > 0 && msg[0].length > 0;
  }
}
