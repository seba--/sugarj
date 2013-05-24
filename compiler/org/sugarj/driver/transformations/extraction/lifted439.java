package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted439 extends Strategy 
{ 
  TermReference h_308;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1236:
    { 
      IStrategoTerm k_308 = null;
      IStrategoTerm r_308 = null;
      IStrategoTerm s_308 = null;
      k_308 = term;
      if(h_308.value == null)
        break Fail1236;
      term = termFactory.makeTuple(h_308.value, extraction.constSortNoArgs71);
      IStrategoTerm term849 = term;
      Success367:
      { 
        Fail1237:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1237;
          if(true)
            break Success367;
        }
        term = term849;
        IStrategoTerm p_308 = null;
        p_308 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_308, extraction.const607);
        if(term == null)
          break Fail1236;
        if(true)
          break Fail1236;
      }
      term = k_308;
      s_308 = k_308;
      r_308 = term;
      term = s_308;
      IStrategoList list397;
      list397 = checkListTail(r_308);
      if(list397 == null)
        break Fail1236;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list397);
      if(true)
        return term;
    }
    return null;
  }
}