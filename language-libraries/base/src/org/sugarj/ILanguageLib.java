package org.sugarj;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.Environment;
import org.sugarj.common.IErrorLogger;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;
import org.sugarj.languagelib.SourceFileContent;

/**
 * @author seba
 */
public interface ILanguageLib {

  public abstract LanguageLibFactory getFactoryForLanguage();

  public abstract void setupSourceFile(RelativePath sourceFile, Environment environment);
  public abstract SourceFileContent getSource();
  public abstract Path getOutFile();
  public abstract Set<RelativePath> getGeneratedFiles();
  public abstract String getRelativeNamespace();

  public abstract void processNamespaceDec(IStrategoTerm toplevelDecl, Environment environment, IErrorLogger errorLog, RelativePath sourceFile, RelativePath sourceFileFromResult) throws IOException;
  public abstract void processLanguageSpecific(IStrategoTerm toplevelDecl, Environment environment) throws IOException;
  public abstract void compile(List<Path> outFiles, Path bin, List<Path> path) throws IOException;

  public abstract void addImportedModule(IStrategoTerm toplevelDecl, boolean checked) throws IOException;
  public abstract String getImportedModulePath(IStrategoTerm decl);

  public abstract boolean isModuleExternallyResolvable(String relModulePath);

  public abstract String getExtensionName(IStrategoTerm decl) throws IOException;
}
