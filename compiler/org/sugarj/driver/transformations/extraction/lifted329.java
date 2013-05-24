package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted329 extends Strategy 
{ 
  TermReference j_242;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1489:
    { 
      IStrategoTerm l_242 = null;
      IStrategoTerm o_242 = null;
      IStrategoTerm p_242 = null;
      l_242 = term;
      if(j_242.value == null)
        break Fail1489;
      term = termFactory.makeTuple(j_242.value, extraction.constSort41);
      IStrategoTerm term706 = term;
      Success510:
      { 
        Fail1490:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1490;
          if(true)
            break Success510;
        }
        term = term706;
        IStrategoTerm n_242 = null;
        n_242 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_242, extraction.const521);
        if(term == null)
          break Fail1489;
        if(true)
          break Fail1489;
      }
      term = l_242;
      p_242 = l_242;
      o_242 = term;
      term = p_242;
      IStrategoList list287;
      list287 = checkListTail(o_242);
      if(list287 == null)
        break Fail1489;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs211, list287);
      if(true)
        return term;
    }
    return null;
  }
}