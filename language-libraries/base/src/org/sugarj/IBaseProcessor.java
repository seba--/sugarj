package org.sugarj;

import java.io.IOException;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.Environment;
import org.sugarj.common.errors.SourceCodeException;
import org.sugarj.common.path.Path;
import org.sugarj.common.path.RelativePath;

/**
 * @author seba
 */
public interface IBaseProcessor {

  public abstract AbstractBaseLanguage getLanguage();

  public abstract void init(RelativePath sourceFile, Environment environment);
  
  public abstract void processModuleImport(IStrategoTerm toplevelDecl) throws IOException;
  public abstract List<String> processBaseDecl(IStrategoTerm toplevelDecl) throws IOException;

  public abstract String getNamespace();
  public abstract String getModulePathOfImport(IStrategoTerm decl);
  public abstract boolean isModuleExternallyResolvable(String relModulePath);

  public abstract String getExtensionName(IStrategoTerm decl) throws IOException;
  public abstract IStrategoTerm getExtensionBody(IStrategoTerm decl);

  public abstract String getGeneratedSource();
  public abstract Path getGeneratedSourceFile();
  public abstract List<Path> compile(List<Path> generatedSourceFiles, Path targetDir, List<Path> classpath) throws IOException, SourceCodeException;
}
