package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted53 extends Strategy 
{ 
  TermReference m_94;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2165:
    { 
      IStrategoTerm p_94 = null;
      IStrategoTerm y_94 = null;
      IStrategoTerm z_94 = null;
      p_94 = term;
      if(m_94.value == null)
        break Fail2165;
      term = termFactory.makeTuple(m_94.value, extraction.constSort12);
      IStrategoTerm term306 = term;
      Success910:
      { 
        Fail2166:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2166;
          if(true)
            break Success910;
        }
        term = term306;
        IStrategoTerm w_94 = null;
        w_94 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_94, extraction.const336);
        if(term == null)
          break Fail2165;
        if(true)
          break Fail2165;
      }
      term = p_94;
      z_94 = p_94;
      y_94 = term;
      term = z_94;
      IStrategoList list11;
      list11 = checkListTail(y_94);
      if(list11 == null)
        break Fail2165;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs193, list11);
      if(true)
        return term;
    }
    return null;
  }
}