package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted453 extends Strategy 
{ 
  TermReference n_316;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1198:
    { 
      IStrategoTerm p_316 = null;
      IStrategoTerm s_316 = null;
      IStrategoTerm t_316 = null;
      p_316 = term;
      if(n_316.value == null)
        break Fail1198;
      term = termFactory.makeTuple(n_316.value, extraction.constSortNoArgs16);
      IStrategoTerm term873 = term;
      Success343:
      { 
        Fail1199:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1199;
          if(true)
            break Success343;
        }
        term = term873;
        IStrategoTerm r_316 = null;
        r_316 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_316, extraction.const621);
        if(term == null)
          break Fail1198;
        if(true)
          break Fail1198;
      }
      term = p_316;
      t_316 = p_316;
      s_316 = term;
      term = t_316;
      IStrategoList list411;
      list411 = checkListTail(s_316);
      if(list411 == null)
        break Fail1198;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs115, list411);
      if(true)
        return term;
    }
    return null;
  }
}