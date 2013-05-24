package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted215 extends Strategy 
{ 
  TermReference h_176;

  TermReference i_176;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1807:
    { 
      IStrategoTerm k_176 = null;
      IStrategoTerm l_176 = null;
      IStrategoTerm q_176 = null;
      IStrategoTerm r_176 = null;
      k_176 = term;
      if(h_176.value == null)
        break Fail1807;
      term = termFactory.makeTuple(h_176.value, extraction.constSortNoArgs8);
      IStrategoTerm term501 = term;
      Success714:
      { 
        Fail1808:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1808;
          if(true)
            break Success714;
        }
        term = term501;
        IStrategoTerm n_176 = null;
        n_176 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_176, extraction.const438);
        if(term == null)
          break Fail1807;
        if(true)
          break Fail1807;
      }
      term = k_176;
      l_176 = k_176;
      if(i_176.value == null)
        break Fail1807;
      term = termFactory.makeTuple(i_176.value, extraction.constSortNoArgs41);
      IStrategoTerm term502 = term;
      Success715:
      { 
        Fail1809:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1809;
          if(true)
            break Success715;
        }
        term = term502;
        IStrategoTerm p_176 = null;
        p_176 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_176, extraction.const438);
        if(term == null)
          break Fail1807;
        if(true)
          break Fail1807;
      }
      term = l_176;
      r_176 = l_176;
      q_176 = term;
      term = r_176;
      IStrategoList list173;
      list173 = checkListTail(q_176);
      if(list173 == null)
        break Fail1807;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs182, list173);
      if(true)
        return term;
    }
    return null;
  }
}