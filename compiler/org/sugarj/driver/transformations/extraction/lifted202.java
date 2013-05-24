package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted202 extends Strategy 
{ 
  TermReference t_169;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1837:
    { 
      IStrategoTerm v_169 = null;
      IStrategoTerm y_169 = null;
      IStrategoTerm z_169 = null;
      v_169 = term;
      if(t_169.value == null)
        break Fail1837;
      term = termFactory.makeTuple(t_169.value, extraction.constSortNoArgs8);
      IStrategoTerm term485 = term;
      Success731:
      { 
        Fail1838:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1838;
          if(true)
            break Success731;
        }
        term = term485;
        IStrategoTerm x_169 = null;
        x_169 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_169, extraction.const6);
        if(term == null)
          break Fail1837;
        if(true)
          break Fail1837;
      }
      term = v_169;
      z_169 = v_169;
      y_169 = term;
      term = z_169;
      IStrategoList list160;
      list160 = checkListTail(y_169);
      if(list160 == null)
        break Fail1837;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs30, list160);
      if(true)
        return term;
    }
    return null;
  }
}