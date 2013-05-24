package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted307 extends Strategy 
{ 
  TermReference l_230;

  TermReference m_230;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1542:
    { 
      IStrategoTerm q_230 = null;
      IStrategoTerm r_230 = null;
      IStrategoTerm h_231 = null;
      IStrategoTerm j_231 = null;
      q_230 = term;
      if(l_230.value == null)
        break Fail1542;
      term = termFactory.makeTuple(l_230.value, extraction.constSortNoArgs51);
      IStrategoTerm term674 = term;
      Success541:
      { 
        Fail1543:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1543;
          if(true)
            break Success541;
        }
        term = term674;
        IStrategoTerm b_231 = null;
        b_231 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_231, extraction.const507);
        if(term == null)
          break Fail1542;
        if(true)
          break Fail1542;
      }
      term = q_230;
      r_230 = q_230;
      if(m_230.value == null)
        break Fail1542;
      term = termFactory.makeTuple(m_230.value, extraction.constSort39);
      IStrategoTerm term675 = term;
      Success542:
      { 
        Fail1544:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1544;
          if(true)
            break Success542;
        }
        term = term675;
        IStrategoTerm e_231 = null;
        e_231 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_231, extraction.const507);
        if(term == null)
          break Fail1542;
        if(true)
          break Fail1542;
      }
      term = r_230;
      j_231 = r_230;
      h_231 = term;
      term = j_231;
      IStrategoList list265;
      list265 = checkListTail(h_231);
      if(list265 == null)
        break Fail1542;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs41, list265);
      if(true)
        return term;
    }
    return null;
  }
}