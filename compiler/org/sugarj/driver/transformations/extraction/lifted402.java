package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted402 extends Strategy 
{ 
  TermReference n_283;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1307:
    { 
      IStrategoTerm p_283 = null;
      IStrategoTerm t_283 = null;
      IStrategoTerm u_283 = null;
      p_283 = term;
      if(n_283.value == null)
        break Fail1307;
      term = termFactory.makeTuple(n_283.value, extraction.constSortNoArgs31);
      IStrategoTerm term815 = term;
      Success401:
      { 
        Fail1308:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1308;
          if(true)
            break Success401;
        }
        term = term815;
        IStrategoTerm s_283 = null;
        s_283 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_283, extraction.const576);
        if(term == null)
          break Fail1307;
        if(true)
          break Fail1307;
      }
      term = p_283;
      u_283 = p_283;
      t_283 = term;
      term = u_283;
      IStrategoList list360;
      list360 = checkListTail(t_283);
      if(list360 == null)
        break Fail1307;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs60, list360);
      if(true)
        return term;
    }
    return null;
  }
}