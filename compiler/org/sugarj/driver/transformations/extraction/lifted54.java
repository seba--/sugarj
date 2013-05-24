package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted54 extends Strategy 
{ 
  TermReference e_95;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2163:
    { 
      IStrategoTerm g_95 = null;
      IStrategoTerm l_95 = null;
      IStrategoTerm m_95 = null;
      g_95 = term;
      if(e_95.value == null)
        break Fail2163;
      term = termFactory.makeTuple(e_95.value, extraction.constSort15);
      IStrategoTerm term307 = term;
      Success909:
      { 
        Fail2164:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2164;
          if(true)
            break Success909;
        }
        term = term307;
        IStrategoTerm j_95 = null;
        j_95 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_95, extraction.const337);
        if(term == null)
          break Fail2163;
        if(true)
          break Fail2163;
      }
      term = g_95;
      m_95 = g_95;
      l_95 = term;
      term = m_95;
      IStrategoList list12;
      list12 = checkListTail(l_95);
      if(list12 == null)
        break Fail2163;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs80, list12);
      if(true)
        return term;
    }
    return null;
  }
}