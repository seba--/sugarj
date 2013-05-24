package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted426 extends Strategy 
{ 
  TermReference u_301;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1265:
    { 
      IStrategoTerm x_301 = null;
      IStrategoTerm f_302 = null;
      IStrategoTerm h_302 = null;
      x_301 = term;
      if(u_301.value == null)
        break Fail1265;
      term = termFactory.makeTuple(u_301.value, extraction.constSort46);
      IStrategoTerm term833 = term;
      Success383:
      { 
        Fail1266:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1266;
          if(true)
            break Success383;
        }
        term = term833;
        IStrategoTerm e_302 = null;
        e_302 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_302, extraction.const596);
        if(term == null)
          break Fail1265;
        if(true)
          break Fail1265;
      }
      term = x_301;
      h_302 = x_301;
      f_302 = term;
      term = h_302;
      IStrategoList list384;
      list384 = checkListTail(f_302);
      if(list384 == null)
        break Fail1265;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs275, list384);
      if(true)
        return term;
    }
    return null;
  }
}