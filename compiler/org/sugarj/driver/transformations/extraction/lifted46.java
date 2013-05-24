package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted46 extends Strategy 
{ 
  TermReference w_91;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2180:
    { 
      IStrategoTerm y_91 = null;
      IStrategoTerm b_92 = null;
      IStrategoTerm c_92 = null;
      y_91 = term;
      if(w_91.value == null)
        break Fail2180;
      term = termFactory.makeTuple(w_91.value, extraction.constSortNoArgs277);
      IStrategoTerm term298 = term;
      Success918:
      { 
        Fail2181:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2181;
          if(true)
            break Success918;
        }
        term = term298;
        IStrategoTerm a_92 = null;
        a_92 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_92, extraction.const332);
        if(term == null)
          break Fail2180;
        if(true)
          break Fail2180;
      }
      term = y_91;
      c_92 = y_91;
      b_92 = term;
      term = c_92;
      IStrategoList list4;
      list4 = checkListTail(b_92);
      if(list4 == null)
        break Fail2180;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs311, list4);
      if(true)
        return term;
    }
    return null;
  }
}