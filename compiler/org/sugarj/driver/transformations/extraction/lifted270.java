package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted270 extends Strategy 
{ 
  TermReference n_209;

  TermReference o_209;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1633:
    { 
      IStrategoTerm q_209 = null;
      IStrategoTerm r_209 = null;
      IStrategoTerm w_209 = null;
      IStrategoTerm x_209 = null;
      q_209 = term;
      if(n_209.value == null)
        break Fail1633;
      term = termFactory.makeTuple(n_209.value, extraction.constSortNoArgs8);
      IStrategoTerm term620 = term;
      Success595:
      { 
        Fail1634:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1634;
          if(true)
            break Success595;
        }
        term = term620;
        IStrategoTerm t_209 = null;
        t_209 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_209, extraction.const476);
        if(term == null)
          break Fail1633;
        if(true)
          break Fail1633;
      }
      term = q_209;
      r_209 = q_209;
      if(o_209.value == null)
        break Fail1633;
      term = termFactory.makeTuple(o_209.value, extraction.constSortNoArgs0);
      IStrategoTerm term621 = term;
      Success596:
      { 
        Fail1635:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1635;
          if(true)
            break Success596;
        }
        term = term621;
        IStrategoTerm v_209 = null;
        v_209 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_209, extraction.const476);
        if(term == null)
          break Fail1633;
        if(true)
          break Fail1633;
      }
      term = r_209;
      x_209 = r_209;
      w_209 = term;
      term = x_209;
      IStrategoList list228;
      list228 = checkListTail(w_209);
      if(list228 == null)
        break Fail1633;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list228);
      if(true)
        return term;
    }
    return null;
  }
}