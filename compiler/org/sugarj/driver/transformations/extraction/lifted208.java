package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted208 extends Strategy 
{ 
  TermReference e_173;

  TermReference f_173;

  TermReference g_173;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1822:
    { 
      IStrategoTerm i_173 = null;
      IStrategoTerm j_173 = null;
      IStrategoTerm k_173 = null;
      IStrategoTerm x_173 = null;
      IStrategoTerm y_173 = null;
      i_173 = term;
      if(e_173.value == null)
        break Fail1822;
      term = termFactory.makeTuple(e_173.value, extraction.constSortNoArgs16);
      IStrategoTerm term492 = term;
      Success722:
      { 
        Fail1823:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1823;
          if(true)
            break Success722;
        }
        term = term492;
        IStrategoTerm m_173 = null;
        m_173 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_173, extraction.const76);
        if(term == null)
          break Fail1822;
        if(true)
          break Fail1822;
      }
      term = i_173;
      j_173 = i_173;
      if(f_173.value == null)
        break Fail1822;
      term = termFactory.makeTuple(f_173.value, extraction.constSortNoArgs70);
      IStrategoTerm term493 = term;
      Success723:
      { 
        Fail1824:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1824;
          if(true)
            break Success723;
        }
        term = term493;
        IStrategoTerm s_173 = null;
        s_173 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_173, extraction.const76);
        if(term == null)
          break Fail1822;
        if(true)
          break Fail1822;
      }
      term = j_173;
      k_173 = j_173;
      if(g_173.value == null)
        break Fail1822;
      term = termFactory.makeTuple(g_173.value, extraction.constSort4);
      IStrategoTerm term494 = term;
      Success724:
      { 
        Fail1825:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1825;
          if(true)
            break Success724;
        }
        term = term494;
        IStrategoTerm w_173 = null;
        w_173 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_173, extraction.const76);
        if(term == null)
          break Fail1822;
        if(true)
          break Fail1822;
      }
      term = k_173;
      y_173 = k_173;
      x_173 = term;
      term = y_173;
      IStrategoList list166;
      list166 = checkListTail(x_173);
      if(list166 == null)
        break Fail1822;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs65, list166);
      if(true)
        return term;
    }
    return null;
  }
}