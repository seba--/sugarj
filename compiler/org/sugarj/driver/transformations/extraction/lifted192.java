package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted192 extends Strategy 
{ 
  TermReference d_164;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1861:
    { 
      IStrategoTerm h_164 = null;
      IStrategoTerm n_164 = null;
      IStrategoTerm o_164 = null;
      h_164 = term;
      if(d_164.value == null)
        break Fail1861;
      term = termFactory.makeTuple(d_164.value, extraction.constSortNoArgs8);
      IStrategoTerm term471 = term;
      Success745:
      { 
        Fail1862:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1862;
          if(true)
            break Success745;
        }
        term = term471;
        IStrategoTerm m_164 = null;
        m_164 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_164, extraction.const428);
        if(term == null)
          break Fail1861;
        if(true)
          break Fail1861;
      }
      term = h_164;
      o_164 = h_164;
      n_164 = term;
      term = o_164;
      IStrategoList list150;
      list150 = checkListTail(n_164);
      if(list150 == null)
        break Fail1861;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list150);
      if(true)
        return term;
    }
    return null;
  }
}