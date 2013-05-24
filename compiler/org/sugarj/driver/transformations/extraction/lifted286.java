package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted286 extends Strategy 
{ 
  TermReference i_218;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1598:
    { 
      IStrategoTerm m_218 = null;
      IStrategoTerm r_218 = null;
      IStrategoTerm t_218 = null;
      m_218 = term;
      if(i_218.value == null)
        break Fail1598;
      term = termFactory.makeTuple(i_218.value, extraction.constSort38);
      IStrategoTerm term640 = term;
      Success576:
      { 
        Fail1599:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1599;
          if(true)
            break Success576;
        }
        term = term640;
        IStrategoTerm q_218 = null;
        q_218 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_218, extraction.const491);
        if(term == null)
          break Fail1598;
        if(true)
          break Fail1598;
      }
      term = m_218;
      t_218 = m_218;
      r_218 = term;
      term = t_218;
      IStrategoList list244;
      list244 = checkListTail(r_218);
      if(list244 == null)
        break Fail1598;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list244);
      if(true)
        return term;
    }
    return null;
  }
}