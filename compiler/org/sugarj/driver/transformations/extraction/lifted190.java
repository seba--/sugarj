package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted190 extends Strategy 
{ 
  TermReference i_162;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1865:
    { 
      IStrategoTerm k_162 = null;
      IStrategoTerm p_162 = null;
      IStrategoTerm q_162 = null;
      k_162 = term;
      if(i_162.value == null)
        break Fail1865;
      term = termFactory.makeTuple(i_162.value, extraction.constSortNoArgs135);
      IStrategoTerm term469 = term;
      Success747:
      { 
        Fail1866:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1866;
          if(true)
            break Success747;
        }
        term = term469;
        IStrategoTerm o_162 = null;
        o_162 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_162, extraction.const427);
        if(term == null)
          break Fail1865;
        if(true)
          break Fail1865;
      }
      term = k_162;
      q_162 = k_162;
      p_162 = term;
      term = q_162;
      IStrategoList list148;
      list148 = checkListTail(p_162);
      if(list148 == null)
        break Fail1865;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list148);
      if(true)
        return term;
    }
    return null;
  }
}