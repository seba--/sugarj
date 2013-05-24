package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted219 extends Strategy 
{ 
  TermReference d_179;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1796:
    { 
      IStrategoTerm f_179 = null;
      IStrategoTerm i_179 = null;
      IStrategoTerm j_179 = null;
      f_179 = term;
      if(d_179.value == null)
        break Fail1796;
      term = termFactory.makeTuple(d_179.value, extraction.constSort35);
      IStrategoTerm term509 = term;
      Success707:
      { 
        Fail1797:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1797;
          if(true)
            break Success707;
        }
        term = term509;
        IStrategoTerm h_179 = null;
        h_179 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_179, extraction.const440);
        if(term == null)
          break Fail1796;
        if(true)
          break Fail1796;
      }
      term = f_179;
      j_179 = f_179;
      i_179 = term;
      term = j_179;
      IStrategoList list177;
      list177 = checkListTail(i_179);
      if(list177 == null)
        break Fail1796;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list177);
      if(true)
        return term;
    }
    return null;
  }
}