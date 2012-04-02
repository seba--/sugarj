package org.sugarj;

import java.io.IOException;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.HybridInterpreter;
import org.sugarj.common.Environment;

public abstract class LanguageDriver {
  // TODO: Integrate into languagelib
  
  public abstract String getSourcecodeExtension();
  
  public abstract boolean isLanguageSpecificDec(IStrategoTerm decl);
  public abstract boolean isSugarDec(IStrategoTerm decl);
  public abstract boolean isEditorService(IStrategoTerm decl);
  public abstract boolean isImport(IStrategoTerm decl);
  public abstract boolean isPlain(IStrategoTerm decl); // XXX: Decide what to do with "Plain"--leave in the language or create a new "Plain" language

  public abstract void processLanguageSpecific(IStrategoTerm toplevelDecl,
                                                Environment environment, 
                                                HybridInterpreter interp) throws IOException;

}
