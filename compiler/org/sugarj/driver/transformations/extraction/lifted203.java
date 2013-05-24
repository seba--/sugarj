package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted203 extends Strategy 
{ 
  TermReference f_170;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1835:
    { 
      IStrategoTerm h_170 = null;
      IStrategoTerm k_170 = null;
      IStrategoTerm l_170 = null;
      h_170 = term;
      if(f_170.value == null)
        break Fail1835;
      term = termFactory.makeTuple(f_170.value, extraction.constSortNoArgs8);
      IStrategoTerm term486 = term;
      Success730:
      { 
        Fail1836:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1836;
          if(true)
            break Success730;
        }
        term = term486;
        IStrategoTerm j_170 = null;
        j_170 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_170, extraction.const433);
        if(term == null)
          break Fail1835;
        if(true)
          break Fail1835;
      }
      term = h_170;
      l_170 = h_170;
      k_170 = term;
      term = l_170;
      IStrategoList list161;
      list161 = checkListTail(k_170);
      if(list161 == null)
        break Fail1835;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs30, list161);
      if(true)
        return term;
    }
    return null;
  }
}