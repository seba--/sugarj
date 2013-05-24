package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted335 extends Strategy 
{ 
  TermReference q_245;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1474:
    { 
      IStrategoTerm s_245 = null;
      IStrategoTerm v_245 = null;
      IStrategoTerm w_245 = null;
      s_245 = term;
      if(q_245.value == null)
        break Fail1474;
      term = termFactory.makeTuple(q_245.value, extraction.constSortNoArgs45);
      IStrategoTerm term715 = term;
      Success501:
      { 
        Fail1475:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1475;
          if(true)
            break Success501;
        }
        term = term715;
        IStrategoTerm u_245 = null;
        u_245 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_245, extraction.const526);
        if(term == null)
          break Fail1474;
        if(true)
          break Fail1474;
      }
      term = s_245;
      w_245 = s_245;
      v_245 = term;
      term = w_245;
      IStrategoList list293;
      list293 = checkListTail(v_245);
      if(list293 == null)
        break Fail1474;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs208, list293);
      if(true)
        return term;
    }
    return null;
  }
}