package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted362 extends Strategy 
{ 
  TermReference z_260;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1403:
    { 
      IStrategoTerm c_261 = null;
      IStrategoTerm j_261 = null;
      IStrategoTerm k_261 = null;
      c_261 = term;
      if(z_260.value == null)
        break Fail1403;
      term = termFactory.makeTuple(z_260.value, extraction.constSortNoArgs41);
      IStrategoTerm term759 = term;
      Success457:
      { 
        Fail1404:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1404;
          if(true)
            break Success457;
        }
        term = term759;
        IStrategoTerm i_261 = null;
        i_261 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_261, extraction.const544);
        if(term == null)
          break Fail1403;
        if(true)
          break Fail1403;
      }
      term = c_261;
      k_261 = c_261;
      j_261 = term;
      term = k_261;
      IStrategoList list320;
      list320 = checkListTail(j_261);
      if(list320 == null)
        break Fail1403;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list320);
      if(true)
        return term;
    }
    return null;
  }
}