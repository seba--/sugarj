package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted177 extends Strategy 
{ 
  TermReference a_155;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1892:
    { 
      IStrategoTerm f_155 = null;
      IStrategoTerm k_155 = null;
      IStrategoTerm l_155 = null;
      f_155 = term;
      if(a_155.value == null)
        break Fail1892;
      term = termFactory.makeTuple(a_155.value, extraction.constSortNoArgs2);
      IStrategoTerm term455 = term;
      Success761:
      { 
        Fail1893:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1893;
          if(true)
            break Success761;
        }
        term = term455;
        IStrategoTerm h_155 = null;
        h_155 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_155, extraction.const7);
        if(term == null)
          break Fail1892;
        if(true)
          break Fail1892;
      }
      term = f_155;
      l_155 = f_155;
      k_155 = term;
      term = l_155;
      IStrategoList list135;
      list135 = checkListTail(k_155);
      if(list135 == null)
        break Fail1892;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs91, list135);
      if(true)
        return term;
    }
    return null;
  }
}