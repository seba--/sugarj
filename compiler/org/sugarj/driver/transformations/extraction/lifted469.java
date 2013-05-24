package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted469 extends Strategy 
{ 
  TermReference m_324;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1164:
    { 
      IStrategoTerm o_324 = null;
      IStrategoTerm r_324 = null;
      IStrategoTerm s_324 = null;
      o_324 = term;
      if(m_324.value == null)
        break Fail1164;
      term = termFactory.makeTuple(m_324.value, extraction.constSortNoArgs284);
      IStrategoTerm term891 = term;
      Success325:
      { 
        Fail1165:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1165;
          if(true)
            break Success325;
        }
        term = term891;
        IStrategoTerm q_324 = null;
        q_324 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_324, extraction.const636);
        if(term == null)
          break Fail1164;
        if(true)
          break Fail1164;
      }
      term = o_324;
      s_324 = o_324;
      r_324 = term;
      term = s_324;
      IStrategoList list427;
      list427 = checkListTail(r_324);
      if(list427 == null)
        break Fail1164;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs277, list427);
      if(true)
        return term;
    }
    return null;
  }
}