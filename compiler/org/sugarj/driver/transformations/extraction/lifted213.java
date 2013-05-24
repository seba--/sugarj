package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted213 extends Strategy 
{ 
  TermReference c_175;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1813:
    { 
      IStrategoTerm f_175 = null;
      IStrategoTerm m_175 = null;
      IStrategoTerm n_175 = null;
      f_175 = term;
      if(c_175.value == null)
        break Fail1813;
      term = termFactory.makeTuple(c_175.value, extraction.constSortNoArgs22);
      IStrategoTerm term498 = term;
      Success718:
      { 
        Fail1814:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1814;
          if(true)
            break Success718;
        }
        term = term498;
        IStrategoTerm l_175 = null;
        l_175 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_175, extraction.const80);
        if(term == null)
          break Fail1813;
        if(true)
          break Fail1813;
      }
      term = f_175;
      n_175 = f_175;
      m_175 = term;
      term = n_175;
      IStrategoList list171;
      list171 = checkListTail(m_175);
      if(list171 == null)
        break Fail1813;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs192, list171);
      if(true)
        return term;
    }
    return null;
  }
}