package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted344 extends Strategy 
{ 
  TermReference m_250;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1454:
    { 
      IStrategoTerm o_250 = null;
      IStrategoTerm r_250 = null;
      IStrategoTerm u_250 = null;
      o_250 = term;
      if(m_250.value == null)
        break Fail1454;
      term = termFactory.makeTuple(m_250.value, extraction.constSortNoArgs18);
      IStrategoTerm term726 = term;
      Success490:
      { 
        Fail1455:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1455;
          if(true)
            break Success490;
        }
        term = term726;
        IStrategoTerm q_250 = null;
        q_250 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_250, extraction.const530);
        if(term == null)
          break Fail1454;
        if(true)
          break Fail1454;
      }
      term = o_250;
      u_250 = o_250;
      r_250 = term;
      term = u_250;
      IStrategoList list302;
      list302 = checkListTail(r_250);
      if(list302 == null)
        break Fail1454;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list302);
      if(true)
        return term;
    }
    return null;
  }
}