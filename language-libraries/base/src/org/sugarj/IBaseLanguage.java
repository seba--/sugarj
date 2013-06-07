package org.sugarj;

import java.io.File;

import org.spoofax.interpreter.terms.IStrategoTerm;

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
   * Examples:
   *   Java -> "class"
   *   Haskell -> "o"
   * 
   * @return extension of generate files.
   */
  public abstract String getGeneratedFileExtension();

  /**
   * Optional. Can be used to provide extension for source files of original language.
   * Will be used to resolve imports if no sugared source file is available.
   * 
   * Examples:
   *   Java -> "java"
   *   Haskell -> "hs"
   * 
   * @return null or file extension of original non-sugared language.
   */
  public abstract String getOriginalFileExtension();

  public abstract File getInitGrammar();

  public abstract String getInitGrammarModuleName();

  public abstract File getInitTrans();

  public abstract String getInitTransModuleName();

  public abstract File getInitEditor();

  public abstract String getInitEditorModuleName();

  public abstract boolean isNamespaceDec(IStrategoTerm decl);

  public abstract boolean isExtensionDec(IStrategoTerm decl);

  public abstract boolean isImportDec(IStrategoTerm decl);

  public abstract boolean isLanguageSpecificDec(IStrategoTerm decl);

  public abstract boolean isPlainDec(IStrategoTerm decl);

  public abstract IStrategoTerm getExtensionBody(IStrategoTerm decl);

}
