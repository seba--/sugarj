package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted47 extends Strategy 
{ 
  TermReference h_92;

  TermReference i_92;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2177:
    { 
      IStrategoTerm k_92 = null;
      IStrategoTerm l_92 = null;
      IStrategoTerm u_92 = null;
      IStrategoTerm v_92 = null;
      k_92 = term;
      if(h_92.value == null)
        break Fail2177;
      term = termFactory.makeTuple(h_92.value, extraction.constSortNoArgs83);
      IStrategoTerm term299 = term;
      Success916:
      { 
        Fail2178:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2178;
          if(true)
            break Success916;
        }
        term = term299;
        IStrategoTerm n_92 = null;
        n_92 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_92, extraction.const92);
        if(term == null)
          break Fail2177;
        if(true)
          break Fail2177;
      }
      term = k_92;
      l_92 = k_92;
      if(i_92.value == null)
        break Fail2177;
      term = termFactory.makeTuple(i_92.value, extraction.constSort8);
      IStrategoTerm term300 = term;
      Success917:
      { 
        Fail2179:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2179;
          if(true)
            break Success917;
        }
        term = term300;
        IStrategoTerm t_92 = null;
        t_92 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_92, extraction.const92);
        if(term == null)
          break Fail2177;
        if(true)
          break Fail2177;
      }
      term = l_92;
      v_92 = l_92;
      u_92 = term;
      term = v_92;
      IStrategoList list5;
      list5 = checkListTail(u_92);
      if(list5 == null)
        break Fail2177;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs81, list5);
      if(true)
        return term;
    }
    return null;
  }
}