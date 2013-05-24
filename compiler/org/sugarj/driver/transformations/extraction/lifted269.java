package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted269 extends Strategy 
{ 
  TermReference w_208;

  TermReference x_208;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1636:
    { 
      IStrategoTerm z_208 = null;
      IStrategoTerm a_209 = null;
      IStrategoTerm h_209 = null;
      IStrategoTerm i_209 = null;
      z_208 = term;
      if(w_208.value == null)
        break Fail1636;
      term = termFactory.makeTuple(w_208.value, extraction.constSortNoArgs0);
      IStrategoTerm term618 = term;
      Success597:
      { 
        Fail1637:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1637;
          if(true)
            break Success597;
        }
        term = term618;
        IStrategoTerm e_209 = null;
        e_209 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_209, extraction.const475);
        if(term == null)
          break Fail1636;
        if(true)
          break Fail1636;
      }
      term = z_208;
      a_209 = z_208;
      if(x_208.value == null)
        break Fail1636;
      term = termFactory.makeTuple(x_208.value, extraction.constSortNoArgs0);
      IStrategoTerm term619 = term;
      Success598:
      { 
        Fail1638:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1638;
          if(true)
            break Success598;
        }
        term = term619;
        IStrategoTerm g_209 = null;
        g_209 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_209, extraction.const475);
        if(term == null)
          break Fail1636;
        if(true)
          break Fail1636;
      }
      term = a_209;
      i_209 = a_209;
      h_209 = term;
      term = i_209;
      IStrategoList list227;
      list227 = checkListTail(h_209);
      if(list227 == null)
        break Fail1636;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list227);
      if(true)
        return term;
    }
    return null;
  }
}