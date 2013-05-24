package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted92 extends Strategy 
{ 
  TermReference c_110;

  TermReference d_110;

  TermReference e_110;

  TermReference f_110;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2079:
    { 
      IStrategoTerm h_110 = null;
      IStrategoTerm i_110 = null;
      IStrategoTerm j_110 = null;
      IStrategoTerm k_110 = null;
      IStrategoTerm t_110 = null;
      IStrategoTerm u_110 = null;
      h_110 = term;
      if(c_110.value == null)
        break Fail2079;
      term = termFactory.makeTuple(c_110.value, extraction.constSort20);
      IStrategoTerm term350 = term;
      Success863:
      { 
        Fail2080:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2080;
          if(true)
            break Success863;
        }
        term = term350;
        IStrategoTerm m_110 = null;
        m_110 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_110, extraction.const363);
        if(term == null)
          break Fail2079;
        if(true)
          break Fail2079;
      }
      term = h_110;
      i_110 = h_110;
      if(d_110.value == null)
        break Fail2079;
      term = termFactory.makeTuple(d_110.value, extraction.constSortNoArgs18);
      IStrategoTerm term351 = term;
      Success864:
      { 
        Fail2081:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2081;
          if(true)
            break Success864;
        }
        term = term351;
        IStrategoTerm o_110 = null;
        o_110 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_110, extraction.const363);
        if(term == null)
          break Fail2079;
        if(true)
          break Fail2079;
      }
      term = i_110;
      j_110 = i_110;
      if(e_110.value == null)
        break Fail2079;
      term = termFactory.makeTuple(e_110.value, extraction.constSortNoArgs91);
      IStrategoTerm term352 = term;
      Success865:
      { 
        Fail2082:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2082;
          if(true)
            break Success865;
        }
        term = term352;
        IStrategoTerm q_110 = null;
        q_110 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_110, extraction.const363);
        if(term == null)
          break Fail2079;
        if(true)
          break Fail2079;
      }
      term = j_110;
      k_110 = j_110;
      if(f_110.value == null)
        break Fail2079;
      term = termFactory.makeTuple(f_110.value, extraction.constSort21);
      IStrategoTerm term353 = term;
      Success866:
      { 
        Fail2083:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2083;
          if(true)
            break Success866;
        }
        term = term353;
        IStrategoTerm s_110 = null;
        s_110 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_110, extraction.const363);
        if(term == null)
          break Fail2079;
        if(true)
          break Fail2079;
      }
      term = k_110;
      u_110 = k_110;
      t_110 = term;
      term = u_110;
      IStrategoList list50;
      list50 = checkListTail(t_110);
      if(list50 == null)
        break Fail2079;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs144, list50);
      if(true)
        return term;
    }
    return null;
  }
}