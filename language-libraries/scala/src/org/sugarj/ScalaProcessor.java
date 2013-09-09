package org.sugarj;

import static org.sugarj.common.ATermCommands.getApplicationSubterm;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.CommandExecution;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.StringCommands;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;

/**
 * @author Florian Jakob &lt;f_jakob@rbg.informatik.tu-darmstadt.de&gt;
 */
public class ScalaProcessor extends AbstractBaseProcessor {
  private static final long serialVersionUID = 9026624278268457077L;
  private static final String SCALAC_COMMAND = "scalac";
  private String moduleHeader;
  private List<String> imports = new LinkedList<String>();
  private List<String> body = new LinkedList<String>();
  private boolean hasExtension = false;

  private Environment environment;
  private RelativePath sourceFile;
  private Path outFile;

  private String relNamespaceName;
  private String moduleName;

  private IStrategoTerm ppTable;

  @Override
  public String getGeneratedSource() {
    if (moduleHeader == null)
      return "";

    if (hasExtension && body.isEmpty())
      return "";

    return moduleHeader + "\n"
         + StringCommands.printListSeparated(imports, "\n") + "\n"
         + StringCommands.printListSeparated(body, "\n");
  }

  @Override
  public Path getGeneratedSourceFile() {
    return outFile;
  }

  @Override
  public String getNamespace() {
    return relNamespaceName;
  }

  @Override
  public ScalaLanguage getLanguage() {
    return ScalaLanguage.getInstance();
  }



  /*
   * processing stuff follows here
   */
  @Override
  public void init(RelativePath sourceFile, Environment environment) {
    this.environment = environment;
    this.sourceFile = sourceFile;
    outFile = environment.createOutPath(FileCommands.dropExtension(sourceFile.getRelativePath()) + "." + ScalaLanguage.getInstance().getBaseFileExtension());
  }

  private void processNamespaceDecl(IStrategoTerm toplevelDecl) throws IOException {
    moduleHeader = prettyPrint(toplevelDecl);
  }

  @Override
  public List<String> processBaseDecl(IStrategoTerm toplevelDecl) throws IOException {
    if (getLanguage().isNamespaceDec(toplevelDecl)) {
      processNamespaceDecl(toplevelDecl);
      return Collections.emptyList();
    }

    //IStrategoTerm term = getApplicationSubterm(toplevelDecl, "ScalaBody", 0);
    String text = null;
    try {
      text = prettyPrint(toplevelDecl);
    } catch (NullPointerException e) {
      ATermCommands.setErrorMessage(toplevelDecl, "pretty printing Scala failed");
    }
    if (text != null)
      body.add(text);
    return Collections.emptyList();
  }

  @Override
  public String getModulePathOfImport(IStrategoTerm toplevelDecl) {
    return prettyPrint(getApplicationSubterm(toplevelDecl, "Import", 2)).replace('.', '/');
  }

  @Override
  public void processModuleImport(IStrategoTerm toplevelDecl) throws IOException {
    imports.add(prettyPrint(toplevelDecl));
  }

  @Override
  public String getExtensionName(IStrategoTerm decl) throws IOException {
    hasExtension = true;
    return moduleName;
  }

  private String prettyPrint(IStrategoTerm term) {
    if (ppTable == null)
      ppTable = ATermCommands.readPrettyPrintTable(getLanguage().ensureFile("org/sugarj/languages/Scala.pp").getAbsolutePath());

    return ATermCommands.prettyPrint(ppTable, term, interp);
  }

  @Override
  public List<Path> compile(List<Path> outFiles, Path bin, List<Path> includePaths) throws IOException {
    List<String> cmds = new LinkedList<String>();
    cmds.add(SCALAC_COMMAND);

    List<Path> generatedFiles = new LinkedList<Path>();
    // TODO …

    new CommandExecution(false).execute(cmds.toArray(new String[cmds.size()]));

    return generatedFiles;
  }

  @Override
  public boolean isModuleExternallyResolvable(String relModulePath) {
    return false;
  }

  @Override
  public IStrategoTerm getExtensionBody(IStrategoTerm decl) {
    return getApplicationSubterm(decl, "ExtensionBody", 0);
  }
}
