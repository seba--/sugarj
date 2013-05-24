package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted74 extends Strategy 
{ 
  TermReference h_102;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2122:
    { 
      IStrategoTerm k_102 = null;
      IStrategoTerm r_102 = null;
      IStrategoTerm s_102 = null;
      k_102 = term;
      if(h_102.value == null)
        break Fail2122;
      term = termFactory.makeTuple(h_102.value, extraction.constSortNoArgs64);
      IStrategoTerm term328 = term;
      Success888:
      { 
        Fail2123:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2123;
          if(true)
            break Success888;
        }
        term = term328;
        IStrategoTerm q_102 = null;
        q_102 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_102, extraction.const349);
        if(term == null)
          break Fail2122;
        if(true)
          break Fail2122;
      }
      term = k_102;
      s_102 = k_102;
      r_102 = term;
      term = s_102;
      IStrategoList list32;
      list32 = checkListTail(r_102);
      if(list32 == null)
        break Fail2122;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list32);
      if(true)
        return term;
    }
    return null;
  }
}