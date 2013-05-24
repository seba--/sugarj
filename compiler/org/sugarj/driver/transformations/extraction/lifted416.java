package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted416 extends Strategy 
{ 
  TermReference a_298;

  TermReference b_298;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1282:
    { 
      IStrategoTerm d_298 = null;
      IStrategoTerm e_298 = null;
      IStrategoTerm j_298 = null;
      IStrategoTerm k_298 = null;
      d_298 = term;
      if(a_298.value == null)
        break Fail1282;
      term = termFactory.makeTuple(a_298.value, extraction.constSortNoArgs299);
      IStrategoTerm term825 = term;
      Success390:
      { 
        Fail1283:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1283;
          if(true)
            break Success390;
        }
        term = term825;
        IStrategoTerm g_298 = null;
        g_298 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_298, extraction.const588);
        if(term == null)
          break Fail1282;
        if(true)
          break Fail1282;
      }
      term = d_298;
      e_298 = d_298;
      if(b_298.value == null)
        break Fail1282;
      term = termFactory.makeTuple(b_298.value, extraction.constSortNoArgs299);
      IStrategoTerm term826 = term;
      Success391:
      { 
        Fail1284:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1284;
          if(true)
            break Success391;
        }
        term = term826;
        IStrategoTerm i_298 = null;
        i_298 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_298, extraction.const588);
        if(term == null)
          break Fail1282;
        if(true)
          break Fail1282;
      }
      term = e_298;
      k_298 = e_298;
      j_298 = term;
      term = k_298;
      IStrategoList list374;
      list374 = checkListTail(j_298);
      if(list374 == null)
        break Fail1282;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs299, list374);
      if(true)
        return term;
    }
    return null;
  }
}