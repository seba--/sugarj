package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted231 extends Strategy 
{ 
  TermReference n_186;

  TermReference o_186;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1760:
    { 
      IStrategoTerm q_186 = null;
      IStrategoTerm r_186 = null;
      IStrategoTerm w_186 = null;
      IStrategoTerm z_186 = null;
      q_186 = term;
      if(n_186.value == null)
        break Fail1760;
      term = termFactory.makeTuple(n_186.value, extraction.constSortNoArgs8);
      IStrategoTerm term532 = term;
      Success683:
      { 
        Fail1761:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1761;
          if(true)
            break Success683;
        }
        term = term532;
        IStrategoTerm t_186 = null;
        t_186 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_186, extraction.const451);
        if(term == null)
          break Fail1760;
        if(true)
          break Fail1760;
      }
      term = q_186;
      r_186 = q_186;
      if(o_186.value == null)
        break Fail1760;
      term = termFactory.makeTuple(o_186.value, extraction.constSortNoArgs41);
      IStrategoTerm term533 = term;
      Success684:
      { 
        Fail1762:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1762;
          if(true)
            break Success684;
        }
        term = term533;
        IStrategoTerm v_186 = null;
        v_186 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_186, extraction.const451);
        if(term == null)
          break Fail1760;
        if(true)
          break Fail1760;
      }
      term = r_186;
      z_186 = r_186;
      w_186 = term;
      term = z_186;
      IStrategoList list189;
      list189 = checkListTail(w_186);
      if(list189 == null)
        break Fail1760;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs101, list189);
      if(true)
        return term;
    }
    return null;
  }
}