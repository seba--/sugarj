package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted207 extends Strategy 
{ 
  TermReference m_172;

  TermReference n_172;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1826:
    { 
      IStrategoTerm p_172 = null;
      IStrategoTerm s_172 = null;
      IStrategoTerm y_172 = null;
      IStrategoTerm z_172 = null;
      p_172 = term;
      if(m_172.value == null)
        break Fail1826;
      term = termFactory.makeTuple(m_172.value, extraction.constSortNoArgs30);
      IStrategoTerm term490 = term;
      Success725:
      { 
        Fail1827:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1827;
          if(true)
            break Success725;
        }
        term = term490;
        IStrategoTerm v_172 = null;
        v_172 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_172, extraction.const435);
        if(term == null)
          break Fail1826;
        if(true)
          break Fail1826;
      }
      term = p_172;
      s_172 = p_172;
      if(n_172.value == null)
        break Fail1826;
      term = termFactory.makeTuple(n_172.value, extraction.constSortNoArgs156);
      IStrategoTerm term491 = term;
      Success726:
      { 
        Fail1828:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1828;
          if(true)
            break Success726;
        }
        term = term491;
        IStrategoTerm x_172 = null;
        x_172 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_172, extraction.const435);
        if(term == null)
          break Fail1826;
        if(true)
          break Fail1826;
      }
      term = s_172;
      z_172 = s_172;
      y_172 = term;
      term = z_172;
      IStrategoList list165;
      list165 = checkListTail(y_172);
      if(list165 == null)
        break Fail1826;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs93, list165);
      if(true)
        return term;
    }
    return null;
  }
}