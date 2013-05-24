package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted477 extends Strategy 
{ 
  TermReference j_328;

  TermReference k_328;

  TermReference l_328;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1145:
    { 
      IStrategoTerm n_328 = null;
      IStrategoTerm o_328 = null;
      IStrategoTerm p_328 = null;
      IStrategoTerm x_328 = null;
      IStrategoTerm y_328 = null;
      n_328 = term;
      if(j_328.value == null)
        break Fail1145;
      term = termFactory.makeTuple(j_328.value, extraction.constSortNoArgs72);
      IStrategoTerm term900 = term;
      Success314:
      { 
        Fail1146:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1146;
          if(true)
            break Success314;
        }
        term = term900;
        IStrategoTerm r_328 = null;
        r_328 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_328, extraction.const644);
        if(term == null)
          break Fail1145;
        if(true)
          break Fail1145;
      }
      term = n_328;
      o_328 = n_328;
      if(k_328.value == null)
        break Fail1145;
      term = termFactory.makeTuple(k_328.value, extraction.constSortNoArgs71);
      IStrategoTerm term901 = term;
      Success315:
      { 
        Fail1147:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1147;
          if(true)
            break Success315;
        }
        term = term901;
        IStrategoTerm u_328 = null;
        u_328 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_328, extraction.const644);
        if(term == null)
          break Fail1145;
        if(true)
          break Fail1145;
      }
      term = o_328;
      p_328 = o_328;
      if(l_328.value == null)
        break Fail1145;
      term = termFactory.makeTuple(l_328.value, extraction.constSortNoArgs270);
      IStrategoTerm term902 = term;
      Success316:
      { 
        Fail1148:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1148;
          if(true)
            break Success316;
        }
        term = term902;
        IStrategoTerm w_328 = null;
        w_328 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_328, extraction.const644);
        if(term == null)
          break Fail1145;
        if(true)
          break Fail1145;
      }
      term = p_328;
      y_328 = p_328;
      x_328 = term;
      term = y_328;
      IStrategoList list435;
      list435 = checkListTail(x_328);
      if(list435 == null)
        break Fail1145;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs73, list435);
      if(true)
        return term;
    }
    return null;
  }
}