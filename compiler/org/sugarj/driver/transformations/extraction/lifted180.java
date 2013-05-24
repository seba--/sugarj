package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted180 extends Strategy 
{ 
  TermReference a_157;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1885:
    { 
      IStrategoTerm e_157 = null;
      IStrategoTerm j_157 = null;
      IStrategoTerm k_157 = null;
      e_157 = term;
      if(a_157.value == null)
        break Fail1885;
      term = termFactory.makeTuple(a_157.value, extraction.constSort30);
      IStrategoTerm term459 = term;
      Success757:
      { 
        Fail1886:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1886;
          if(true)
            break Success757;
        }
        term = term459;
        IStrategoTerm i_157 = null;
        i_157 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_157, extraction.const419);
        if(term == null)
          break Fail1885;
        if(true)
          break Fail1885;
      }
      term = e_157;
      k_157 = e_157;
      j_157 = term;
      term = k_157;
      IStrategoList list138;
      list138 = checkListTail(j_157);
      if(list138 == null)
        break Fail1885;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs135, list138);
      if(true)
        return term;
    }
    return null;
  }
}