package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted369 extends Strategy 
{ 
  TermReference t_265;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1382:
    { 
      IStrategoTerm v_265 = null;
      IStrategoTerm y_265 = null;
      IStrategoTerm z_265 = null;
      v_265 = term;
      if(t_265.value == null)
        break Fail1382;
      term = termFactory.makeTuple(t_265.value, extraction.constSortNoArgs22);
      IStrategoTerm term773 = term;
      Success443:
      { 
        Fail1383:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1383;
          if(true)
            break Success443;
        }
        term = term773;
        IStrategoTerm x_265 = null;
        x_265 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_265, extraction.const550);
        if(term == null)
          break Fail1382;
        if(true)
          break Fail1382;
      }
      term = v_265;
      z_265 = v_265;
      y_265 = term;
      term = z_265;
      IStrategoList list327;
      list327 = checkListTail(y_265);
      if(list327 == null)
        break Fail1382;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list327);
      if(true)
        return term;
    }
    return null;
  }
}