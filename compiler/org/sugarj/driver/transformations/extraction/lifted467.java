package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted467 extends Strategy 
{ 
  TermReference n_323;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1168:
    { 
      IStrategoTerm p_323 = null;
      IStrategoTerm t_323 = null;
      IStrategoTerm u_323 = null;
      p_323 = term;
      if(n_323.value == null)
        break Fail1168;
      term = termFactory.makeTuple(n_323.value, extraction.constSortNoArgs38);
      IStrategoTerm term889 = term;
      Success327:
      { 
        Fail1169:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1169;
          if(true)
            break Success327;
        }
        term = term889;
        IStrategoTerm s_323 = null;
        s_323 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_323, extraction.const634);
        if(term == null)
          break Fail1168;
        if(true)
          break Fail1168;
      }
      term = p_323;
      u_323 = p_323;
      t_323 = term;
      term = u_323;
      IStrategoList list425;
      list425 = checkListTail(t_323);
      if(list425 == null)
        break Fail1168;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs288, list425);
      if(true)
        return term;
    }
    return null;
  }
}