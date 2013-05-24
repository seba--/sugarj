package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted127 extends Strategy 
{ 
  TermReference s_125;

  TermReference t_125;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2000:
    { 
      IStrategoTerm v_125 = null;
      IStrategoTerm w_125 = null;
      IStrategoTerm b_126 = null;
      IStrategoTerm c_126 = null;
      v_125 = term;
      if(s_125.value == null)
        break Fail2000;
      term = termFactory.makeTuple(s_125.value, extraction.constSortNoArgs5);
      IStrategoTerm term396 = term;
      Success819:
      { 
        Fail2001:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2001;
          if(true)
            break Success819;
        }
        term = term396;
        IStrategoTerm y_125 = null;
        y_125 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_125, extraction.const161);
        if(term == null)
          break Fail2000;
        if(true)
          break Fail2000;
      }
      term = v_125;
      w_125 = v_125;
      if(t_125.value == null)
        break Fail2000;
      term = termFactory.makeTuple(t_125.value, extraction.constSortNoArgs91);
      IStrategoTerm term397 = term;
      Success820:
      { 
        Fail2002:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2002;
          if(true)
            break Success820;
        }
        term = term397;
        IStrategoTerm a_126 = null;
        a_126 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_126, extraction.const161);
        if(term == null)
          break Fail2000;
        if(true)
          break Fail2000;
      }
      term = w_125;
      c_126 = w_125;
      b_126 = term;
      term = c_126;
      IStrategoList list85;
      list85 = checkListTail(b_126);
      if(list85 == null)
        break Fail2000;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs150, list85);
      if(true)
        return term;
    }
    return null;
  }
}