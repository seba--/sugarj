package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted408 extends Strategy 
{ 
  TermReference s_285;

  TermReference t_285;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1298:
    { 
      IStrategoTerm v_285 = null;
      IStrategoTerm w_285 = null;
      IStrategoTerm b_286 = null;
      IStrategoTerm c_286 = null;
      v_285 = term;
      if(s_285.value == null)
        break Fail1298;
      term = termFactory.makeTuple(s_285.value, extraction.constSortNoArgs60);
      IStrategoTerm term817 = term;
      Success398:
      { 
        Fail1299:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1299;
          if(true)
            break Success398;
        }
        term = term817;
        IStrategoTerm y_285 = null;
        y_285 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_285, extraction.const582);
        if(term == null)
          break Fail1298;
        if(true)
          break Fail1298;
      }
      term = v_285;
      w_285 = v_285;
      if(t_285.value == null)
        break Fail1298;
      term = termFactory.makeTuple(t_285.value, extraction.constSortNoArgs60);
      IStrategoTerm term818 = term;
      Success399:
      { 
        Fail1300:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1300;
          if(true)
            break Success399;
        }
        term = term818;
        IStrategoTerm a_286 = null;
        a_286 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_286, extraction.const582);
        if(term == null)
          break Fail1298;
        if(true)
          break Fail1298;
      }
      term = w_285;
      c_286 = w_285;
      b_286 = term;
      term = c_286;
      IStrategoList list366;
      list366 = checkListTail(b_286);
      if(list366 == null)
        break Fail1298;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs61, list366);
      if(true)
        return term;
    }
    return null;
  }
}