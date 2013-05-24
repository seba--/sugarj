package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted95 extends Strategy 
{ 
  TermReference f_112;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2071:
    { 
      IStrategoTerm h_112 = null;
      IStrategoTerm k_112 = null;
      IStrategoTerm l_112 = null;
      h_112 = term;
      if(f_112.value == null)
        break Fail2071;
      term = termFactory.makeTuple(f_112.value, extraction.constSortNoArgs91);
      IStrategoTerm term358 = term;
      Success858:
      { 
        Fail2072:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2072;
          if(true)
            break Success858;
        }
        term = term358;
        IStrategoTerm j_112 = null;
        j_112 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_112, extraction.const365);
        if(term == null)
          break Fail2071;
        if(true)
          break Fail2071;
      }
      term = h_112;
      l_112 = h_112;
      k_112 = term;
      term = l_112;
      IStrategoList list53;
      list53 = checkListTail(k_112);
      if(list53 == null)
        break Fail2071;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs146, list53);
      if(true)
        return term;
    }
    return null;
  }
}