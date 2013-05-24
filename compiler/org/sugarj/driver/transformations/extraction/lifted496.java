package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted496 extends Strategy 
{ 
  public static final lifted496 instance = new lifted496();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail1120:
    { 
      IStrategoTerm d_354 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1120;
      d_354 = term.getSubterm(0);
      IStrategoTerm arg75 = term.getSubterm(1);
      term = aux_$Subsort_$Stack_0_1.instance.invoke(context, d_354, arg75);
      if(term == null)
        break Fail1120;
      if(true)
        return term;
    }
    return null;
  }
}