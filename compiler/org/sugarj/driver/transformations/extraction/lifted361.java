package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted361 extends Strategy 
{ 
  TermReference z_260;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1405:
    { 
      IStrategoTerm b_261 = null;
      IStrategoTerm f_261 = null;
      IStrategoTerm g_261 = null;
      b_261 = term;
      if(z_260.value == null)
        break Fail1405;
      term = termFactory.makeTuple(z_260.value, extraction.constSortNoArgs41);
      IStrategoTerm term758 = term;
      Success458:
      { 
        Fail1406:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1406;
          if(true)
            break Success458;
        }
        term = term758;
        IStrategoTerm e_261 = null;
        e_261 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_261, extraction.const544);
        if(term == null)
          break Fail1405;
        if(true)
          break Fail1405;
      }
      term = b_261;
      g_261 = b_261;
      f_261 = term;
      term = g_261;
      IStrategoList list319;
      list319 = checkListTail(f_261);
      if(list319 == null)
        break Fail1405;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list319);
      if(true)
        return term;
    }
    return null;
  }
}