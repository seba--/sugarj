package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted332 extends Strategy 
{ 
  TermReference r_243;

  TermReference s_243;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1482:
    { 
      IStrategoTerm v_243 = null;
      IStrategoTerm w_243 = null;
      IStrategoTerm b_244 = null;
      IStrategoTerm c_244 = null;
      v_243 = term;
      if(r_243.value == null)
        break Fail1482;
      term = termFactory.makeTuple(r_243.value, extraction.constSortNoArgs8);
      IStrategoTerm term709 = term;
      Success506:
      { 
        Fail1483:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1483;
          if(true)
            break Success506;
        }
        term = term709;
        IStrategoTerm y_243 = null;
        y_243 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_243, extraction.const6);
        if(term == null)
          break Fail1482;
        if(true)
          break Fail1482;
      }
      term = v_243;
      w_243 = v_243;
      if(s_243.value == null)
        break Fail1482;
      term = termFactory.makeTuple(s_243.value, extraction.constSort31);
      IStrategoTerm term710 = term;
      Success507:
      { 
        Fail1484:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1484;
          if(true)
            break Success507;
        }
        term = term710;
        IStrategoTerm a_244 = null;
        a_244 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_244, extraction.const6);
        if(term == null)
          break Fail1482;
        if(true)
          break Fail1482;
      }
      term = w_243;
      c_244 = w_243;
      b_244 = term;
      term = c_244;
      IStrategoList list290;
      list290 = checkListTail(b_244);
      if(list290 == null)
        break Fail1482;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs30, list290);
      if(true)
        return term;
    }
    return null;
  }
}