package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted185 extends Strategy 
{ 
  TermReference y_159;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1875:
    { 
      IStrategoTerm a_160 = null;
      IStrategoTerm d_160 = null;
      IStrategoTerm e_160 = null;
      a_160 = term;
      if(y_159.value == null)
        break Fail1875;
      term = termFactory.makeTuple(y_159.value, extraction.constSortNoArgs6);
      IStrategoTerm term464 = term;
      Success752:
      { 
        Fail1876:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1876;
          if(true)
            break Success752;
        }
        term = term464;
        IStrategoTerm c_160 = null;
        c_160 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_160, extraction.const424);
        if(term == null)
          break Fail1875;
        if(true)
          break Fail1875;
      }
      term = a_160;
      e_160 = a_160;
      d_160 = term;
      term = e_160;
      IStrategoList list143;
      list143 = checkListTail(d_160);
      if(list143 == null)
        break Fail1875;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list143);
      if(true)
        return term;
    }
    return null;
  }
}