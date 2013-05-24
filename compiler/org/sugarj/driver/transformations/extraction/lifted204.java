package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted204 extends Strategy 
{ 
  TermReference r_170;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1833:
    { 
      IStrategoTerm t_170 = null;
      IStrategoTerm x_170 = null;
      IStrategoTerm y_170 = null;
      t_170 = term;
      if(r_170.value == null)
        break Fail1833;
      term = termFactory.makeTuple(r_170.value, extraction.constSortNoArgs11);
      IStrategoTerm term487 = term;
      Success729:
      { 
        Fail1834:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1834;
          if(true)
            break Success729;
        }
        term = term487;
        IStrategoTerm w_170 = null;
        w_170 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_170, extraction.const25);
        if(term == null)
          break Fail1833;
        if(true)
          break Fail1833;
      }
      term = t_170;
      y_170 = t_170;
      x_170 = term;
      term = y_170;
      IStrategoList list162;
      list162 = checkListTail(x_170);
      if(list162 == null)
        break Fail1833;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs18, list162);
      if(true)
        return term;
    }
    return null;
  }
}