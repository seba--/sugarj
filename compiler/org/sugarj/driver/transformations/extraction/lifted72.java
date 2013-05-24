package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted72 extends Strategy 
{ 
  TermReference r_101;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2126:
    { 
      IStrategoTerm u_101 = null;
      IStrategoTerm b_102 = null;
      IStrategoTerm c_102 = null;
      u_101 = term;
      if(r_101.value == null)
        break Fail2126;
      term = termFactory.makeTuple(r_101.value, extraction.constSortNoArgs64);
      IStrategoTerm term326 = term;
      Success890:
      { 
        Fail2127:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2127;
          if(true)
            break Success890;
        }
        term = term326;
        IStrategoTerm a_102 = null;
        a_102 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_102, extraction.const348);
        if(term == null)
          break Fail2126;
        if(true)
          break Fail2126;
      }
      term = u_101;
      c_102 = u_101;
      b_102 = term;
      term = c_102;
      IStrategoList list30;
      list30 = checkListTail(b_102);
      if(list30 == null)
        break Fail2126;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list30);
      if(true)
        return term;
    }
    return null;
  }
}