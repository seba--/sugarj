package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted250 extends Strategy 
{ 
  TermReference l_197;

  TermReference m_197;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1695:
    { 
      IStrategoTerm q_197 = null;
      IStrategoTerm r_197 = null;
      IStrategoTerm c_198 = null;
      IStrategoTerm d_198 = null;
      q_197 = term;
      if(l_197.value == null)
        break Fail1695;
      term = termFactory.makeTuple(l_197.value, extraction.constSortNoArgs40);
      IStrategoTerm term578 = term;
      Success637:
      { 
        Fail1696:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1696;
          if(true)
            break Success637;
        }
        term = term578;
        IStrategoTerm z_197 = null;
        z_197 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_197, extraction.const461);
        if(term == null)
          break Fail1695;
        if(true)
          break Fail1695;
      }
      term = q_197;
      r_197 = q_197;
      if(m_197.value == null)
        break Fail1695;
      term = termFactory.makeTuple(m_197.value, extraction.constSortNoArgs41);
      IStrategoTerm term579 = term;
      Success638:
      { 
        Fail1697:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1697;
          if(true)
            break Success638;
        }
        term = term579;
        IStrategoTerm b_198 = null;
        b_198 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_198, extraction.const461);
        if(term == null)
          break Fail1695;
        if(true)
          break Fail1695;
      }
      term = r_197;
      d_198 = r_197;
      c_198 = term;
      term = d_198;
      IStrategoList list208;
      list208 = checkListTail(c_198);
      if(list208 == null)
        break Fail1695;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list208);
      if(true)
        return term;
    }
    return null;
  }
}