package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted387 extends Strategy 
{ 
  TermReference f_274;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1342:
    { 
      IStrategoTerm h_274 = null;
      IStrategoTerm m_274 = null;
      IStrategoTerm n_274 = null;
      h_274 = term;
      if(f_274.value == null)
        break Fail1342;
      term = termFactory.makeTuple(f_274.value, extraction.constSortNoArgs37);
      IStrategoTerm term795 = term;
      Success421:
      { 
        Fail1343:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1343;
          if(true)
            break Success421;
        }
        term = term795;
        IStrategoTerm k_274 = null;
        k_274 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_274, extraction.const563);
        if(term == null)
          break Fail1342;
        if(true)
          break Fail1342;
      }
      term = h_274;
      n_274 = h_274;
      m_274 = term;
      term = n_274;
      IStrategoList list345;
      list345 = checkListTail(m_274);
      if(list345 == null)
        break Fail1342;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs76, list345);
      if(true)
        return term;
    }
    return null;
  }
}