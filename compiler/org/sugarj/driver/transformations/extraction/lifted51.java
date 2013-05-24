package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted51 extends Strategy 
{ 
  TermReference w_93;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2169:
    { 
      IStrategoTerm z_93 = null;
      IStrategoTerm g_94 = null;
      IStrategoTerm h_94 = null;
      z_93 = term;
      if(w_93.value == null)
        break Fail2169;
      term = termFactory.makeTuple(w_93.value, extraction.constSort14);
      IStrategoTerm term304 = term;
      Success912:
      { 
        Fail2170:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2170;
          if(true)
            break Success912;
        }
        term = term304;
        IStrategoTerm f_94 = null;
        f_94 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_94, extraction.const335);
        if(term == null)
          break Fail2169;
        if(true)
          break Fail2169;
      }
      term = z_93;
      h_94 = z_93;
      g_94 = term;
      term = h_94;
      IStrategoList list9;
      list9 = checkListTail(g_94);
      if(list9 == null)
        break Fail2169;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs193, list9);
      if(true)
        return term;
    }
    return null;
  }
}