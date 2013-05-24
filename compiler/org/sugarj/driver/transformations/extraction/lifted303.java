package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted303 extends Strategy 
{ 
  TermReference n_228;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1552:
    { 
      IStrategoTerm p_228 = null;
      IStrategoTerm s_228 = null;
      IStrategoTerm t_228 = null;
      p_228 = term;
      if(n_228.value == null)
        break Fail1552;
      term = termFactory.makeTuple(n_228.value, extraction.constSortNoArgs51);
      IStrategoTerm term669 = term;
      Success547:
      { 
        Fail1553:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1553;
          if(true)
            break Success547;
        }
        term = term669;
        IStrategoTerm r_228 = null;
        r_228 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_228, extraction.const505);
        if(term == null)
          break Fail1552;
        if(true)
          break Fail1552;
      }
      term = p_228;
      t_228 = p_228;
      s_228 = term;
      term = t_228;
      IStrategoList list261;
      list261 = checkListTail(s_228);
      if(list261 == null)
        break Fail1552;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list261);
      if(true)
        return term;
    }
    return null;
  }
}