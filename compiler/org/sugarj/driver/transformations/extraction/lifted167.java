package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted167 extends Strategy 
{ 
  TermReference s_149;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1916:
    { 
      IStrategoTerm w_149 = null;
      IStrategoTerm m_150 = null;
      IStrategoTerm n_150 = null;
      w_149 = term;
      if(s_149.value == null)
        break Fail1916;
      term = termFactory.makeTuple(s_149.value, extraction.constSortNoArgs6);
      IStrategoTerm term441 = term;
      Success775:
      { 
        Fail1917:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1917;
          if(true)
            break Success775;
        }
        term = term441;
        IStrategoTerm l_150 = null;
        l_150 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_150, extraction.const416);
        if(term == null)
          break Fail1916;
        if(true)
          break Fail1916;
      }
      term = w_149;
      n_150 = w_149;
      m_150 = term;
      term = n_150;
      IStrategoList list125;
      list125 = checkListTail(m_150);
      if(list125 == null)
        break Fail1916;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs146, list125);
      if(true)
        return term;
    }
    return null;
  }
}