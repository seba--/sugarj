package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted401 extends Strategy 
{ 
  TermReference v_281;

  TermReference w_281;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1309:
    { 
      IStrategoTerm i_282 = null;
      IStrategoTerm r_282 = null;
      IStrategoTerm e_283 = null;
      IStrategoTerm f_283 = null;
      i_282 = term;
      if(v_281.value == null)
        break Fail1309;
      term = termFactory.makeTuple(v_281.value, extraction.constSortNoArgs30);
      IStrategoTerm term813 = term;
      Success402:
      { 
        Fail1310:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1310;
          if(true)
            break Success402;
        }
        term = term813;
        IStrategoTerm t_282 = null;
        t_282 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_282, extraction.const575);
        if(term == null)
          break Fail1309;
        if(true)
          break Fail1309;
      }
      term = i_282;
      r_282 = i_282;
      if(w_281.value == null)
        break Fail1309;
      term = termFactory.makeTuple(w_281.value, extraction.constSort6);
      IStrategoTerm term814 = term;
      Success403:
      { 
        Fail1311:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1311;
          if(true)
            break Success403;
        }
        term = term814;
        IStrategoTerm d_283 = null;
        d_283 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_283, extraction.const575);
        if(term == null)
          break Fail1309;
        if(true)
          break Fail1309;
      }
      term = r_282;
      f_283 = r_282;
      e_283 = term;
      term = f_283;
      IStrategoList list359;
      list359 = checkListTail(e_283);
      if(list359 == null)
        break Fail1309;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs71, list359);
      if(true)
        return term;
    }
    return null;
  }
}