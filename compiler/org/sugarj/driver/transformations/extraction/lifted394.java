package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted394 extends Strategy 
{ 
  TermReference o_277;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1327:
    { 
      IStrategoTerm q_277 = null;
      IStrategoTerm t_277 = null;
      IStrategoTerm u_277 = null;
      q_277 = term;
      if(o_277.value == null)
        break Fail1327;
      term = termFactory.makeTuple(o_277.value, extraction.constSortNoArgs37);
      IStrategoTerm term803 = term;
      Success413:
      { 
        Fail1328:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1328;
          if(true)
            break Success413;
        }
        term = term803;
        IStrategoTerm s_277 = null;
        s_277 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_277, extraction.const568);
        if(term == null)
          break Fail1327;
        if(true)
          break Fail1327;
      }
      term = q_277;
      u_277 = q_277;
      t_277 = term;
      term = u_277;
      IStrategoList list352;
      list352 = checkListTail(t_277);
      if(list352 == null)
        break Fail1327;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list352);
      if(true)
        return term;
    }
    return null;
  }
}