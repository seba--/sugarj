package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted222 extends Strategy 
{ 
  TermReference s_180;

  TermReference t_180;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1787:
    { 
      IStrategoTerm x_180 = null;
      IStrategoTerm y_180 = null;
      IStrategoTerm k_181 = null;
      IStrategoTerm l_181 = null;
      x_180 = term;
      if(s_180.value == null)
        break Fail1787;
      term = termFactory.makeTuple(s_180.value, extraction.constSortNoArgs172);
      IStrategoTerm term514 = term;
      Success701:
      { 
        Fail1788:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1788;
          if(true)
            break Success701;
        }
        term = term514;
        IStrategoTerm h_181 = null;
        h_181 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_181, extraction.const443);
        if(term == null)
          break Fail1787;
        if(true)
          break Fail1787;
      }
      term = x_180;
      y_180 = x_180;
      if(t_180.value == null)
        break Fail1787;
      term = termFactory.makeTuple(t_180.value, extraction.constSortNoArgs179);
      IStrategoTerm term515 = term;
      Success702:
      { 
        Fail1789:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1789;
          if(true)
            break Success702;
        }
        term = term515;
        IStrategoTerm j_181 = null;
        j_181 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_181, extraction.const443);
        if(term == null)
          break Fail1787;
        if(true)
          break Fail1787;
      }
      term = y_180;
      l_181 = y_180;
      k_181 = term;
      term = l_181;
      IStrategoList list180;
      list180 = checkListTail(k_181);
      if(list180 == null)
        break Fail1787;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs174, list180);
      if(true)
        return term;
    }
    return null;
  }
}