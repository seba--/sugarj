package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted388 extends Strategy 
{ 
  TermReference f_274;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1340:
    { 
      IStrategoTerm i_274 = null;
      IStrategoTerm q_274 = null;
      IStrategoTerm r_274 = null;
      i_274 = term;
      if(f_274.value == null)
        break Fail1340;
      term = termFactory.makeTuple(f_274.value, extraction.constSortNoArgs37);
      IStrategoTerm term796 = term;
      Success420:
      { 
        Fail1341:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1341;
          if(true)
            break Success420;
        }
        term = term796;
        IStrategoTerm p_274 = null;
        p_274 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_274, extraction.const563);
        if(term == null)
          break Fail1340;
        if(true)
          break Fail1340;
      }
      term = i_274;
      r_274 = i_274;
      q_274 = term;
      term = r_274;
      IStrategoList list346;
      list346 = checkListTail(q_274);
      if(list346 == null)
        break Fail1340;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs279, list346);
      if(true)
        return term;
    }
    return null;
  }
}