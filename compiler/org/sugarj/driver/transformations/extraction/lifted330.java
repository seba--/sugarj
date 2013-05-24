package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted330 extends Strategy 
{ 
  TermReference u_242;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1487:
    { 
      IStrategoTerm w_242 = null;
      IStrategoTerm z_242 = null;
      IStrategoTerm a_243 = null;
      w_242 = term;
      if(u_242.value == null)
        break Fail1487;
      term = termFactory.makeTuple(u_242.value, extraction.constSortNoArgs25);
      IStrategoTerm term707 = term;
      Success509:
      { 
        Fail1488:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1488;
          if(true)
            break Success509;
        }
        term = term707;
        IStrategoTerm y_242 = null;
        y_242 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_242, extraction.const522);
        if(term == null)
          break Fail1487;
        if(true)
          break Fail1487;
      }
      term = w_242;
      a_243 = w_242;
      z_242 = term;
      term = a_243;
      IStrategoList list288;
      list288 = checkListTail(z_242);
      if(list288 == null)
        break Fail1487;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs30, list288);
      if(true)
        return term;
    }
    return null;
  }
}