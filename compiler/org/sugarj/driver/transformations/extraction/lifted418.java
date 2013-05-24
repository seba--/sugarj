package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted418 extends Strategy 
{ 
  TermReference i_299;

  TermReference j_299;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1276:
    { 
      IStrategoTerm l_299 = null;
      IStrategoTerm n_299 = null;
      IStrategoTerm s_299 = null;
      IStrategoTerm t_299 = null;
      l_299 = term;
      if(i_299.value == null)
        break Fail1276;
      term = termFactory.makeTuple(i_299.value, extraction.constSortNoArgs299);
      IStrategoTerm term829 = term;
      Success386:
      { 
        Fail1277:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1277;
          if(true)
            break Success386;
        }
        term = term829;
        IStrategoTerm p_299 = null;
        p_299 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_299, extraction.const590);
        if(term == null)
          break Fail1276;
        if(true)
          break Fail1276;
      }
      term = l_299;
      n_299 = l_299;
      if(j_299.value == null)
        break Fail1276;
      term = termFactory.makeTuple(j_299.value, extraction.constSortNoArgs299);
      IStrategoTerm term830 = term;
      Success387:
      { 
        Fail1278:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1278;
          if(true)
            break Success387;
        }
        term = term830;
        IStrategoTerm r_299 = null;
        r_299 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_299, extraction.const590);
        if(term == null)
          break Fail1276;
        if(true)
          break Fail1276;
      }
      term = n_299;
      t_299 = n_299;
      s_299 = term;
      term = t_299;
      IStrategoList list376;
      list376 = checkListTail(s_299);
      if(list376 == null)
        break Fail1276;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs299, list376);
      if(true)
        return term;
    }
    return null;
  }
}