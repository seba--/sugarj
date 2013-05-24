package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted56 extends Strategy 
{ 
  TermReference x_95;

  TermReference y_95;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2158:
    { 
      IStrategoTerm a_96 = null;
      IStrategoTerm b_96 = null;
      IStrategoTerm g_96 = null;
      IStrategoTerm h_96 = null;
      a_96 = term;
      if(x_95.value == null)
        break Fail2158;
      term = termFactory.makeTuple(x_95.value, extraction.constSortNoArgs84);
      IStrategoTerm term309 = term;
      Success906:
      { 
        Fail2159:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2159;
          if(true)
            break Success906;
        }
        term = term309;
        IStrategoTerm d_96 = null;
        d_96 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_96, extraction.const338);
        if(term == null)
          break Fail2158;
        if(true)
          break Fail2158;
      }
      term = a_96;
      b_96 = a_96;
      if(y_95.value == null)
        break Fail2158;
      term = termFactory.makeTuple(y_95.value, extraction.constSortNoArgs84);
      IStrategoTerm term310 = term;
      Success907:
      { 
        Fail2160:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2160;
          if(true)
            break Success907;
        }
        term = term310;
        IStrategoTerm f_96 = null;
        f_96 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_96, extraction.const338);
        if(term == null)
          break Fail2158;
        if(true)
          break Fail2158;
      }
      term = b_96;
      h_96 = b_96;
      g_96 = term;
      term = h_96;
      IStrategoList list14;
      list14 = checkListTail(g_96);
      if(list14 == null)
        break Fail2158;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs85, list14);
      if(true)
        return term;
    }
    return null;
  }
}