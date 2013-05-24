package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted191 extends Strategy 
{ 
  TermReference d_163;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1863:
    { 
      IStrategoTerm i_163 = null;
      IStrategoTerm p_163 = null;
      IStrategoTerm q_163 = null;
      i_163 = term;
      if(d_163.value == null)
        break Fail1863;
      term = termFactory.makeTuple(d_163.value, extraction.constSortNoArgs135);
      IStrategoTerm term470 = term;
      Success746:
      { 
        Fail1864:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1864;
          if(true)
            break Success746;
        }
        term = term470;
        IStrategoTerm k_163 = null;
        k_163 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_163, extraction.const68);
        if(term == null)
          break Fail1863;
        if(true)
          break Fail1863;
      }
      term = i_163;
      q_163 = i_163;
      p_163 = term;
      term = q_163;
      IStrategoList list149;
      list149 = checkListTail(p_163);
      if(list149 == null)
        break Fail1863;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list149);
      if(true)
        return term;
    }
    return null;
  }
}