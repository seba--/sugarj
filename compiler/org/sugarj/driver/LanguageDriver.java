package org.sugarj.driver;

import org.spoofax.interpreter.terms.IStrategoTerm;

public abstract class LanguageDriver {
  
  public abstract String getSourcecodeExtension();
  
  public abstract boolean isLanguageSpecificDec(IStrategoTerm decl);
  public abstract boolean isSugarDec(IStrategoTerm decl);
  public abstract boolean isEditorService(IStrategoTerm decl);
  public abstract boolean isImport(IStrategoTerm decl);
  public abstract boolean isPlain(IStrategoTerm decl); // XXX: Decide what to do with "Plain"--leave in the language or create a new "Plain" language
}
