package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted279 extends Strategy 
{ 
  TermReference t_213;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1614:
    { 
      IStrategoTerm v_213 = null;
      IStrategoTerm y_213 = null;
      IStrategoTerm z_213 = null;
      v_213 = term;
      if(t_213.value == null)
        break Fail1614;
      term = termFactory.makeTuple(t_213.value, extraction.constSortNoArgs17);
      IStrategoTerm term631 = term;
      Success585:
      { 
        Fail1615:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1615;
          if(true)
            break Success585;
        }
        term = term631;
        IStrategoTerm x_213 = null;
        x_213 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_213, extraction.const485);
        if(term == null)
          break Fail1614;
        if(true)
          break Fail1614;
      }
      term = v_213;
      z_213 = v_213;
      y_213 = term;
      term = z_213;
      IStrategoList list237;
      list237 = checkListTail(y_213);
      if(list237 == null)
        break Fail1614;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list237);
      if(true)
        return term;
    }
    return null;
  }
}