package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted91 extends Strategy 
{ 
  TermReference r_109;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2084:
    { 
      IStrategoTerm t_109 = null;
      IStrategoTerm w_109 = null;
      IStrategoTerm x_109 = null;
      t_109 = term;
      if(r_109.value == null)
        break Fail2084;
      term = termFactory.makeTuple(r_109.value, extraction.constSortNoArgs91);
      IStrategoTerm term349 = term;
      Success867:
      { 
        Fail2085:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2085;
          if(true)
            break Success867;
        }
        term = term349;
        IStrategoTerm v_109 = null;
        v_109 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_109, extraction.const362);
        if(term == null)
          break Fail2084;
        if(true)
          break Fail2084;
      }
      term = t_109;
      x_109 = t_109;
      w_109 = term;
      term = x_109;
      IStrategoList list49;
      list49 = checkListTail(w_109);
      if(list49 == null)
        break Fail2084;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs144, list49);
      if(true)
        return term;
    }
    return null;
  }
}