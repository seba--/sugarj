package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted299 extends Strategy 
{ 
  TermReference x_226;

  TermReference y_226;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1560:
    { 
      IStrategoTerm a_227 = null;
      IStrategoTerm b_227 = null;
      IStrategoTerm g_227 = null;
      IStrategoTerm h_227 = null;
      a_227 = term;
      if(x_226.value == null)
        break Fail1560;
      term = termFactory.makeTuple(x_226.value, extraction.constSortNoArgs41);
      IStrategoTerm term664 = term;
      Success551:
      { 
        Fail1561:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1561;
          if(true)
            break Success551;
        }
        term = term664;
        IStrategoTerm d_227 = null;
        d_227 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_227, extraction.const503);
        if(term == null)
          break Fail1560;
        if(true)
          break Fail1560;
      }
      term = a_227;
      b_227 = a_227;
      if(y_226.value == null)
        break Fail1560;
      term = termFactory.makeTuple(y_226.value, extraction.constSortNoArgs41);
      IStrategoTerm term665 = term;
      Success552:
      { 
        Fail1562:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1562;
          if(true)
            break Success552;
        }
        term = term665;
        IStrategoTerm f_227 = null;
        f_227 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_227, extraction.const503);
        if(term == null)
          break Fail1560;
        if(true)
          break Fail1560;
      }
      term = b_227;
      h_227 = b_227;
      g_227 = term;
      term = h_227;
      IStrategoList list257;
      list257 = checkListTail(g_227);
      if(list257 == null)
        break Fail1560;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list257);
      if(true)
        return term;
    }
    return null;
  }
}