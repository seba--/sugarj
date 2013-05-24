package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted251 extends Strategy 
{ 
  TermReference j_198;

  TermReference k_198;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1692:
    { 
      IStrategoTerm m_198 = null;
      IStrategoTerm n_198 = null;
      IStrategoTerm v_198 = null;
      IStrategoTerm w_198 = null;
      m_198 = term;
      if(j_198.value == null)
        break Fail1692;
      term = termFactory.makeTuple(j_198.value, extraction.constSortNoArgs0);
      IStrategoTerm term580 = term;
      Success635:
      { 
        Fail1693:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1693;
          if(true)
            break Success635;
        }
        term = term580;
        IStrategoTerm r_198 = null;
        r_198 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_198, extraction.const462);
        if(term == null)
          break Fail1692;
        if(true)
          break Fail1692;
      }
      term = m_198;
      n_198 = m_198;
      if(k_198.value == null)
        break Fail1692;
      term = termFactory.makeTuple(k_198.value, extraction.constSortNoArgs41);
      IStrategoTerm term581 = term;
      Success636:
      { 
        Fail1694:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1694;
          if(true)
            break Success636;
        }
        term = term581;
        IStrategoTerm t_198 = null;
        t_198 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_198, extraction.const462);
        if(term == null)
          break Fail1692;
        if(true)
          break Fail1692;
      }
      term = n_198;
      w_198 = n_198;
      v_198 = term;
      term = w_198;
      IStrategoList list209;
      list209 = checkListTail(v_198);
      if(list209 == null)
        break Fail1692;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list209);
      if(true)
        return term;
    }
    return null;
  }
}