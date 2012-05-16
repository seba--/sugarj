package org.sugarj;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.HybridInterpreter;
import org.sugarj.common.Environment;
import org.sugarj.common.IErrorLogger;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class HaskellLib extends LanguageLib {

  private static final long serialVersionUID = -8916207157344649789L;

  @Override
  public File getInitGrammar() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getInitGrammarModule() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public File getInitTrans() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getInitTransModule() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public File getInitEditor() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getInitEditorModule() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public File getLibraryDirectory() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  protected File ensureFile(String resource) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getGeneratedFileExtension() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getSugarFileExtension() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void init() {
    // TODO Auto-generated method stub

  }

  @Override
  public ISourceFileContent getSource() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Path getOutFile() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Set<RelativePath> getGeneratedFiles() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isNamespaceDec(IStrategoTerm decl) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isLanguageSpecificDec(IStrategoTerm decl) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isSugarDec(IStrategoTerm decl) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isEditorServiceDec(IStrategoTerm decl) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isImportDec(IStrategoTerm decl) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isPlainDec(IStrategoTerm decl) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void processLanguageSpecific(IStrategoTerm toplevelDecl, Environment environment, HybridInterpreter interp) throws IOException {
    // TODO Auto-generated method stub

  }

  @Override
  public String prettyPrint(IStrategoTerm term, HybridInterpreter interp) throws IOException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setupSourceFile(RelativePath sourceFile, Environment environment) {
    // TODO Auto-generated method stub

  }

  @Override
  public String getRelativeNamespace() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void processNamespaceDec(IStrategoTerm toplevelDecl, Environment environment, HybridInterpreter interp, IErrorLogger errorLog, RelativeSourceLocationPath sourceFile, RelativeSourceLocationPath sourceFileFromResult) throws IOException {
    // TODO Auto-generated method stub

  }

  @Override
  public LanguageLibFactory getFactoryForLanguage() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getImportedModulePath(IStrategoTerm toplevelDecl, HybridInterpreter interp) throws IOException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void compile(List<Path> outFiles, Path bin, List<Path> path, Set<? extends Path> generatedFiles, Map<Path, Integer> generatedFileHashes, HybridInterpreter interp, boolean generateFiles) throws IOException {
    // TODO Auto-generated method stub

  }

  @Override
  public void addImportModule(IStrategoTerm toplevelDecl, HybridInterpreter interp) throws IOException {
    // TODO Auto-generated method stub

  }

  @Override
  public void addCheckedImportModule(IStrategoTerm toplevelDecl, HybridInterpreter interp) throws IOException {
    // TODO Auto-generated method stub

  }

  @Override
  public String getSugarName(IStrategoTerm decl, HybridInterpreter interp) throws IOException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getSugarAccessibility(IStrategoTerm decl) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public IStrategoTerm getSugarBody(IStrategoTerm decl) {
    // TODO Auto-generated method stub
    return null;
  }

}
