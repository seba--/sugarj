package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted277 extends Strategy 
{ 
  TermReference x_212;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1618:
    { 
      IStrategoTerm z_212 = null;
      IStrategoTerm c_213 = null;
      IStrategoTerm d_213 = null;
      z_212 = term;
      if(x_212.value == null)
        break Fail1618;
      term = termFactory.makeTuple(x_212.value, extraction.constSortNoArgs18);
      IStrategoTerm term629 = term;
      Success587:
      { 
        Fail1619:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1619;
          if(true)
            break Success587;
        }
        term = term629;
        IStrategoTerm b_213 = null;
        b_213 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_213, extraction.const483);
        if(term == null)
          break Fail1618;
        if(true)
          break Fail1618;
      }
      term = z_212;
      d_213 = z_212;
      c_213 = term;
      term = d_213;
      IStrategoList list235;
      list235 = checkListTail(c_213);
      if(list235 == null)
        break Fail1618;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list235);
      if(true)
        return term;
    }
    return null;
  }
}