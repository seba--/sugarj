package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted314 extends Strategy 
{ 
  TermReference e_235;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1526:
    { 
      IStrategoTerm h_235 = null;
      IStrategoTerm n_235 = null;
      IStrategoTerm o_235 = null;
      h_235 = term;
      if(e_235.value == null)
        break Fail1526;
      term = termFactory.makeTuple(e_235.value, extraction.constSort39);
      IStrategoTerm term684 = term;
      Success532:
      { 
        Fail1527:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1527;
          if(true)
            break Success532;
        }
        term = term684;
        IStrategoTerm m_235 = null;
        m_235 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_235, extraction.const66);
        if(term == null)
          break Fail1526;
        if(true)
          break Fail1526;
      }
      term = h_235;
      o_235 = h_235;
      n_235 = term;
      term = o_235;
      IStrategoList list272;
      list272 = checkListTail(n_235);
      if(list272 == null)
        break Fail1526;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list272);
      if(true)
        return term;
    }
    return null;
  }
}