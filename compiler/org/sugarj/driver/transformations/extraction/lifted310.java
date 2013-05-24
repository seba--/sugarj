package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted310 extends Strategy 
{ 
  TermReference f_232;

  TermReference g_232;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1534:
    { 
      IStrategoTerm k_232 = null;
      IStrategoTerm n_232 = null;
      IStrategoTerm b_233 = null;
      IStrategoTerm c_233 = null;
      k_232 = term;
      if(f_232.value == null)
        break Fail1534;
      term = termFactory.makeTuple(f_232.value, extraction.constSortNoArgs0);
      IStrategoTerm term679 = term;
      Success536:
      { 
        Fail1535:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1535;
          if(true)
            break Success536;
        }
        term = term679;
        IStrategoTerm x_232 = null;
        x_232 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_232, extraction.const509);
        if(term == null)
          break Fail1534;
        if(true)
          break Fail1534;
      }
      term = k_232;
      n_232 = k_232;
      if(g_232.value == null)
        break Fail1534;
      term = termFactory.makeTuple(g_232.value, extraction.constSortNoArgs41);
      IStrategoTerm term680 = term;
      Success537:
      { 
        Fail1536:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1536;
          if(true)
            break Success537;
        }
        term = term680;
        IStrategoTerm a_233 = null;
        a_233 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_233, extraction.const509);
        if(term == null)
          break Fail1534;
        if(true)
          break Fail1534;
      }
      term = n_232;
      c_233 = n_232;
      b_233 = term;
      term = c_233;
      IStrategoList list268;
      list268 = checkListTail(b_233);
      if(list268 == null)
        break Fail1534;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs41, list268);
      if(true)
        return term;
    }
    return null;
  }
}