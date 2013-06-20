package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class non_assoc_0_0 extends Strategy 
{ 
  public static non_assoc_0_0 instance = new non_assoc_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail209:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consnon_assoc_0 != ((IStrategoAppl)term).getConstructor())
        break Fail209;
      if(true)
        return term;
    }
    context.push("non_assoc_0_0");
    context.popOnFailure();
    return null;
  }
}