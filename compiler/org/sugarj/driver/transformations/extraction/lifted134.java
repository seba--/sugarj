package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted134 extends Strategy 
{ 
  TermReference z_129;

  TermReference a_130;

  TermReference c_130;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1978:
    { 
      IStrategoTerm f_130 = null;
      IStrategoTerm g_130 = null;
      IStrategoTerm h_130 = null;
      IStrategoTerm x_130 = null;
      IStrategoTerm y_130 = null;
      f_130 = term;
      if(z_129.value == null)
        break Fail1978;
      term = termFactory.makeTuple(z_129.value, extraction.constSortNoArgs94);
      IStrategoTerm term410 = term;
      Success804:
      { 
        Fail1979:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1979;
          if(true)
            break Success804;
        }
        term = term410;
        IStrategoTerm o_130 = null;
        o_130 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_130, extraction.const390);
        if(term == null)
          break Fail1978;
        if(true)
          break Fail1978;
      }
      term = f_130;
      g_130 = f_130;
      if(a_130.value == null)
        break Fail1978;
      term = termFactory.makeTuple(a_130.value, extraction.constSortNoArgs18);
      IStrategoTerm term411 = term;
      Success805:
      { 
        Fail1980:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1980;
          if(true)
            break Success805;
        }
        term = term411;
        IStrategoTerm t_130 = null;
        t_130 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_130, extraction.const390);
        if(term == null)
          break Fail1978;
        if(true)
          break Fail1978;
      }
      term = g_130;
      h_130 = g_130;
      if(c_130.value == null)
        break Fail1978;
      term = termFactory.makeTuple(c_130.value, extraction.constSortNoArgs115);
      IStrategoTerm term412 = term;
      Success806:
      { 
        Fail1981:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1981;
          if(true)
            break Success806;
        }
        term = term412;
        IStrategoTerm w_130 = null;
        w_130 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_130, extraction.const390);
        if(term == null)
          break Fail1978;
        if(true)
          break Fail1978;
      }
      term = h_130;
      y_130 = h_130;
      x_130 = term;
      term = y_130;
      IStrategoList list92;
      list92 = checkListTail(x_130);
      if(list92 == null)
        break Fail1978;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs117, list92);
      if(true)
        return term;
    }
    return null;
  }
}