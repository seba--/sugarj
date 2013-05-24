package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted497 extends Strategy 
{ 
  public static final lifted497 instance = new lifted497();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail1119:
    { 
      IStrategoTerm p_354 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1119;
      p_354 = term.getSubterm(0);
      IStrategoTerm arg76 = term.getSubterm(1);
      term = aux_$Subsort_$Stack_0_1.instance.invoke(context, p_354, arg76);
      if(term == null)
        break Fail1119;
      if(true)
        return term;
    }
    return null;
  }
}