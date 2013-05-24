package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted68 extends Strategy 
{ 
  TermReference j_100;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2134:
    { 
      IStrategoTerm m_100 = null;
      IStrategoTerm t_100 = null;
      IStrategoTerm u_100 = null;
      m_100 = term;
      if(j_100.value == null)
        break Fail2134;
      term = termFactory.makeTuple(j_100.value, extraction.constSortNoArgs74);
      IStrategoTerm term322 = term;
      Success894:
      { 
        Fail2135:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2135;
          if(true)
            break Success894;
        }
        term = term322;
        IStrategoTerm s_100 = null;
        s_100 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_100, extraction.const346);
        if(term == null)
          break Fail2134;
        if(true)
          break Fail2134;
      }
      term = m_100;
      u_100 = m_100;
      t_100 = term;
      term = u_100;
      IStrategoList list26;
      list26 = checkListTail(t_100);
      if(list26 == null)
        break Fail2134;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list26);
      if(true)
        return term;
    }
    return null;
  }
}