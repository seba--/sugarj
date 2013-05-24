package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted55 extends Strategy 
{ 
  TermReference e_95;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2161:
    { 
      IStrategoTerm h_95 = null;
      IStrategoTerm p_95 = null;
      IStrategoTerm q_95 = null;
      h_95 = term;
      if(e_95.value == null)
        break Fail2161;
      term = termFactory.makeTuple(e_95.value, extraction.constSort16);
      IStrategoTerm term308 = term;
      Success908:
      { 
        Fail2162:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2162;
          if(true)
            break Success908;
        }
        term = term308;
        IStrategoTerm o_95 = null;
        o_95 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_95, extraction.const337);
        if(term == null)
          break Fail2161;
        if(true)
          break Fail2161;
      }
      term = h_95;
      q_95 = h_95;
      p_95 = term;
      term = q_95;
      IStrategoList list13;
      list13 = checkListTail(p_95);
      if(list13 == null)
        break Fail2161;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs193, list13);
      if(true)
        return term;
    }
    return null;
  }
}