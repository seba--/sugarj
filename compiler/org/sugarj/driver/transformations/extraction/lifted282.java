package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted282 extends Strategy 
{ 
  TermReference g_215;

  TermReference h_215;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1606:
    { 
      IStrategoTerm j_215 = null;
      IStrategoTerm k_215 = null;
      IStrategoTerm q_215 = null;
      IStrategoTerm r_215 = null;
      j_215 = term;
      if(g_215.value == null)
        break Fail1606;
      term = termFactory.makeTuple(g_215.value, extraction.constSortNoArgs0);
      IStrategoTerm term635 = term;
      Success580:
      { 
        Fail1607:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1607;
          if(true)
            break Success580;
        }
        term = term635;
        IStrategoTerm m_215 = null;
        m_215 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_215, extraction.const488);
        if(term == null)
          break Fail1606;
        if(true)
          break Fail1606;
      }
      term = j_215;
      k_215 = j_215;
      if(h_215.value == null)
        break Fail1606;
      term = termFactory.makeTuple(h_215.value, extraction.constSortNoArgs186);
      IStrategoTerm term636 = term;
      Success581:
      { 
        Fail1608:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1608;
          if(true)
            break Success581;
        }
        term = term636;
        IStrategoTerm o_215 = null;
        o_215 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_215, extraction.const488);
        if(term == null)
          break Fail1606;
        if(true)
          break Fail1606;
      }
      term = k_215;
      r_215 = k_215;
      q_215 = term;
      term = r_215;
      IStrategoList list240;
      list240 = checkListTail(q_215);
      if(list240 == null)
        break Fail1606;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list240);
      if(true)
        return term;
    }
    return null;
  }
}