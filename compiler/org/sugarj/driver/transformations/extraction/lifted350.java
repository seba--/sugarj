package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted350 extends Strategy 
{ 
  TermReference a_254;

  TermReference b_254;

  TermReference d_254;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1436:
    { 
      IStrategoTerm f_254 = null;
      IStrategoTerm g_254 = null;
      IStrategoTerm h_254 = null;
      IStrategoTerm p_254 = null;
      IStrategoTerm q_254 = null;
      f_254 = term;
      if(a_254.value == null)
        break Fail1436;
      term = termFactory.makeTuple(a_254.value, extraction.constSortNoArgs201);
      IStrategoTerm term736 = term;
      Success478:
      { 
        Fail1437:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1437;
          if(true)
            break Success478;
        }
        term = term736;
        IStrategoTerm k_254 = null;
        k_254 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_254, extraction.const535);
        if(term == null)
          break Fail1436;
        if(true)
          break Fail1436;
      }
      term = f_254;
      g_254 = f_254;
      if(b_254.value == null)
        break Fail1436;
      term = termFactory.makeTuple(b_254.value, extraction.constSort38);
      IStrategoTerm term737 = term;
      Success479:
      { 
        Fail1438:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1438;
          if(true)
            break Success479;
        }
        term = term737;
        IStrategoTerm m_254 = null;
        m_254 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_254, extraction.const535);
        if(term == null)
          break Fail1436;
        if(true)
          break Fail1436;
      }
      term = g_254;
      h_254 = g_254;
      if(d_254.value == null)
        break Fail1436;
      term = termFactory.makeTuple(d_254.value, extraction.constSort39);
      IStrategoTerm term738 = term;
      Success480:
      { 
        Fail1439:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1439;
          if(true)
            break Success480;
        }
        term = term738;
        IStrategoTerm o_254 = null;
        o_254 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_254, extraction.const535);
        if(term == null)
          break Fail1436;
        if(true)
          break Fail1436;
      }
      term = h_254;
      q_254 = h_254;
      p_254 = term;
      term = q_254;
      IStrategoList list308;
      list308 = checkListTail(p_254);
      if(list308 == null)
        break Fail1436;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list308);
      if(true)
        return term;
    }
    return null;
  }
}