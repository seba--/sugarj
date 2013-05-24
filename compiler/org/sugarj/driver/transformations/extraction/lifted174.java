package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted174 extends Strategy 
{ 
  TermReference p_151;

  TermReference q_151;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1900:
    { 
      IStrategoTerm z_151 = null;
      IStrategoTerm a_152 = null;
      IStrategoTerm v_153 = null;
      IStrategoTerm z_153 = null;
      z_151 = term;
      if(p_151.value == null)
        break Fail1900;
      term = termFactory.makeTuple(p_151.value, extraction.constSortNoArgs91);
      IStrategoTerm term449 = term;
      Success766:
      { 
        Fail1901:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1901;
          if(true)
            break Success766;
        }
        term = term449;
        IStrategoTerm m_153 = null;
        m_153 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_153, extraction.const417);
        if(term == null)
          break Fail1900;
        if(true)
          break Fail1900;
      }
      term = z_151;
      a_152 = z_151;
      if(q_151.value == null)
        break Fail1900;
      term = termFactory.makeTuple(q_151.value, extraction.constSortNoArgs141);
      IStrategoTerm term450 = term;
      Success767:
      { 
        Fail1902:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1902;
          if(true)
            break Success767;
        }
        term = term450;
        IStrategoTerm s_153 = null;
        s_153 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_153, extraction.const417);
        if(term == null)
          break Fail1900;
        if(true)
          break Fail1900;
      }
      term = a_152;
      z_153 = a_152;
      v_153 = term;
      term = z_153;
      IStrategoList list132;
      list132 = checkListTail(v_153);
      if(list132 == null)
        break Fail1900;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs146, list132);
      if(true)
        return term;
    }
    return null;
  }
}