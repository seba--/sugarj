package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted287 extends Strategy 
{ 
  TermReference c_219;

  TermReference e_219;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1595:
    { 
      IStrategoTerm g_219 = null;
      IStrategoTerm h_219 = null;
      IStrategoTerm p_219 = null;
      IStrategoTerm q_219 = null;
      g_219 = term;
      if(c_219.value == null)
        break Fail1595;
      term = termFactory.makeTuple(c_219.value, extraction.constSort38);
      IStrategoTerm term641 = term;
      Success574:
      { 
        Fail1596:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1596;
          if(true)
            break Success574;
        }
        term = term641;
        IStrategoTerm m_219 = null;
        m_219 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_219, extraction.const492);
        if(term == null)
          break Fail1595;
        if(true)
          break Fail1595;
      }
      term = g_219;
      h_219 = g_219;
      if(e_219.value == null)
        break Fail1595;
      term = termFactory.makeTuple(e_219.value, extraction.constSortNoArgs0);
      IStrategoTerm term642 = term;
      Success575:
      { 
        Fail1597:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1597;
          if(true)
            break Success575;
        }
        term = term642;
        IStrategoTerm o_219 = null;
        o_219 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_219, extraction.const492);
        if(term == null)
          break Fail1595;
        if(true)
          break Fail1595;
      }
      term = h_219;
      q_219 = h_219;
      p_219 = term;
      term = q_219;
      IStrategoList list245;
      list245 = checkListTail(p_219);
      if(list245 == null)
        break Fail1595;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list245);
      if(true)
        return term;
    }
    return null;
  }
}