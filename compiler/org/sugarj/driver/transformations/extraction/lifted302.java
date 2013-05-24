package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted302 extends Strategy 
{ 
  TermReference x_227;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1554:
    { 
      IStrategoTerm a_228 = null;
      IStrategoTerm h_228 = null;
      IStrategoTerm i_228 = null;
      a_228 = term;
      if(x_227.value == null)
        break Fail1554;
      term = termFactory.makeTuple(x_227.value, extraction.constSortNoArgs8);
      IStrategoTerm term668 = term;
      Success548:
      { 
        Fail1555:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1555;
          if(true)
            break Success548;
        }
        term = term668;
        IStrategoTerm g_228 = null;
        g_228 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_228, extraction.const60);
        if(term == null)
          break Fail1554;
        if(true)
          break Fail1554;
      }
      term = a_228;
      i_228 = a_228;
      h_228 = term;
      term = i_228;
      IStrategoList list260;
      list260 = checkListTail(h_228);
      if(list260 == null)
        break Fail1554;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs50, list260);
      if(true)
        return term;
    }
    return null;
  }
}