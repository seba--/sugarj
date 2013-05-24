package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted83 extends Strategy 
{ 
  TermReference m_105;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2104:
    { 
      IStrategoTerm o_105 = null;
      IStrategoTerm t_105 = null;
      IStrategoTerm u_105 = null;
      o_105 = term;
      if(m_105.value == null)
        break Fail2104;
      term = termFactory.makeTuple(m_105.value, extraction.constSortNoArgs231);
      IStrategoTerm term337 = term;
      Success879:
      { 
        Fail2105:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2105;
          if(true)
            break Success879;
        }
        term = term337;
        IStrategoTerm s_105 = null;
        s_105 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_105, extraction.const354);
        if(term == null)
          break Fail2104;
        if(true)
          break Fail2104;
      }
      term = o_105;
      u_105 = o_105;
      t_105 = term;
      term = u_105;
      IStrategoList list41;
      list41 = checkListTail(t_105);
      if(list41 == null)
        break Fail2104;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list41);
      if(true)
        return term;
    }
    return null;
  }
}