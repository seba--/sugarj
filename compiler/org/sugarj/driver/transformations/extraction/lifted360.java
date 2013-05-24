package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted360 extends Strategy 
{ 
  TermReference j_260;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1407:
    { 
      IStrategoTerm m_260 = null;
      IStrategoTerm t_260 = null;
      IStrategoTerm u_260 = null;
      m_260 = term;
      if(j_260.value == null)
        break Fail1407;
      term = termFactory.makeTuple(j_260.value, extraction.constSortNoArgs41);
      IStrategoTerm term757 = term;
      Success459:
      { 
        Fail1408:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1408;
          if(true)
            break Success459;
        }
        term = term757;
        IStrategoTerm s_260 = null;
        s_260 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_260, extraction.const543);
        if(term == null)
          break Fail1407;
        if(true)
          break Fail1407;
      }
      term = m_260;
      u_260 = m_260;
      t_260 = term;
      term = u_260;
      IStrategoList list318;
      list318 = checkListTail(t_260);
      if(list318 == null)
        break Fail1407;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list318);
      if(true)
        return term;
    }
    return null;
  }
}