package org.sugarj;

public class PrologLibFactory extends LanguageLibFactory {
	// TODO: Probably: Ensure only one PrologLibFactory exists
	@Override
	public LanguageLib createLanguageLibrary() {
		return new PrologLib();
	}
}
