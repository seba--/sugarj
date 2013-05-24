package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted339 extends Strategy 
{ 
  TermReference y_247;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1464:
    { 
      IStrategoTerm c_248 = null;
      IStrategoTerm f_248 = null;
      IStrategoTerm g_248 = null;
      c_248 = term;
      if(y_247.value == null)
        break Fail1464;
      term = termFactory.makeTuple(y_247.value, extraction.constSortNoArgs30);
      IStrategoTerm term721 = term;
      Success495:
      { 
        Fail1465:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1465;
          if(true)
            break Success495;
        }
        term = term721;
        IStrategoTerm e_248 = null;
        e_248 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_248, extraction.const57);
        if(term == null)
          break Fail1464;
        if(true)
          break Fail1464;
      }
      term = c_248;
      g_248 = c_248;
      f_248 = term;
      term = g_248;
      IStrategoList list297;
      list297 = checkListTail(f_248);
      if(list297 == null)
        break Fail1464;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs47, list297);
      if(true)
        return term;
    }
    return null;
  }
}