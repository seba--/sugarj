package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted475 extends Strategy 
{ 
  TermReference o_327;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1150:
    { 
      IStrategoTerm r_327 = null;
      IStrategoTerm u_327 = null;
      IStrategoTerm v_327 = null;
      r_327 = term;
      if(o_327.value == null)
        break Fail1150;
      term = termFactory.makeTuple(o_327.value, extraction.constSort51);
      IStrategoTerm term899 = term;
      Success317:
      { 
        Fail1151:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1151;
          if(true)
            break Success317;
        }
        term = term899;
        IStrategoTerm t_327 = null;
        t_327 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_327, extraction.const642);
        if(term == null)
          break Fail1150;
        if(true)
          break Fail1150;
      }
      term = r_327;
      v_327 = r_327;
      u_327 = term;
      term = v_327;
      IStrategoList list433;
      list433 = checkListTail(u_327);
      if(list433 == null)
        break Fail1150;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs270, list433);
      if(true)
        return term;
    }
    return null;
  }
}