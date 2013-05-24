package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted70 extends Strategy 
{ 
  TermReference z_100;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2130:
    { 
      IStrategoTerm c_101 = null;
      IStrategoTerm j_101 = null;
      IStrategoTerm m_101 = null;
      c_101 = term;
      if(z_100.value == null)
        break Fail2130;
      term = termFactory.makeTuple(z_100.value, extraction.constSortNoArgs74);
      IStrategoTerm term324 = term;
      Success892:
      { 
        Fail2131:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2131;
          if(true)
            break Success892;
        }
        term = term324;
        IStrategoTerm i_101 = null;
        i_101 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_101, extraction.const347);
        if(term == null)
          break Fail2130;
        if(true)
          break Fail2130;
      }
      term = c_101;
      m_101 = c_101;
      j_101 = term;
      term = m_101;
      IStrategoList list28;
      list28 = checkListTail(j_101);
      if(list28 == null)
        break Fail2130;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list28);
      if(true)
        return term;
    }
    return null;
  }
}