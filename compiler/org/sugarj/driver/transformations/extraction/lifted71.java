package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted71 extends Strategy 
{ 
  TermReference r_101;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2128:
    { 
      IStrategoTerm t_101 = null;
      IStrategoTerm x_101 = null;
      IStrategoTerm y_101 = null;
      t_101 = term;
      if(r_101.value == null)
        break Fail2128;
      term = termFactory.makeTuple(r_101.value, extraction.constSortNoArgs247);
      IStrategoTerm term325 = term;
      Success891:
      { 
        Fail2129:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2129;
          if(true)
            break Success891;
        }
        term = term325;
        IStrategoTerm w_101 = null;
        w_101 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_101, extraction.const348);
        if(term == null)
          break Fail2128;
        if(true)
          break Fail2128;
      }
      term = t_101;
      y_101 = t_101;
      x_101 = term;
      term = y_101;
      IStrategoList list29;
      list29 = checkListTail(x_101);
      if(list29 == null)
        break Fail2128;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list29);
      if(true)
        return term;
    }
    return null;
  }
}