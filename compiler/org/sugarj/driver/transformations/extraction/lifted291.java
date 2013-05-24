package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted291 extends Strategy 
{ 
  TermReference p_221;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1586:
    { 
      IStrategoTerm r_221 = null;
      IStrategoTerm w_221 = null;
      IStrategoTerm x_221 = null;
      r_221 = term;
      if(p_221.value == null)
        break Fail1586;
      term = termFactory.makeTuple(p_221.value, extraction.constSortNoArgs179);
      IStrategoTerm term647 = term;
      Success569:
      { 
        Fail1587:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1587;
          if(true)
            break Success569;
        }
        term = term647;
        IStrategoTerm v_221 = null;
        v_221 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_221, extraction.const496);
        if(term == null)
          break Fail1586;
        if(true)
          break Fail1586;
      }
      term = r_221;
      x_221 = r_221;
      w_221 = term;
      term = x_221;
      IStrategoList list249;
      list249 = checkListTail(w_221);
      if(list249 == null)
        break Fail1586;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list249);
      if(true)
        return term;
    }
    return null;
  }
}