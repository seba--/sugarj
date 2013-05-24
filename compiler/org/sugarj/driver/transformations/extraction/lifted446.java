package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted446 extends Strategy 
{ 
  TermReference i_312;

  TermReference j_312;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1216:
    { 
      IStrategoTerm l_312 = null;
      IStrategoTerm m_312 = null;
      IStrategoTerm s_312 = null;
      IStrategoTerm t_312 = null;
      l_312 = term;
      if(i_312.value == null)
        break Fail1216;
      term = termFactory.makeTuple(i_312.value, extraction.constSortNoArgs71);
      IStrategoTerm term861 = term;
      Success354:
      { 
        Fail1217:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1217;
          if(true)
            break Success354;
        }
        term = term861;
        IStrategoTerm p_312 = null;
        p_312 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_312, extraction.const614);
        if(term == null)
          break Fail1216;
        if(true)
          break Fail1216;
      }
      term = l_312;
      m_312 = l_312;
      if(j_312.value == null)
        break Fail1216;
      term = termFactory.makeTuple(j_312.value, extraction.constSortNoArgs71);
      IStrategoTerm term862 = term;
      Success355:
      { 
        Fail1218:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1218;
          if(true)
            break Success355;
        }
        term = term862;
        IStrategoTerm r_312 = null;
        r_312 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_312, extraction.const614);
        if(term == null)
          break Fail1216;
        if(true)
          break Fail1216;
      }
      term = m_312;
      t_312 = m_312;
      s_312 = term;
      term = t_312;
      IStrategoList list404;
      list404 = checkListTail(s_312);
      if(list404 == null)
        break Fail1216;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs264, list404);
      if(true)
        return term;
    }
    return null;
  }
}