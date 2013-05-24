package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted463 extends Strategy 
{ 
  TermReference b_321;

  TermReference c_321;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1178:
    { 
      IStrategoTerm e_321 = null;
      IStrategoTerm f_321 = null;
      IStrategoTerm k_321 = null;
      IStrategoTerm l_321 = null;
      e_321 = term;
      if(b_321.value == null)
        break Fail1178;
      term = termFactory.makeTuple(b_321.value, extraction.constSortNoArgs293);
      IStrategoTerm term882 = term;
      Success333:
      { 
        Fail1179:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1179;
          if(true)
            break Success333;
        }
        term = term882;
        IStrategoTerm h_321 = null;
        h_321 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_321, extraction.const630);
        if(term == null)
          break Fail1178;
        if(true)
          break Fail1178;
      }
      term = e_321;
      f_321 = e_321;
      if(c_321.value == null)
        break Fail1178;
      term = termFactory.makeTuple(c_321.value, extraction.constSortNoArgs293);
      IStrategoTerm term883 = term;
      Success334:
      { 
        Fail1180:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1180;
          if(true)
            break Success334;
        }
        term = term883;
        IStrategoTerm j_321 = null;
        j_321 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_321, extraction.const630);
        if(term == null)
          break Fail1178;
        if(true)
          break Fail1178;
      }
      term = f_321;
      l_321 = f_321;
      k_321 = term;
      term = l_321;
      IStrategoList list421;
      list421 = checkListTail(k_321);
      if(list421 == null)
        break Fail1178;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list421);
      if(true)
        return term;
    }
    return null;
  }
}