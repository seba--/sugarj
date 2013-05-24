package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted452 extends Strategy 
{ 
  TermReference y_315;

  TermReference z_315;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1200:
    { 
      IStrategoTerm b_316 = null;
      IStrategoTerm c_316 = null;
      IStrategoTerm h_316 = null;
      IStrategoTerm i_316 = null;
      b_316 = term;
      if(y_315.value == null)
        break Fail1200;
      term = termFactory.makeTuple(y_315.value, extraction.constSortNoArgs34);
      IStrategoTerm term871 = term;
      Success344:
      { 
        Fail1201:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1201;
          if(true)
            break Success344;
        }
        term = term871;
        IStrategoTerm e_316 = null;
        e_316 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_316, extraction.const620);
        if(term == null)
          break Fail1200;
        if(true)
          break Fail1200;
      }
      term = b_316;
      c_316 = b_316;
      if(z_315.value == null)
        break Fail1200;
      term = termFactory.makeTuple(z_315.value, extraction.constSortNoArgs72);
      IStrategoTerm term872 = term;
      Success345:
      { 
        Fail1202:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1202;
          if(true)
            break Success345;
        }
        term = term872;
        IStrategoTerm g_316 = null;
        g_316 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_316, extraction.const620);
        if(term == null)
          break Fail1200;
        if(true)
          break Fail1200;
      }
      term = c_316;
      i_316 = c_316;
      h_316 = term;
      term = i_316;
      IStrategoList list410;
      list410 = checkListTail(h_316);
      if(list410 == null)
        break Fail1200;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs16, list410);
      if(true)
        return term;
    }
    return null;
  }
}