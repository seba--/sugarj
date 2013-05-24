package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted368 extends Strategy 
{ 
  TermReference i_265;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1384:
    { 
      IStrategoTerm k_265 = null;
      IStrategoTerm n_265 = null;
      IStrategoTerm o_265 = null;
      k_265 = term;
      if(i_265.value == null)
        break Fail1384;
      term = termFactory.makeTuple(i_265.value, extraction.constSortNoArgs0);
      IStrategoTerm term772 = term;
      Success444:
      { 
        Fail1385:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1385;
          if(true)
            break Success444;
        }
        term = term772;
        IStrategoTerm m_265 = null;
        m_265 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_265, extraction.const549);
        if(term == null)
          break Fail1384;
        if(true)
          break Fail1384;
      }
      term = k_265;
      o_265 = k_265;
      n_265 = term;
      term = o_265;
      IStrategoList list326;
      list326 = checkListTail(n_265);
      if(list326 == null)
        break Fail1384;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list326);
      if(true)
        return term;
    }
    return null;
  }
}