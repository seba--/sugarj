package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted312 extends Strategy 
{ 
  TermReference s_233;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1530:
    { 
      IStrategoTerm v_233 = null;
      IStrategoTerm j_234 = null;
      IStrategoTerm l_234 = null;
      v_233 = term;
      if(s_233.value == null)
        break Fail1530;
      term = termFactory.makeTuple(s_233.value, extraction.constSortNoArgs40);
      IStrategoTerm term682 = term;
      Success534:
      { 
        Fail1531:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1531;
          if(true)
            break Success534;
        }
        term = term682;
        IStrategoTerm c_234 = null;
        c_234 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_234, extraction.const510);
        if(term == null)
          break Fail1530;
        if(true)
          break Fail1530;
      }
      term = v_233;
      l_234 = v_233;
      j_234 = term;
      term = l_234;
      IStrategoList list270;
      list270 = checkListTail(j_234);
      if(list270 == null)
        break Fail1530;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs41, list270);
      if(true)
        return term;
    }
    return null;
  }
}