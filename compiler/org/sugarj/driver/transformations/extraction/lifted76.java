package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted76 extends Strategy 
{ 
  TermReference x_102;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2118:
    { 
      IStrategoTerm a_103 = null;
      IStrategoTerm h_103 = null;
      IStrategoTerm i_103 = null;
      a_103 = term;
      if(x_102.value == null)
        break Fail2118;
      term = termFactory.makeTuple(x_102.value, extraction.constSortNoArgs64);
      IStrategoTerm term330 = term;
      Success886:
      { 
        Fail2119:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2119;
          if(true)
            break Success886;
        }
        term = term330;
        IStrategoTerm g_103 = null;
        g_103 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_103, extraction.const350);
        if(term == null)
          break Fail2118;
        if(true)
          break Fail2118;
      }
      term = a_103;
      i_103 = a_103;
      h_103 = term;
      term = i_103;
      IStrategoList list34;
      list34 = checkListTail(h_103);
      if(list34 == null)
        break Fail2118;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list34);
      if(true)
        return term;
    }
    return null;
  }
}