package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted114 extends Strategy 
{ 
  TermReference r_119;

  TermReference t_119;

  TermReference u_119;

  TermReference w_119;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2023:
    { 
      IStrategoTerm j_120 = null;
      IStrategoTerm k_120 = null;
      IStrategoTerm l_120 = null;
      IStrategoTerm m_120 = null;
      IStrategoTerm h_121 = null;
      IStrategoTerm i_121 = null;
      j_120 = term;
      if(r_119.value == null)
        break Fail2023;
      term = termFactory.makeTuple(r_119.value, extraction.constSortNoArgs30);
      IStrategoTerm term384 = term;
      Success829:
      { 
        Fail2024:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2024;
          if(true)
            break Success829;
        }
        term = term384;
        IStrategoTerm a_121 = null;
        a_121 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_121, extraction.const379);
        if(term == null)
          break Fail2023;
        if(true)
          break Fail2023;
      }
      term = j_120;
      k_120 = j_120;
      if(t_119.value == null)
        break Fail2023;
      term = termFactory.makeTuple(t_119.value, extraction.constSortNoArgs6);
      IStrategoTerm term385 = term;
      Success830:
      { 
        Fail2025:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2025;
          if(true)
            break Success830;
        }
        term = term385;
        IStrategoTerm c_121 = null;
        c_121 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_121, extraction.const379);
        if(term == null)
          break Fail2023;
        if(true)
          break Fail2023;
      }
      term = k_120;
      l_120 = k_120;
      if(u_119.value == null)
        break Fail2023;
      term = termFactory.makeTuple(u_119.value, extraction.constSort24);
      IStrategoTerm term386 = term;
      Success831:
      { 
        Fail2026:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2026;
          if(true)
            break Success831;
        }
        term = term386;
        IStrategoTerm e_121 = null;
        e_121 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_121, extraction.const379);
        if(term == null)
          break Fail2023;
        if(true)
          break Fail2023;
      }
      term = l_120;
      m_120 = l_120;
      if(w_119.value == null)
        break Fail2023;
      term = termFactory.makeTuple(w_119.value, extraction.constSortNoArgs309);
      IStrategoTerm term387 = term;
      Success832:
      { 
        Fail2027:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2027;
          if(true)
            break Success832;
        }
        term = term387;
        IStrategoTerm g_121 = null;
        g_121 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_121, extraction.const379);
        if(term == null)
          break Fail2023;
        if(true)
          break Fail2023;
      }
      term = m_120;
      i_121 = m_120;
      h_121 = term;
      term = i_121;
      IStrategoList list72;
      list72 = checkListTail(h_121);
      if(list72 == null)
        break Fail2023;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs148, list72);
      if(true)
        return term;
    }
    return null;
  }
}