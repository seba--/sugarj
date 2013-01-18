package org.sugarj;

public class JavaLibFactory extends LanguageLibFactory {

  private JavaLibFactory() { }
  
  private static JavaLibFactory instance = new JavaLibFactory();
  
  public static JavaLibFactory getInstance() {
    return instance;
  }
  
  @Override
  public LanguageLib createLanguageLibrary() {
    return new JavaLib();
  }

  @Override
  public String getLanguageName() {
    return "Java";
  }

  @Override
  public String getVersion() {
    return "java-0.2";
  }

  @Override
  public String getGeneratedFileExtension() {
    return "class";
  }

  @Override
  public String getSugarFileExtension() {
    return "sugj";
  }
  
  @Override
  public String getOriginalFileExtension() {
    return "java";
  }

}
