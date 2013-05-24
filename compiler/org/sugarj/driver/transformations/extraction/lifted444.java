package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted444 extends Strategy 
{ 
  TermReference i_311;

  TermReference j_311;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1221:
    { 
      IStrategoTerm l_311 = null;
      IStrategoTerm m_311 = null;
      IStrategoTerm r_311 = null;
      IStrategoTerm s_311 = null;
      l_311 = term;
      if(i_311.value == null)
        break Fail1221;
      term = termFactory.makeTuple(i_311.value, extraction.constSortNoArgs71);
      IStrategoTerm term858 = term;
      Success357:
      { 
        Fail1222:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1222;
          if(true)
            break Success357;
        }
        term = term858;
        IStrategoTerm o_311 = null;
        o_311 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_311, extraction.const612);
        if(term == null)
          break Fail1221;
        if(true)
          break Fail1221;
      }
      term = l_311;
      m_311 = l_311;
      if(j_311.value == null)
        break Fail1221;
      term = termFactory.makeTuple(j_311.value, extraction.constSortNoArgs71);
      IStrategoTerm term859 = term;
      Success358:
      { 
        Fail1223:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1223;
          if(true)
            break Success358;
        }
        term = term859;
        IStrategoTerm q_311 = null;
        q_311 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_311, extraction.const612);
        if(term == null)
          break Fail1221;
        if(true)
          break Fail1221;
      }
      term = m_311;
      s_311 = m_311;
      r_311 = term;
      term = s_311;
      IStrategoList list402;
      list402 = checkListTail(r_311);
      if(list402 == null)
        break Fail1221;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list402);
      if(true)
        return term;
    }
    return null;
  }
}