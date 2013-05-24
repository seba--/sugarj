package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted349 extends Strategy 
{ 
  TermReference j_253;

  TermReference k_253;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1440:
    { 
      IStrategoTerm o_253 = null;
      IStrategoTerm p_253 = null;
      IStrategoTerm u_253 = null;
      IStrategoTerm v_253 = null;
      o_253 = term;
      if(j_253.value == null)
        break Fail1440;
      term = termFactory.makeTuple(j_253.value, extraction.constSort12);
      IStrategoTerm term734 = term;
      Success481:
      { 
        Fail1441:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1441;
          if(true)
            break Success481;
        }
        term = term734;
        IStrategoTerm r_253 = null;
        r_253 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_253, extraction.const534);
        if(term == null)
          break Fail1440;
        if(true)
          break Fail1440;
      }
      term = o_253;
      p_253 = o_253;
      if(k_253.value == null)
        break Fail1440;
      term = termFactory.makeTuple(k_253.value, extraction.constSortNoArgs0);
      IStrategoTerm term735 = term;
      Success482:
      { 
        Fail1442:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1442;
          if(true)
            break Success482;
        }
        term = term735;
        IStrategoTerm t_253 = null;
        t_253 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_253, extraction.const534);
        if(term == null)
          break Fail1440;
        if(true)
          break Fail1440;
      }
      term = p_253;
      v_253 = p_253;
      u_253 = term;
      term = v_253;
      IStrategoList list307;
      list307 = checkListTail(u_253);
      if(list307 == null)
        break Fail1440;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list307);
      if(true)
        return term;
    }
    return null;
  }
}