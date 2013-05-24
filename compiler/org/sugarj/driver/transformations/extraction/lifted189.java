package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted189 extends Strategy 
{ 
  TermReference k_161;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1867:
    { 
      IStrategoTerm p_161 = null;
      IStrategoTerm t_161 = null;
      IStrategoTerm v_161 = null;
      p_161 = term;
      if(k_161.value == null)
        break Fail1867;
      term = termFactory.makeTuple(k_161.value, extraction.constSortNoArgs7);
      IStrategoTerm term468 = term;
      Success748:
      { 
        Fail1868:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1868;
          if(true)
            break Success748;
        }
        term = term468;
        IStrategoTerm s_161 = null;
        s_161 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_161, extraction.const14);
        if(term == null)
          break Fail1867;
        if(true)
          break Fail1867;
      }
      term = p_161;
      v_161 = p_161;
      t_161 = term;
      term = v_161;
      IStrategoList list147;
      list147 = checkListTail(t_161);
      if(list147 == null)
        break Fail1867;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list147);
      if(true)
        return term;
    }
    return null;
  }
}