package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted276 extends Strategy 
{ 
  TermReference g_212;

  TermReference h_212;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1620:
    { 
      IStrategoTerm l_212 = null;
      IStrategoTerm m_212 = null;
      IStrategoTerm r_212 = null;
      IStrategoTerm s_212 = null;
      l_212 = term;
      if(g_212.value == null)
        break Fail1620;
      term = termFactory.makeTuple(g_212.value, extraction.constSortNoArgs18);
      IStrategoTerm term627 = term;
      Success588:
      { 
        Fail1621:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1621;
          if(true)
            break Success588;
        }
        term = term627;
        IStrategoTerm o_212 = null;
        o_212 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_212, extraction.const482);
        if(term == null)
          break Fail1620;
        if(true)
          break Fail1620;
      }
      term = l_212;
      m_212 = l_212;
      if(h_212.value == null)
        break Fail1620;
      term = termFactory.makeTuple(h_212.value, extraction.constSort39);
      IStrategoTerm term628 = term;
      Success589:
      { 
        Fail1622:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1622;
          if(true)
            break Success589;
        }
        term = term628;
        IStrategoTerm q_212 = null;
        q_212 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_212, extraction.const482);
        if(term == null)
          break Fail1620;
        if(true)
          break Fail1620;
      }
      term = m_212;
      s_212 = m_212;
      r_212 = term;
      term = s_212;
      IStrategoList list234;
      list234 = checkListTail(r_212);
      if(list234 == null)
        break Fail1620;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list234);
      if(true)
        return term;
    }
    return null;
  }
}