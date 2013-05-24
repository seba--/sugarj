package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted271 extends Strategy 
{ 
  TermReference c_210;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1631:
    { 
      IStrategoTerm e_210 = null;
      IStrategoTerm h_210 = null;
      IStrategoTerm i_210 = null;
      e_210 = term;
      if(c_210.value == null)
        break Fail1631;
      term = termFactory.makeTuple(c_210.value, extraction.constSortNoArgs0);
      IStrategoTerm term622 = term;
      Success594:
      { 
        Fail1632:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1632;
          if(true)
            break Success594;
        }
        term = term622;
        IStrategoTerm g_210 = null;
        g_210 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_210, extraction.const477);
        if(term == null)
          break Fail1631;
        if(true)
          break Fail1631;
      }
      term = e_210;
      i_210 = e_210;
      h_210 = term;
      term = i_210;
      IStrategoList list229;
      list229 = checkListTail(h_210);
      if(list229 == null)
        break Fail1631;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list229);
      if(true)
        return term;
    }
    return null;
  }
}