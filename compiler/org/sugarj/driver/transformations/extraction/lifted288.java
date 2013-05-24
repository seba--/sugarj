package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted288 extends Strategy 
{ 
  TermReference v_219;

  TermReference w_219;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1592:
    { 
      IStrategoTerm a_220 = null;
      IStrategoTerm b_220 = null;
      IStrategoTerm j_220 = null;
      IStrategoTerm k_220 = null;
      a_220 = term;
      if(v_219.value == null)
        break Fail1592;
      term = termFactory.makeTuple(v_219.value, extraction.constSortNoArgs0);
      IStrategoTerm term643 = term;
      Success572:
      { 
        Fail1593:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1593;
          if(true)
            break Success572;
        }
        term = term643;
        IStrategoTerm d_220 = null;
        d_220 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_220, extraction.const493);
        if(term == null)
          break Fail1592;
        if(true)
          break Fail1592;
      }
      term = a_220;
      b_220 = a_220;
      if(w_219.value == null)
        break Fail1592;
      term = termFactory.makeTuple(w_219.value, extraction.constSortNoArgs196);
      IStrategoTerm term644 = term;
      Success573:
      { 
        Fail1594:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1594;
          if(true)
            break Success573;
        }
        term = term644;
        IStrategoTerm f_220 = null;
        f_220 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_220, extraction.const493);
        if(term == null)
          break Fail1592;
        if(true)
          break Fail1592;
      }
      term = b_220;
      k_220 = b_220;
      j_220 = term;
      term = k_220;
      IStrategoList list246;
      list246 = checkListTail(j_220);
      if(list246 == null)
        break Fail1592;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list246);
      if(true)
        return term;
    }
    return null;
  }
}