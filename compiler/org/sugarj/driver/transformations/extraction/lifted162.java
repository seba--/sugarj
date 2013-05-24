package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted162 extends Strategy 
{ 
  TermReference h_148;

  TermReference i_148;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1926:
    { 
      IStrategoTerm k_148 = null;
      IStrategoTerm l_148 = null;
      IStrategoTerm q_148 = null;
      IStrategoTerm r_148 = null;
      k_148 = term;
      if(h_148.value == null)
        break Fail1926;
      term = termFactory.makeTuple(h_148.value, extraction.constSortNoArgs93);
      IStrategoTerm term435 = term;
      Success780:
      { 
        Fail1927:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1927;
          if(true)
            break Success780;
        }
        term = term435;
        IStrategoTerm n_148 = null;
        n_148 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_148, extraction.const413);
        if(term == null)
          break Fail1926;
        if(true)
          break Fail1926;
      }
      term = k_148;
      l_148 = k_148;
      if(i_148.value == null)
        break Fail1926;
      term = termFactory.makeTuple(i_148.value, extraction.constSortNoArgs121);
      IStrategoTerm term436 = term;
      Success781:
      { 
        Fail1928:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1928;
          if(true)
            break Success781;
        }
        term = term436;
        IStrategoTerm p_148 = null;
        p_148 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_148, extraction.const413);
        if(term == null)
          break Fail1926;
        if(true)
          break Fail1926;
      }
      term = l_148;
      r_148 = l_148;
      q_148 = term;
      term = r_148;
      IStrategoList list120;
      list120 = checkListTail(q_148);
      if(list120 == null)
        break Fail1926;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs123, list120);
      if(true)
        return term;
    }
    return null;
  }
}