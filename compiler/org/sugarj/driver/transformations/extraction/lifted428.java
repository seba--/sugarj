package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted428 extends Strategy 
{ 
  TermReference q_302;

  TermReference r_302;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1260:
    { 
      IStrategoTerm t_302 = null;
      IStrategoTerm u_302 = null;
      IStrategoTerm c_303 = null;
      IStrategoTerm g_303 = null;
      t_302 = term;
      if(q_302.value == null)
        break Fail1260;
      term = termFactory.makeTuple(q_302.value, extraction.constSortNoArgs296);
      IStrategoTerm term835 = term;
      Success380:
      { 
        Fail1261:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1261;
          if(true)
            break Success380;
        }
        term = term835;
        IStrategoTerm y_302 = null;
        y_302 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_302, extraction.const597);
        if(term == null)
          break Fail1260;
        if(true)
          break Fail1260;
      }
      term = t_302;
      u_302 = t_302;
      if(r_302.value == null)
        break Fail1260;
      term = termFactory.makeTuple(r_302.value, extraction.constSortNoArgs250);
      IStrategoTerm term836 = term;
      Success381:
      { 
        Fail1262:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1262;
          if(true)
            break Success381;
        }
        term = term836;
        IStrategoTerm b_303 = null;
        b_303 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_303, extraction.const597);
        if(term == null)
          break Fail1260;
        if(true)
          break Fail1260;
      }
      term = u_302;
      g_303 = u_302;
      c_303 = term;
      term = g_303;
      IStrategoList list386;
      list386 = checkListTail(c_303);
      if(list386 == null)
        break Fail1260;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs296, list386);
      if(true)
        return term;
    }
    return null;
  }
}