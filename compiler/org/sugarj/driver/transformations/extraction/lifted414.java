package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted414 extends Strategy 
{ 
  TermReference w_287;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1287:
    { 
      IStrategoTerm y_287 = null;
      IStrategoTerm b_288 = null;
      IStrategoTerm c_288 = null;
      y_287 = term;
      if(w_287.value == null)
        break Fail1287;
      term = termFactory.makeTuple(w_287.value, extraction.constSortNoArgs242);
      IStrategoTerm term823 = term;
      Success393:
      { 
        Fail1288:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1288;
          if(true)
            break Success393;
        }
        term = term823;
        IStrategoTerm a_288 = null;
        a_288 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_288, extraction.const586);
        if(term == null)
          break Fail1287;
        if(true)
          break Fail1287;
      }
      term = y_287;
      c_288 = y_287;
      b_288 = term;
      term = c_288;
      IStrategoList list372;
      list372 = checkListTail(b_288);
      if(list372 == null)
        break Fail1287;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs299, list372);
      if(true)
        return term;
    }
    return null;
  }
}