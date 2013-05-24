package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted417 extends Strategy 
{ 
  TermReference p_298;

  TermReference q_298;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1279:
    { 
      IStrategoTerm s_298 = null;
      IStrategoTerm t_298 = null;
      IStrategoTerm y_298 = null;
      IStrategoTerm z_298 = null;
      s_298 = term;
      if(p_298.value == null)
        break Fail1279;
      term = termFactory.makeTuple(p_298.value, extraction.constSortNoArgs299);
      IStrategoTerm term827 = term;
      Success388:
      { 
        Fail1280:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1280;
          if(true)
            break Success388;
        }
        term = term827;
        IStrategoTerm v_298 = null;
        v_298 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_298, extraction.const589);
        if(term == null)
          break Fail1279;
        if(true)
          break Fail1279;
      }
      term = s_298;
      t_298 = s_298;
      if(q_298.value == null)
        break Fail1279;
      term = termFactory.makeTuple(q_298.value, extraction.constSortNoArgs299);
      IStrategoTerm term828 = term;
      Success389:
      { 
        Fail1281:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1281;
          if(true)
            break Success389;
        }
        term = term828;
        IStrategoTerm x_298 = null;
        x_298 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_298, extraction.const589);
        if(term == null)
          break Fail1279;
        if(true)
          break Fail1279;
      }
      term = t_298;
      z_298 = t_298;
      y_298 = term;
      term = z_298;
      IStrategoList list375;
      list375 = checkListTail(y_298);
      if(list375 == null)
        break Fail1279;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs299, list375);
      if(true)
        return term;
    }
    return null;
  }
}