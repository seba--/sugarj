package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted87 extends Strategy 
{ 
  TermReference b_107;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2096:
    { 
      IStrategoTerm d_107 = null;
      IStrategoTerm h_107 = null;
      IStrategoTerm j_107 = null;
      d_107 = term;
      if(b_107.value == null)
        break Fail2096;
      term = termFactory.makeTuple(b_107.value, extraction.constSortNoArgs88);
      IStrategoTerm term341 = term;
      Success875:
      { 
        Fail2097:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2097;
          if(true)
            break Success875;
        }
        term = term341;
        IStrategoTerm g_107 = null;
        g_107 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_107, extraction.const358);
        if(term == null)
          break Fail2096;
        if(true)
          break Fail2096;
      }
      term = d_107;
      j_107 = d_107;
      h_107 = term;
      term = j_107;
      IStrategoList list45;
      list45 = checkListTail(h_107);
      if(list45 == null)
        break Fail2096;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs313, list45);
      if(true)
        return term;
    }
    return null;
  }
}