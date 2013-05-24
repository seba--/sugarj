package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted89 extends Strategy 
{ 
  TermReference o_108;

  TermReference p_108;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2088:
    { 
      IStrategoTerm r_108 = null;
      IStrategoTerm s_108 = null;
      IStrategoTerm x_108 = null;
      IStrategoTerm y_108 = null;
      r_108 = term;
      if(o_108.value == null)
        break Fail2088;
      term = termFactory.makeTuple(o_108.value, extraction.constSortNoArgs14);
      IStrategoTerm term346 = term;
      Success869:
      { 
        Fail2089:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2089;
          if(true)
            break Success869;
        }
        term = term346;
        IStrategoTerm u_108 = null;
        u_108 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_108, extraction.const360);
        if(term == null)
          break Fail2088;
        if(true)
          break Fail2088;
      }
      term = r_108;
      s_108 = r_108;
      if(p_108.value == null)
        break Fail2088;
      term = termFactory.makeTuple(p_108.value, extraction.constSort19);
      IStrategoTerm term347 = term;
      Success870:
      { 
        Fail2090:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2090;
          if(true)
            break Success870;
        }
        term = term347;
        IStrategoTerm w_108 = null;
        w_108 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_108, extraction.const360);
        if(term == null)
          break Fail2088;
        if(true)
          break Fail2088;
      }
      term = s_108;
      y_108 = s_108;
      x_108 = term;
      term = y_108;
      IStrategoList list47;
      list47 = checkListTail(x_108);
      if(list47 == null)
        break Fail2088;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs67, list47);
      if(true)
        return term;
    }
    return null;
  }
}