package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted473 extends Strategy 
{ 
  TermReference i_326;

  TermReference j_326;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1154:
    { 
      IStrategoTerm m_326 = null;
      IStrategoTerm n_326 = null;
      IStrategoTerm s_326 = null;
      IStrategoTerm t_326 = null;
      m_326 = term;
      if(i_326.value == null)
        break Fail1154;
      term = termFactory.makeTuple(i_326.value, extraction.constSortNoArgs277);
      IStrategoTerm term896 = term;
      Success319:
      { 
        Fail1155:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1155;
          if(true)
            break Success319;
        }
        term = term896;
        IStrategoTerm p_326 = null;
        p_326 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_326, extraction.const640);
        if(term == null)
          break Fail1154;
        if(true)
          break Fail1154;
      }
      term = m_326;
      n_326 = m_326;
      if(j_326.value == null)
        break Fail1154;
      term = termFactory.makeTuple(j_326.value, extraction.constSortNoArgs275);
      IStrategoTerm term897 = term;
      Success320:
      { 
        Fail1156:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1156;
          if(true)
            break Success320;
        }
        term = term897;
        IStrategoTerm r_326 = null;
        r_326 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_326, extraction.const640);
        if(term == null)
          break Fail1154;
        if(true)
          break Fail1154;
      }
      term = n_326;
      t_326 = n_326;
      s_326 = term;
      term = t_326;
      IStrategoList list431;
      list431 = checkListTail(s_326);
      if(list431 == null)
        break Fail1154;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs277, list431);
      if(true)
        return term;
    }
    return null;
  }
}