package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted178 extends Strategy 
{ 
  TermReference r_155;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1890:
    { 
      IStrategoTerm t_155 = null;
      IStrategoTerm w_155 = null;
      IStrategoTerm x_155 = null;
      t_155 = term;
      if(r_155.value == null)
        break Fail1890;
      term = termFactory.makeTuple(r_155.value, extraction.constSortNoArgs2);
      IStrategoTerm term456 = term;
      Success760:
      { 
        Fail1891:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1891;
          if(true)
            break Success760;
        }
        term = term456;
        IStrategoTerm v_155 = null;
        v_155 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_155, extraction.const126);
        if(term == null)
          break Fail1890;
        if(true)
          break Fail1890;
      }
      term = t_155;
      x_155 = t_155;
      w_155 = term;
      term = x_155;
      IStrategoList list136;
      list136 = checkListTail(w_155);
      if(list136 == null)
        break Fail1890;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs91, list136);
      if(true)
        return term;
    }
    return null;
  }
}