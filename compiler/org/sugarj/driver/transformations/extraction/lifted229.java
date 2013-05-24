package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted229 extends Strategy 
{ 
  TermReference l_185;

  TermReference m_185;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1765:
    { 
      IStrategoTerm o_185 = null;
      IStrategoTerm p_185 = null;
      IStrategoTerm w_185 = null;
      IStrategoTerm x_185 = null;
      o_185 = term;
      if(l_185.value == null)
        break Fail1765;
      term = termFactory.makeTuple(l_185.value, extraction.constSortNoArgs169);
      IStrategoTerm term529 = term;
      Success686:
      { 
        Fail1766:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1766;
          if(true)
            break Success686;
        }
        term = term529;
        IStrategoTerm r_185 = null;
        r_185 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_185, extraction.const450);
        if(term == null)
          break Fail1765;
        if(true)
          break Fail1765;
      }
      term = o_185;
      p_185 = o_185;
      if(m_185.value == null)
        break Fail1765;
      term = termFactory.makeTuple(m_185.value, extraction.constSortNoArgs41);
      IStrategoTerm term530 = term;
      Success687:
      { 
        Fail1767:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1767;
          if(true)
            break Success687;
        }
        term = term530;
        IStrategoTerm v_185 = null;
        v_185 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_185, extraction.const450);
        if(term == null)
          break Fail1765;
        if(true)
          break Fail1765;
      }
      term = p_185;
      x_185 = p_185;
      w_185 = term;
      term = x_185;
      IStrategoList list187;
      list187 = checkListTail(w_185);
      if(list187 == null)
        break Fail1765;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs172, list187);
      if(true)
        return term;
    }
    return null;
  }
}