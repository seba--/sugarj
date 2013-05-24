package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted451 extends Strategy 
{ 
  TermReference n_315;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1203:
    { 
      IStrategoTerm p_315 = null;
      IStrategoTerm s_315 = null;
      IStrategoTerm t_315 = null;
      p_315 = term;
      if(n_315.value == null)
        break Fail1203;
      term = termFactory.makeTuple(n_315.value, extraction.constSortNoArgs34);
      IStrategoTerm term870 = term;
      Success346:
      { 
        Fail1204:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1204;
          if(true)
            break Success346;
        }
        term = term870;
        IStrategoTerm r_315 = null;
        r_315 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_315, extraction.const619);
        if(term == null)
          break Fail1203;
        if(true)
          break Fail1203;
      }
      term = p_315;
      t_315 = p_315;
      s_315 = term;
      term = t_315;
      IStrategoList list409;
      list409 = checkListTail(s_315);
      if(list409 == null)
        break Fail1203;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs16, list409);
      if(true)
        return term;
    }
    return null;
  }
}