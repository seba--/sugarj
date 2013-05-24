package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted342 extends Strategy 
{ 
  TermReference o_249;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1458:
    { 
      IStrategoTerm q_249 = null;
      IStrategoTerm t_249 = null;
      IStrategoTerm u_249 = null;
      q_249 = term;
      if(o_249.value == null)
        break Fail1458;
      term = termFactory.makeTuple(o_249.value, extraction.constSortNoArgs10);
      IStrategoTerm term724 = term;
      Success492:
      { 
        Fail1459:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1459;
          if(true)
            break Success492;
        }
        term = term724;
        IStrategoTerm s_249 = null;
        s_249 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_249, extraction.const17);
        if(term == null)
          break Fail1458;
        if(true)
          break Fail1458;
      }
      term = q_249;
      u_249 = q_249;
      t_249 = term;
      term = u_249;
      IStrategoList list300;
      list300 = checkListTail(t_249);
      if(list300 == null)
        break Fail1458;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list300);
      if(true)
        return term;
    }
    return null;
  }
}