package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted175 extends Strategy 
{ 
  TermReference p_151;

  TermReference q_151;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1897:
    { 
      IStrategoTerm b_152 = null;
      IStrategoTerm g_152 = null;
      IStrategoTerm e_154 = null;
      IStrategoTerm f_154 = null;
      b_152 = term;
      if(p_151.value == null)
        break Fail1897;
      term = termFactory.makeTuple(p_151.value, extraction.constSortNoArgs91);
      IStrategoTerm term451 = term;
      Success764:
      { 
        Fail1898:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1898;
          if(true)
            break Success764;
        }
        term = term451;
        IStrategoTerm b_154 = null;
        b_154 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_154, extraction.const417);
        if(term == null)
          break Fail1897;
        if(true)
          break Fail1897;
      }
      term = b_152;
      g_152 = b_152;
      if(q_151.value == null)
        break Fail1897;
      term = termFactory.makeTuple(q_151.value, extraction.constSortNoArgs141);
      IStrategoTerm term452 = term;
      Success765:
      { 
        Fail1899:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1899;
          if(true)
            break Success765;
        }
        term = term452;
        IStrategoTerm d_154 = null;
        d_154 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_154, extraction.const417);
        if(term == null)
          break Fail1897;
        if(true)
          break Fail1897;
      }
      term = g_152;
      f_154 = g_152;
      e_154 = term;
      term = f_154;
      IStrategoList list133;
      list133 = checkListTail(e_154);
      if(list133 == null)
        break Fail1897;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs148, list133);
      if(true)
        return term;
    }
    return null;
  }
}