package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted201 extends Strategy 
{ 
  TermReference i_169;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1839:
    { 
      IStrategoTerm k_169 = null;
      IStrategoTerm n_169 = null;
      IStrategoTerm o_169 = null;
      k_169 = term;
      if(i_169.value == null)
        break Fail1839;
      term = termFactory.makeTuple(i_169.value, extraction.constSortNoArgs6);
      IStrategoTerm term484 = term;
      Success732:
      { 
        Fail1840:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1840;
          if(true)
            break Success732;
        }
        term = term484;
        IStrategoTerm m_169 = null;
        m_169 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_169, extraction.const136);
        if(term == null)
          break Fail1839;
        if(true)
          break Fail1839;
      }
      term = k_169;
      o_169 = k_169;
      n_169 = term;
      term = o_169;
      IStrategoList list159;
      list159 = checkListTail(n_169);
      if(list159 == null)
        break Fail1839;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs125, list159);
      if(true)
        return term;
    }
    return null;
  }
}