package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted194 extends Strategy 
{ 
  TermReference v_165;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1857:
    { 
      IStrategoTerm x_165 = null;
      IStrategoTerm b_166 = null;
      IStrategoTerm c_166 = null;
      x_165 = term;
      if(v_165.value == null)
        break Fail1857;
      term = termFactory.makeTuple(v_165.value, extraction.constSortNoArgs131);
      IStrategoTerm term473 = term;
      Success743:
      { 
        Fail1858:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1858;
          if(true)
            break Success743;
        }
        term = term473;
        IStrategoTerm a_166 = null;
        a_166 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_166, extraction.const430);
        if(term == null)
          break Fail1857;
        if(true)
          break Fail1857;
      }
      term = x_165;
      c_166 = x_165;
      b_166 = term;
      term = c_166;
      IStrategoList list152;
      list152 = checkListTail(b_166);
      if(list152 == null)
        break Fail1857;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list152);
      if(true)
        return term;
    }
    return null;
  }
}