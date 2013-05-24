package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted81 extends Strategy 
{ 
  TermReference w_104;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2108:
    { 
      IStrategoTerm y_104 = null;
      IStrategoTerm c_105 = null;
      IStrategoTerm d_105 = null;
      y_104 = term;
      if(w_104.value == null)
        break Fail2108;
      term = termFactory.makeTuple(w_104.value, extraction.constSortNoArgs233);
      IStrategoTerm term335 = term;
      Success881:
      { 
        Fail2109:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2109;
          if(true)
            break Success881;
        }
        term = term335;
        IStrategoTerm b_105 = null;
        b_105 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_105, extraction.const353);
        if(term == null)
          break Fail2108;
        if(true)
          break Fail2108;
      }
      term = y_104;
      d_105 = y_104;
      c_105 = term;
      term = d_105;
      IStrategoList list39;
      list39 = checkListTail(c_105);
      if(list39 == null)
        break Fail2108;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list39);
      if(true)
        return term;
    }
    return null;
  }
}