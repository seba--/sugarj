package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted460 extends Strategy 
{ 
  TermReference b_320;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1183:
    { 
      IStrategoTerm d_320 = null;
      IStrategoTerm g_320 = null;
      IStrategoTerm h_320 = null;
      d_320 = term;
      if(b_320.value == null)
        break Fail1183;
      term = termFactory.makeTuple(b_320.value, extraction.constSortNoArgs71);
      IStrategoTerm term881 = term;
      Success335:
      { 
        Fail1184:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1184;
          if(true)
            break Success335;
        }
        term = term881;
        IStrategoTerm f_320 = null;
        f_320 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_320, extraction.const627);
        if(term == null)
          break Fail1183;
        if(true)
          break Fail1183;
      }
      term = d_320;
      h_320 = d_320;
      g_320 = term;
      term = h_320;
      IStrategoList list418;
      list418 = checkListTail(g_320);
      if(list418 == null)
        break Fail1183;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list418);
      if(true)
        return term;
    }
    return null;
  }
}