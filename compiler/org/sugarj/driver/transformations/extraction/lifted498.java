package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted498 extends Strategy 
{ 
  public static final lifted498 instance = new lifted498();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail1118:
    { 
      IStrategoTerm a_355 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1118;
      a_355 = term.getSubterm(0);
      IStrategoTerm arg77 = term.getSubterm(1);
      term = aux_$Subsort_$Stack_0_1.instance.invoke(context, a_355, arg77);
      if(term == null)
        break Fail1118;
      if(true)
        return term;
    }
    return null;
  }
}