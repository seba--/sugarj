package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted372 extends Strategy 
{ 
  TermReference h_267;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1375:
    { 
      IStrategoTerm j_267 = null;
      IStrategoTerm o_267 = null;
      IStrategoTerm p_267 = null;
      j_267 = term;
      if(h_267.value == null)
        break Fail1375;
      term = termFactory.makeTuple(h_267.value, extraction.constSortNoArgs22);
      IStrategoTerm term777 = term;
      Success439:
      { 
        Fail1376:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1376;
          if(true)
            break Success439;
        }
        term = term777;
        IStrategoTerm n_267 = null;
        n_267 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_267, extraction.const552);
        if(term == null)
          break Fail1375;
        if(true)
          break Fail1375;
      }
      term = j_267;
      p_267 = j_267;
      o_267 = term;
      term = p_267;
      IStrategoList list330;
      list330 = checkListTail(o_267);
      if(list330 == null)
        break Fail1375;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs192, list330);
      if(true)
        return term;
    }
    return null;
  }
}