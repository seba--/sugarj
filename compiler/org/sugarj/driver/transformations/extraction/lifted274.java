package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted274 extends Strategy 
{ 
  TermReference k_211;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1625:
    { 
      IStrategoTerm m_211 = null;
      IStrategoTerm p_211 = null;
      IStrategoTerm q_211 = null;
      m_211 = term;
      if(k_211.value == null)
        break Fail1625;
      term = termFactory.makeTuple(k_211.value, extraction.constSortNoArgs0);
      IStrategoTerm term625 = term;
      Success591:
      { 
        Fail1626:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1626;
          if(true)
            break Success591;
        }
        term = term625;
        IStrategoTerm o_211 = null;
        o_211 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_211, extraction.const480);
        if(term == null)
          break Fail1625;
        if(true)
          break Fail1625;
      }
      term = m_211;
      q_211 = m_211;
      p_211 = term;
      term = q_211;
      IStrategoList list232;
      list232 = checkListTail(p_211);
      if(list232 == null)
        break Fail1625;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list232);
      if(true)
        return term;
    }
    return null;
  }
}