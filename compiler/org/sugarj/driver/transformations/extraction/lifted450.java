package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted450 extends Strategy 
{ 
  TermReference b_315;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1205:
    { 
      IStrategoTerm d_315 = null;
      IStrategoTerm g_315 = null;
      IStrategoTerm h_315 = null;
      d_315 = term;
      if(b_315.value == null)
        break Fail1205;
      term = termFactory.makeTuple(b_315.value, extraction.constSortNoArgs293);
      IStrategoTerm term869 = term;
      Success347:
      { 
        Fail1206:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1206;
          if(true)
            break Success347;
        }
        term = term869;
        IStrategoTerm f_315 = null;
        f_315 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_315, extraction.const618);
        if(term == null)
          break Fail1205;
        if(true)
          break Fail1205;
      }
      term = d_315;
      h_315 = d_315;
      g_315 = term;
      term = h_315;
      IStrategoList list408;
      list408 = checkListTail(g_315);
      if(list408 == null)
        break Fail1205;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs67, list408);
      if(true)
        return term;
    }
    return null;
  }
}