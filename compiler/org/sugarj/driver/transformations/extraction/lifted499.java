package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted499 extends Strategy 
{ 
  public static final lifted499 instance = new lifted499();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail1117:
    { 
      IStrategoTerm l_355 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1117;
      l_355 = term.getSubterm(0);
      IStrategoTerm arg78 = term.getSubterm(1);
      term = aux_$Subsort_$Stack_0_1.instance.invoke(context, l_355, arg78);
      if(term == null)
        break Fail1117;
      if(true)
        return term;
    }
    return null;
  }
}