package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted268 extends Strategy 
{ 
  TermReference l_208;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1639:
    { 
      IStrategoTerm n_208 = null;
      IStrategoTerm q_208 = null;
      IStrategoTerm r_208 = null;
      n_208 = term;
      if(l_208.value == null)
        break Fail1639;
      term = termFactory.makeTuple(l_208.value, extraction.constSortNoArgs0);
      IStrategoTerm term617 = term;
      Success599:
      { 
        Fail1640:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1640;
          if(true)
            break Success599;
        }
        term = term617;
        IStrategoTerm p_208 = null;
        p_208 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_208, extraction.const474);
        if(term == null)
          break Fail1639;
        if(true)
          break Fail1639;
      }
      term = n_208;
      r_208 = n_208;
      q_208 = term;
      term = r_208;
      IStrategoList list226;
      list226 = checkListTail(q_208);
      if(list226 == null)
        break Fail1639;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list226);
      if(true)
        return term;
    }
    return null;
  }
}