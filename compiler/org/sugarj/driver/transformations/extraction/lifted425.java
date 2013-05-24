package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted425 extends Strategy 
{ 
  TermReference u_301;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1267:
    { 
      IStrategoTerm w_301 = null;
      IStrategoTerm b_302 = null;
      IStrategoTerm c_302 = null;
      w_301 = term;
      if(u_301.value == null)
        break Fail1267;
      term = termFactory.makeTuple(u_301.value, extraction.constSort47);
      IStrategoTerm term832 = term;
      Success384:
      { 
        Fail1268:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1268;
          if(true)
            break Success384;
        }
        term = term832;
        IStrategoTerm a_302 = null;
        a_302 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_302, extraction.const596);
        if(term == null)
          break Fail1267;
        if(true)
          break Fail1267;
      }
      term = w_301;
      c_302 = w_301;
      b_302 = term;
      term = c_302;
      IStrategoList list383;
      list383 = checkListTail(b_302);
      if(list383 == null)
        break Fail1267;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs250, list383);
      if(true)
        return term;
    }
    return null;
  }
}