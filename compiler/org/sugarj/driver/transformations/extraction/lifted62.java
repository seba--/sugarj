package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted62 extends Strategy 
{ 
  TermReference i_98;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2146:
    { 
      IStrategoTerm n_98 = null;
      IStrategoTerm x_98 = null;
      IStrategoTerm y_98 = null;
      n_98 = term;
      if(i_98.value == null)
        break Fail2146;
      term = termFactory.makeTuple(i_98.value, extraction.constSortNoArgs74);
      IStrategoTerm term316 = term;
      Success900:
      { 
        Fail2147:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2147;
          if(true)
            break Success900;
        }
        term = term316;
        IStrategoTerm w_98 = null;
        w_98 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_98, extraction.const343);
        if(term == null)
          break Fail2146;
        if(true)
          break Fail2146;
      }
      term = n_98;
      y_98 = n_98;
      x_98 = term;
      term = y_98;
      IStrategoList list20;
      list20 = checkListTail(x_98);
      if(list20 == null)
        break Fail2146;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list20);
      if(true)
        return term;
    }
    return null;
  }
}