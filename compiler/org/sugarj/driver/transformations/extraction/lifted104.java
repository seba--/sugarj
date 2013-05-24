package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted104 extends Strategy 
{ 
  TermReference s_115;

  TermReference t_115;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2056:
    { 
      IStrategoTerm v_115 = null;
      IStrategoTerm w_115 = null;
      IStrategoTerm b_116 = null;
      IStrategoTerm c_116 = null;
      v_115 = term;
      if(s_115.value == null)
        break Fail2056;
      term = termFactory.makeTuple(s_115.value, extraction.constSortNoArgs14);
      IStrategoTerm term363 = term;
      Success852:
      { 
        Fail2057:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2057;
          if(true)
            break Success852;
        }
        term = term363;
        IStrategoTerm y_115 = null;
        y_115 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_115, extraction.const374);
        if(term == null)
          break Fail2056;
        if(true)
          break Fail2056;
      }
      term = v_115;
      w_115 = v_115;
      if(t_115.value == null)
        break Fail2056;
      term = termFactory.makeTuple(t_115.value, extraction.constSort23);
      IStrategoTerm term364 = term;
      Success853:
      { 
        Fail2058:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2058;
          if(true)
            break Success853;
        }
        term = term364;
        IStrategoTerm a_116 = null;
        a_116 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_116, extraction.const374);
        if(term == null)
          break Fail2056;
        if(true)
          break Fail2056;
      }
      term = w_115;
      c_116 = w_115;
      b_116 = term;
      term = c_116;
      IStrategoList list62;
      list62 = checkListTail(b_116);
      if(list62 == null)
        break Fail2056;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs67, list62);
      if(true)
        return term;
    }
    return null;
  }
}