package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted441 extends Strategy 
{ 
  TermReference o_309;

  TermReference p_309;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1230:
    { 
      IStrategoTerm r_309 = null;
      IStrategoTerm s_309 = null;
      IStrategoTerm x_309 = null;
      IStrategoTerm y_309 = null;
      r_309 = term;
      if(o_309.value == null)
        break Fail1230;
      term = termFactory.makeTuple(o_309.value, extraction.constSortNoArgs71);
      IStrategoTerm term852 = term;
      Success363:
      { 
        Fail1231:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1231;
          if(true)
            break Success363;
        }
        term = term852;
        IStrategoTerm u_309 = null;
        u_309 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_309, extraction.const609);
        if(term == null)
          break Fail1230;
        if(true)
          break Fail1230;
      }
      term = r_309;
      s_309 = r_309;
      if(p_309.value == null)
        break Fail1230;
      term = termFactory.makeTuple(p_309.value, extraction.constSortNoArgs71);
      IStrategoTerm term853 = term;
      Success364:
      { 
        Fail1232:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1232;
          if(true)
            break Success364;
        }
        term = term853;
        IStrategoTerm w_309 = null;
        w_309 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_309, extraction.const609);
        if(term == null)
          break Fail1230;
        if(true)
          break Fail1230;
      }
      term = s_309;
      y_309 = s_309;
      x_309 = term;
      term = y_309;
      IStrategoList list399;
      list399 = checkListTail(x_309);
      if(list399 == null)
        break Fail1230;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list399);
      if(true)
        return term;
    }
    return null;
  }
}