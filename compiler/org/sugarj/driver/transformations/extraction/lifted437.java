package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted437 extends Strategy 
{ 
  TermReference i_307;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1240:
    { 
      IStrategoTerm k_307 = null;
      IStrategoTerm n_307 = null;
      IStrategoTerm o_307 = null;
      k_307 = term;
      if(i_307.value == null)
        break Fail1240;
      term = termFactory.makeTuple(i_307.value, extraction.constSortNoArgs71);
      IStrategoTerm term847 = term;
      Success369:
      { 
        Fail1241:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1241;
          if(true)
            break Success369;
        }
        term = term847;
        IStrategoTerm m_307 = null;
        m_307 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_307, extraction.const605);
        if(term == null)
          break Fail1240;
        if(true)
          break Fail1240;
      }
      term = k_307;
      o_307 = k_307;
      n_307 = term;
      term = o_307;
      IStrategoList list395;
      list395 = checkListTail(n_307);
      if(list395 == null)
        break Fail1240;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list395);
      if(true)
        return term;
    }
    return null;
  }
}