package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted445 extends Strategy 
{ 
  TermReference x_311;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1219:
    { 
      IStrategoTerm z_311 = null;
      IStrategoTerm c_312 = null;
      IStrategoTerm d_312 = null;
      z_311 = term;
      if(x_311.value == null)
        break Fail1219;
      term = termFactory.makeTuple(x_311.value, extraction.constSort49);
      IStrategoTerm term860 = term;
      Success356:
      { 
        Fail1220:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1220;
          if(true)
            break Success356;
        }
        term = term860;
        IStrategoTerm b_312 = null;
        b_312 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_312, extraction.const613);
        if(term == null)
          break Fail1219;
        if(true)
          break Fail1219;
      }
      term = z_311;
      d_312 = z_311;
      c_312 = term;
      term = d_312;
      IStrategoList list403;
      list403 = checkListTail(c_312);
      if(list403 == null)
        break Fail1219;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs266, list403);
      if(true)
        return term;
    }
    return null;
  }
}