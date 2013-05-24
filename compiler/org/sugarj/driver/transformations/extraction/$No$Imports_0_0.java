package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $No$Imports_0_0 extends Strategy 
{ 
  public static $No$Imports_0_0 instance = new $No$Imports_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail849:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || ext._consNoImports_0 != ((IStrategoAppl)term).getConstructor())
        break Fail849;
      if(true)
        return term;
    }
    context.push("NoImports_0_0");
    context.popOnFailure();
    return null;
  }
}