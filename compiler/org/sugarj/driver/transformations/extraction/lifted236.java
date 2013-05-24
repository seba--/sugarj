package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted236 extends Strategy 
{ 
  TermReference j_189;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1747:
    { 
      IStrategoTerm l_189 = null;
      IStrategoTerm o_189 = null;
      IStrategoTerm p_189 = null;
      l_189 = term;
      if(j_189.value == null)
        break Fail1747;
      term = termFactory.makeTuple(j_189.value, extraction.constSortNoArgs41);
      IStrategoTerm term541 = term;
      Success675:
      { 
        Fail1748:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1748;
          if(true)
            break Success675;
        }
        term = term541;
        IStrategoTerm n_189 = null;
        n_189 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_189, extraction.const114);
        if(term == null)
          break Fail1747;
        if(true)
          break Fail1747;
      }
      term = l_189;
      p_189 = l_189;
      o_189 = term;
      term = p_189;
      IStrategoList list194;
      list194 = checkListTail(o_189);
      if(list194 == null)
        break Fail1747;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs103, list194);
      if(true)
        return term;
    }
    return null;
  }
}