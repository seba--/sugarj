package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted173 extends Strategy 
{ 
  TermReference p_151;

  TermReference q_151;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1903:
    { 
      IStrategoTerm u_151 = null;
      IStrategoTerm v_151 = null;
      IStrategoTerm w_152 = null;
      IStrategoTerm x_152 = null;
      u_151 = term;
      if(p_151.value == null)
        break Fail1903;
      term = termFactory.makeTuple(p_151.value, extraction.constSortNoArgs91);
      IStrategoTerm term447 = term;
      Success768:
      { 
        Fail1904:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1904;
          if(true)
            break Success768;
        }
        term = term447;
        IStrategoTerm p_152 = null;
        p_152 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_152, extraction.const417);
        if(term == null)
          break Fail1903;
        if(true)
          break Fail1903;
      }
      term = u_151;
      v_151 = u_151;
      if(q_151.value == null)
        break Fail1903;
      term = termFactory.makeTuple(q_151.value, extraction.constSortNoArgs141);
      IStrategoTerm term448 = term;
      Success769:
      { 
        Fail1905:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1905;
          if(true)
            break Success769;
        }
        term = term448;
        IStrategoTerm r_152 = null;
        r_152 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_152, extraction.const417);
        if(term == null)
          break Fail1903;
        if(true)
          break Fail1903;
      }
      term = v_151;
      x_152 = v_151;
      w_152 = term;
      term = x_152;
      IStrategoList list131;
      list131 = checkListTail(w_152);
      if(list131 == null)
        break Fail1903;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs144, list131);
      if(true)
        return term;
    }
    return null;
  }
}