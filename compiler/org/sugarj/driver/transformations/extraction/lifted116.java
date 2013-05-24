package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted116 extends Strategy 
{ 
  TermReference h_122;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2018:
    { 
      IStrategoTerm j_122 = null;
      IStrategoTerm o_122 = null;
      IStrategoTerm p_122 = null;
      j_122 = term;
      if(h_122.value == null)
        break Fail2018;
      term = termFactory.makeTuple(h_122.value, extraction.constSortNoArgs3);
      IStrategoTerm term390 = term;
      Success826:
      { 
        Fail2019:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2019;
          if(true)
            break Success826;
        }
        term = term390;
        IStrategoTerm l_122 = null;
        l_122 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_122, extraction.const10);
        if(term == null)
          break Fail2018;
        if(true)
          break Fail2018;
      }
      term = j_122;
      p_122 = j_122;
      o_122 = term;
      term = p_122;
      IStrategoList list74;
      list74 = checkListTail(o_122);
      if(list74 == null)
        break Fail2018;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs92, list74);
      if(true)
        return term;
    }
    return null;
  }
}