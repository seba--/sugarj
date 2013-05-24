package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted323 extends Strategy 
{ 
  TermReference i_239;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1500:
    { 
      IStrategoTerm k_239 = null;
      IStrategoTerm o_239 = null;
      IStrategoTerm p_239 = null;
      k_239 = term;
      if(i_239.value == null)
        break Fail1500;
      term = termFactory.makeTuple(i_239.value, extraction.constSort31);
      IStrategoTerm term701 = term;
      Success515:
      { 
        Fail1501:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1501;
          if(true)
            break Success515;
        }
        term = term701;
        IStrategoTerm n_239 = null;
        n_239 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_239, extraction.const515);
        if(term == null)
          break Fail1500;
        if(true)
          break Fail1500;
      }
      term = k_239;
      p_239 = k_239;
      o_239 = term;
      term = p_239;
      IStrategoList list281;
      list281 = checkListTail(o_239);
      if(list281 == null)
        break Fail1500;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs30, list281);
      if(true)
        return term;
    }
    return null;
  }
}