package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted50 extends Strategy 
{ 
  TermReference w_93;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2171:
    { 
      IStrategoTerm y_93 = null;
      IStrategoTerm c_94 = null;
      IStrategoTerm d_94 = null;
      y_93 = term;
      if(w_93.value == null)
        break Fail2171;
      term = termFactory.makeTuple(w_93.value, extraction.constSort13);
      IStrategoTerm term303 = term;
      Success913:
      { 
        Fail2172:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2172;
          if(true)
            break Success913;
        }
        term = term303;
        IStrategoTerm b_94 = null;
        b_94 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_94, extraction.const335);
        if(term == null)
          break Fail2171;
        if(true)
          break Fail2171;
      }
      term = y_93;
      d_94 = y_93;
      c_94 = term;
      term = d_94;
      IStrategoList list8;
      list8 = checkListTail(c_94);
      if(list8 == null)
        break Fail2171;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs80, list8);
      if(true)
        return term;
    }
    return null;
  }
}