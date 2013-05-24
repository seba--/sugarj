package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted449 extends Strategy 
{ 
  TermReference p_314;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1207:
    { 
      IStrategoTerm r_314 = null;
      IStrategoTerm v_314 = null;
      IStrategoTerm w_314 = null;
      r_314 = term;
      if(p_314.value == null)
        break Fail1207;
      term = termFactory.makeTuple(p_314.value, extraction.constSortNoArgs293);
      IStrategoTerm term868 = term;
      Success348:
      { 
        Fail1208:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1208;
          if(true)
            break Success348;
        }
        term = term868;
        IStrategoTerm u_314 = null;
        u_314 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_314, extraction.const617);
        if(term == null)
          break Fail1207;
        if(true)
          break Fail1207;
      }
      term = r_314;
      w_314 = r_314;
      v_314 = term;
      term = w_314;
      IStrategoList list407;
      list407 = checkListTail(v_314);
      if(list407 == null)
        break Fail1207;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs67, list407);
      if(true)
        return term;
    }
    return null;
  }
}