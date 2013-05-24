package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted57 extends Strategy 
{ 
  TermReference m_96;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2156:
    { 
      IStrategoTerm o_96 = null;
      IStrategoTerm r_96 = null;
      IStrategoTerm s_96 = null;
      o_96 = term;
      if(m_96.value == null)
        break Fail2156;
      term = termFactory.makeTuple(m_96.value, extraction.constSortNoArgs293);
      IStrategoTerm term311 = term;
      Success905:
      { 
        Fail2157:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2157;
          if(true)
            break Success905;
        }
        term = term311;
        IStrategoTerm q_96 = null;
        q_96 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_96, extraction.const339);
        if(term == null)
          break Fail2156;
        if(true)
          break Fail2156;
      }
      term = o_96;
      s_96 = o_96;
      r_96 = term;
      term = s_96;
      IStrategoList list15;
      list15 = checkListTail(r_96);
      if(list15 == null)
        break Fail2156;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs312, list15);
      if(true)
        return term;
    }
    return null;
  }
}