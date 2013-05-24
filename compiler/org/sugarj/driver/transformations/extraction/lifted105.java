package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted105 extends Strategy 
{ 
  TermReference h_116;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2054:
    { 
      IStrategoTerm j_116 = null;
      IStrategoTerm m_116 = null;
      IStrategoTerm n_116 = null;
      j_116 = term;
      if(h_116.value == null)
        break Fail2054;
      term = termFactory.makeTuple(h_116.value, extraction.constSortNoArgs91);
      IStrategoTerm term365 = term;
      Success851:
      { 
        Fail2055:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2055;
          if(true)
            break Success851;
        }
        term = term365;
        IStrategoTerm l_116 = null;
        l_116 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_116, extraction.const375);
        if(term == null)
          break Fail2054;
        if(true)
          break Fail2054;
      }
      term = j_116;
      n_116 = j_116;
      m_116 = term;
      term = n_116;
      IStrategoList list63;
      list63 = checkListTail(m_116);
      if(list63 == null)
        break Fail2054;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs148, list63);
      if(true)
        return term;
    }
    return null;
  }
}