package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted193 extends Strategy 
{ 
  TermReference d_165;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1859:
    { 
      IStrategoTerm k_165 = null;
      IStrategoTerm n_165 = null;
      IStrategoTerm p_165 = null;
      k_165 = term;
      if(d_165.value == null)
        break Fail1859;
      term = termFactory.makeTuple(d_165.value, extraction.constSortNoArgs6);
      IStrategoTerm term472 = term;
      Success744:
      { 
        Fail1860:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1860;
          if(true)
            break Success744;
        }
        term = term472;
        IStrategoTerm m_165 = null;
        m_165 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_165, extraction.const429);
        if(term == null)
          break Fail1859;
        if(true)
          break Fail1859;
      }
      term = k_165;
      p_165 = k_165;
      n_165 = term;
      term = p_165;
      IStrategoList list151;
      list151 = checkListTail(n_165);
      if(list151 == null)
        break Fail1859;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list151);
      if(true)
        return term;
    }
    return null;
  }
}