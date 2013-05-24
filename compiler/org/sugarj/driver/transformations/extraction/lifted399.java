package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted399 extends Strategy 
{ 
  TermReference z_280;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1314:
    { 
      IStrategoTerm b_281 = null;
      IStrategoTerm e_281 = null;
      IStrategoTerm f_281 = null;
      b_281 = term;
      if(z_280.value == null)
        break Fail1314;
      term = termFactory.makeTuple(z_280.value, extraction.constSortNoArgs72);
      IStrategoTerm term811 = term;
      Success405:
      { 
        Fail1315:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1315;
          if(true)
            break Success405;
        }
        term = term811;
        IStrategoTerm d_281 = null;
        d_281 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_281, extraction.const573);
        if(term == null)
          break Fail1314;
        if(true)
          break Fail1314;
      }
      term = b_281;
      f_281 = b_281;
      e_281 = term;
      term = f_281;
      IStrategoList list357;
      list357 = checkListTail(e_281);
      if(list357 == null)
        break Fail1314;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list357);
      if(true)
        return term;
    }
    return null;
  }
}