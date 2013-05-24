package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted325 extends Strategy 
{ 
  TermReference o_240;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1495:
    { 
      IStrategoTerm r_240 = null;
      IStrategoTerm u_240 = null;
      IStrategoTerm v_240 = null;
      r_240 = term;
      if(o_240.value == null)
        break Fail1495;
      term = termFactory.makeTuple(o_240.value, extraction.constSort31);
      IStrategoTerm term704 = term;
      Success512:
      { 
        Fail1496:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1496;
          if(true)
            break Success512;
        }
        term = term704;
        IStrategoTerm t_240 = null;
        t_240 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_240, extraction.const517);
        if(term == null)
          break Fail1495;
        if(true)
          break Fail1495;
      }
      term = r_240;
      v_240 = r_240;
      u_240 = term;
      term = v_240;
      IStrategoList list283;
      list283 = checkListTail(u_240);
      if(list283 == null)
        break Fail1495;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs30, list283);
      if(true)
        return term;
    }
    return null;
  }
}