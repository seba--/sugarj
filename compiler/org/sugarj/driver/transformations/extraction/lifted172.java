package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted172 extends Strategy 
{ 
  TermReference s_149;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1906:
    { 
      IStrategoTerm b_150 = null;
      IStrategoTerm i_151 = null;
      IStrategoTerm j_151 = null;
      b_150 = term;
      if(s_149.value == null)
        break Fail1906;
      term = termFactory.makeTuple(s_149.value, extraction.constSortNoArgs6);
      IStrategoTerm term446 = term;
      Success770:
      { 
        Fail1907:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1907;
          if(true)
            break Success770;
        }
        term = term446;
        IStrategoTerm h_151 = null;
        h_151 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_151, extraction.const416);
        if(term == null)
          break Fail1906;
        if(true)
          break Fail1906;
      }
      term = b_150;
      j_151 = b_150;
      i_151 = term;
      term = j_151;
      IStrategoList list130;
      list130 = checkListTail(i_151);
      if(list130 == null)
        break Fail1906;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs150, list130);
      if(true)
        return term;
    }
    return null;
  }
}