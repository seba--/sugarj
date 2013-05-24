package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted232 extends Strategy 
{ 
  TermReference e_187;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1758:
    { 
      IStrategoTerm g_187 = null;
      IStrategoTerm j_187 = null;
      IStrategoTerm k_187 = null;
      g_187 = term;
      if(e_187.value == null)
        break Fail1758;
      term = termFactory.makeTuple(e_187.value, extraction.constSortNoArgs8);
      IStrategoTerm term534 = term;
      Success682:
      { 
        Fail1759:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1759;
          if(true)
            break Success682;
        }
        term = term534;
        IStrategoTerm i_187 = null;
        i_187 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_187, extraction.const112);
        if(term == null)
          break Fail1758;
        if(true)
          break Fail1758;
      }
      term = g_187;
      k_187 = g_187;
      j_187 = term;
      term = k_187;
      IStrategoList list190;
      list190 = checkListTail(j_187);
      if(list190 == null)
        break Fail1758;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs101, list190);
      if(true)
        return term;
    }
    return null;
  }
}