package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted115 extends Strategy 
{ 
  TermReference p_121;

  TermReference q_121;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2020:
    { 
      IStrategoTerm t_121 = null;
      IStrategoTerm u_121 = null;
      IStrategoTerm a_122 = null;
      IStrategoTerm b_122 = null;
      t_121 = term;
      if(p_121.value == null)
        break Fail2020;
      term = termFactory.makeTuple(p_121.value, extraction.constSortNoArgs6);
      IStrategoTerm term388 = term;
      Success827:
      { 
        Fail2021:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2021;
          if(true)
            break Success827;
        }
        term = term388;
        IStrategoTerm x_121 = null;
        x_121 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_121, extraction.const380);
        if(term == null)
          break Fail2020;
        if(true)
          break Fail2020;
      }
      term = t_121;
      u_121 = t_121;
      if(q_121.value == null)
        break Fail2020;
      term = termFactory.makeTuple(q_121.value, extraction.constSortNoArgs309);
      IStrategoTerm term389 = term;
      Success828:
      { 
        Fail2022:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2022;
          if(true)
            break Success828;
        }
        term = term389;
        IStrategoTerm z_121 = null;
        z_121 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_121, extraction.const380);
        if(term == null)
          break Fail2020;
        if(true)
          break Fail2020;
      }
      term = u_121;
      b_122 = u_121;
      a_122 = term;
      term = b_122;
      IStrategoList list73;
      list73 = checkListTail(a_122);
      if(list73 == null)
        break Fail2020;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs148, list73);
      if(true)
        return term;
    }
    return null;
  }
}