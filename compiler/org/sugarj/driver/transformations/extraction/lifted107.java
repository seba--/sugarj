package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted107 extends Strategy 
{ 
  TermReference s_116;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2050:
    { 
      IStrategoTerm v_116 = null;
      IStrategoTerm d_117 = null;
      IStrategoTerm e_117 = null;
      v_116 = term;
      if(s_116.value == null)
        break Fail2050;
      term = termFactory.makeTuple(s_116.value, extraction.constSortNoArgs6);
      IStrategoTerm term367 = term;
      Success849:
      { 
        Fail2051:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2051;
          if(true)
            break Success849;
        }
        term = term367;
        IStrategoTerm c_117 = null;
        c_117 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_117, extraction.const376);
        if(term == null)
          break Fail2050;
        if(true)
          break Fail2050;
      }
      term = v_116;
      e_117 = v_116;
      d_117 = term;
      term = e_117;
      IStrategoList list65;
      list65 = checkListTail(d_117);
      if(list65 == null)
        break Fail2050;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs148, list65);
      if(true)
        return term;
    }
    return null;
  }
}