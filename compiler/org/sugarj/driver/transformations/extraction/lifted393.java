package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted393 extends Strategy 
{ 
  TermReference b_277;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1329:
    { 
      IStrategoTerm d_277 = null;
      IStrategoTerm g_277 = null;
      IStrategoTerm h_277 = null;
      d_277 = term;
      if(b_277.value == null)
        break Fail1329;
      term = termFactory.makeTuple(b_277.value, extraction.constSortNoArgs37);
      IStrategoTerm term802 = term;
      Success414:
      { 
        Fail1330:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1330;
          if(true)
            break Success414;
        }
        term = term802;
        IStrategoTerm f_277 = null;
        f_277 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_277, extraction.const567);
        if(term == null)
          break Fail1329;
        if(true)
          break Fail1329;
      }
      term = d_277;
      h_277 = d_277;
      g_277 = term;
      term = h_277;
      IStrategoList list351;
      list351 = checkListTail(g_277);
      if(list351 == null)
        break Fail1329;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs237, list351);
      if(true)
        return term;
    }
    return null;
  }
}