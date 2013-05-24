package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted459 extends Strategy 
{ 
  TermReference p_319;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1185:
    { 
      IStrategoTerm r_319 = null;
      IStrategoTerm u_319 = null;
      IStrategoTerm v_319 = null;
      r_319 = term;
      if(p_319.value == null)
        break Fail1185;
      term = termFactory.makeTuple(p_319.value, extraction.constSortNoArgs71);
      IStrategoTerm term880 = term;
      Success336:
      { 
        Fail1186:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1186;
          if(true)
            break Success336;
        }
        term = term880;
        IStrategoTerm t_319 = null;
        t_319 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_319, extraction.const626);
        if(term == null)
          break Fail1185;
        if(true)
          break Fail1185;
      }
      term = r_319;
      v_319 = r_319;
      u_319 = term;
      term = v_319;
      IStrategoList list417;
      list417 = checkListTail(u_319);
      if(list417 == null)
        break Fail1185;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list417);
      if(true)
        return term;
    }
    return null;
  }
}