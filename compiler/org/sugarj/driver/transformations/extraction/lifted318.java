package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted318 extends Strategy 
{ 
  TermReference i_236;

  TermReference j_236;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1514:
    { 
      IStrategoTerm p_236 = null;
      IStrategoTerm q_236 = null;
      IStrategoTerm j_237 = null;
      IStrategoTerm l_237 = null;
      p_236 = term;
      if(i_236.value == null)
        break Fail1514;
      term = termFactory.makeTuple(i_236.value, extraction.constSortNoArgs41);
      IStrategoTerm term691 = term;
      Success524:
      { 
        Fail1515:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1515;
          if(true)
            break Success524;
        }
        term = term691;
        IStrategoTerm g_237 = null;
        g_237 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_237, extraction.const513);
        if(term == null)
          break Fail1514;
        if(true)
          break Fail1514;
      }
      term = p_236;
      q_236 = p_236;
      if(j_236.value == null)
        break Fail1514;
      term = termFactory.makeTuple(j_236.value, extraction.constSortNoArgs41);
      IStrategoTerm term692 = term;
      Success525:
      { 
        Fail1516:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1516;
          if(true)
            break Success525;
        }
        term = term692;
        IStrategoTerm i_237 = null;
        i_237 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_237, extraction.const513);
        if(term == null)
          break Fail1514;
        if(true)
          break Fail1514;
      }
      term = q_236;
      l_237 = q_236;
      j_237 = term;
      term = l_237;
      IStrategoList list276;
      list276 = checkListTail(j_237);
      if(list276 == null)
        break Fail1514;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list276);
      if(true)
        return term;
    }
    return null;
  }
}