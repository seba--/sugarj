package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted253 extends Strategy 
{ 
  TermReference j_199;

  TermReference k_199;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1686:
    { 
      IStrategoTerm m_199 = null;
      IStrategoTerm n_199 = null;
      IStrategoTerm w_199 = null;
      IStrategoTerm x_199 = null;
      m_199 = term;
      if(j_199.value == null)
        break Fail1686;
      term = termFactory.makeTuple(j_199.value, extraction.constSortNoArgs0);
      IStrategoTerm term584 = term;
      Success631:
      { 
        Fail1687:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1687;
          if(true)
            break Success631;
        }
        term = term584;
        IStrategoTerm t_199 = null;
        t_199 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_199, extraction.const463);
        if(term == null)
          break Fail1686;
        if(true)
          break Fail1686;
      }
      term = m_199;
      n_199 = m_199;
      if(k_199.value == null)
        break Fail1686;
      term = termFactory.makeTuple(k_199.value, extraction.constSortNoArgs0);
      IStrategoTerm term585 = term;
      Success632:
      { 
        Fail1688:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1688;
          if(true)
            break Success632;
        }
        term = term585;
        IStrategoTerm v_199 = null;
        v_199 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_199, extraction.const463);
        if(term == null)
          break Fail1686;
        if(true)
          break Fail1686;
      }
      term = n_199;
      x_199 = n_199;
      w_199 = term;
      term = x_199;
      IStrategoList list211;
      list211 = checkListTail(w_199);
      if(list211 == null)
        break Fail1686;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list211);
      if(true)
        return term;
    }
    return null;
  }
}