package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted224 extends Strategy 
{ 
  TermReference f_182;

  TermReference g_182;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1781:
    { 
      IStrategoTerm i_182 = null;
      IStrategoTerm j_182 = null;
      IStrategoTerm o_182 = null;
      IStrategoTerm p_182 = null;
      i_182 = term;
      if(f_182.value == null)
        break Fail1781;
      term = termFactory.makeTuple(f_182.value, extraction.constSortNoArgs172);
      IStrategoTerm term518 = term;
      Success697:
      { 
        Fail1782:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1782;
          if(true)
            break Success697;
        }
        term = term518;
        IStrategoTerm l_182 = null;
        l_182 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_182, extraction.const445);
        if(term == null)
          break Fail1781;
        if(true)
          break Fail1781;
      }
      term = i_182;
      j_182 = i_182;
      if(g_182.value == null)
        break Fail1781;
      term = termFactory.makeTuple(g_182.value, extraction.constSortNoArgs41);
      IStrategoTerm term519 = term;
      Success698:
      { 
        Fail1783:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1783;
          if(true)
            break Success698;
        }
        term = term519;
        IStrategoTerm n_182 = null;
        n_182 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_182, extraction.const445);
        if(term == null)
          break Fail1781;
        if(true)
          break Fail1781;
      }
      term = j_182;
      p_182 = j_182;
      o_182 = term;
      term = p_182;
      IStrategoList list182;
      list182 = checkListTail(o_182);
      if(list182 == null)
        break Fail1781;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs174, list182);
      if(true)
        return term;
    }
    return null;
  }
}