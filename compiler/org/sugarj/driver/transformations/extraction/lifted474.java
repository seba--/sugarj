package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted474 extends Strategy 
{ 
  TermReference y_326;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1152:
    { 
      IStrategoTerm a_327 = null;
      IStrategoTerm d_327 = null;
      IStrategoTerm e_327 = null;
      a_327 = term;
      if(y_326.value == null)
        break Fail1152;
      term = termFactory.makeTuple(y_326.value, extraction.constSortNoArgs77);
      IStrategoTerm term898 = term;
      Success318:
      { 
        Fail1153:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1153;
          if(true)
            break Success318;
        }
        term = term898;
        IStrategoTerm c_327 = null;
        c_327 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_327, extraction.const641);
        if(term == null)
          break Fail1152;
        if(true)
          break Fail1152;
      }
      term = a_327;
      e_327 = a_327;
      d_327 = term;
      term = e_327;
      IStrategoList list432;
      list432 = checkListTail(d_327);
      if(list432 == null)
        break Fail1152;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs115, list432);
      if(true)
        return term;
    }
    return null;
  }
}