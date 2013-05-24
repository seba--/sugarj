package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted397 extends Strategy 
{ 
  TermReference w_279;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1318:
    { 
      IStrategoTerm y_279 = null;
      IStrategoTerm d_280 = null;
      IStrategoTerm e_280 = null;
      y_279 = term;
      if(w_279.value == null)
        break Fail1318;
      term = termFactory.makeTuple(w_279.value, extraction.constSortNoArgs72);
      IStrategoTerm term809 = term;
      Success407:
      { 
        Fail1319:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1319;
          if(true)
            break Success407;
        }
        term = term809;
        IStrategoTerm c_280 = null;
        c_280 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_280, extraction.const571);
        if(term == null)
          break Fail1318;
        if(true)
          break Fail1318;
      }
      term = y_279;
      e_280 = y_279;
      d_280 = term;
      term = e_280;
      IStrategoList list355;
      list355 = checkListTail(d_280);
      if(list355 == null)
        break Fail1318;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list355);
      if(true)
        return term;
    }
    return null;
  }
}