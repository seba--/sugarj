package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted112 extends Strategy 
{ 
  TermReference c_118;

  TermReference d_118;

  TermReference e_118;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2033:
    { 
      IStrategoTerm m_118 = null;
      IStrategoTerm n_118 = null;
      IStrategoTerm o_118 = null;
      IStrategoTerm l_119 = null;
      IStrategoTerm m_119 = null;
      m_118 = term;
      if(c_118.value == null)
        break Fail2033;
      term = termFactory.makeTuple(c_118.value, extraction.constSortNoArgs6);
      IStrategoTerm term377 = term;
      Success837:
      { 
        Fail2034:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2034;
          if(true)
            break Success837;
        }
        term = term377;
        IStrategoTerm g_119 = null;
        g_119 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_119, extraction.const378);
        if(term == null)
          break Fail2033;
        if(true)
          break Fail2033;
      }
      term = m_118;
      n_118 = m_118;
      if(d_118.value == null)
        break Fail2033;
      term = termFactory.makeTuple(d_118.value, extraction.constSort24);
      IStrategoTerm term378 = term;
      Success838:
      { 
        Fail2035:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2035;
          if(true)
            break Success838;
        }
        term = term378;
        IStrategoTerm i_119 = null;
        i_119 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_119, extraction.const378);
        if(term == null)
          break Fail2033;
        if(true)
          break Fail2033;
      }
      term = n_118;
      o_118 = n_118;
      if(e_118.value == null)
        break Fail2033;
      term = termFactory.makeTuple(e_118.value, extraction.constSortNoArgs309);
      IStrategoTerm term379 = term;
      Success839:
      { 
        Fail2036:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2036;
          if(true)
            break Success839;
        }
        term = term379;
        IStrategoTerm k_119 = null;
        k_119 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_119, extraction.const378);
        if(term == null)
          break Fail2033;
        if(true)
          break Fail2033;
      }
      term = o_118;
      m_119 = o_118;
      l_119 = term;
      term = m_119;
      IStrategoList list70;
      list70 = checkListTail(l_119);
      if(list70 == null)
        break Fail2033;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs148, list70);
      if(true)
        return term;
    }
    return null;
  }
}