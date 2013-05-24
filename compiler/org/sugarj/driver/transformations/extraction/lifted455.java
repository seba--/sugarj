package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted455 extends Strategy 
{ 
  TermReference j_317;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1194:
    { 
      IStrategoTerm l_317 = null;
      IStrategoTerm o_317 = null;
      IStrategoTerm p_317 = null;
      l_317 = term;
      if(j_317.value == null)
        break Fail1194;
      term = termFactory.makeTuple(j_317.value, extraction.constSortNoArgs255);
      IStrategoTerm term875 = term;
      Success341:
      { 
        Fail1195:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1195;
          if(true)
            break Success341;
        }
        term = term875;
        IStrategoTerm n_317 = null;
        n_317 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_317, extraction.const623);
        if(term == null)
          break Fail1194;
        if(true)
          break Fail1194;
      }
      term = l_317;
      p_317 = l_317;
      o_317 = term;
      term = p_317;
      IStrategoList list413;
      list413 = checkListTail(o_317);
      if(list413 == null)
        break Fail1194;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list413);
      if(true)
        return term;
    }
    return null;
  }
}