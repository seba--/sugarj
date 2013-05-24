package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted292 extends Strategy 
{ 
  TermReference d_222;

  TermReference e_222;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1583:
    { 
      IStrategoTerm g_222 = null;
      IStrategoTerm h_222 = null;
      IStrategoTerm m_222 = null;
      IStrategoTerm n_222 = null;
      g_222 = term;
      if(d_222.value == null)
        break Fail1583;
      term = termFactory.makeTuple(d_222.value, extraction.constSortNoArgs0);
      IStrategoTerm term648 = term;
      Success567:
      { 
        Fail1584:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1584;
          if(true)
            break Success567;
        }
        term = term648;
        IStrategoTerm j_222 = null;
        j_222 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_222, extraction.const497);
        if(term == null)
          break Fail1583;
        if(true)
          break Fail1583;
      }
      term = g_222;
      h_222 = g_222;
      if(e_222.value == null)
        break Fail1583;
      term = termFactory.makeTuple(e_222.value, extraction.constSortNoArgs0);
      IStrategoTerm term649 = term;
      Success568:
      { 
        Fail1585:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1585;
          if(true)
            break Success568;
        }
        term = term649;
        IStrategoTerm l_222 = null;
        l_222 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_222, extraction.const497);
        if(term == null)
          break Fail1583;
        if(true)
          break Fail1583;
      }
      term = h_222;
      n_222 = h_222;
      m_222 = term;
      term = n_222;
      IStrategoList list250;
      list250 = checkListTail(m_222);
      if(list250 == null)
        break Fail1583;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list250);
      if(true)
        return term;
    }
    return null;
  }
}