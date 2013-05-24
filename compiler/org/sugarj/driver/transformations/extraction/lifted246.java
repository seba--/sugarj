package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted246 extends Strategy 
{ 
  TermReference p_194;

  TermReference q_194;

  TermReference r_194;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1711:
    { 
      IStrategoTerm w_194 = null;
      IStrategoTerm x_194 = null;
      IStrategoTerm y_194 = null;
      IStrategoTerm p_195 = null;
      IStrategoTerm q_195 = null;
      w_194 = term;
      if(p_194.value == null)
        break Fail1711;
      term = termFactory.makeTuple(p_194.value, extraction.constSortNoArgs0);
      IStrategoTerm term565 = term;
      Success649:
      { 
        Fail1712:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1712;
          if(true)
            break Success649;
        }
        term = term565;
        IStrategoTerm i_195 = null;
        i_195 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_195, extraction.const459);
        if(term == null)
          break Fail1711;
        if(true)
          break Fail1711;
      }
      term = w_194;
      x_194 = w_194;
      if(q_194.value == null)
        break Fail1711;
      term = termFactory.makeTuple(q_194.value, extraction.constSortNoArgs103);
      IStrategoTerm term566 = term;
      Success650:
      { 
        Fail1713:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1713;
          if(true)
            break Success650;
        }
        term = term566;
        IStrategoTerm m_195 = null;
        m_195 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_195, extraction.const459);
        if(term == null)
          break Fail1711;
        if(true)
          break Fail1711;
      }
      term = x_194;
      y_194 = x_194;
      if(r_194.value == null)
        break Fail1711;
      term = termFactory.makeTuple(r_194.value, extraction.constSortNoArgs0);
      IStrategoTerm term567 = term;
      Success651:
      { 
        Fail1714:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1714;
          if(true)
            break Success651;
        }
        term = term567;
        IStrategoTerm o_195 = null;
        o_195 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_195, extraction.const459);
        if(term == null)
          break Fail1711;
        if(true)
          break Fail1711;
      }
      term = y_194;
      q_195 = y_194;
      p_195 = term;
      term = q_195;
      IStrategoList list204;
      list204 = checkListTail(p_195);
      if(list204 == null)
        break Fail1711;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list204);
      if(true)
        return term;
    }
    return null;
  }
}