package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted313 extends Strategy 
{ 
  TermReference r_234;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1528:
    { 
      IStrategoTerm t_234 = null;
      IStrategoTerm w_234 = null;
      IStrategoTerm x_234 = null;
      t_234 = term;
      if(r_234.value == null)
        break Fail1528;
      term = termFactory.makeTuple(r_234.value, extraction.constSort39);
      IStrategoTerm term683 = term;
      Success533:
      { 
        Fail1529:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1529;
          if(true)
            break Success533;
        }
        term = term683;
        IStrategoTerm v_234 = null;
        v_234 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_234, extraction.const511);
        if(term == null)
          break Fail1528;
        if(true)
          break Fail1528;
      }
      term = t_234;
      x_234 = t_234;
      w_234 = term;
      term = x_234;
      IStrategoList list271;
      list271 = checkListTail(w_234);
      if(list271 == null)
        break Fail1528;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list271);
      if(true)
        return term;
    }
    return null;
  }
}