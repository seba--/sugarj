package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted67 extends Strategy 
{ 
  TermReference j_100;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2136:
    { 
      IStrategoTerm l_100 = null;
      IStrategoTerm p_100 = null;
      IStrategoTerm q_100 = null;
      l_100 = term;
      if(j_100.value == null)
        break Fail2136;
      term = termFactory.makeTuple(j_100.value, extraction.constSortNoArgs267);
      IStrategoTerm term321 = term;
      Success895:
      { 
        Fail2137:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2137;
          if(true)
            break Success895;
        }
        term = term321;
        IStrategoTerm o_100 = null;
        o_100 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_100, extraction.const346);
        if(term == null)
          break Fail2136;
        if(true)
          break Fail2136;
      }
      term = l_100;
      q_100 = l_100;
      p_100 = term;
      term = q_100;
      IStrategoList list25;
      list25 = checkListTail(p_100);
      if(list25 == null)
        break Fail2136;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list25);
      if(true)
        return term;
    }
    return null;
  }
}