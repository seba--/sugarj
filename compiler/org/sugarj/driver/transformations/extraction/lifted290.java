package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted290 extends Strategy 
{ 
  TermReference b_221;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1588:
    { 
      IStrategoTerm d_221 = null;
      IStrategoTerm h_221 = null;
      IStrategoTerm k_221 = null;
      d_221 = term;
      if(b_221.value == null)
        break Fail1588;
      term = termFactory.makeTuple(b_221.value, extraction.constSortNoArgs179);
      IStrategoTerm term646 = term;
      Success570:
      { 
        Fail1589:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1589;
          if(true)
            break Success570;
        }
        term = term646;
        IStrategoTerm g_221 = null;
        g_221 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_221, extraction.const495);
        if(term == null)
          break Fail1588;
        if(true)
          break Fail1588;
      }
      term = d_221;
      k_221 = d_221;
      h_221 = term;
      term = k_221;
      IStrategoList list248;
      list248 = checkListTail(h_221);
      if(list248 == null)
        break Fail1588;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list248);
      if(true)
        return term;
    }
    return null;
  }
}