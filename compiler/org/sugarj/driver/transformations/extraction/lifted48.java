package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted48 extends Strategy 
{ 
  TermReference d_93;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2175:
    { 
      IStrategoTerm g_93 = null;
      IStrategoTerm k_93 = null;
      IStrategoTerm l_93 = null;
      g_93 = term;
      if(d_93.value == null)
        break Fail2175;
      term = termFactory.makeTuple(d_93.value, extraction.constSort9);
      IStrategoTerm term301 = term;
      Success915:
      { 
        Fail2176:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2176;
          if(true)
            break Success915;
        }
        term = term301;
        IStrategoTerm j_93 = null;
        j_93 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_93, extraction.const334);
        if(term == null)
          break Fail2175;
        if(true)
          break Fail2175;
      }
      term = g_93;
      l_93 = g_93;
      k_93 = term;
      term = l_93;
      IStrategoList list6;
      list6 = checkListTail(k_93);
      if(list6 == null)
        break Fail2175;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs80, list6);
      if(true)
        return term;
    }
    return null;
  }
}