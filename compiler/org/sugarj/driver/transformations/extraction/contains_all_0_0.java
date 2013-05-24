package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class contains_all_0_0 extends Strategy 
{ 
  public static contains_all_0_0 instance = new contains_all_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("contains_all_0_0");
    Fail6:
    { 
      IStrategoTerm n_50 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail6;
      n_50 = term.getSubterm(1);
      term = $Swap_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail6;
      term = intersect_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail6;
      term = equal_0_1.instance.invoke(context, term, n_50);
      if(term == null)
        break Fail6;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}