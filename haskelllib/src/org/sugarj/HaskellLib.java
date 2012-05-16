package org.sugarj;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.HybridInterpreter;
import org.sugarj.common.Environment;
import org.sugarj.common.IErrorLogger;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.common.path.RelativeSourceLocationPath;
import org.sugarj.driver.sourcefilecontent.ISourceFileContent;
import org.sugarj.haskell.HaskellSourceFileContent;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class HaskellLib extends LanguageLib {

  private static final long serialVersionUID = -8916207157344649789L;

  private transient File libDir;
  
  private HaskellSourceFileContent haskellSource;

  @Override
  public File getInitGrammar() {
    return ensureFile("org/sugarj/haskell/initGrammar.sdf");
  }

  @Override
  public String getInitGrammarModule() {
    return "org/sugarj/haskell/initGrammar";
  }

  @Override
  public File getInitTrans() {
    return ensureFile("org/sugarj/haskell/initTrans.str");
  }

  @Override
  public String getInitTransModule() {
    return "org/sugarj/haskell/initTrans";
  }

  @Override
  public File getInitEditor() {
    return ensureFile("org/sugarj/haskell/initEditor.serv");
  }

  @Override
  public String getInitEditorModule() {
    return "org/sugarj/haskell/initEditor";
  }

  @Override
  public File getLibraryDirectory() {
    if (libDir == null) { // set up directories first
      String thisClassPath = "org/sugarj/HaskellLib.class";
      URL thisClassURL = HaskellLib.class.getClassLoader().getResource(thisClassPath);
      
      System.out.println(thisClassURL);
      
      if (thisClassURL.getProtocol().equals("bundleresource"))
        try {
          thisClassURL = FileLocator.resolve(thisClassURL);
        } catch (IOException e) {
          e.printStackTrace();
        }
      
      String classPath = thisClassURL.getPath();
      String binPath = classPath.substring(0, classPath.length() - thisClassPath.length());
      
      libDir = new File(binPath);
    }
    
    return libDir;
  }

  @Override
  public String getGeneratedFileExtension() {
    return ".o";
  }

  @Override
  public String getSugarFileExtension() {
    //TODO should be ".sugh"
    return ".sugj";
  }

  @Override
  public ISourceFileContent getSource() {
    return haskellSource;
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
