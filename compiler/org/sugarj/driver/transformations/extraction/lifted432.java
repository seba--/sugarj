package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted432 extends Strategy 
{ 
  TermReference w_304;

  TermReference x_304;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1251:
    { 
      IStrategoTerm z_304 = null;
      IStrategoTerm a_305 = null;
      IStrategoTerm f_305 = null;
      IStrategoTerm g_305 = null;
      z_304 = term;
      if(w_304.value == null)
        break Fail1251;
      term = termFactory.makeTuple(w_304.value, extraction.constSortNoArgs75);
      IStrategoTerm term840 = term;
      Success375:
      { 
        Fail1252:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1252;
          if(true)
            break Success375;
        }
        term = term840;
        IStrategoTerm c_305 = null;
        c_305 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_305, extraction.const601);
        if(term == null)
          break Fail1251;
        if(true)
          break Fail1251;
      }
      term = z_304;
      a_305 = z_304;
      if(x_304.value == null)
        break Fail1251;
      term = termFactory.makeTuple(x_304.value, extraction.constSortNoArgs74);
      IStrategoTerm term841 = term;
      Success376:
      { 
        Fail1253:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1253;
          if(true)
            break Success376;
        }
        term = term841;
        IStrategoTerm e_305 = null;
        e_305 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_305, extraction.const601);
        if(term == null)
          break Fail1251;
        if(true)
          break Fail1251;
      }
      term = a_305;
      g_305 = a_305;
      f_305 = term;
      term = g_305;
      IStrategoList list390;
      list390 = checkListTail(f_305);
      if(list390 == null)
        break Fail1251;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs296, list390);
      if(true)
        return term;
    }
    return null;
  }
}