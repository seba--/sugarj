package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted176 extends Strategy 
{ 
  TermReference p_151;

  TermReference q_151;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1894:
    { 
      IStrategoTerm j_152 = null;
      IStrategoTerm k_152 = null;
      IStrategoTerm n_154 = null;
      IStrategoTerm r_154 = null;
      j_152 = term;
      if(p_151.value == null)
        break Fail1894;
      term = termFactory.makeTuple(p_151.value, extraction.constSortNoArgs91);
      IStrategoTerm term453 = term;
      Success762:
      { 
        Fail1895:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1895;
          if(true)
            break Success762;
        }
        term = term453;
        IStrategoTerm k_154 = null;
        k_154 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_154, extraction.const417);
        if(term == null)
          break Fail1894;
        if(true)
          break Fail1894;
      }
      term = j_152;
      k_152 = j_152;
      if(q_151.value == null)
        break Fail1894;
      term = termFactory.makeTuple(q_151.value, extraction.constSortNoArgs141);
      IStrategoTerm term454 = term;
      Success763:
      { 
        Fail1896:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1896;
          if(true)
            break Success763;
        }
        term = term454;
        IStrategoTerm m_154 = null;
        m_154 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_154, extraction.const417);
        if(term == null)
          break Fail1894;
        if(true)
          break Fail1894;
      }
      term = k_152;
      r_154 = k_152;
      n_154 = term;
      term = r_154;
      IStrategoList list134;
      list134 = checkListTail(n_154);
      if(list134 == null)
        break Fail1894;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs150, list134);
      if(true)
        return term;
    }
    return null;
  }
}