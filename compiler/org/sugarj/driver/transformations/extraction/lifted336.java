package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted336 extends Strategy 
{ 
  TermReference c_246;

  TermReference d_246;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1471:
    { 
      IStrategoTerm f_246 = null;
      IStrategoTerm g_246 = null;
      IStrategoTerm l_246 = null;
      IStrategoTerm m_246 = null;
      f_246 = term;
      if(c_246.value == null)
        break Fail1471;
      term = termFactory.makeTuple(c_246.value, extraction.constSortNoArgs8);
      IStrategoTerm term716 = term;
      Success499:
      { 
        Fail1472:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1472;
          if(true)
            break Success499;
        }
        term = term716;
        IStrategoTerm i_246 = null;
        i_246 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_246, extraction.const527);
        if(term == null)
          break Fail1471;
        if(true)
          break Fail1471;
      }
      term = f_246;
      g_246 = f_246;
      if(d_246.value == null)
        break Fail1471;
      term = termFactory.makeTuple(d_246.value, extraction.constSortNoArgs45);
      IStrategoTerm term717 = term;
      Success500:
      { 
        Fail1473:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1473;
          if(true)
            break Success500;
        }
        term = term717;
        IStrategoTerm k_246 = null;
        k_246 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_246, extraction.const527);
        if(term == null)
          break Fail1471;
        if(true)
          break Fail1471;
      }
      term = g_246;
      m_246 = g_246;
      l_246 = term;
      term = m_246;
      IStrategoList list294;
      list294 = checkListTail(l_246);
      if(list294 == null)
        break Fail1471;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs208, list294);
      if(true)
        return term;
    }
    return null;
  }
}