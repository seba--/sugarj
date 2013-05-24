package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted49 extends Strategy 
{ 
  TermReference d_93;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2173:
    { 
      IStrategoTerm h_93 = null;
      IStrategoTerm p_93 = null;
      IStrategoTerm q_93 = null;
      h_93 = term;
      if(d_93.value == null)
        break Fail2173;
      term = termFactory.makeTuple(d_93.value, extraction.constSort12);
      IStrategoTerm term302 = term;
      Success914:
      { 
        Fail2174:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2174;
          if(true)
            break Success914;
        }
        term = term302;
        IStrategoTerm o_93 = null;
        o_93 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_93, extraction.const334);
        if(term == null)
          break Fail2173;
        if(true)
          break Fail2173;
      }
      term = h_93;
      q_93 = h_93;
      p_93 = term;
      term = q_93;
      IStrategoList list7;
      list7 = checkListTail(p_93);
      if(list7 == null)
        break Fail2173;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs193, list7);
      if(true)
        return term;
    }
    return null;
  }
}