package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted225 extends Strategy 
{ 
  TermReference u_182;

  TermReference v_182;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1778:
    { 
      IStrategoTerm x_182 = null;
      IStrategoTerm y_182 = null;
      IStrategoTerm g_183 = null;
      IStrategoTerm h_183 = null;
      x_182 = term;
      if(u_182.value == null)
        break Fail1778;
      term = termFactory.makeTuple(u_182.value, extraction.constSortNoArgs172);
      IStrategoTerm term520 = term;
      Success695:
      { 
        Fail1779:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1779;
          if(true)
            break Success695;
        }
        term = term520;
        IStrategoTerm d_183 = null;
        d_183 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_183, extraction.const446);
        if(term == null)
          break Fail1778;
        if(true)
          break Fail1778;
      }
      term = x_182;
      y_182 = x_182;
      if(v_182.value == null)
        break Fail1778;
      term = termFactory.makeTuple(v_182.value, extraction.constSortNoArgs41);
      IStrategoTerm term521 = term;
      Success696:
      { 
        Fail1780:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1780;
          if(true)
            break Success696;
        }
        term = term521;
        IStrategoTerm f_183 = null;
        f_183 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_183, extraction.const446);
        if(term == null)
          break Fail1778;
        if(true)
          break Fail1778;
      }
      term = y_182;
      h_183 = y_182;
      g_183 = term;
      term = h_183;
      IStrategoList list183;
      list183 = checkListTail(g_183);
      if(list183 == null)
        break Fail1778;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs174, list183);
      if(true)
        return term;
    }
    return null;
  }
}