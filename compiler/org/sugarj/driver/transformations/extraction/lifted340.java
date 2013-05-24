package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted340 extends Strategy 
{ 
  TermReference m_248;

  TermReference n_248;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1461:
    { 
      IStrategoTerm r_248 = null;
      IStrategoTerm s_248 = null;
      IStrategoTerm z_248 = null;
      IStrategoTerm a_249 = null;
      r_248 = term;
      if(m_248.value == null)
        break Fail1461;
      term = termFactory.makeTuple(m_248.value, extraction.constSort42);
      IStrategoTerm term722 = term;
      Success493:
      { 
        Fail1462:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1462;
          if(true)
            break Success493;
        }
        term = term722;
        IStrategoTerm u_248 = null;
        u_248 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_248, extraction.const59);
        if(term == null)
          break Fail1461;
        if(true)
          break Fail1461;
      }
      term = r_248;
      s_248 = r_248;
      if(n_248.value == null)
        break Fail1461;
      term = termFactory.makeTuple(n_248.value, extraction.constSortNoArgs48);
      IStrategoTerm term723 = term;
      Success494:
      { 
        Fail1463:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1463;
          if(true)
            break Success494;
        }
        term = term723;
        IStrategoTerm y_248 = null;
        y_248 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_248, extraction.const59);
        if(term == null)
          break Fail1461;
        if(true)
          break Fail1461;
      }
      term = s_248;
      a_249 = s_248;
      z_248 = term;
      term = a_249;
      IStrategoList list298;
      list298 = checkListTail(z_248);
      if(list298 == null)
        break Fail1461;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs49, list298);
      if(true)
        return term;
    }
    return null;
  }
}