package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted403 extends Strategy 
{ 
  TermReference d_284;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1305:
    { 
      IStrategoTerm f_284 = null;
      IStrategoTerm i_284 = null;
      IStrategoTerm j_284 = null;
      f_284 = term;
      if(d_284.value == null)
        break Fail1305;
      term = termFactory.makeTuple(d_284.value, extraction.constSortNoArgs32);
      IStrategoTerm term816 = term;
      Success400:
      { 
        Fail1306:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1306;
          if(true)
            break Success400;
        }
        term = term816;
        IStrategoTerm h_284 = null;
        h_284 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_284, extraction.const577);
        if(term == null)
          break Fail1305;
        if(true)
          break Fail1305;
      }
      term = f_284;
      j_284 = f_284;
      i_284 = term;
      term = j_284;
      IStrategoList list361;
      list361 = checkListTail(i_284);
      if(list361 == null)
        break Fail1305;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs60, list361);
      if(true)
        return term;
    }
    return null;
  }
}