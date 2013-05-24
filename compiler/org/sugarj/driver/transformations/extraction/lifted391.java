package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted391 extends Strategy 
{ 
  TermReference b_276;

  TermReference c_276;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1333:
    { 
      IStrategoTerm e_276 = null;
      IStrategoTerm f_276 = null;
      IStrategoTerm k_276 = null;
      IStrategoTerm l_276 = null;
      e_276 = term;
      if(b_276.value == null)
        break Fail1333;
      term = termFactory.makeTuple(b_276.value, extraction.constSortNoArgs76);
      IStrategoTerm term799 = term;
      Success416:
      { 
        Fail1334:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1334;
          if(true)
            break Success416;
        }
        term = term799;
        IStrategoTerm h_276 = null;
        h_276 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_276, extraction.const565);
        if(term == null)
          break Fail1333;
        if(true)
          break Fail1333;
      }
      term = e_276;
      f_276 = e_276;
      if(c_276.value == null)
        break Fail1333;
      term = termFactory.makeTuple(c_276.value, extraction.constSortNoArgs71);
      IStrategoTerm term800 = term;
      Success417:
      { 
        Fail1335:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1335;
          if(true)
            break Success417;
        }
        term = term800;
        IStrategoTerm j_276 = null;
        j_276 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_276, extraction.const565);
        if(term == null)
          break Fail1333;
        if(true)
          break Fail1333;
      }
      term = f_276;
      l_276 = f_276;
      k_276 = term;
      term = l_276;
      IStrategoList list349;
      list349 = checkListTail(k_276);
      if(list349 == null)
        break Fail1333;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list349);
      if(true)
        return term;
    }
    return null;
  }
}