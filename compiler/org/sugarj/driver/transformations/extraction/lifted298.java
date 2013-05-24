package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted298 extends Strategy 
{ 
  TermReference i_226;

  TermReference j_226;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1563:
    { 
      IStrategoTerm l_226 = null;
      IStrategoTerm m_226 = null;
      IStrategoTerm r_226 = null;
      IStrategoTerm s_226 = null;
      l_226 = term;
      if(i_226.value == null)
        break Fail1563;
      term = termFactory.makeTuple(i_226.value, extraction.constSortNoArgs0);
      IStrategoTerm term662 = term;
      Success553:
      { 
        Fail1564:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1564;
          if(true)
            break Success553;
        }
        term = term662;
        IStrategoTerm o_226 = null;
        o_226 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_226, extraction.const195);
        if(term == null)
          break Fail1563;
        if(true)
          break Fail1563;
      }
      term = l_226;
      m_226 = l_226;
      if(j_226.value == null)
        break Fail1563;
      term = termFactory.makeTuple(j_226.value, extraction.constSortNoArgs0);
      IStrategoTerm term663 = term;
      Success554:
      { 
        Fail1565:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1565;
          if(true)
            break Success554;
        }
        term = term663;
        IStrategoTerm q_226 = null;
        q_226 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_226, extraction.const195);
        if(term == null)
          break Fail1563;
        if(true)
          break Fail1563;
      }
      term = m_226;
      s_226 = m_226;
      r_226 = term;
      term = s_226;
      IStrategoList list256;
      list256 = checkListTail(r_226);
      if(list256 == null)
        break Fail1563;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs184, list256);
      if(true)
        return term;
    }
    return null;
  }
}