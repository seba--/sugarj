package org.sugarj;

public class JavaLibFactory extends LanguageLibFactory {
	// XXX: How to ensure that only one JavaLibFactory exists?	
	@Override
	public LanguageLib createLanguageLibrary() {
		return new JavaLib();
	}

}
