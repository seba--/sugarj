package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted338 extends Strategy 
{ 
  TermReference k_247;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1466:
    { 
      IStrategoTerm m_247 = null;
      IStrategoTerm q_247 = null;
      IStrategoTerm r_247 = null;
      m_247 = term;
      if(k_247.value == null)
        break Fail1466;
      term = termFactory.makeTuple(k_247.value, extraction.constSortNoArgs45);
      IStrategoTerm term720 = term;
      Success496:
      { 
        Fail1467:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1467;
          if(true)
            break Success496;
        }
        term = term720;
        IStrategoTerm o_247 = null;
        o_247 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_247, extraction.const529);
        if(term == null)
          break Fail1466;
        if(true)
          break Fail1466;
      }
      term = m_247;
      r_247 = m_247;
      q_247 = term;
      term = r_247;
      IStrategoList list296;
      list296 = checkListTail(q_247);
      if(list296 == null)
        break Fail1466;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs208, list296);
      if(true)
        return term;
    }
    return null;
  }
}