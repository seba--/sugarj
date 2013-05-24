package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted183 extends Strategy 
{ 
  TermReference w_158;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1879:
    { 
      IStrategoTerm z_158 = null;
      IStrategoTerm g_159 = null;
      IStrategoTerm i_159 = null;
      z_158 = term;
      if(w_158.value == null)
        break Fail1879;
      term = termFactory.makeTuple(w_158.value, extraction.constSortNoArgs135);
      IStrategoTerm term462 = term;
      Success754:
      { 
        Fail1880:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1880;
          if(true)
            break Success754;
        }
        term = term462;
        IStrategoTerm e_159 = null;
        e_159 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_159, extraction.const422);
        if(term == null)
          break Fail1879;
        if(true)
          break Fail1879;
      }
      term = z_158;
      i_159 = z_158;
      g_159 = term;
      term = i_159;
      IStrategoList list141;
      list141 = checkListTail(g_159);
      if(list141 == null)
        break Fail1879;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list141);
      if(true)
        return term;
    }
    return null;
  }
}