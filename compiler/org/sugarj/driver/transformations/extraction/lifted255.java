package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted255 extends Strategy 
{ 
  TermReference j_199;

  TermReference k_199;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1680:
    { 
      IStrategoTerm q_199 = null;
      IStrategoTerm r_199 = null;
      IStrategoTerm k_200 = null;
      IStrategoTerm l_200 = null;
      q_199 = term;
      if(j_199.value == null)
        break Fail1680;
      term = termFactory.makeTuple(j_199.value, extraction.constSortNoArgs0);
      IStrategoTerm term588 = term;
      Success627:
      { 
        Fail1681:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1681;
          if(true)
            break Success627;
        }
        term = term588;
        IStrategoTerm h_200 = null;
        h_200 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_200, extraction.const463);
        if(term == null)
          break Fail1680;
        if(true)
          break Fail1680;
      }
      term = q_199;
      r_199 = q_199;
      if(k_199.value == null)
        break Fail1680;
      term = termFactory.makeTuple(k_199.value, extraction.constSortNoArgs0);
      IStrategoTerm term589 = term;
      Success628:
      { 
        Fail1682:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1682;
          if(true)
            break Success628;
        }
        term = term589;
        IStrategoTerm j_200 = null;
        j_200 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_200, extraction.const463);
        if(term == null)
          break Fail1680;
        if(true)
          break Fail1680;
      }
      term = r_199;
      l_200 = r_199;
      k_200 = term;
      term = l_200;
      IStrategoList list213;
      list213 = checkListTail(k_200);
      if(list213 == null)
        break Fail1680;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list213);
      if(true)
        return term;
    }
    return null;
  }
}