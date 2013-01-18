package org.sugarj;

import java.io.File;
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

  public abstract File getInitGrammar();
  public abstract String getInitGrammarModule();
  public abstract File getInitTrans();
  public abstract String getInitTransModule();
  public abstract File getInitEditor();
  public abstract String getInitEditorModule();

  public abstract File getLibraryDirectory();

  public abstract void setupSourceFile(RelativePath sourceFile, Environment environment);
  public abstract SourceFileContent getSource();
  public abstract Path getOutFile();
  public abstract Set<RelativePath> getGeneratedFiles();
  public abstract String getRelativeNamespace();

  public abstract boolean isNamespaceDec(IStrategoTerm decl);
  public abstract boolean isLanguageSpecificDec(IStrategoTerm decl);
  public abstract boolean isSugarDec(IStrategoTerm decl);
  public abstract boolean isEditorServiceDec(IStrategoTerm decl);
  public abstract boolean isImportDec(IStrategoTerm decl);
  public abstract boolean isPlainDec(IStrategoTerm decl);

  public abstract void processNamespaceDec(IStrategoTerm toplevelDecl, Environment environment, IErrorLogger errorLog, RelativePath sourceFile, RelativePath sourceFileFromResult) throws IOException;
  public abstract void processLanguageSpecific(IStrategoTerm toplevelDecl, Environment environment) throws IOException;
  public abstract void compile(List<Path> outFiles, Path bin, List<Path> path, boolean generateFiles) throws IOException;

  public abstract void addImportedModule(IStrategoTerm toplevelDecl, boolean checked) throws IOException;
  public abstract String getImportedModulePath(IStrategoTerm decl);

  public abstract String getSugarName(IStrategoTerm decl) throws IOException;
  public abstract IStrategoTerm getSugarBody(IStrategoTerm decl);

  public abstract String getEditorName(IStrategoTerm decl) throws IOException;
  public abstract IStrategoTerm getEditorServices(IStrategoTerm decl);
}
