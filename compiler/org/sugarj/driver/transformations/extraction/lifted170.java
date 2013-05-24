package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted170 extends Strategy 
{ 
  TermReference s_149;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1910:
    { 
      IStrategoTerm z_149 = null;
      IStrategoTerm y_150 = null;
      IStrategoTerm z_150 = null;
      z_149 = term;
      if(s_149.value == null)
        break Fail1910;
      term = termFactory.makeTuple(s_149.value, extraction.constSortNoArgs6);
      IStrategoTerm term444 = term;
      Success772:
      { 
        Fail1911:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1911;
          if(true)
            break Success772;
        }
        term = term444;
        IStrategoTerm x_150 = null;
        x_150 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_150, extraction.const416);
        if(term == null)
          break Fail1910;
        if(true)
          break Fail1910;
      }
      term = z_149;
      z_150 = z_149;
      y_150 = term;
      term = z_150;
      IStrategoList list128;
      list128 = checkListTail(y_150);
      if(list128 == null)
        break Fail1910;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs148, list128);
      if(true)
        return term;
    }
    return null;
  }
}