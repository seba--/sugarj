package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted347 extends Strategy 
{ 
  TermReference h_252;

  TermReference i_252;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1445:
    { 
      IStrategoTerm l_252 = null;
      IStrategoTerm m_252 = null;
      IStrategoTerm r_252 = null;
      IStrategoTerm s_252 = null;
      l_252 = term;
      if(h_252.value == null)
        break Fail1445;
      term = termFactory.makeTuple(h_252.value, extraction.constSortNoArgs51);
      IStrategoTerm term731 = term;
      Success484:
      { 
        Fail1446:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1446;
          if(true)
            break Success484;
        }
        term = term731;
        IStrategoTerm o_252 = null;
        o_252 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_252, extraction.const533);
        if(term == null)
          break Fail1445;
        if(true)
          break Fail1445;
      }
      term = l_252;
      m_252 = l_252;
      if(i_252.value == null)
        break Fail1445;
      term = termFactory.makeTuple(i_252.value, extraction.constSortNoArgs51);
      IStrategoTerm term732 = term;
      Success485:
      { 
        Fail1447:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1447;
          if(true)
            break Success485;
        }
        term = term732;
        IStrategoTerm q_252 = null;
        q_252 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_252, extraction.const533);
        if(term == null)
          break Fail1445;
        if(true)
          break Fail1445;
      }
      term = m_252;
      s_252 = m_252;
      r_252 = term;
      term = s_252;
      IStrategoList list305;
      list305 = checkListTail(r_252);
      if(list305 == null)
        break Fail1445;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs41, list305);
      if(true)
        return term;
    }
    return null;
  }
}