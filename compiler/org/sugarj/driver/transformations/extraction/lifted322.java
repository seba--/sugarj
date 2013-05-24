package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted322 extends Strategy 
{ 
  TermReference q_237;

  TermReference r_237;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1502:
    { 
      IStrategoTerm b_238 = null;
      IStrategoTerm c_238 = null;
      IStrategoTerm c_239 = null;
      IStrategoTerm d_239 = null;
      b_238 = term;
      if(q_237.value == null)
        break Fail1502;
      term = termFactory.makeTuple(q_237.value, extraction.constSortNoArgs50);
      IStrategoTerm term699 = term;
      Success516:
      { 
        Fail1503:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1503;
          if(true)
            break Success516;
        }
        term = term699;
        IStrategoTerm z_238 = null;
        z_238 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_238, extraction.const514);
        if(term == null)
          break Fail1502;
        if(true)
          break Fail1502;
      }
      term = b_238;
      c_238 = b_238;
      if(r_237.value == null)
        break Fail1502;
      term = termFactory.makeTuple(r_237.value, extraction.constSortNoArgs41);
      IStrategoTerm term700 = term;
      Success517:
      { 
        Fail1504:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1504;
          if(true)
            break Success517;
        }
        term = term700;
        IStrategoTerm b_239 = null;
        b_239 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_239, extraction.const514);
        if(term == null)
          break Fail1502;
        if(true)
          break Fail1502;
      }
      term = c_238;
      d_239 = c_238;
      c_239 = term;
      term = d_239;
      IStrategoList list280;
      list280 = checkListTail(c_239);
      if(list280 == null)
        break Fail1502;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs41, list280);
      if(true)
        return term;
    }
    return null;
  }
}