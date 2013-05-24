package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted331 extends Strategy 
{ 
  TermReference f_243;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1485:
    { 
      IStrategoTerm h_243 = null;
      IStrategoTerm k_243 = null;
      IStrategoTerm l_243 = null;
      h_243 = term;
      if(f_243.value == null)
        break Fail1485;
      term = termFactory.makeTuple(f_243.value, extraction.constSortNoArgs26);
      IStrategoTerm term708 = term;
      Success508:
      { 
        Fail1486:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1486;
          if(true)
            break Success508;
        }
        term = term708;
        IStrategoTerm j_243 = null;
        j_243 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_243, extraction.const523);
        if(term == null)
          break Fail1485;
        if(true)
          break Fail1485;
      }
      term = h_243;
      l_243 = h_243;
      k_243 = term;
      term = l_243;
      IStrategoList list289;
      list289 = checkListTail(k_243);
      if(list289 == null)
        break Fail1485;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs30, list289);
      if(true)
        return term;
    }
    return null;
  }
}