package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted356 extends Strategy 
{ 
  TermReference f_259;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1413:
    { 
      IStrategoTerm h_259 = null;
      IStrategoTerm l_259 = null;
      IStrategoTerm m_259 = null;
      h_259 = term;
      if(f_259.value == null)
        break Fail1413;
      term = termFactory.makeTuple(f_259.value, extraction.constSortNoArgs0);
      IStrategoTerm term755 = term;
      Success461:
      { 
        Fail1414:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1414;
          if(true)
            break Success461;
        }
        term = term755;
        IStrategoTerm k_259 = null;
        k_259 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_259, extraction.const541);
        if(term == null)
          break Fail1413;
        if(true)
          break Fail1413;
      }
      term = h_259;
      m_259 = h_259;
      l_259 = term;
      term = m_259;
      IStrategoList list314;
      list314 = checkListTail(l_259);
      if(list314 == null)
        break Fail1413;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs196, list314);
      if(true)
        return term;
    }
    return null;
  }
}