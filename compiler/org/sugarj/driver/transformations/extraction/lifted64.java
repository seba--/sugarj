package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted64 extends Strategy 
{ 
  TermReference d_99;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2142:
    { 
      IStrategoTerm g_99 = null;
      IStrategoTerm n_99 = null;
      IStrategoTerm o_99 = null;
      g_99 = term;
      if(d_99.value == null)
        break Fail2142;
      term = termFactory.makeTuple(d_99.value, extraction.constSortNoArgs74);
      IStrategoTerm term318 = term;
      Success898:
      { 
        Fail2143:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2143;
          if(true)
            break Success898;
        }
        term = term318;
        IStrategoTerm m_99 = null;
        m_99 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_99, extraction.const344);
        if(term == null)
          break Fail2142;
        if(true)
          break Fail2142;
      }
      term = g_99;
      o_99 = g_99;
      n_99 = term;
      term = o_99;
      IStrategoList list22;
      list22 = checkListTail(n_99);
      if(list22 == null)
        break Fail2142;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list22);
      if(true)
        return term;
    }
    return null;
  }
}