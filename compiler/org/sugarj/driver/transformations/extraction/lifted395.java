package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted395 extends Strategy 
{ 
  TermReference c_278;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1325:
    { 
      IStrategoTerm f_278 = null;
      IStrategoTerm i_278 = null;
      IStrategoTerm j_278 = null;
      f_278 = term;
      if(c_278.value == null)
        break Fail1325;
      term = termFactory.makeTuple(c_278.value, extraction.constSortNoArgs29);
      IStrategoTerm term804 = term;
      Success412:
      { 
        Fail1326:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1326;
          if(true)
            break Success412;
        }
        term = term804;
        IStrategoTerm h_278 = null;
        h_278 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_278, extraction.const569);
        if(term == null)
          break Fail1325;
        if(true)
          break Fail1325;
      }
      term = f_278;
      j_278 = f_278;
      i_278 = term;
      term = j_278;
      IStrategoList list353;
      list353 = checkListTail(i_278);
      if(list353 == null)
        break Fail1325;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list353);
      if(true)
        return term;
    }
    return null;
  }
}