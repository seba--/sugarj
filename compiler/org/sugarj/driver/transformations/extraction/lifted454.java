package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted454 extends Strategy 
{ 
  TermReference y_316;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1196:
    { 
      IStrategoTerm a_317 = null;
      IStrategoTerm d_317 = null;
      IStrategoTerm e_317 = null;
      a_317 = term;
      if(y_316.value == null)
        break Fail1196;
      term = termFactory.makeTuple(y_316.value, extraction.constSortNoArgs70);
      IStrategoTerm term874 = term;
      Success342:
      { 
        Fail1197:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1197;
          if(true)
            break Success342;
        }
        term = term874;
        IStrategoTerm c_317 = null;
        c_317 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_317, extraction.const622);
        if(term == null)
          break Fail1196;
        if(true)
          break Fail1196;
      }
      term = a_317;
      e_317 = a_317;
      d_317 = term;
      term = e_317;
      IStrategoList list412;
      list412 = checkListTail(d_317);
      if(list412 == null)
        break Fail1196;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs255, list412);
      if(true)
        return term;
    }
    return null;
  }
}