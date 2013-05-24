package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted195 extends Strategy 
{ 
  TermReference k_166;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1855:
    { 
      IStrategoTerm m_166 = null;
      IStrategoTerm p_166 = null;
      IStrategoTerm q_166 = null;
      m_166 = term;
      if(k_166.value == null)
        break Fail1855;
      term = termFactory.makeTuple(k_166.value, extraction.constSort32);
      IStrategoTerm term474 = term;
      Success742:
      { 
        Fail1856:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1856;
          if(true)
            break Success742;
        }
        term = term474;
        IStrategoTerm o_166 = null;
        o_166 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_166, extraction.const431);
        if(term == null)
          break Fail1855;
        if(true)
          break Fail1855;
      }
      term = m_166;
      q_166 = m_166;
      p_166 = term;
      term = q_166;
      IStrategoList list153;
      list153 = checkListTail(p_166);
      if(list153 == null)
        break Fail1855;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list153);
      if(true)
        return term;
    }
    return null;
  }
}