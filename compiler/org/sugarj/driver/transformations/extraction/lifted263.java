package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted263 extends Strategy 
{ 
  TermReference j_205;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1653:
    { 
      IStrategoTerm l_205 = null;
      IStrategoTerm o_205 = null;
      IStrategoTerm p_205 = null;
      l_205 = term;
      if(j_205.value == null)
        break Fail1653;
      term = termFactory.makeTuple(j_205.value, extraction.constSortNoArgs0);
      IStrategoTerm term608 = term;
      Success608:
      { 
        Fail1654:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1654;
          if(true)
            break Success608;
        }
        term = term608;
        IStrategoTerm n_205 = null;
        n_205 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_205, extraction.const469);
        if(term == null)
          break Fail1653;
        if(true)
          break Fail1653;
      }
      term = l_205;
      p_205 = l_205;
      o_205 = term;
      term = p_205;
      IStrategoList list221;
      list221 = checkListTail(o_205);
      if(list221 == null)
        break Fail1653;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs177, list221);
      if(true)
        return term;
    }
    return null;
  }
}