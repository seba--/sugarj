package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted52 extends Strategy 
{ 
  TermReference m_94;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2167:
    { 
      IStrategoTerm o_94 = null;
      IStrategoTerm t_94 = null;
      IStrategoTerm u_94 = null;
      o_94 = term;
      if(m_94.value == null)
        break Fail2167;
      term = termFactory.makeTuple(m_94.value, extraction.constSort9);
      IStrategoTerm term305 = term;
      Success911:
      { 
        Fail2168:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2168;
          if(true)
            break Success911;
        }
        term = term305;
        IStrategoTerm s_94 = null;
        s_94 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_94, extraction.const336);
        if(term == null)
          break Fail2167;
        if(true)
          break Fail2167;
      }
      term = o_94;
      u_94 = o_94;
      t_94 = term;
      term = u_94;
      IStrategoList list10;
      list10 = checkListTail(t_94);
      if(list10 == null)
        break Fail2167;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs80, list10);
      if(true)
        return term;
    }
    return null;
  }
}