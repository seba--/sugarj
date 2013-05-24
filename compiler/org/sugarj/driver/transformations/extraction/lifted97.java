package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted97 extends Strategy 
{ 
  TermReference k_113;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2065:
    { 
      IStrategoTerm m_113 = null;
      IStrategoTerm q_113 = null;
      IStrategoTerm r_113 = null;
      m_113 = term;
      if(k_113.value == null)
        break Fail2065;
      term = termFactory.makeTuple(k_113.value, extraction.constSortNoArgs6);
      IStrategoTerm term362 = term;
      Success854:
      { 
        Fail2066:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2066;
          if(true)
            break Success854;
        }
        term = term362;
        IStrategoTerm o_113 = null;
        o_113 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_113, extraction.const367);
        if(term == null)
          break Fail2065;
        if(true)
          break Fail2065;
      }
      term = m_113;
      r_113 = m_113;
      q_113 = term;
      term = r_113;
      IStrategoList list55;
      list55 = checkListTail(q_113);
      if(list55 == null)
        break Fail2065;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs146, list55);
      if(true)
        return term;
    }
    return null;
  }
}