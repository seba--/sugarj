package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted345 extends Strategy 
{ 
  TermReference z_250;

  TermReference a_251;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1451:
    { 
      IStrategoTerm c_251 = null;
      IStrategoTerm d_251 = null;
      IStrategoTerm i_251 = null;
      IStrategoTerm k_251 = null;
      c_251 = term;
      if(z_250.value == null)
        break Fail1451;
      term = termFactory.makeTuple(z_250.value, extraction.constSortNoArgs8);
      IStrategoTerm term727 = term;
      Success488:
      { 
        Fail1452:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1452;
          if(true)
            break Success488;
        }
        term = term727;
        IStrategoTerm f_251 = null;
        f_251 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_251, extraction.const531);
        if(term == null)
          break Fail1451;
        if(true)
          break Fail1451;
      }
      term = c_251;
      d_251 = c_251;
      if(a_251.value == null)
        break Fail1451;
      term = termFactory.makeTuple(a_251.value, extraction.constSort39);
      IStrategoTerm term728 = term;
      Success489:
      { 
        Fail1453:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1453;
          if(true)
            break Success489;
        }
        term = term728;
        IStrategoTerm h_251 = null;
        h_251 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_251, extraction.const531);
        if(term == null)
          break Fail1451;
        if(true)
          break Fail1451;
      }
      term = d_251;
      k_251 = d_251;
      i_251 = term;
      term = k_251;
      IStrategoList list303;
      list303 = checkListTail(i_251);
      if(list303 == null)
        break Fail1451;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list303);
      if(true)
        return term;
    }
    return null;
  }
}