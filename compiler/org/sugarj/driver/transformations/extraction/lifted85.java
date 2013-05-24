package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted85 extends Strategy 
{ 
  TermReference e_106;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2100:
    { 
      IStrategoTerm g_106 = null;
      IStrategoTerm j_106 = null;
      IStrategoTerm k_106 = null;
      g_106 = term;
      if(e_106.value == null)
        break Fail2100;
      term = termFactory.makeTuple(e_106.value, extraction.constSort17);
      IStrategoTerm term339 = term;
      Success877:
      { 
        Fail2101:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2101;
          if(true)
            break Success877;
        }
        term = term339;
        IStrategoTerm i_106 = null;
        i_106 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_106, extraction.const356);
        if(term == null)
          break Fail2100;
        if(true)
          break Fail2100;
      }
      term = g_106;
      k_106 = g_106;
      j_106 = term;
      term = k_106;
      IStrategoList list43;
      list43 = checkListTail(j_106);
      if(list43 == null)
        break Fail2100;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs87, list43);
      if(true)
        return term;
    }
    return null;
  }
}