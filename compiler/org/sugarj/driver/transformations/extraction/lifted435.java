package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted435 extends Strategy 
{ 
  TermReference p_306;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1243:
    { 
      IStrategoTerm r_306 = null;
      IStrategoTerm u_306 = null;
      IStrategoTerm v_306 = null;
      r_306 = term;
      if(p_306.value == null)
        break Fail1243;
      term = termFactory.makeTuple(p_306.value, extraction.constSortNoArgs71);
      IStrategoTerm term846 = term;
      Success370:
      { 
        Fail1244:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1244;
          if(true)
            break Success370;
        }
        term = term846;
        IStrategoTerm t_306 = null;
        t_306 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_306, extraction.const603);
        if(term == null)
          break Fail1243;
        if(true)
          break Fail1243;
      }
      term = r_306;
      v_306 = r_306;
      u_306 = term;
      term = v_306;
      IStrategoList list393;
      list393 = checkListTail(u_306);
      if(list393 == null)
        break Fail1243;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list393);
      if(true)
        return term;
    }
    return null;
  }
}