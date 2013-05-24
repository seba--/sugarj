package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted78 extends Strategy 
{ 
  TermReference n_103;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2114:
    { 
      IStrategoTerm q_103 = null;
      IStrategoTerm x_103 = null;
      IStrategoTerm z_103 = null;
      q_103 = term;
      if(n_103.value == null)
        break Fail2114;
      term = termFactory.makeTuple(n_103.value, extraction.constSortNoArgs59);
      IStrategoTerm term332 = term;
      Success884:
      { 
        Fail2115:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2115;
          if(true)
            break Success884;
        }
        term = term332;
        IStrategoTerm w_103 = null;
        w_103 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_103, extraction.const351);
        if(term == null)
          break Fail2114;
        if(true)
          break Fail2114;
      }
      term = q_103;
      z_103 = q_103;
      x_103 = term;
      term = z_103;
      IStrategoList list36;
      list36 = checkListTail(x_103);
      if(list36 == null)
        break Fail2114;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list36);
      if(true)
        return term;
    }
    return null;
  }
}