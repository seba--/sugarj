package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted348 extends Strategy 
{ 
  TermReference x_252;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1443:
    { 
      IStrategoTerm z_252 = null;
      IStrategoTerm d_253 = null;
      IStrategoTerm e_253 = null;
      z_252 = term;
      if(x_252.value == null)
        break Fail1443;
      term = termFactory.makeTuple(x_252.value, extraction.constSortNoArgs8);
      IStrategoTerm term733 = term;
      Success483:
      { 
        Fail1444:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1444;
          if(true)
            break Success483;
        }
        term = term733;
        IStrategoTerm c_253 = null;
        c_253 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_253, extraction.const212);
        if(term == null)
          break Fail1443;
        if(true)
          break Fail1443;
      }
      term = z_252;
      e_253 = z_252;
      d_253 = term;
      term = e_253;
      IStrategoList list306;
      list306 = checkListTail(d_253);
      if(list306 == null)
        break Fail1443;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs201, list306);
      if(true)
        return term;
    }
    return null;
  }
}