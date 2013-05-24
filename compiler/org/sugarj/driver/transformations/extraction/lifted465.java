package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted465 extends Strategy 
{ 
  TermReference k_322;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1172:
    { 
      IStrategoTerm m_322 = null;
      IStrategoTerm p_322 = null;
      IStrategoTerm q_322 = null;
      m_322 = term;
      if(k_322.value == null)
        break Fail1172;
      term = termFactory.makeTuple(k_322.value, extraction.constSortNoArgs38);
      IStrategoTerm term887 = term;
      Success329:
      { 
        Fail1173:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1173;
          if(true)
            break Success329;
        }
        term = term887;
        IStrategoTerm o_322 = null;
        o_322 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_322, extraction.const632);
        if(term == null)
          break Fail1172;
        if(true)
          break Fail1172;
      }
      term = m_322;
      q_322 = m_322;
      p_322 = term;
      term = q_322;
      IStrategoList list423;
      list423 = checkListTail(p_322);
      if(list423 == null)
        break Fail1172;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs288, list423);
      if(true)
        return term;
    }
    return null;
  }
}