package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted306 extends Strategy 
{ 
  TermReference l_230;

  TermReference m_230;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1545:
    { 
      IStrategoTerm o_230 = null;
      IStrategoTerm p_230 = null;
      IStrategoTerm y_230 = null;
      IStrategoTerm z_230 = null;
      o_230 = term;
      if(l_230.value == null)
        break Fail1545;
      term = termFactory.makeTuple(l_230.value, extraction.constSortNoArgs51);
      IStrategoTerm term672 = term;
      Success543:
      { 
        Fail1546:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1546;
          if(true)
            break Success543;
        }
        term = term672;
        IStrategoTerm v_230 = null;
        v_230 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_230, extraction.const507);
        if(term == null)
          break Fail1545;
        if(true)
          break Fail1545;
      }
      term = o_230;
      p_230 = o_230;
      if(m_230.value == null)
        break Fail1545;
      term = termFactory.makeTuple(m_230.value, extraction.constSort39);
      IStrategoTerm term673 = term;
      Success544:
      { 
        Fail1547:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1547;
          if(true)
            break Success544;
        }
        term = term673;
        IStrategoTerm x_230 = null;
        x_230 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_230, extraction.const507);
        if(term == null)
          break Fail1545;
        if(true)
          break Fail1545;
      }
      term = p_230;
      z_230 = p_230;
      y_230 = term;
      term = z_230;
      IStrategoList list264;
      list264 = checkListTail(y_230);
      if(list264 == null)
        break Fail1545;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs41, list264);
      if(true)
        return term;
    }
    return null;
  }
}