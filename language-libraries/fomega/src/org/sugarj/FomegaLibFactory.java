package org.sugarj;

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
		return new FomegaLib();
	}

}
