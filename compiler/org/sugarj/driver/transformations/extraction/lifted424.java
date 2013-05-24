package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted424 extends Strategy 
{ 
  TermReference j_301;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1269:
    { 
      IStrategoTerm l_301 = null;
      IStrategoTerm o_301 = null;
      IStrategoTerm p_301 = null;
      l_301 = term;
      if(j_301.value == null)
        break Fail1269;
      term = termFactory.makeTuple(j_301.value, extraction.constSortNoArgs75);
      IStrategoTerm term831 = term;
      Success385:
      { 
        Fail1270:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1270;
          if(true)
            break Success385;
        }
        term = term831;
        IStrategoTerm n_301 = null;
        n_301 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_301, extraction.const594);
        if(term == null)
          break Fail1269;
        if(true)
          break Fail1269;
      }
      term = l_301;
      p_301 = l_301;
      o_301 = term;
      term = p_301;
      IStrategoList list382;
      list382 = checkListTail(o_301);
      if(list382 == null)
        break Fail1269;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs115, list382);
      if(true)
        return term;
    }
    return null;
  }
}