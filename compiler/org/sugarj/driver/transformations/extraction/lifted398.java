package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted398 extends Strategy 
{ 
  TermReference m_280;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1316:
    { 
      IStrategoTerm o_280 = null;
      IStrategoTerm t_280 = null;
      IStrategoTerm u_280 = null;
      o_280 = term;
      if(m_280.value == null)
        break Fail1316;
      term = termFactory.makeTuple(m_280.value, extraction.constSortNoArgs72);
      IStrategoTerm term810 = term;
      Success406:
      { 
        Fail1317:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1317;
          if(true)
            break Success406;
        }
        term = term810;
        IStrategoTerm s_280 = null;
        s_280 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_280, extraction.const572);
        if(term == null)
          break Fail1316;
        if(true)
          break Fail1316;
      }
      term = o_280;
      u_280 = o_280;
      t_280 = term;
      term = u_280;
      IStrategoList list356;
      list356 = checkListTail(t_280);
      if(list356 == null)
        break Fail1316;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs293, list356);
      if(true)
        return term;
    }
    return null;
  }
}