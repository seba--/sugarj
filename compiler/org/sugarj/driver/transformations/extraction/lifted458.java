package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted458 extends Strategy 
{ 
  TermReference z_318;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1187:
    { 
      IStrategoTerm e_319 = null;
      IStrategoTerm i_319 = null;
      IStrategoTerm j_319 = null;
      e_319 = term;
      if(z_318.value == null)
        break Fail1187;
      term = termFactory.makeTuple(z_318.value, extraction.constSortNoArgs71);
      IStrategoTerm term879 = term;
      Success337:
      { 
        Fail1188:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1188;
          if(true)
            break Success337;
        }
        term = term879;
        IStrategoTerm h_319 = null;
        h_319 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_319, extraction.const625);
        if(term == null)
          break Fail1187;
        if(true)
          break Fail1187;
      }
      term = e_319;
      j_319 = e_319;
      i_319 = term;
      term = j_319;
      IStrategoList list416;
      list416 = checkListTail(i_319);
      if(list416 == null)
        break Fail1187;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list416);
      if(true)
        return term;
    }
    return null;
  }
}