package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted400 extends Strategy 
{ 
  TermReference k_281;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1312:
    { 
      IStrategoTerm m_281 = null;
      IStrategoTerm p_281 = null;
      IStrategoTerm q_281 = null;
      m_281 = term;
      if(k_281.value == null)
        break Fail1312;
      term = termFactory.makeTuple(k_281.value, extraction.constSortNoArgs30);
      IStrategoTerm term812 = term;
      Success404:
      { 
        Fail1313:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1313;
          if(true)
            break Success404;
        }
        term = term812;
        IStrategoTerm o_281 = null;
        o_281 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_281, extraction.const574);
        if(term == null)
          break Fail1312;
        if(true)
          break Fail1312;
      }
      term = m_281;
      q_281 = m_281;
      p_281 = term;
      term = q_281;
      IStrategoList list358;
      list358 = checkListTail(p_281);
      if(list358 == null)
        break Fail1312;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list358);
      if(true)
        return term;
    }
    return null;
  }
}