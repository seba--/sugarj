package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted130 extends Strategy 
{ 
  TermReference o_127;

  TermReference p_127;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1991:
    { 
      IStrategoTerm r_127 = null;
      IStrategoTerm s_127 = null;
      IStrategoTerm x_127 = null;
      IStrategoTerm y_127 = null;
      r_127 = term;
      if(o_127.value == null)
        break Fail1991;
      term = termFactory.makeTuple(o_127.value, extraction.constSortNoArgs14);
      IStrategoTerm term402 = term;
      Success813:
      { 
        Fail1992:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1992;
          if(true)
            break Success813;
        }
        term = term402;
        IStrategoTerm u_127 = null;
        u_127 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_127, extraction.const388);
        if(term == null)
          break Fail1991;
        if(true)
          break Fail1991;
      }
      term = r_127;
      s_127 = r_127;
      if(p_127.value == null)
        break Fail1991;
      term = termFactory.makeTuple(p_127.value, extraction.constSort26);
      IStrategoTerm term403 = term;
      Success814:
      { 
        Fail1993:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1993;
          if(true)
            break Success814;
        }
        term = term403;
        IStrategoTerm w_127 = null;
        w_127 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_127, extraction.const388);
        if(term == null)
          break Fail1991;
        if(true)
          break Fail1991;
      }
      term = s_127;
      y_127 = s_127;
      x_127 = term;
      term = y_127;
      IStrategoList list88;
      list88 = checkListTail(x_127);
      if(list88 == null)
        break Fail1991;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs67, list88);
      if(true)
        return term;
    }
    return null;
  }
}