package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted373 extends Strategy 
{ 
  TermReference v_267;

  TermReference w_267;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1372:
    { 
      IStrategoTerm z_267 = null;
      IStrategoTerm b_268 = null;
      IStrategoTerm g_268 = null;
      IStrategoTerm h_268 = null;
      z_267 = term;
      if(v_267.value == null)
        break Fail1372;
      term = termFactory.makeTuple(v_267.value, extraction.constSortNoArgs71);
      IStrategoTerm term778 = term;
      Success437:
      { 
        Fail1373:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1373;
          if(true)
            break Success437;
        }
        term = term778;
        IStrategoTerm d_268 = null;
        d_268 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_268, extraction.const553);
        if(term == null)
          break Fail1372;
        if(true)
          break Fail1372;
      }
      term = z_267;
      b_268 = z_267;
      if(w_267.value == null)
        break Fail1372;
      term = termFactory.makeTuple(w_267.value, extraction.constSortNoArgs71);
      IStrategoTerm term779 = term;
      Success438:
      { 
        Fail1374:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1374;
          if(true)
            break Success438;
        }
        term = term779;
        IStrategoTerm f_268 = null;
        f_268 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_268, extraction.const553);
        if(term == null)
          break Fail1372;
        if(true)
          break Fail1372;
      }
      term = b_268;
      h_268 = b_268;
      g_268 = term;
      term = h_268;
      IStrategoList list331;
      list331 = checkListTail(g_268);
      if(list331 == null)
        break Fail1372;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs56, list331);
      if(true)
        return term;
    }
    return null;
  }
}