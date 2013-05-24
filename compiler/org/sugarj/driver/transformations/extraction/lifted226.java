package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted226 extends Strategy 
{ 
  TermReference m_183;

  TermReference n_183;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1775:
    { 
      IStrategoTerm p_183 = null;
      IStrategoTerm q_183 = null;
      IStrategoTerm v_183 = null;
      IStrategoTerm w_183 = null;
      p_183 = term;
      if(m_183.value == null)
        break Fail1775;
      term = termFactory.makeTuple(m_183.value, extraction.constSortNoArgs172);
      IStrategoTerm term522 = term;
      Success693:
      { 
        Fail1776:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1776;
          if(true)
            break Success693;
        }
        term = term522;
        IStrategoTerm s_183 = null;
        s_183 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_183, extraction.const447);
        if(term == null)
          break Fail1775;
        if(true)
          break Fail1775;
      }
      term = p_183;
      q_183 = p_183;
      if(n_183.value == null)
        break Fail1775;
      term = termFactory.makeTuple(n_183.value, extraction.constSortNoArgs41);
      IStrategoTerm term523 = term;
      Success694:
      { 
        Fail1777:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1777;
          if(true)
            break Success694;
        }
        term = term523;
        IStrategoTerm u_183 = null;
        u_183 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_183, extraction.const447);
        if(term == null)
          break Fail1775;
        if(true)
          break Fail1775;
      }
      term = q_183;
      w_183 = q_183;
      v_183 = term;
      term = w_183;
      IStrategoList list184;
      list184 = checkListTail(v_183);
      if(list184 == null)
        break Fail1775;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs174, list184);
      if(true)
        return term;
    }
    return null;
  }
}