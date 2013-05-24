package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted447 extends Strategy 
{ 
  TermReference y_312;

  TermReference z_312;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1213:
    { 
      IStrategoTerm b_313 = null;
      IStrategoTerm c_313 = null;
      IStrategoTerm h_313 = null;
      IStrategoTerm i_313 = null;
      b_313 = term;
      if(y_312.value == null)
        break Fail1213;
      term = termFactory.makeTuple(y_312.value, extraction.constSortNoArgs73);
      IStrategoTerm term863 = term;
      Success352:
      { 
        Fail1214:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1214;
          if(true)
            break Success352;
        }
        term = term863;
        IStrategoTerm e_313 = null;
        e_313 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_313, extraction.const615);
        if(term == null)
          break Fail1213;
        if(true)
          break Fail1213;
      }
      term = b_313;
      c_313 = b_313;
      if(z_312.value == null)
        break Fail1213;
      term = termFactory.makeTuple(z_312.value, extraction.constSortNoArgs73);
      IStrategoTerm term864 = term;
      Success353:
      { 
        Fail1215:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1215;
          if(true)
            break Success353;
        }
        term = term864;
        IStrategoTerm g_313 = null;
        g_313 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_313, extraction.const615);
        if(term == null)
          break Fail1213;
        if(true)
          break Fail1213;
      }
      term = c_313;
      i_313 = c_313;
      h_313 = term;
      term = i_313;
      IStrategoList list405;
      list405 = checkListTail(h_313);
      if(list405 == null)
        break Fail1213;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs264, list405);
      if(true)
        return term;
    }
    return null;
  }
}