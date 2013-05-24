package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted63 extends Strategy 
{ 
  TermReference d_99;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2144:
    { 
      IStrategoTerm f_99 = null;
      IStrategoTerm j_99 = null;
      IStrategoTerm k_99 = null;
      f_99 = term;
      if(d_99.value == null)
        break Fail2144;
      term = termFactory.makeTuple(d_99.value, extraction.constSortNoArgs267);
      IStrategoTerm term317 = term;
      Success899:
      { 
        Fail2145:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2145;
          if(true)
            break Success899;
        }
        term = term317;
        IStrategoTerm i_99 = null;
        i_99 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_99, extraction.const344);
        if(term == null)
          break Fail2144;
        if(true)
          break Fail2144;
      }
      term = f_99;
      k_99 = f_99;
      j_99 = term;
      term = k_99;
      IStrategoList list21;
      list21 = checkListTail(j_99);
      if(list21 == null)
        break Fail2144;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list21);
      if(true)
        return term;
    }
    return null;
  }
}