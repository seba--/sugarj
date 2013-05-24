package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted61 extends Strategy 
{ 
  TermReference i_98;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2148:
    { 
      IStrategoTerm l_98 = null;
      IStrategoTerm s_98 = null;
      IStrategoTerm t_98 = null;
      l_98 = term;
      if(i_98.value == null)
        break Fail2148;
      term = termFactory.makeTuple(i_98.value, extraction.constSortNoArgs267);
      IStrategoTerm term315 = term;
      Success901:
      { 
        Fail2149:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2149;
          if(true)
            break Success901;
        }
        term = term315;
        IStrategoTerm q_98 = null;
        q_98 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_98, extraction.const343);
        if(term == null)
          break Fail2148;
        if(true)
          break Fail2148;
      }
      term = l_98;
      t_98 = l_98;
      s_98 = term;
      term = t_98;
      IStrategoList list19;
      list19 = checkListTail(s_98);
      if(list19 == null)
        break Fail2148;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list19);
      if(true)
        return term;
    }
    return null;
  }
}