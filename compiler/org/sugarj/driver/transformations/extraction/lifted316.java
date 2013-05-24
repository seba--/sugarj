package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted316 extends Strategy 
{ 
  TermReference i_236;

  TermReference j_236;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1520:
    { 
      IStrategoTerm l_236 = null;
      IStrategoTerm m_236 = null;
      IStrategoTerm w_236 = null;
      IStrategoTerm x_236 = null;
      l_236 = term;
      if(i_236.value == null)
        break Fail1520;
      term = termFactory.makeTuple(i_236.value, extraction.constSortNoArgs41);
      IStrategoTerm term687 = term;
      Success528:
      { 
        Fail1521:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1521;
          if(true)
            break Success528;
        }
        term = term687;
        IStrategoTerm s_236 = null;
        s_236 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_236, extraction.const513);
        if(term == null)
          break Fail1520;
        if(true)
          break Fail1520;
      }
      term = l_236;
      m_236 = l_236;
      if(j_236.value == null)
        break Fail1520;
      term = termFactory.makeTuple(j_236.value, extraction.constSortNoArgs41);
      IStrategoTerm term688 = term;
      Success529:
      { 
        Fail1522:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1522;
          if(true)
            break Success529;
        }
        term = term688;
        IStrategoTerm v_236 = null;
        v_236 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_236, extraction.const513);
        if(term == null)
          break Fail1520;
        if(true)
          break Fail1520;
      }
      term = m_236;
      x_236 = m_236;
      w_236 = term;
      term = x_236;
      IStrategoList list274;
      list274 = checkListTail(w_236);
      if(list274 == null)
        break Fail1520;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list274);
      if(true)
        return term;
    }
    return null;
  }
}