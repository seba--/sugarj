package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted261 extends Strategy 
{ 
  TermReference o_203;

  TermReference p_203;

  TermReference r_203;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1657:
    { 
      IStrategoTerm y_203 = null;
      IStrategoTerm z_203 = null;
      IStrategoTerm a_204 = null;
      IStrategoTerm p_204 = null;
      IStrategoTerm q_204 = null;
      y_203 = term;
      if(o_203.value == null)
        break Fail1657;
      term = termFactory.makeTuple(o_203.value, extraction.constSortNoArgs41);
      IStrategoTerm term604 = term;
      Success610:
      { 
        Fail1658:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1658;
          if(true)
            break Success610;
        }
        term = term604;
        IStrategoTerm k_204 = null;
        k_204 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_204, extraction.const190);
        if(term == null)
          break Fail1657;
        if(true)
          break Fail1657;
      }
      term = y_203;
      z_203 = y_203;
      if(p_203.value == null)
        break Fail1657;
      term = termFactory.makeTuple(p_203.value, extraction.constSortNoArgs41);
      IStrategoTerm term605 = term;
      Success611:
      { 
        Fail1659:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1659;
          if(true)
            break Success611;
        }
        term = term605;
        IStrategoTerm m_204 = null;
        m_204 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_204, extraction.const190);
        if(term == null)
          break Fail1657;
        if(true)
          break Fail1657;
      }
      term = z_203;
      a_204 = z_203;
      if(r_203.value == null)
        break Fail1657;
      term = termFactory.makeTuple(r_203.value, extraction.constSort37);
      IStrategoTerm term606 = term;
      Success612:
      { 
        Fail1660:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1660;
          if(true)
            break Success612;
        }
        term = term606;
        IStrategoTerm o_204 = null;
        o_204 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_204, extraction.const190);
        if(term == null)
          break Fail1657;
        if(true)
          break Fail1657;
      }
      term = a_204;
      q_204 = a_204;
      p_204 = term;
      term = q_204;
      IStrategoList list219;
      list219 = checkListTail(p_204);
      if(list219 == null)
        break Fail1657;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs179, list219);
      if(true)
        return term;
    }
    return null;
  }
}