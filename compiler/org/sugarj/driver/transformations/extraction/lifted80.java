package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted80 extends Strategy 
{ 
  TermReference f_104;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2110:
    { 
      IStrategoTerm j_104 = null;
      IStrategoTerm q_104 = null;
      IStrategoTerm r_104 = null;
      j_104 = term;
      if(f_104.value == null)
        break Fail2110;
      term = termFactory.makeTuple(f_104.value, extraction.constSortNoArgs59);
      IStrategoTerm term334 = term;
      Success882:
      { 
        Fail2111:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2111;
          if(true)
            break Success882;
        }
        term = term334;
        IStrategoTerm p_104 = null;
        p_104 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_104, extraction.const352);
        if(term == null)
          break Fail2110;
        if(true)
          break Fail2110;
      }
      term = j_104;
      r_104 = j_104;
      q_104 = term;
      term = r_104;
      IStrategoList list38;
      list38 = checkListTail(q_104);
      if(list38 == null)
        break Fail2110;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list38);
      if(true)
        return term;
    }
    return null;
  }
}