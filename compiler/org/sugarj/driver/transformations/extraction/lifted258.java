package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted258 extends Strategy 
{ 
  TermReference b_202;

  TermReference c_202;

  TermReference d_202;

  TermReference f_202;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1668:
    { 
      IStrategoTerm h_202 = null;
      IStrategoTerm i_202 = null;
      IStrategoTerm j_202 = null;
      IStrategoTerm k_202 = null;
      IStrategoTerm t_202 = null;
      IStrategoTerm u_202 = null;
      h_202 = term;
      if(b_202.value == null)
        break Fail1668;
      term = termFactory.makeTuple(b_202.value, extraction.constSortNoArgs8);
      IStrategoTerm term595 = term;
      Success618:
      { 
        Fail1669:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1669;
          if(true)
            break Success618;
        }
        term = term595;
        IStrategoTerm m_202 = null;
        m_202 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_202, extraction.const466);
        if(term == null)
          break Fail1668;
        if(true)
          break Fail1668;
      }
      term = h_202;
      i_202 = h_202;
      if(c_202.value == null)
        break Fail1668;
      term = termFactory.makeTuple(c_202.value, extraction.constSort36);
      IStrategoTerm term596 = term;
      Success619:
      { 
        Fail1670:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1670;
          if(true)
            break Success619;
        }
        term = term596;
        IStrategoTerm o_202 = null;
        o_202 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_202, extraction.const466);
        if(term == null)
          break Fail1668;
        if(true)
          break Fail1668;
      }
      term = i_202;
      j_202 = i_202;
      if(d_202.value == null)
        break Fail1668;
      term = termFactory.makeTuple(d_202.value, extraction.constSort36);
      IStrategoTerm term597 = term;
      Success620:
      { 
        Fail1671:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1671;
          if(true)
            break Success620;
        }
        term = term597;
        IStrategoTerm q_202 = null;
        q_202 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_202, extraction.const466);
        if(term == null)
          break Fail1668;
        if(true)
          break Fail1668;
      }
      term = j_202;
      k_202 = j_202;
      if(f_202.value == null)
        break Fail1668;
      term = termFactory.makeTuple(f_202.value, extraction.constSortNoArgs179);
      IStrategoTerm term598 = term;
      Success621:
      { 
        Fail1672:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1672;
          if(true)
            break Success621;
        }
        term = term598;
        IStrategoTerm s_202 = null;
        s_202 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_202, extraction.const466);
        if(term == null)
          break Fail1668;
        if(true)
          break Fail1668;
      }
      term = k_202;
      u_202 = k_202;
      t_202 = term;
      term = u_202;
      IStrategoList list216;
      list216 = checkListTail(t_202);
      if(list216 == null)
        break Fail1668;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs55, list216);
      if(true)
        return term;
    }
    return null;
  }
}