package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted206 extends Strategy 
{ 
  TermReference x_171;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1829:
    { 
      IStrategoTerm z_171 = null;
      IStrategoTerm c_172 = null;
      IStrategoTerm d_172 = null;
      z_171 = term;
      if(x_171.value == null)
        break Fail1829;
      term = termFactory.makeTuple(x_171.value, extraction.constSortNoArgs8);
      IStrategoTerm term489 = term;
      Success727:
      { 
        Fail1830:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1830;
          if(true)
            break Success727;
        }
        term = term489;
        IStrategoTerm b_172 = null;
        b_172 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_172, extraction.const111);
        if(term == null)
          break Fail1829;
        if(true)
          break Fail1829;
      }
      term = z_171;
      d_172 = z_171;
      c_172 = term;
      term = d_172;
      IStrategoList list164;
      list164 = checkListTail(c_172);
      if(list164 == null)
        break Fail1829;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs156, list164);
      if(true)
        return term;
    }
    return null;
  }
}