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

  public abstract void init(RelativePath sourceFile, Environment environment);
  public abstract SourceFileContent getGeneratedSource();
  public abstract Path getOutFile();
  public abstract Set<RelativePath> getGeneratedFiles();
  public abstract String getRelativeNamespace();

  public abstract void processNamespaceDec(IStrategoTerm toplevelDecl, Environment environment, IErrorLogger errorLog, RelativePath sourceFile, RelativePath sourceFileFromResult) throws IOException;
  public abstract void processLanguageSpecific(IStrategoTerm toplevelDecl, Environment environment) throws IOException;
  public abstract List<Path> compile(List<Path> generatedSourceFiles, Path targetDir, List<Path> classpath) throws IOException;

  public abstract void addModuleImport(IStrategoTerm toplevelDecl, boolean checked) throws IOException;
  public abstract String getModulePathOfImport(IStrategoTerm decl);

  public abstract boolean isModuleExternallyResolvable(String relModulePath);

  public abstract String getExtensionName(IStrategoTerm decl) throws IOException;
}
