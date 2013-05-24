package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted484 extends Strategy 
{ 
  TermReference x_331;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1129:
    { 
      IStrategoTerm z_331 = null;
      IStrategoTerm c_332 = null;
      IStrategoTerm d_332 = null;
      z_331 = term;
      if(x_331.value == null)
        break Fail1129;
      term = termFactory.makeTuple(x_331.value, extraction.constSortNoArgs39);
      IStrategoTerm term911 = term;
      Success305:
      { 
        Fail1130:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1130;
          if(true)
            break Success305;
        }
        term = term911;
        IStrategoTerm b_332 = null;
        b_332 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_332, extraction.const650);
        if(term == null)
          break Fail1129;
        if(true)
          break Fail1129;
      }
      term = z_331;
      d_332 = z_331;
      c_332 = term;
      term = d_332;
      IStrategoList list442;
      list442 = checkListTail(c_332);
      if(list442 == null)
        break Fail1129;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs315, list442);
      if(true)
        return term;
    }
    return null;
  }
}