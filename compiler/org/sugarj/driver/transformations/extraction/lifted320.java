package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted320 extends Strategy 
{ 
  TermReference q_237;

  TermReference r_237;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1508:
    { 
      IStrategoTerm w_237 = null;
      IStrategoTerm x_237 = null;
      IStrategoTerm p_238 = null;
      IStrategoTerm q_238 = null;
      w_237 = term;
      if(q_237.value == null)
        break Fail1508;
      term = termFactory.makeTuple(q_237.value, extraction.constSortNoArgs50);
      IStrategoTerm term695 = term;
      Success520:
      { 
        Fail1509:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1509;
          if(true)
            break Success520;
        }
        term = term695;
        IStrategoTerm l_238 = null;
        l_238 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_238, extraction.const514);
        if(term == null)
          break Fail1508;
        if(true)
          break Fail1508;
      }
      term = w_237;
      x_237 = w_237;
      if(r_237.value == null)
        break Fail1508;
      term = termFactory.makeTuple(r_237.value, extraction.constSortNoArgs41);
      IStrategoTerm term696 = term;
      Success521:
      { 
        Fail1510:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1510;
          if(true)
            break Success521;
        }
        term = term696;
        IStrategoTerm n_238 = null;
        n_238 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_238, extraction.const514);
        if(term == null)
          break Fail1508;
        if(true)
          break Fail1508;
      }
      term = x_237;
      q_238 = x_237;
      p_238 = term;
      term = q_238;
      IStrategoList list278;
      list278 = checkListTail(p_238);
      if(list278 == null)
        break Fail1508;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs41, list278);
      if(true)
        return term;
    }
    return null;
  }
}