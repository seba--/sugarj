package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted464 extends Strategy 
{ 
  TermReference q_321;

  TermReference r_321;

  TermReference s_321;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1174:
    { 
      IStrategoTerm u_321 = null;
      IStrategoTerm v_321 = null;
      IStrategoTerm w_321 = null;
      IStrategoTerm d_322 = null;
      IStrategoTerm e_322 = null;
      u_321 = term;
      if(q_321.value == null)
        break Fail1174;
      term = termFactory.makeTuple(q_321.value, extraction.constSortNoArgs288);
      IStrategoTerm term884 = term;
      Success330:
      { 
        Fail1175:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1175;
          if(true)
            break Success330;
        }
        term = term884;
        IStrategoTerm y_321 = null;
        y_321 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_321, extraction.const631);
        if(term == null)
          break Fail1174;
        if(true)
          break Fail1174;
      }
      term = u_321;
      v_321 = u_321;
      if(r_321.value == null)
        break Fail1174;
      term = termFactory.makeTuple(r_321.value, extraction.constSortNoArgs38);
      IStrategoTerm term885 = term;
      Success331:
      { 
        Fail1176:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1176;
          if(true)
            break Success331;
        }
        term = term885;
        IStrategoTerm a_322 = null;
        a_322 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_322, extraction.const631);
        if(term == null)
          break Fail1174;
        if(true)
          break Fail1174;
      }
      term = v_321;
      w_321 = v_321;
      if(s_321.value == null)
        break Fail1174;
      term = termFactory.makeTuple(s_321.value, extraction.constSortNoArgs286);
      IStrategoTerm term886 = term;
      Success332:
      { 
        Fail1177:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1177;
          if(true)
            break Success332;
        }
        term = term886;
        IStrategoTerm c_322 = null;
        c_322 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_322, extraction.const631);
        if(term == null)
          break Fail1174;
        if(true)
          break Fail1174;
      }
      term = w_321;
      e_322 = w_321;
      d_322 = term;
      term = e_322;
      IStrategoList list422;
      list422 = checkListTail(d_322);
      if(list422 == null)
        break Fail1174;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs284, list422);
      if(true)
        return term;
    }
    return null;
  }
}