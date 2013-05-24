package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted84 extends Strategy 
{ 
  TermReference m_105;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2102:
    { 
      IStrategoTerm p_105 = null;
      IStrategoTerm x_105 = null;
      IStrategoTerm y_105 = null;
      p_105 = term;
      if(m_105.value == null)
        break Fail2102;
      term = termFactory.makeTuple(m_105.value, extraction.constSortNoArgs57);
      IStrategoTerm term338 = term;
      Success878:
      { 
        Fail2103:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2103;
          if(true)
            break Success878;
        }
        term = term338;
        IStrategoTerm w_105 = null;
        w_105 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_105, extraction.const354);
        if(term == null)
          break Fail2102;
        if(true)
          break Fail2102;
      }
      term = p_105;
      y_105 = p_105;
      x_105 = term;
      term = y_105;
      IStrategoList list42;
      list42 = checkListTail(x_105);
      if(list42 == null)
        break Fail2102;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list42);
      if(true)
        return term;
    }
    return null;
  }
}