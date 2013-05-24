package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted413 extends Strategy 
{ 
  TermReference g_287;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1289:
    { 
      IStrategoTerm j_287 = null;
      IStrategoTerm q_287 = null;
      IStrategoTerm r_287 = null;
      j_287 = term;
      if(g_287.value == null)
        break Fail1289;
      term = termFactory.makeTuple(g_287.value, extraction.constSortNoArgs288);
      IStrategoTerm term822 = term;
      Success394:
      { 
        Fail1290:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1290;
          if(true)
            break Success394;
        }
        term = term822;
        IStrategoTerm p_287 = null;
        p_287 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_287, extraction.const585);
        if(term == null)
          break Fail1289;
        if(true)
          break Fail1289;
      }
      term = j_287;
      r_287 = j_287;
      q_287 = term;
      term = r_287;
      IStrategoList list371;
      list371 = checkListTail(q_287);
      if(list371 == null)
        break Fail1289;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs286, list371);
      if(true)
        return term;
    }
    return null;
  }
}