package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted109 extends Strategy 
{ 
  TermReference n_117;

  TermReference o_117;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2045:
    { 
      IStrategoTerm q_117 = null;
      IStrategoTerm r_117 = null;
      IStrategoTerm w_117 = null;
      IStrategoTerm x_117 = null;
      q_117 = term;
      if(n_117.value == null)
        break Fail2045;
      term = termFactory.makeTuple(n_117.value, extraction.constSortNoArgs6);
      IStrategoTerm term369 = term;
      Success846:
      { 
        Fail2046:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2046;
          if(true)
            break Success846;
        }
        term = term369;
        IStrategoTerm t_117 = null;
        t_117 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_117, extraction.const377);
        if(term == null)
          break Fail2045;
        if(true)
          break Fail2045;
      }
      term = q_117;
      r_117 = q_117;
      if(o_117.value == null)
        break Fail2045;
      term = termFactory.makeTuple(o_117.value, extraction.constSortNoArgs309);
      IStrategoTerm term370 = term;
      Success847:
      { 
        Fail2047:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2047;
          if(true)
            break Success847;
        }
        term = term370;
        IStrategoTerm v_117 = null;
        v_117 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_117, extraction.const377);
        if(term == null)
          break Fail2045;
        if(true)
          break Fail2045;
      }
      term = r_117;
      x_117 = r_117;
      w_117 = term;
      term = x_117;
      IStrategoList list67;
      list67 = checkListTail(w_117);
      if(list67 == null)
        break Fail2045;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs148, list67);
      if(true)
        return term;
    }
    return null;
  }
}