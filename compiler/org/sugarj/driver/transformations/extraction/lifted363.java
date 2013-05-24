package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted363 extends Strategy 
{ 
  TermReference r_261;

  TermReference s_261;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1400:
    { 
      IStrategoTerm u_261 = null;
      IStrategoTerm v_261 = null;
      IStrategoTerm a_262 = null;
      IStrategoTerm b_262 = null;
      u_261 = term;
      if(r_261.value == null)
        break Fail1400;
      term = termFactory.makeTuple(r_261.value, extraction.constSort43);
      IStrategoTerm term760 = term;
      Success455:
      { 
        Fail1401:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1401;
          if(true)
            break Success455;
        }
        term = term760;
        IStrategoTerm x_261 = null;
        x_261 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_261, extraction.const545);
        if(term == null)
          break Fail1400;
        if(true)
          break Fail1400;
      }
      term = u_261;
      v_261 = u_261;
      if(s_261.value == null)
        break Fail1400;
      term = termFactory.makeTuple(s_261.value, extraction.constSortNoArgs0);
      IStrategoTerm term761 = term;
      Success456:
      { 
        Fail1402:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1402;
          if(true)
            break Success456;
        }
        term = term761;
        IStrategoTerm z_261 = null;
        z_261 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_261, extraction.const545);
        if(term == null)
          break Fail1400;
        if(true)
          break Fail1400;
      }
      term = v_261;
      b_262 = v_261;
      a_262 = term;
      term = b_262;
      IStrategoList list321;
      list321 = checkListTail(a_262);
      if(list321 == null)
        break Fail1400;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list321);
      if(true)
        return term;
    }
    return null;
  }
}