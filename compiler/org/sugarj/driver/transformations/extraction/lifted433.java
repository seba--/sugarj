package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted433 extends Strategy 
{ 
  TermReference l_305;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1249:
    { 
      IStrategoTerm n_305 = null;
      IStrategoTerm q_305 = null;
      IStrategoTerm r_305 = null;
      n_305 = term;
      if(l_305.value == null)
        break Fail1249;
      term = termFactory.makeTuple(l_305.value, extraction.constSort48);
      IStrategoTerm term842 = term;
      Success374:
      { 
        Fail1250:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1250;
          if(true)
            break Success374;
        }
        term = term842;
        IStrategoTerm p_305 = null;
        p_305 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_305, extraction.const602);
        if(term == null)
          break Fail1249;
        if(true)
          break Fail1249;
      }
      term = n_305;
      r_305 = n_305;
      q_305 = term;
      term = r_305;
      IStrategoList list391;
      list391 = checkListTail(q_305);
      if(list391 == null)
        break Fail1249;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs63, list391);
      if(true)
        return term;
    }
    return null;
  }
}