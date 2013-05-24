package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted139 extends Strategy 
{ 
  TermReference k_136;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1962:
    { 
      IStrategoTerm m_136 = null;
      IStrategoTerm p_136 = null;
      IStrategoTerm q_136 = null;
      m_136 = term;
      if(k_136.value == null)
        break Fail1962;
      term = termFactory.makeTuple(k_136.value, extraction.constSortNoArgs112);
      IStrategoTerm term423 = term;
      Success793:
      { 
        Fail1963:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1963;
          if(true)
            break Success793;
        }
        term = term423;
        IStrategoTerm o_136 = null;
        o_136 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_136, extraction.const393);
        if(term == null)
          break Fail1962;
        if(true)
          break Fail1962;
      }
      term = m_136;
      q_136 = m_136;
      p_136 = term;
      term = q_136;
      IStrategoList list97;
      list97 = checkListTail(p_136);
      if(list97 == null)
        break Fail1962;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs94, list97);
      if(true)
        return term;
    }
    return null;
  }
}