package org.sugarj;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */

public class HaskellLibFactory extends LanguageLibFactory {

	private HaskellLibFactory() { }
	
	private static HaskellLibFactory instance = new HaskellLibFactory();
	
	public static HaskellLibFactory getInstance() {
		return instance;
	}
	
	/**
	 * @see org.sugarj.LanguageLibFactory#createLanguageLibrary()
	 */
	@Override
	public LanguageLib createLanguageLibrary() {
		return new HaskellLib();
	}

}
