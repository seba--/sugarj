package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted333 extends Strategy 
{ 
  TermReference h_244;

  TermReference i_244;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1479:
    { 
      IStrategoTerm k_244 = null;
      IStrategoTerm l_244 = null;
      IStrategoTerm r_244 = null;
      IStrategoTerm s_244 = null;
      k_244 = term;
      if(h_244.value == null)
        break Fail1479;
      term = termFactory.makeTuple(h_244.value, extraction.constSortNoArgs8);
      IStrategoTerm term711 = term;
      Success504:
      { 
        Fail1480:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1480;
          if(true)
            break Success504;
        }
        term = term711;
        IStrategoTerm n_244 = null;
        n_244 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_244, extraction.const524);
        if(term == null)
          break Fail1479;
        if(true)
          break Fail1479;
      }
      term = k_244;
      l_244 = k_244;
      if(i_244.value == null)
        break Fail1479;
      term = termFactory.makeTuple(i_244.value, extraction.constSortNoArgs45);
      IStrategoTerm term712 = term;
      Success505:
      { 
        Fail1481:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1481;
          if(true)
            break Success505;
        }
        term = term712;
        IStrategoTerm q_244 = null;
        q_244 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_244, extraction.const524);
        if(term == null)
          break Fail1479;
        if(true)
          break Fail1479;
      }
      term = l_244;
      s_244 = l_244;
      r_244 = term;
      term = s_244;
      IStrategoList list291;
      list291 = checkListTail(r_244);
      if(list291 == null)
        break Fail1479;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs208, list291);
      if(true)
        return term;
    }
    return null;
  }
}