package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted367 extends Strategy 
{ 
  TermReference t_264;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1386:
    { 
      IStrategoTerm v_264 = null;
      IStrategoTerm b_265 = null;
      IStrategoTerm d_265 = null;
      v_264 = term;
      if(t_264.value == null)
        break Fail1386;
      term = termFactory.makeTuple(t_264.value, extraction.constSortNoArgs0);
      IStrategoTerm term771 = term;
      Success445:
      { 
        Fail1387:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1387;
          if(true)
            break Success445;
        }
        term = term771;
        IStrategoTerm x_264 = null;
        x_264 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_264, extraction.const548);
        if(term == null)
          break Fail1386;
        if(true)
          break Fail1386;
      }
      term = v_264;
      d_265 = v_264;
      b_265 = term;
      term = d_265;
      IStrategoList list325;
      list325 = checkListTail(b_265);
      if(list325 == null)
        break Fail1386;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list325);
      if(true)
        return term;
    }
    return null;
  }
}