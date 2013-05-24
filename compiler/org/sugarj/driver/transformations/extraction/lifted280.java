package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted280 extends Strategy 
{ 
  TermReference e_214;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1612:
    { 
      IStrategoTerm g_214 = null;
      IStrategoTerm j_214 = null;
      IStrategoTerm k_214 = null;
      g_214 = term;
      if(e_214.value == null)
        break Fail1612;
      term = termFactory.makeTuple(e_214.value, extraction.constSortNoArgs20);
      IStrategoTerm term632 = term;
      Success584:
      { 
        Fail1613:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1613;
          if(true)
            break Success584;
        }
        term = term632;
        IStrategoTerm i_214 = null;
        i_214 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_214, extraction.const486);
        if(term == null)
          break Fail1612;
        if(true)
          break Fail1612;
      }
      term = g_214;
      k_214 = g_214;
      j_214 = term;
      term = k_214;
      IStrategoList list238;
      list238 = checkListTail(j_214);
      if(list238 == null)
        break Fail1612;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list238);
      if(true)
        return term;
    }
    return null;
  }
}