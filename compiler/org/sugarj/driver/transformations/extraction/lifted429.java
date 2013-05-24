package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted429 extends Strategy 
{ 
  TermReference m_303;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1258:
    { 
      IStrategoTerm o_303 = null;
      IStrategoTerm s_303 = null;
      IStrategoTerm t_303 = null;
      o_303 = term;
      if(m_303.value == null)
        break Fail1258;
      term = termFactory.makeTuple(m_303.value, extraction.constSortNoArgs296);
      IStrategoTerm term837 = term;
      Success379:
      { 
        Fail1259:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1259;
          if(true)
            break Success379;
        }
        term = term837;
        IStrategoTerm r_303 = null;
        r_303 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_303, extraction.const598);
        if(term == null)
          break Fail1258;
        if(true)
          break Fail1258;
      }
      term = o_303;
      t_303 = o_303;
      s_303 = term;
      term = t_303;
      IStrategoList list387;
      list387 = checkListTail(s_303);
      if(list387 == null)
        break Fail1258;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs296, list387);
      if(true)
        return term;
    }
    return null;
  }
}