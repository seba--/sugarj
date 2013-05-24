package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted321 extends Strategy 
{ 
  TermReference q_237;

  TermReference r_237;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1505:
    { 
      IStrategoTerm y_237 = null;
      IStrategoTerm a_238 = null;
      IStrategoTerm w_238 = null;
      IStrategoTerm x_238 = null;
      y_237 = term;
      if(q_237.value == null)
        break Fail1505;
      term = termFactory.makeTuple(q_237.value, extraction.constSortNoArgs50);
      IStrategoTerm term697 = term;
      Success518:
      { 
        Fail1506:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1506;
          if(true)
            break Success518;
        }
        term = term697;
        IStrategoTerm t_238 = null;
        t_238 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_238, extraction.const514);
        if(term == null)
          break Fail1505;
        if(true)
          break Fail1505;
      }
      term = y_237;
      a_238 = y_237;
      if(r_237.value == null)
        break Fail1505;
      term = termFactory.makeTuple(r_237.value, extraction.constSortNoArgs51);
      IStrategoTerm term698 = term;
      Success519:
      { 
        Fail1507:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1507;
          if(true)
            break Success519;
        }
        term = term698;
        IStrategoTerm v_238 = null;
        v_238 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_238, extraction.const514);
        if(term == null)
          break Fail1505;
        if(true)
          break Fail1505;
      }
      term = a_238;
      x_238 = a_238;
      w_238 = term;
      term = x_238;
      IStrategoList list279;
      list279 = checkListTail(w_238);
      if(list279 == null)
        break Fail1505;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list279);
      if(true)
        return term;
    }
    return null;
  }
}