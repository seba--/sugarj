package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted346 extends Strategy 
{ 
  TermReference p_251;

  TermReference q_251;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1448:
    { 
      IStrategoTerm v_251 = null;
      IStrategoTerm w_251 = null;
      IStrategoTerm b_252 = null;
      IStrategoTerm c_252 = null;
      v_251 = term;
      if(p_251.value == null)
        break Fail1448;
      term = termFactory.makeTuple(p_251.value, extraction.constSortNoArgs18);
      IStrategoTerm term729 = term;
      Success486:
      { 
        Fail1449:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1449;
          if(true)
            break Success486;
        }
        term = term729;
        IStrategoTerm y_251 = null;
        y_251 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_251, extraction.const532);
        if(term == null)
          break Fail1448;
        if(true)
          break Fail1448;
      }
      term = v_251;
      w_251 = v_251;
      if(q_251.value == null)
        break Fail1448;
      term = termFactory.makeTuple(q_251.value, extraction.constSort39);
      IStrategoTerm term730 = term;
      Success487:
      { 
        Fail1450:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1450;
          if(true)
            break Success487;
        }
        term = term730;
        IStrategoTerm a_252 = null;
        a_252 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_252, extraction.const532);
        if(term == null)
          break Fail1448;
        if(true)
          break Fail1448;
      }
      term = w_251;
      c_252 = w_251;
      b_252 = term;
      term = c_252;
      IStrategoList list304;
      list304 = checkListTail(b_252);
      if(list304 == null)
        break Fail1448;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list304);
      if(true)
        return term;
    }
    return null;
  }
}