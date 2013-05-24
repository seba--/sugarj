package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted328 extends Strategy 
{ 
  TermReference v_241;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1491:
    { 
      IStrategoTerm x_241 = null;
      IStrategoTerm b_242 = null;
      IStrategoTerm c_242 = null;
      x_241 = term;
      if(v_241.value == null)
        break Fail1491;
      term = termFactory.makeTuple(v_241.value, extraction.constSort31);
      IStrategoTerm term705 = term;
      Success511:
      { 
        Fail1492:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1492;
          if(true)
            break Success511;
        }
        term = term705;
        IStrategoTerm a_242 = null;
        a_242 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_242, extraction.const520);
        if(term == null)
          break Fail1491;
        if(true)
          break Fail1491;
      }
      term = x_241;
      c_242 = x_241;
      b_242 = term;
      term = c_242;
      IStrategoList list286;
      list286 = checkListTail(b_242);
      if(list286 == null)
        break Fail1491;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs211, list286);
      if(true)
        return term;
    }
    return null;
  }
}