package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted311 extends Strategy 
{ 
  TermReference s_233;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1532:
    { 
      IStrategoTerm u_233 = null;
      IStrategoTerm z_233 = null;
      IStrategoTerm a_234 = null;
      u_233 = term;
      if(s_233.value == null)
        break Fail1532;
      term = termFactory.makeTuple(s_233.value, extraction.constSortNoArgs40);
      IStrategoTerm term681 = term;
      Success535:
      { 
        Fail1533:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1533;
          if(true)
            break Success535;
        }
        term = term681;
        IStrategoTerm x_233 = null;
        x_233 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_233, extraction.const510);
        if(term == null)
          break Fail1532;
        if(true)
          break Fail1532;
      }
      term = u_233;
      a_234 = u_233;
      z_233 = term;
      term = a_234;
      IStrategoList list269;
      list269 = checkListTail(z_233);
      if(list269 == null)
        break Fail1532;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list269);
      if(true)
        return term;
    }
    return null;
  }
}