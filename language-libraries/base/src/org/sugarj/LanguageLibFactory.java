package org.sugarj;

/**
 * Factory for language libraries. Configures some fixed options, such as file
 * extensions.
 * 
 * @author seba, frieger
 * 
 */
public abstract class LanguageLibFactory {
  public abstract LanguageLib createLanguageLibrary();

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
  public String getOriginalFileExtension() {
    return null;
  }
}
