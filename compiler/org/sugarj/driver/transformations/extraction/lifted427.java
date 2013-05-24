package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted427 extends Strategy 
{ 
  TermReference u_301;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1263:
    { 
      IStrategoTerm y_301 = null;
      IStrategoTerm k_302 = null;
      IStrategoTerm l_302 = null;
      y_301 = term;
      if(u_301.value == null)
        break Fail1263;
      term = termFactory.makeTuple(u_301.value, extraction.constSortNoArgs277);
      IStrategoTerm term834 = term;
      Success382:
      { 
        Fail1264:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1264;
          if(true)
            break Success382;
        }
        term = term834;
        IStrategoTerm j_302 = null;
        j_302 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_302, extraction.const596);
        if(term == null)
          break Fail1263;
        if(true)
          break Fail1263;
      }
      term = y_301;
      l_302 = y_301;
      k_302 = term;
      term = l_302;
      IStrategoList list385;
      list385 = checkListTail(k_302);
      if(list385 == null)
        break Fail1263;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs77, list385);
      if(true)
        return term;
    }
    return null;
  }
}