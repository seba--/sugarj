package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted131 extends Strategy 
{ 
  TermReference d_128;

  TermReference e_128;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1988:
    { 
      IStrategoTerm g_128 = null;
      IStrategoTerm h_128 = null;
      IStrategoTerm o_128 = null;
      IStrategoTerm r_128 = null;
      g_128 = term;
      if(d_128.value == null)
        break Fail1988;
      term = termFactory.makeTuple(d_128.value, extraction.constSortNoArgs94);
      IStrategoTerm term404 = term;
      Success811:
      { 
        Fail1989:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1989;
          if(true)
            break Success811;
        }
        term = term404;
        IStrategoTerm l_128 = null;
        l_128 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_128, extraction.const389);
        if(term == null)
          break Fail1988;
        if(true)
          break Fail1988;
      }
      term = g_128;
      h_128 = g_128;
      if(e_128.value == null)
        break Fail1988;
      term = termFactory.makeTuple(e_128.value, extraction.constSortNoArgs115);
      IStrategoTerm term405 = term;
      Success812:
      { 
        Fail1990:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1990;
          if(true)
            break Success812;
        }
        term = term405;
        IStrategoTerm n_128 = null;
        n_128 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_128, extraction.const389);
        if(term == null)
          break Fail1988;
        if(true)
          break Fail1988;
      }
      term = h_128;
      r_128 = h_128;
      o_128 = term;
      term = r_128;
      IStrategoList list89;
      list89 = checkListTail(o_128);
      if(list89 == null)
        break Fail1988;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs117, list89);
      if(true)
        return term;
    }
    return null;
  }
}