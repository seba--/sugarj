package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted374 extends Strategy 
{ 
  TermReference m_268;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1370:
    { 
      IStrategoTerm p_268 = null;
      IStrategoTerm t_268 = null;
      IStrategoTerm w_268 = null;
      p_268 = term;
      if(m_268.value == null)
        break Fail1370;
      term = termFactory.makeTuple(m_268.value, extraction.constSortNoArgs299);
      IStrategoTerm term780 = term;
      Success436:
      { 
        Fail1371:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1371;
          if(true)
            break Success436;
        }
        term = term780;
        IStrategoTerm s_268 = null;
        s_268 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_268, extraction.const554);
        if(term == null)
          break Fail1370;
        if(true)
          break Fail1370;
      }
      term = p_268;
      w_268 = p_268;
      t_268 = term;
      term = w_268;
      IStrategoList list332;
      list332 = checkListTail(t_268);
      if(list332 == null)
        break Fail1370;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs291, list332);
      if(true)
        return term;
    }
    return null;
  }
}