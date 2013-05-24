package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted230 extends Strategy 
{ 
  TermReference c_186;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1763:
    { 
      IStrategoTerm e_186 = null;
      IStrategoTerm h_186 = null;
      IStrategoTerm i_186 = null;
      e_186 = term;
      if(c_186.value == null)
        break Fail1763;
      term = termFactory.makeTuple(c_186.value, extraction.constSortNoArgs169);
      IStrategoTerm term531 = term;
      Success685:
      { 
        Fail1764:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1764;
          if(true)
            break Success685;
        }
        term = term531;
        IStrategoTerm g_186 = null;
        g_186 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_186, extraction.const183);
        if(term == null)
          break Fail1763;
        if(true)
          break Fail1763;
      }
      term = e_186;
      i_186 = e_186;
      h_186 = term;
      term = i_186;
      IStrategoList list188;
      list188 = checkListTail(h_186);
      if(list188 == null)
        break Fail1763;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs172, list188);
      if(true)
        return term;
    }
    return null;
  }
}