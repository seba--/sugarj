package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted69 extends Strategy 
{ 
  TermReference z_100;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2132:
    { 
      IStrategoTerm b_101 = null;
      IStrategoTerm f_101 = null;
      IStrategoTerm g_101 = null;
      b_101 = term;
      if(z_100.value == null)
        break Fail2132;
      term = termFactory.makeTuple(z_100.value, extraction.constSortNoArgs267);
      IStrategoTerm term323 = term;
      Success893:
      { 
        Fail2133:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2133;
          if(true)
            break Success893;
        }
        term = term323;
        IStrategoTerm e_101 = null;
        e_101 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_101, extraction.const347);
        if(term == null)
          break Fail2132;
        if(true)
          break Fail2132;
      }
      term = b_101;
      g_101 = b_101;
      f_101 = term;
      term = g_101;
      IStrategoList list27;
      list27 = checkListTail(f_101);
      if(list27 == null)
        break Fail2132;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list27);
      if(true)
        return term;
    }
    return null;
  }
}