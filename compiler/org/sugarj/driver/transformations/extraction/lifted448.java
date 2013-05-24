package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted448 extends Strategy 
{ 
  TermReference r_313;

  TermReference s_313;

  TermReference w_313;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1209:
    { 
      IStrategoTerm z_313 = null;
      IStrategoTerm a_314 = null;
      IStrategoTerm b_314 = null;
      IStrategoTerm j_314 = null;
      IStrategoTerm k_314 = null;
      z_313 = term;
      if(r_313.value == null)
        break Fail1209;
      term = termFactory.makeTuple(r_313.value, extraction.constSortNoArgs16);
      IStrategoTerm term865 = term;
      Success349:
      { 
        Fail1210:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1210;
          if(true)
            break Success349;
        }
        term = term865;
        IStrategoTerm d_314 = null;
        d_314 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_314, extraction.const616);
        if(term == null)
          break Fail1209;
        if(true)
          break Fail1209;
      }
      term = z_313;
      a_314 = z_313;
      if(s_313.value == null)
        break Fail1209;
      term = termFactory.makeTuple(s_313.value, extraction.constSort50);
      IStrategoTerm term866 = term;
      Success350:
      { 
        Fail1211:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1211;
          if(true)
            break Success350;
        }
        term = term866;
        IStrategoTerm g_314 = null;
        g_314 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_314, extraction.const616);
        if(term == null)
          break Fail1209;
        if(true)
          break Fail1209;
      }
      term = a_314;
      b_314 = a_314;
      if(w_313.value == null)
        break Fail1209;
      term = termFactory.makeTuple(w_313.value, extraction.constSortNoArgs68);
      IStrategoTerm term867 = term;
      Success351:
      { 
        Fail1212:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1212;
          if(true)
            break Success351;
        }
        term = term867;
        IStrategoTerm i_314 = null;
        i_314 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_314, extraction.const616);
        if(term == null)
          break Fail1209;
        if(true)
          break Fail1209;
      }
      term = b_314;
      k_314 = b_314;
      j_314 = term;
      term = k_314;
      IStrategoList list406;
      list406 = checkListTail(j_314);
      if(list406 == null)
        break Fail1209;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs65, list406);
      if(true)
        return term;
    }
    return null;
  }
}