package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted380 extends Strategy 
{ 
  TermReference w_270;

  TermReference x_270;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1354:
    { 
      IStrategoTerm b_271 = null;
      IStrategoTerm c_271 = null;
      IStrategoTerm n_271 = null;
      IStrategoTerm o_271 = null;
      b_271 = term;
      if(w_270.value == null)
        break Fail1354;
      term = termFactory.makeTuple(w_270.value, extraction.constSortNoArgs71);
      IStrategoTerm term789 = term;
      Success426:
      { 
        Fail1355:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1355;
          if(true)
            break Success426;
        }
        term = term789;
        IStrategoTerm k_271 = null;
        k_271 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_271, extraction.const557);
        if(term == null)
          break Fail1354;
        if(true)
          break Fail1354;
      }
      term = b_271;
      c_271 = b_271;
      if(x_270.value == null)
        break Fail1354;
      term = termFactory.makeTuple(x_270.value, extraction.constSortNoArgs71);
      IStrategoTerm term790 = term;
      Success427:
      { 
        Fail1356:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1356;
          if(true)
            break Success427;
        }
        term = term790;
        IStrategoTerm m_271 = null;
        m_271 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_271, extraction.const557);
        if(term == null)
          break Fail1354;
        if(true)
          break Fail1354;
      }
      term = c_271;
      o_271 = c_271;
      n_271 = term;
      term = o_271;
      IStrategoList list338;
      list338 = checkListTail(n_271);
      if(list338 == null)
        break Fail1354;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list338);
      if(true)
        return term;
    }
    return null;
  }
}