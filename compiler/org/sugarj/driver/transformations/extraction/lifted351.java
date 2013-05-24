package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted351 extends Strategy 
{ 
  TermReference v_254;

  TermReference x_254;

  TermReference y_254;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1432:
    { 
      IStrategoTerm b_255 = null;
      IStrategoTerm c_255 = null;
      IStrategoTerm d_255 = null;
      IStrategoTerm k_255 = null;
      IStrategoTerm m_255 = null;
      b_255 = term;
      if(v_254.value == null)
        break Fail1432;
      term = termFactory.makeTuple(v_254.value, extraction.constSortNoArgs41);
      IStrategoTerm term739 = term;
      Success475:
      { 
        Fail1433:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1433;
          if(true)
            break Success475;
        }
        term = term739;
        IStrategoTerm f_255 = null;
        f_255 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_255, extraction.const536);
        if(term == null)
          break Fail1432;
        if(true)
          break Fail1432;
      }
      term = b_255;
      c_255 = b_255;
      if(x_254.value == null)
        break Fail1432;
      term = termFactory.makeTuple(x_254.value, extraction.constSort38);
      IStrategoTerm term740 = term;
      Success476:
      { 
        Fail1434:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1434;
          if(true)
            break Success476;
        }
        term = term740;
        IStrategoTerm h_255 = null;
        h_255 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_255, extraction.const536);
        if(term == null)
          break Fail1432;
        if(true)
          break Fail1432;
      }
      term = c_255;
      d_255 = c_255;
      if(y_254.value == null)
        break Fail1432;
      term = termFactory.makeTuple(y_254.value, extraction.constSort39);
      IStrategoTerm term741 = term;
      Success477:
      { 
        Fail1435:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1435;
          if(true)
            break Success477;
        }
        term = term741;
        IStrategoTerm j_255 = null;
        j_255 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_255, extraction.const536);
        if(term == null)
          break Fail1432;
        if(true)
          break Fail1432;
      }
      term = d_255;
      m_255 = d_255;
      k_255 = term;
      term = m_255;
      IStrategoList list309;
      list309 = checkListTail(k_255);
      if(list309 == null)
        break Fail1432;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list309);
      if(true)
        return term;
    }
    return null;
  }
}