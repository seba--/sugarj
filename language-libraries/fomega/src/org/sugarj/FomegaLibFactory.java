package org.sugarj;

import org.sugarj.common.Log;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */

public class FomegaLibFactory extends LanguageLibFactory {

	private FomegaLibFactory() { }
	
	private static FomegaLibFactory instance = new FomegaLibFactory();
	
	public static FomegaLibFactory getInstance() {
		return instance;
	}
	
	/**
	 * @see org.sugarj.LanguageLibFactory#createLanguageLibrary()
	 */
	@Override
	public LanguageLib createLanguageLibrary() {
	  // TODO leave log level unchanged
	  Log.log.setLoggingLevel(Log.ALWAYS);
		return new FomegaLib();
	}

  @Override
  public String getLanguageName() {
    return "Fomega";
  }

  @Override
  public String getVersion() {
    return "fomega-0.2";
  }
  
  @Override
  public String getGeneratedFileExtension() {
    return "pts";
  }

  @Override
  public String getSugarFileExtension() {
    return "sf";
  }


}
