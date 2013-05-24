package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted480 extends Strategy 
{ 
  TermReference r_329;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1141:
    { 
      IStrategoTerm t_329 = null;
      IStrategoTerm w_329 = null;
      IStrategoTerm x_329 = null;
      t_329 = term;
      if(r_329.value == null)
        break Fail1141;
      term = termFactory.makeTuple(r_329.value, extraction.constSortNoArgs66);
      IStrategoTerm term903 = term;
      Success313:
      { 
        Fail1142:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1142;
          if(true)
            break Success313;
        }
        term = term903;
        IStrategoTerm v_329 = null;
        v_329 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_329, extraction.const647);
        if(term == null)
          break Fail1141;
        if(true)
          break Fail1141;
      }
      term = t_329;
      x_329 = t_329;
      w_329 = term;
      term = x_329;
      IStrategoList list438;
      list438 = checkListTail(w_329);
      if(list438 == null)
        break Fail1141;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs230, list438);
      if(true)
        return term;
    }
    return null;
  }
}