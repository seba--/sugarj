package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted106 extends Strategy 
{ 
  TermReference s_116;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2052:
    { 
      IStrategoTerm u_116 = null;
      IStrategoTerm z_116 = null;
      IStrategoTerm a_117 = null;
      u_116 = term;
      if(s_116.value == null)
        break Fail2052;
      term = termFactory.makeTuple(s_116.value, extraction.constSortNoArgs6);
      IStrategoTerm term366 = term;
      Success850:
      { 
        Fail2053:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2053;
          if(true)
            break Success850;
        }
        term = term366;
        IStrategoTerm y_116 = null;
        y_116 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_116, extraction.const376);
        if(term == null)
          break Fail2052;
        if(true)
          break Fail2052;
      }
      term = u_116;
      a_117 = u_116;
      z_116 = term;
      term = a_117;
      IStrategoList list64;
      list64 = checkListTail(z_116);
      if(list64 == null)
        break Fail2052;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs148, list64);
      if(true)
        return term;
    }
    return null;
  }
}