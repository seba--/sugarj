package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted440 extends Strategy 
{ 
  TermReference y_308;

  TermReference z_308;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1233:
    { 
      IStrategoTerm b_309 = null;
      IStrategoTerm c_309 = null;
      IStrategoTerm h_309 = null;
      IStrategoTerm i_309 = null;
      b_309 = term;
      if(y_308.value == null)
        break Fail1233;
      term = termFactory.makeTuple(y_308.value, extraction.constSortNoArgs71);
      IStrategoTerm term850 = term;
      Success365:
      { 
        Fail1234:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1234;
          if(true)
            break Success365;
        }
        term = term850;
        IStrategoTerm e_309 = null;
        e_309 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_309, extraction.const608);
        if(term == null)
          break Fail1233;
        if(true)
          break Fail1233;
      }
      term = b_309;
      c_309 = b_309;
      if(z_308.value == null)
        break Fail1233;
      term = termFactory.makeTuple(z_308.value, extraction.constSortNoArgs71);
      IStrategoTerm term851 = term;
      Success366:
      { 
        Fail1235:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1235;
          if(true)
            break Success366;
        }
        term = term851;
        IStrategoTerm g_309 = null;
        g_309 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_309, extraction.const608);
        if(term == null)
          break Fail1233;
        if(true)
          break Fail1233;
      }
      term = c_309;
      i_309 = c_309;
      h_309 = term;
      term = i_309;
      IStrategoList list398;
      list398 = checkListTail(h_309);
      if(list398 == null)
        break Fail1233;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list398);
      if(true)
        return term;
    }
    return null;
  }
}