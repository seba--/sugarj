package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted138 extends Strategy 
{ 
  TermReference k_135;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1964:
    { 
      IStrategoTerm o_135 = null;
      IStrategoTerm y_135 = null;
      IStrategoTerm b_136 = null;
      o_135 = term;
      if(k_135.value == null)
        break Fail1964;
      term = termFactory.makeTuple(k_135.value, extraction.constSortNoArgs98);
      IStrategoTerm term422 = term;
      Success794:
      { 
        Fail1965:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1965;
          if(true)
            break Success794;
        }
        term = term422;
        IStrategoTerm u_135 = null;
        u_135 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_135, extraction.const392);
        if(term == null)
          break Fail1964;
        if(true)
          break Fail1964;
      }
      term = o_135;
      b_136 = o_135;
      y_135 = term;
      term = b_136;
      IStrategoList list96;
      list96 = checkListTail(y_135);
      if(list96 == null)
        break Fail1964;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs115, list96);
      if(true)
        return term;
    }
    return null;
  }
}