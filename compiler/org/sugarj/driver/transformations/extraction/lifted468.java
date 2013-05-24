package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted468 extends Strategy 
{ 
  TermReference a_324;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1166:
    { 
      IStrategoTerm c_324 = null;
      IStrategoTerm f_324 = null;
      IStrategoTerm g_324 = null;
      c_324 = term;
      if(a_324.value == null)
        break Fail1166;
      term = termFactory.makeTuple(a_324.value, extraction.constSortNoArgs288);
      IStrategoTerm term890 = term;
      Success326:
      { 
        Fail1167:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1167;
          if(true)
            break Success326;
        }
        term = term890;
        IStrategoTerm e_324 = null;
        e_324 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_324, extraction.const635);
        if(term == null)
          break Fail1166;
        if(true)
          break Fail1166;
      }
      term = c_324;
      g_324 = c_324;
      f_324 = term;
      term = g_324;
      IStrategoList list426;
      list426 = checkListTail(f_324);
      if(list426 == null)
        break Fail1166;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs277, list426);
      if(true)
        return term;
    }
    return null;
  }
}