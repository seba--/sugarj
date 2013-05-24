package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted283 extends Strategy 
{ 
  TermReference x_215;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1604:
    { 
      IStrategoTerm z_215 = null;
      IStrategoTerm c_216 = null;
      IStrategoTerm d_216 = null;
      z_215 = term;
      if(x_215.value == null)
        break Fail1604;
      term = termFactory.makeTuple(x_215.value, extraction.constSortNoArgs0);
      IStrategoTerm term637 = term;
      Success579:
      { 
        Fail1605:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1605;
          if(true)
            break Success579;
        }
        term = term637;
        IStrategoTerm b_216 = null;
        b_216 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_216, extraction.const197);
        if(term == null)
          break Fail1604;
        if(true)
          break Fail1604;
      }
      term = z_215;
      d_216 = z_215;
      c_216 = term;
      term = d_216;
      IStrategoList list241;
      list241 = checkListTail(c_216);
      if(list241 == null)
        break Fail1604;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs186, list241);
      if(true)
        return term;
    }
    return null;
  }
}