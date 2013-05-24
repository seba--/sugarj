package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted438 extends Strategy 
{ 
  TermReference t_307;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1238:
    { 
      IStrategoTerm v_307 = null;
      IStrategoTerm y_307 = null;
      IStrategoTerm z_307 = null;
      v_307 = term;
      if(t_307.value == null)
        break Fail1238;
      term = termFactory.makeTuple(t_307.value, extraction.constSortNoArgs71);
      IStrategoTerm term848 = term;
      Success368:
      { 
        Fail1239:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1239;
          if(true)
            break Success368;
        }
        term = term848;
        IStrategoTerm x_307 = null;
        x_307 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_307, extraction.const606);
        if(term == null)
          break Fail1238;
        if(true)
          break Fail1238;
      }
      term = v_307;
      z_307 = v_307;
      y_307 = term;
      term = z_307;
      IStrategoList list396;
      list396 = checkListTail(y_307);
      if(list396 == null)
        break Fail1238;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list396);
      if(true)
        return term;
    }
    return null;
  }
}