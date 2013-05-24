package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted392 extends Strategy 
{ 
  TermReference q_276;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1331:
    { 
      IStrategoTerm s_276 = null;
      IStrategoTerm v_276 = null;
      IStrategoTerm w_276 = null;
      s_276 = term;
      if(q_276.value == null)
        break Fail1331;
      term = termFactory.makeTuple(q_276.value, extraction.constSortNoArgs36);
      IStrategoTerm term801 = term;
      Success415:
      { 
        Fail1332:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1332;
          if(true)
            break Success415;
        }
        term = term801;
        IStrategoTerm u_276 = null;
        u_276 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_276, extraction.const566);
        if(term == null)
          break Fail1331;
        if(true)
          break Fail1331;
      }
      term = s_276;
      w_276 = s_276;
      v_276 = term;
      term = w_276;
      IStrategoList list350;
      list350 = checkListTail(v_276);
      if(list350 == null)
        break Fail1331;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs237, list350);
      if(true)
        return term;
    }
    return null;
  }
}