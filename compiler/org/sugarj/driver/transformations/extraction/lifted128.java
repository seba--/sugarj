package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted128 extends Strategy 
{ 
  TermReference h_126;

  TermReference i_126;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1997:
    { 
      IStrategoTerm k_126 = null;
      IStrategoTerm l_126 = null;
      IStrategoTerm q_126 = null;
      IStrategoTerm r_126 = null;
      k_126 = term;
      if(h_126.value == null)
        break Fail1997;
      term = termFactory.makeTuple(h_126.value, extraction.constSortNoArgs5);
      IStrategoTerm term398 = term;
      Success817:
      { 
        Fail1998:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1998;
          if(true)
            break Success817;
        }
        term = term398;
        IStrategoTerm n_126 = null;
        n_126 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_126, extraction.const386);
        if(term == null)
          break Fail1997;
        if(true)
          break Fail1997;
      }
      term = k_126;
      l_126 = k_126;
      if(i_126.value == null)
        break Fail1997;
      term = termFactory.makeTuple(i_126.value, extraction.constSortNoArgs91);
      IStrategoTerm term399 = term;
      Success818:
      { 
        Fail1999:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1999;
          if(true)
            break Success818;
        }
        term = term399;
        IStrategoTerm p_126 = null;
        p_126 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_126, extraction.const386);
        if(term == null)
          break Fail1997;
        if(true)
          break Fail1997;
      }
      term = l_126;
      r_126 = l_126;
      q_126 = term;
      term = r_126;
      IStrategoList list86;
      list86 = checkListTail(q_126);
      if(list86 == null)
        break Fail1997;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs150, list86);
      if(true)
        return term;
    }
    return null;
  }
}