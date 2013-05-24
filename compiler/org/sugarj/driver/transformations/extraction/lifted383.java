package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted383 extends Strategy 
{ 
  TermReference k_272;

  TermReference l_272;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1347:
    { 
      IStrategoTerm n_272 = null;
      IStrategoTerm p_272 = null;
      IStrategoTerm x_272 = null;
      IStrategoTerm y_272 = null;
      n_272 = term;
      if(k_272.value == null)
        break Fail1347;
      term = termFactory.makeTuple(k_272.value, extraction.constSortNoArgs72);
      IStrategoTerm term793 = term;
      Success422:
      { 
        Fail1348:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1348;
          if(true)
            break Success422;
        }
        term = term793;
        IStrategoTerm t_272 = null;
        t_272 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_272, extraction.const559);
        if(term == null)
          break Fail1347;
        if(true)
          break Fail1347;
      }
      term = n_272;
      p_272 = n_272;
      if(l_272.value == null)
        break Fail1347;
      term = termFactory.makeTuple(l_272.value, extraction.constSortNoArgs301);
      IStrategoTerm term794 = term;
      Success423:
      { 
        Fail1349:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1349;
          if(true)
            break Success423;
        }
        term = term794;
        IStrategoTerm w_272 = null;
        w_272 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_272, extraction.const559);
        if(term == null)
          break Fail1347;
        if(true)
          break Fail1347;
      }
      term = p_272;
      y_272 = p_272;
      x_272 = term;
      term = y_272;
      IStrategoList list341;
      list341 = checkListTail(x_272);
      if(list341 == null)
        break Fail1347;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs58, list341);
      if(true)
        return term;
    }
    return null;
  }
}