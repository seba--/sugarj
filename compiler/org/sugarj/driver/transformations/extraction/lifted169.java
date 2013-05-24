package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted169 extends Strategy 
{ 
  TermReference s_149;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1912:
    { 
      IStrategoTerm y_149 = null;
      IStrategoTerm u_150 = null;
      IStrategoTerm v_150 = null;
      y_149 = term;
      if(s_149.value == null)
        break Fail1912;
      term = termFactory.makeTuple(s_149.value, extraction.constSortNoArgs6);
      IStrategoTerm term443 = term;
      Success773:
      { 
        Fail1913:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1913;
          if(true)
            break Success773;
        }
        term = term443;
        IStrategoTerm t_150 = null;
        t_150 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_150, extraction.const416);
        if(term == null)
          break Fail1912;
        if(true)
          break Fail1912;
      }
      term = y_149;
      v_150 = y_149;
      u_150 = term;
      term = v_150;
      IStrategoList list127;
      list127 = checkListTail(u_150);
      if(list127 == null)
        break Fail1912;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs148, list127);
      if(true)
        return term;
    }
    return null;
  }
}