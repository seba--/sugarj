package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted343 extends Strategy 
{ 
  TermReference z_249;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1456:
    { 
      IStrategoTerm b_250 = null;
      IStrategoTerm g_250 = null;
      IStrategoTerm h_250 = null;
      b_250 = term;
      if(z_249.value == null)
        break Fail1456;
      term = termFactory.makeTuple(z_249.value, extraction.constSortNoArgs17);
      IStrategoTerm term725 = term;
      Success491:
      { 
        Fail1457:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1457;
          if(true)
            break Success491;
        }
        term = term725;
        IStrategoTerm e_250 = null;
        e_250 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_250, extraction.const24);
        if(term == null)
          break Fail1456;
        if(true)
          break Fail1456;
      }
      term = b_250;
      h_250 = b_250;
      g_250 = term;
      term = h_250;
      IStrategoList list301;
      list301 = checkListTail(g_250);
      if(list301 == null)
        break Fail1456;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list301);
      if(true)
        return term;
    }
    return null;
  }
}