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

}
