package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted168 extends Strategy 
{ 
  TermReference s_149;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1914:
    { 
      IStrategoTerm x_149 = null;
      IStrategoTerm q_150 = null;
      IStrategoTerm r_150 = null;
      x_149 = term;
      if(s_149.value == null)
        break Fail1914;
      term = termFactory.makeTuple(s_149.value, extraction.constSortNoArgs6);
      IStrategoTerm term442 = term;
      Success774:
      { 
        Fail1915:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1915;
          if(true)
            break Success774;
        }
        term = term442;
        IStrategoTerm p_150 = null;
        p_150 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_150, extraction.const416);
        if(term == null)
          break Fail1914;
        if(true)
          break Fail1914;
      }
      term = x_149;
      r_150 = x_149;
      q_150 = term;
      term = r_150;
      IStrategoList list126;
      list126 = checkListTail(q_150);
      if(list126 == null)
        break Fail1914;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs146, list126);
      if(true)
        return term;
    }
    return null;
  }
}