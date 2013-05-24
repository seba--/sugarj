package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted108 extends Strategy 
{ 
  TermReference s_116;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2048:
    { 
      IStrategoTerm w_116 = null;
      IStrategoTerm h_117 = null;
      IStrategoTerm i_117 = null;
      w_116 = term;
      if(s_116.value == null)
        break Fail2048;
      term = termFactory.makeTuple(s_116.value, extraction.constSortNoArgs6);
      IStrategoTerm term368 = term;
      Success848:
      { 
        Fail2049:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2049;
          if(true)
            break Success848;
        }
        term = term368;
        IStrategoTerm g_117 = null;
        g_117 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_117, extraction.const376);
        if(term == null)
          break Fail2048;
        if(true)
          break Fail2048;
      }
      term = w_116;
      i_117 = w_116;
      h_117 = term;
      term = i_117;
      IStrategoList list66;
      list66 = checkListTail(h_117);
      if(list66 == null)
        break Fail2048;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list66);
      if(true)
        return term;
    }
    return null;
  }
}