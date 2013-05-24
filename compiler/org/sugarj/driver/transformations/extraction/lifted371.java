package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted371 extends Strategy 
{ 
  TermReference v_266;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1377:
    { 
      IStrategoTerm x_266 = null;
      IStrategoTerm a_267 = null;
      IStrategoTerm b_267 = null;
      x_266 = term;
      if(v_266.value == null)
        break Fail1377;
      term = termFactory.makeTuple(v_266.value, extraction.constSort44);
      IStrategoTerm term776 = term;
      Success440:
      { 
        Fail1378:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1378;
          if(true)
            break Success440;
        }
        term = term776;
        IStrategoTerm z_266 = null;
        z_266 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_266, extraction.const551);
        if(term == null)
          break Fail1377;
        if(true)
          break Fail1377;
      }
      term = x_266;
      b_267 = x_266;
      a_267 = term;
      term = b_267;
      IStrategoList list329;
      list329 = checkListTail(a_267);
      if(list329 == null)
        break Fail1377;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs65, list329);
      if(true)
        return term;
    }
    return null;
  }
}