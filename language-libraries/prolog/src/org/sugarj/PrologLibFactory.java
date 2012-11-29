package org.sugarj;

public class PrologLibFactory extends LanguageLibFactory {

  private PrologLibFactory() { }
  
  private static PrologLibFactory instance = new PrologLibFactory();
  
  public static PrologLibFactory getInstance() {
    return instance;
  }
  
	@Override
	public LanguageLib createLanguageLibrary() {
		return new PrologLib();
	}

  @Override
  public String getGeneratedFileExtension() {
    return "pro";
  }

  @Override
  public String getSugarFileExtension() {
    return "sugp";
  }
}
