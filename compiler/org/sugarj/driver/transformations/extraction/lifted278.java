package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted278 extends Strategy 
{ 
  TermReference i_213;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1616:
    { 
      IStrategoTerm k_213 = null;
      IStrategoTerm n_213 = null;
      IStrategoTerm o_213 = null;
      k_213 = term;
      if(i_213.value == null)
        break Fail1616;
      term = termFactory.makeTuple(i_213.value, extraction.constSortNoArgs10);
      IStrategoTerm term630 = term;
      Success586:
      { 
        Fail1617:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1617;
          if(true)
            break Success586;
        }
        term = term630;
        IStrategoTerm m_213 = null;
        m_213 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_213, extraction.const484);
        if(term == null)
          break Fail1616;
        if(true)
          break Fail1616;
      }
      term = k_213;
      o_213 = k_213;
      n_213 = term;
      term = o_213;
      IStrategoList list236;
      list236 = checkListTail(n_213);
      if(list236 == null)
        break Fail1616;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list236);
      if(true)
        return term;
    }
    return null;
  }
}