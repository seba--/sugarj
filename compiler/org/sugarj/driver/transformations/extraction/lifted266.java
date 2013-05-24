package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted266 extends Strategy 
{ 
  TermReference k_207;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1644:
    { 
      IStrategoTerm m_207 = null;
      IStrategoTerm p_207 = null;
      IStrategoTerm q_207 = null;
      m_207 = term;
      if(k_207.value == null)
        break Fail1644;
      term = termFactory.makeTuple(k_207.value, extraction.constSortNoArgs44);
      IStrategoTerm term614 = term;
      Success602:
      { 
        Fail1645:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1645;
          if(true)
            break Success602;
        }
        term = term614;
        IStrategoTerm o_207 = null;
        o_207 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_207, extraction.const472);
        if(term == null)
          break Fail1644;
        if(true)
          break Fail1644;
      }
      term = m_207;
      q_207 = m_207;
      p_207 = term;
      term = q_207;
      IStrategoList list224;
      list224 = checkListTail(p_207);
      if(list224 == null)
        break Fail1644;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs198, list224);
      if(true)
        return term;
    }
    return null;
  }
}