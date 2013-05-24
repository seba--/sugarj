package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted218 extends Strategy 
{ 
  TermReference n_178;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1798:
    { 
      IStrategoTerm p_178 = null;
      IStrategoTerm x_178 = null;
      IStrategoTerm y_178 = null;
      p_178 = term;
      if(n_178.value == null)
        break Fail1798;
      term = termFactory.makeTuple(n_178.value, extraction.constSortNoArgs41);
      IStrategoTerm term508 = term;
      Success708:
      { 
        Fail1799:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1799;
          if(true)
            break Success708;
        }
        term = term508;
        IStrategoTerm w_178 = null;
        w_178 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_178, extraction.const113);
        if(term == null)
          break Fail1798;
        if(true)
          break Fail1798;
      }
      term = p_178;
      y_178 = p_178;
      x_178 = term;
      term = y_178;
      IStrategoList list176;
      list176 = checkListTail(x_178);
      if(list176 == null)
        break Fail1798;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs102, list176);
      if(true)
        return term;
    }
    return null;
  }
}