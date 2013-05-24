package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted205 extends Strategy 
{ 
  TermReference j_171;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1831:
    { 
      IStrategoTerm l_171 = null;
      IStrategoTerm o_171 = null;
      IStrategoTerm p_171 = null;
      l_171 = term;
      if(j_171.value == null)
        break Fail1831;
      term = termFactory.makeTuple(j_171.value, extraction.constSortNoArgs156);
      IStrategoTerm term488 = term;
      Success728:
      { 
        Fail1832:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1832;
          if(true)
            break Success728;
        }
        term = term488;
        IStrategoTerm n_171 = null;
        n_171 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_171, extraction.const434);
        if(term == null)
          break Fail1831;
        if(true)
          break Fail1831;
      }
      term = l_171;
      p_171 = l_171;
      o_171 = term;
      term = p_171;
      IStrategoList list163;
      list163 = checkListTail(o_171);
      if(list163 == null)
        break Fail1831;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs100, list163);
      if(true)
        return term;
    }
    return null;
  }
}