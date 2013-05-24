package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted82 extends Strategy 
{ 
  TermReference w_104;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2106:
    { 
      IStrategoTerm z_104 = null;
      IStrategoTerm g_105 = null;
      IStrategoTerm h_105 = null;
      z_104 = term;
      if(w_104.value == null)
        break Fail2106;
      term = termFactory.makeTuple(w_104.value, extraction.constSortNoArgs59);
      IStrategoTerm term336 = term;
      Success880:
      { 
        Fail2107:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2107;
          if(true)
            break Success880;
        }
        term = term336;
        IStrategoTerm f_105 = null;
        f_105 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_105, extraction.const353);
        if(term == null)
          break Fail2106;
        if(true)
          break Fail2106;
      }
      term = z_104;
      h_105 = z_104;
      g_105 = term;
      term = h_105;
      IStrategoList list40;
      list40 = checkListTail(g_105);
      if(list40 == null)
        break Fail2106;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list40);
      if(true)
        return term;
    }
    return null;
  }
}