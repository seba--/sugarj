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
import org.strategoxt.lang.Context;
import org.strategoxt.stratego_gpp.parse_pptable_file_0_0;
import org.sugarj.common.ATermCommands;
import org.sugarj.common.Environment;
import org.sugarj.common.FileCommands;
import org.sugarj.common.Log;
import org.sugarj.common.StringCommands;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;

public class PrologProcessor extends AbstractBaseProcessor implements Serializable {
  private static final long serialVersionUID = 6271882490466636509L;

  private String moduleHeader;
  private List<String> imports = new LinkedList<String>();
  private List<String> body = new LinkedList<String>();

  private Environment environment;
  private RelativePath sourceFile;
  private Path prologOutFile;

  private String decName;
  private String relNamespaceName;

  private IStrategoTerm pptable = null;
  private Path prettyPrint = null;

  private Path getPrettyPrint() {
    if (prettyPrint == null)
      prettyPrint = getLanguage().ensureFile("org/sugarj/languages/Prolog.pp");

    return prettyPrint;
  }

  @Override
  public String getGeneratedSource() {
    return moduleHeader + "\n"
         + StringCommands.printListSeparated(imports, "\n") + "\n"
         + StringCommands.printListSeparated(body, "\n");
  }
  @Override
  public Path getGeneratedSourceFile() {
    return prologOutFile;
  }

  @Override
  public List<String> processBaseDecl(IStrategoTerm toplevelDecl) throws IOException {
    if (getLanguage().isNamespaceDec(toplevelDecl)) {
      processNamespaceDecl(toplevelDecl);
      return Collections.emptyList();
    }

    // Nothing to do here for prolog
    IStrategoTerm dec = toplevelDecl;

    // TODO: Implement reexport handling in a more sensible way
    if (isApplication(dec, "ModuleReexport"))
      imports.add(prettyPrint(dec));
    else
      body.add(prettyPrint(dec));
    
    return Collections.emptyList();
  }

  private IStrategoTerm initializePrettyPrinter(Context ctx) {
    if (pptable == null) {
      IStrategoTerm pptable_file = ATermCommands.makeString(getPrettyPrint().getAbsolutePath());
      pptable = parse_pptable_file_0_0.instance.invoke(org.strategoxt.stratego_gpp.stratego_gpp.init(), pptable_file);
    }

    return pptable;
  }

  public String prettyPrint(IStrategoTerm term) {
    IStrategoTerm ppTable = initializePrettyPrinter(interp.getCompiledContext());
    return ATermCommands.prettyPrint(ppTable, term, interp);
  }

  @Override
  public void init(RelativePath sourceFile, Environment environment) {
    this.environment = environment;
    this.sourceFile = sourceFile;
    prologOutFile = environment.createOutPath(FileCommands.dropExtension(sourceFile.getRelativePath()) + "." + PrologLanguage.getInstance().getBinaryFileExtension());
  }

  @Override
  public String getNamespace() {
    // XXX: Is there a namespace separator in prolog? Or even any notion of
    // compound namespaces?
    // XXX: From swi prolog doc: Modules are organised in a single and flat
    // namespace and therefore module names must be chosen with some care to
    // avoid conflicts.
    // XXX: SugarProlog will implement different namespace handling.
    return relNamespaceName;
  }

  private void processNamespaceDecl(IStrategoTerm toplevelDecl) throws IOException {
    String moduleName = null;
    if (isApplication(toplevelDecl, "ModuleDec")) {
      moduleName = prettyPrint(getApplicationSubterm(toplevelDecl, "ModuleDec", 0));
      moduleHeader = prettyPrint(toplevelDecl);
    } else if (isApplication(toplevelDecl, "SugarModuleDec")) {
      moduleName = prettyPrint(getApplicationSubterm(toplevelDecl, "SugarModuleDec", 0));
      moduleHeader = ":-module(" + moduleName + ", []).";
    }

    relNamespaceName = FileCommands.dropFilename(sourceFile.getRelativePath());
    decName = getRelativeModulePath(moduleName);
    log.log("The SDF / Stratego package name is '" + relNamespaceName + "'.", Log.DETAIL);

    if (prologOutFile == null)
      prologOutFile = environment.createOutPath(getRelativeNamespaceSep() + FileCommands.fileName(sourceFile) + "." + PrologLanguage.getInstance().getBinaryFileExtension());
  }

  @Override
  public PrologLanguage getLanguage() {
    return PrologLanguage.getInstance();
  }

  @Override
  public List<Path> compile(List<Path> sourceFiles, Path bin, List<Path> path) throws IOException {
    // no compilation neccessary for Prolog
    return Collections.emptyList();
  }

  @Override
  public String getModulePathOfImport(IStrategoTerm toplevelDecl) {
    String modulePath = prettyPrint(toplevelDecl.getSubterm(0).getSubterm(0));

    return modulePath;
  }

  private String getRelativeModulePath(String moduleName) {
    return moduleName.replace("/", Environment.sep);
  }
  
  private String getImportedModuleString(IStrategoTerm moduleDecl) {
    String importedModuleName = prettyPrint(moduleDecl.getSubterm(0).getSubterm(0));
    // XXX: hacky, remove first directory. Should be replaced by a more robust implementation.
    String importName = importedModuleName.substring(importedModuleName.indexOf("/") + 1);
    String importString = ":- use_module(";
    importString += importName;
    if (moduleDecl.getSubtermCount() > 1) {  // :- use_module(foo, bar/1).
      importString += ", " + prettyPrint(moduleDecl.getSubterm(1));
    }
    importString += importString + ").";
    return importString;
  }
  
  @Override
  public void processModuleImport(IStrategoTerm toplevelDecl) throws IOException {
    imports.add(getImportedModuleString(toplevelDecl));
  }

  @Override
  public String getExtensionName(IStrategoTerm decl) throws IOException {
    return decName;
  }

  @Override
  public boolean isModuleExternallyResolvable(String relModulePath) {
    // TODO: look for pre-installed SWI libraries?
    return false;
  }

  @Override
  public IStrategoTerm getExtensionBody(IStrategoTerm decl) {
    IStrategoTerm sugarBody = getApplicationSubterm(decl, "ExtensionBody", 0);
  
    return sugarBody;
  
  }
}
