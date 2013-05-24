package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted390 extends Strategy 
{ 
  TermReference x_274;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1336:
    { 
      IStrategoTerm e_275 = null;
      IStrategoTerm u_275 = null;
      IStrategoTerm w_275 = null;
      e_275 = term;
      if(x_274.value == null)
        break Fail1336;
      term = termFactory.makeTuple(x_274.value, extraction.constSortNoArgs36);
      IStrategoTerm term798 = term;
      Success418:
      { 
        Fail1337:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1337;
          if(true)
            break Success418;
        }
        term = term798;
        IStrategoTerm p_275 = null;
        p_275 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_275, extraction.const564);
        if(term == null)
          break Fail1336;
        if(true)
          break Fail1336;
      }
      term = e_275;
      w_275 = e_275;
      u_275 = term;
      term = w_275;
      IStrategoList list348;
      list348 = checkListTail(u_275);
      if(list348 == null)
        break Fail1336;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs279, list348);
      if(true)
        return term;
    }
    return null;
  }
}