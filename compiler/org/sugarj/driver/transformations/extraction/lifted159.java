package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted159 extends Strategy 
{ 
  TermReference a_146;

  TermReference b_146;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1934:
    { 
      IStrategoTerm e_146 = null;
      IStrategoTerm f_146 = null;
      IStrategoTerm k_146 = null;
      IStrategoTerm m_146 = null;
      e_146 = term;
      if(a_146.value == null)
        break Fail1934;
      term = termFactory.makeTuple(a_146.value, extraction.constSortNoArgs14);
      IStrategoTerm term430 = term;
      Success785:
      { 
        Fail1935:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1935;
          if(true)
            break Success785;
        }
        term = term430;
        IStrategoTerm h_146 = null;
        h_146 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_146, extraction.const411);
        if(term == null)
          break Fail1934;
        if(true)
          break Fail1934;
      }
      term = e_146;
      f_146 = e_146;
      if(b_146.value == null)
        break Fail1934;
      term = termFactory.makeTuple(b_146.value, extraction.constSort27);
      IStrategoTerm term431 = term;
      Success786:
      { 
        Fail1936:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1936;
          if(true)
            break Success786;
        }
        term = term431;
        IStrategoTerm j_146 = null;
        j_146 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_146, extraction.const411);
        if(term == null)
          break Fail1934;
        if(true)
          break Fail1934;
      }
      term = f_146;
      m_146 = f_146;
      k_146 = term;
      term = m_146;
      IStrategoList list117;
      list117 = checkListTail(k_146);
      if(list117 == null)
        break Fail1934;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs67, list117);
      if(true)
        return term;
    }
    return null;
  }
}