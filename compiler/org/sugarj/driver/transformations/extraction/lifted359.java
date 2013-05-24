package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted359 extends Strategy 
{ 
  TermReference j_260;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1409:
    { 
      IStrategoTerm l_260 = null;
      IStrategoTerm p_260 = null;
      IStrategoTerm q_260 = null;
      l_260 = term;
      if(j_260.value == null)
        break Fail1409;
      term = termFactory.makeTuple(j_260.value, extraction.constSortNoArgs41);
      IStrategoTerm term756 = term;
      Success460:
      { 
        Fail1410:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1410;
          if(true)
            break Success460;
        }
        term = term756;
        IStrategoTerm o_260 = null;
        o_260 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_260, extraction.const543);
        if(term == null)
          break Fail1409;
        if(true)
          break Fail1409;
      }
      term = l_260;
      q_260 = l_260;
      p_260 = term;
      term = q_260;
      IStrategoList list317;
      list317 = checkListTail(p_260);
      if(list317 == null)
        break Fail1409;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list317);
      if(true)
        return term;
    }
    return null;
  }
}