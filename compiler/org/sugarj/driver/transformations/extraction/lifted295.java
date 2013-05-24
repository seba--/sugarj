package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted295 extends Strategy 
{ 
  TermReference g_224;

  TermReference h_224;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1573:
    { 
      IStrategoTerm k_224 = null;
      IStrategoTerm n_224 = null;
      IStrategoTerm u_224 = null;
      IStrategoTerm v_224 = null;
      k_224 = term;
      if(g_224.value == null)
        break Fail1573;
      term = termFactory.makeTuple(g_224.value, extraction.constSortNoArgs0);
      IStrategoTerm term655 = term;
      Success560:
      { 
        Fail1574:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1574;
          if(true)
            break Success560;
        }
        term = term655;
        IStrategoTerm r_224 = null;
        r_224 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_224, extraction.const500);
        if(term == null)
          break Fail1573;
        if(true)
          break Fail1573;
      }
      term = k_224;
      n_224 = k_224;
      if(h_224.value == null)
        break Fail1573;
      term = termFactory.makeTuple(h_224.value, extraction.constSortNoArgs0);
      IStrategoTerm term656 = term;
      Success561:
      { 
        Fail1575:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1575;
          if(true)
            break Success561;
        }
        term = term656;
        IStrategoTerm t_224 = null;
        t_224 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_224, extraction.const500);
        if(term == null)
          break Fail1573;
        if(true)
          break Fail1573;
      }
      term = n_224;
      v_224 = n_224;
      u_224 = term;
      term = v_224;
      IStrategoList list253;
      list253 = checkListTail(u_224);
      if(list253 == null)
        break Fail1573;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list253);
      if(true)
        return term;
    }
    return null;
  }
}