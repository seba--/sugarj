package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted334 extends Strategy 
{ 
  TermReference z_244;

  TermReference a_245;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1476:
    { 
      IStrategoTerm c_245 = null;
      IStrategoTerm d_245 = null;
      IStrategoTerm i_245 = null;
      IStrategoTerm k_245 = null;
      c_245 = term;
      if(z_244.value == null)
        break Fail1476;
      term = termFactory.makeTuple(z_244.value, extraction.constSortNoArgs18);
      IStrategoTerm term713 = term;
      Success502:
      { 
        Fail1477:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1477;
          if(true)
            break Success502;
        }
        term = term713;
        IStrategoTerm f_245 = null;
        f_245 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_245, extraction.const525);
        if(term == null)
          break Fail1476;
        if(true)
          break Fail1476;
      }
      term = c_245;
      d_245 = c_245;
      if(a_245.value == null)
        break Fail1476;
      term = termFactory.makeTuple(a_245.value, extraction.constSortNoArgs45);
      IStrategoTerm term714 = term;
      Success503:
      { 
        Fail1478:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1478;
          if(true)
            break Success503;
        }
        term = term714;
        IStrategoTerm h_245 = null;
        h_245 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_245, extraction.const525);
        if(term == null)
          break Fail1476;
        if(true)
          break Fail1476;
      }
      term = d_245;
      k_245 = d_245;
      i_245 = term;
      term = k_245;
      IStrategoList list292;
      list292 = checkListTail(i_245);
      if(list292 == null)
        break Fail1476;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs208, list292);
      if(true)
        return term;
    }
    return null;
  }
}