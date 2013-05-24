package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted182 extends Strategy 
{ 
  TermReference j_158;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1881:
    { 
      IStrategoTerm l_158 = null;
      IStrategoTerm p_158 = null;
      IStrategoTerm q_158 = null;
      l_158 = term;
      if(j_158.value == null)
        break Fail1881;
      term = termFactory.makeTuple(j_158.value, extraction.constSortNoArgs6);
      IStrategoTerm term461 = term;
      Success755:
      { 
        Fail1882:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1882;
          if(true)
            break Success755;
        }
        term = term461;
        IStrategoTerm o_158 = null;
        o_158 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_158, extraction.const421);
        if(term == null)
          break Fail1881;
        if(true)
          break Fail1881;
      }
      term = l_158;
      q_158 = l_158;
      p_158 = term;
      term = q_158;
      IStrategoList list140;
      list140 = checkListTail(p_158);
      if(list140 == null)
        break Fail1881;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list140);
      if(true)
        return term;
    }
    return null;
  }
}