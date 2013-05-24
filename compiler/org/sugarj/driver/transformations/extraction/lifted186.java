package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted186 extends Strategy 
{ 
  TermReference j_160;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1873:
    { 
      IStrategoTerm l_160 = null;
      IStrategoTerm o_160 = null;
      IStrategoTerm p_160 = null;
      l_160 = term;
      if(j_160.value == null)
        break Fail1873;
      term = termFactory.makeTuple(j_160.value, extraction.constSortNoArgs91);
      IStrategoTerm term465 = term;
      Success751:
      { 
        Fail1874:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1874;
          if(true)
            break Success751;
        }
        term = term465;
        IStrategoTerm n_160 = null;
        n_160 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_160, extraction.const425);
        if(term == null)
          break Fail1873;
        if(true)
          break Fail1873;
      }
      term = l_160;
      p_160 = l_160;
      o_160 = term;
      term = p_160;
      IStrategoList list144;
      list144 = checkListTail(o_160);
      if(list144 == null)
        break Fail1873;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list144);
      if(true)
        return term;
    }
    return null;
  }
}