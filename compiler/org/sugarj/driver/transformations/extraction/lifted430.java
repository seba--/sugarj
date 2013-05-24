package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted430 extends Strategy 
{ 
  TermReference y_303;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1256:
    { 
      IStrategoTerm a_304 = null;
      IStrategoTerm e_304 = null;
      IStrategoTerm f_304 = null;
      a_304 = term;
      if(y_303.value == null)
        break Fail1256;
      term = termFactory.makeTuple(y_303.value, extraction.constSortNoArgs73);
      IStrategoTerm term838 = term;
      Success378:
      { 
        Fail1257:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1257;
          if(true)
            break Success378;
        }
        term = term838;
        IStrategoTerm d_304 = null;
        d_304 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_304, extraction.const599);
        if(term == null)
          break Fail1256;
        if(true)
          break Fail1256;
      }
      term = a_304;
      f_304 = a_304;
      e_304 = term;
      term = f_304;
      IStrategoList list388;
      list388 = checkListTail(e_304);
      if(list388 == null)
        break Fail1256;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs296, list388);
      if(true)
        return term;
    }
    return null;
  }
}