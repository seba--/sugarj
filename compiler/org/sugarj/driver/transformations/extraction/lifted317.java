package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted317 extends Strategy 
{ 
  TermReference i_236;

  TermReference j_236;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1517:
    { 
      IStrategoTerm n_236 = null;
      IStrategoTerm o_236 = null;
      IStrategoTerm d_237 = null;
      IStrategoTerm e_237 = null;
      n_236 = term;
      if(i_236.value == null)
        break Fail1517;
      term = termFactory.makeTuple(i_236.value, extraction.constSortNoArgs41);
      IStrategoTerm term689 = term;
      Success526:
      { 
        Fail1518:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1518;
          if(true)
            break Success526;
        }
        term = term689;
        IStrategoTerm z_236 = null;
        z_236 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_236, extraction.const513);
        if(term == null)
          break Fail1517;
        if(true)
          break Fail1517;
      }
      term = n_236;
      o_236 = n_236;
      if(j_236.value == null)
        break Fail1517;
      term = termFactory.makeTuple(j_236.value, extraction.constSortNoArgs41);
      IStrategoTerm term690 = term;
      Success527:
      { 
        Fail1519:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1519;
          if(true)
            break Success527;
        }
        term = term690;
        IStrategoTerm b_237 = null;
        b_237 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_237, extraction.const513);
        if(term == null)
          break Fail1517;
        if(true)
          break Fail1517;
      }
      term = o_236;
      e_237 = o_236;
      d_237 = term;
      term = e_237;
      IStrategoList list275;
      list275 = checkListTail(d_237);
      if(list275 == null)
        break Fail1517;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list275);
      if(true)
        return term;
    }
    return null;
  }
}