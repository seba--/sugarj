package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted354 extends Strategy 
{ 
  TermReference s_257;

  TermReference t_257;

  TermReference u_257;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1418:
    { 
      IStrategoTerm w_257 = null;
      IStrategoTerm x_257 = null;
      IStrategoTerm y_257 = null;
      IStrategoTerm g_258 = null;
      IStrategoTerm h_258 = null;
      w_257 = term;
      if(s_257.value == null)
        break Fail1418;
      term = termFactory.makeTuple(s_257.value, extraction.constSortNoArgs8);
      IStrategoTerm term750 = term;
      Success464:
      { 
        Fail1419:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1419;
          if(true)
            break Success464;
        }
        term = term750;
        IStrategoTerm b_258 = null;
        b_258 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_258, extraction.const539);
        if(term == null)
          break Fail1418;
        if(true)
          break Fail1418;
      }
      term = w_257;
      x_257 = w_257;
      if(t_257.value == null)
        break Fail1418;
      term = termFactory.makeTuple(t_257.value, extraction.constSort36);
      IStrategoTerm term751 = term;
      Success465:
      { 
        Fail1420:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1420;
          if(true)
            break Success465;
        }
        term = term751;
        IStrategoTerm d_258 = null;
        d_258 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_258, extraction.const539);
        if(term == null)
          break Fail1418;
        if(true)
          break Fail1418;
      }
      term = x_257;
      y_257 = x_257;
      if(u_257.value == null)
        break Fail1418;
      term = termFactory.makeTuple(u_257.value, extraction.constSort36);
      IStrategoTerm term752 = term;
      Success466:
      { 
        Fail1421:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1421;
          if(true)
            break Success466;
        }
        term = term752;
        IStrategoTerm f_258 = null;
        f_258 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_258, extraction.const539);
        if(term == null)
          break Fail1418;
        if(true)
          break Fail1418;
      }
      term = y_257;
      h_258 = y_257;
      g_258 = term;
      term = h_258;
      IStrategoList list312;
      list312 = checkListTail(g_258);
      if(list312 == null)
        break Fail1418;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs53, list312);
      if(true)
        return term;
    }
    return null;
  }
}