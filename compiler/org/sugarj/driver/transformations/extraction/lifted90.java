package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted90 extends Strategy 
{ 
  TermReference d_109;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2086:
    { 
      IStrategoTerm f_109 = null;
      IStrategoTerm i_109 = null;
      IStrategoTerm j_109 = null;
      f_109 = term;
      if(d_109.value == null)
        break Fail2086;
      term = termFactory.makeTuple(d_109.value, extraction.constSortNoArgs91);
      IStrategoTerm term348 = term;
      Success868:
      { 
        Fail2087:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2087;
          if(true)
            break Success868;
        }
        term = term348;
        IStrategoTerm h_109 = null;
        h_109 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_109, extraction.const361);
        if(term == null)
          break Fail2086;
        if(true)
          break Fail2086;
      }
      term = f_109;
      j_109 = f_109;
      i_109 = term;
      term = j_109;
      IStrategoList list48;
      list48 = checkListTail(i_109);
      if(list48 == null)
        break Fail2086;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs144, list48);
      if(true)
        return term;
    }
    return null;
  }
}