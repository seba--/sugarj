package org.sugarj;

import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.sugarj.common.path.Path;

/**
 * @author seba
 */
public interface IBaseLanguage {

  public abstract AbstractBaseProcessor createNewProcessor();

  public abstract String getVersion();

  public abstract String getLanguageName();

  /**
   * Examples:
   *   Java -> "sugj"
   *   Haskell -> "shs"
   * 
   * @return extension of sugared source files.
   */
  public abstract String getSugarFileExtension();

  /**
   * Optional. The file extensions for binaries if the language is compiled; otherwise null. 
   * 
   * Examples:
   *   Java -> "class"
   *   Haskell -> "o"
   * 
   * @return null or file extension of binary files.
   */
  public abstract String getBinaryFileExtension();

  /**
   * Used to provide extension for source files of original language.
   * This will be used to resolve imports if no sugared source file is available.
   * 
   * Examples:
   *   Java -> "java"
   *   Haskell -> "hs"
   * 
   * @return file extension of base non-sugared language.
   */
  public abstract String getBaseFileExtension();

  public abstract Path getInitGrammar();
  public List<Path> getPackagedGrammars();
  public abstract String getInitGrammarModuleName();
  public abstract Path getInitTrans();
  public abstract String getInitTransModuleName();
  public abstract Path getInitEditor();
  public abstract String getInitEditorModuleName();

  public abstract boolean isExtensionDecl(IStrategoTerm decl);
  public abstract boolean isImportDecl(IStrategoTerm decl);
  public abstract boolean isBaseDecl(IStrategoTerm decl);

  public abstract boolean isPlainDecl(IStrategoTerm decl);

}
