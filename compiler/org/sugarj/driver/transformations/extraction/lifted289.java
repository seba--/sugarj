package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted289 extends Strategy 
{ 
  TermReference p_220;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1590:
    { 
      IStrategoTerm r_220 = null;
      IStrategoTerm v_220 = null;
      IStrategoTerm w_220 = null;
      r_220 = term;
      if(p_220.value == null)
        break Fail1590;
      term = termFactory.makeTuple(p_220.value, extraction.constSortNoArgs201);
      IStrategoTerm term645 = term;
      Success571:
      { 
        Fail1591:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1591;
          if(true)
            break Success571;
        }
        term = term645;
        IStrategoTerm u_220 = null;
        u_220 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_220, extraction.const494);
        if(term == null)
          break Fail1590;
        if(true)
          break Fail1590;
      }
      term = r_220;
      w_220 = r_220;
      v_220 = term;
      term = w_220;
      IStrategoList list247;
      list247 = checkListTail(v_220);
      if(list247 == null)
        break Fail1590;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list247);
      if(true)
        return term;
    }
    return null;
  }
}