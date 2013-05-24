package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted378 extends Strategy 
{ 
  TermReference j_270;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1360:
    { 
      IStrategoTerm l_270 = null;
      IStrategoTerm q_270 = null;
      IStrategoTerm r_270 = null;
      l_270 = term;
      if(j_270.value == null)
        break Fail1360;
      term = termFactory.makeTuple(j_270.value, extraction.constSortNoArgs291);
      IStrategoTerm term786 = term;
      Success430:
      { 
        Fail1361:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1361;
          if(true)
            break Success430;
        }
        term = term786;
        IStrategoTerm p_270 = null;
        p_270 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_270, extraction.const556);
        if(term == null)
          break Fail1360;
        if(true)
          break Fail1360;
      }
      term = l_270;
      r_270 = l_270;
      q_270 = term;
      term = r_270;
      IStrategoList list336;
      list336 = checkListTail(q_270);
      if(list336 == null)
        break Fail1360;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs301, list336);
      if(true)
        return term;
    }
    return null;
  }
}