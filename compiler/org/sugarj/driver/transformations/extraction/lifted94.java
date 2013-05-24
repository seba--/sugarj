package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted94 extends Strategy 
{ 
  TermReference f_111;

  TermReference g_111;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2073:
    { 
      IStrategoTerm k_111 = null;
      IStrategoTerm l_111 = null;
      IStrategoTerm y_111 = null;
      IStrategoTerm z_111 = null;
      k_111 = term;
      if(f_111.value == null)
        break Fail2073;
      term = termFactory.makeTuple(f_111.value, extraction.constSortNoArgs14);
      IStrategoTerm term356 = term;
      Success859:
      { 
        Fail2074:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2074;
          if(true)
            break Success859;
        }
        term = term356;
        IStrategoTerm v_111 = null;
        v_111 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_111, extraction.const364);
        if(term == null)
          break Fail2073;
        if(true)
          break Fail2073;
      }
      term = k_111;
      l_111 = k_111;
      if(g_111.value == null)
        break Fail2073;
      term = termFactory.makeTuple(g_111.value, extraction.constSort22);
      IStrategoTerm term357 = term;
      Success860:
      { 
        Fail2075:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2075;
          if(true)
            break Success860;
        }
        term = term357;
        IStrategoTerm x_111 = null;
        x_111 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_111, extraction.const364);
        if(term == null)
          break Fail2073;
        if(true)
          break Fail2073;
      }
      term = l_111;
      z_111 = l_111;
      y_111 = term;
      term = z_111;
      IStrategoList list52;
      list52 = checkListTail(y_111);
      if(list52 == null)
        break Fail2073;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs67, list52);
      if(true)
        return term;
    }
    return null;
  }
}