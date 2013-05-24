package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted389 extends Strategy 
{ 
  TermReference x_274;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1338:
    { 
      IStrategoTerm d_275 = null;
      IStrategoTerm h_275 = null;
      IStrategoTerm i_275 = null;
      d_275 = term;
      if(x_274.value == null)
        break Fail1338;
      term = termFactory.makeTuple(x_274.value, extraction.constSortNoArgs36);
      IStrategoTerm term797 = term;
      Success419:
      { 
        Fail1339:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1339;
          if(true)
            break Success419;
        }
        term = term797;
        IStrategoTerm g_275 = null;
        g_275 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_275, extraction.const564);
        if(term == null)
          break Fail1338;
        if(true)
          break Fail1338;
      }
      term = d_275;
      i_275 = d_275;
      h_275 = term;
      term = i_275;
      IStrategoList list347;
      list347 = checkListTail(h_275);
      if(list347 == null)
        break Fail1338;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs76, list347);
      if(true)
        return term;
    }
    return null;
  }
}