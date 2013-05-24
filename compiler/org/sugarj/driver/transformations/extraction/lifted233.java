package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted233 extends Strategy 
{ 
  TermReference p_187;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1756:
    { 
      IStrategoTerm r_187 = null;
      IStrategoTerm u_187 = null;
      IStrategoTerm v_187 = null;
      r_187 = term;
      if(p_187.value == null)
        break Fail1756;
      term = termFactory.makeTuple(p_187.value, extraction.constSortNoArgs8);
      IStrategoTerm term535 = term;
      Success681:
      { 
        Fail1757:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1757;
          if(true)
            break Success681;
        }
        term = term535;
        IStrategoTerm t_187 = null;
        t_187 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_187, extraction.const452);
        if(term == null)
          break Fail1756;
        if(true)
          break Fail1756;
      }
      term = r_187;
      v_187 = r_187;
      u_187 = term;
      term = v_187;
      IStrategoList list191;
      list191 = checkListTail(u_187);
      if(list191 == null)
        break Fail1756;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs169, list191);
      if(true)
        return term;
    }
    return null;
  }
}