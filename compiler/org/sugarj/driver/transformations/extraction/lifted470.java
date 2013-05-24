package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted470 extends Strategy 
{ 
  TermReference x_324;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1162:
    { 
      IStrategoTerm z_324 = null;
      IStrategoTerm c_325 = null;
      IStrategoTerm d_325 = null;
      z_324 = term;
      if(x_324.value == null)
        break Fail1162;
      term = termFactory.makeTuple(x_324.value, extraction.constSortNoArgs279);
      IStrategoTerm term892 = term;
      Success324:
      { 
        Fail1163:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1163;
          if(true)
            break Success324;
        }
        term = term892;
        IStrategoTerm b_325 = null;
        b_325 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_325, extraction.const637);
        if(term == null)
          break Fail1162;
        if(true)
          break Fail1162;
      }
      term = z_324;
      d_325 = z_324;
      c_325 = term;
      term = d_325;
      IStrategoList list428;
      list428 = checkListTail(c_325);
      if(list428 == null)
        break Fail1162;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs277, list428);
      if(true)
        return term;
    }
    return null;
  }
}