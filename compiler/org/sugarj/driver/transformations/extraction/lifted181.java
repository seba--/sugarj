package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted181 extends Strategy 
{ 
  TermReference q_157;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1883:
    { 
      IStrategoTerm w_157 = null;
      IStrategoTerm b_158 = null;
      IStrategoTerm c_158 = null;
      w_157 = term;
      if(q_157.value == null)
        break Fail1883;
      term = termFactory.makeTuple(q_157.value, extraction.constSortNoArgs6);
      IStrategoTerm term460 = term;
      Success756:
      { 
        Fail1884:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1884;
          if(true)
            break Success756;
        }
        term = term460;
        IStrategoTerm a_158 = null;
        a_158 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_158, extraction.const420);
        if(term == null)
          break Fail1883;
        if(true)
          break Fail1883;
      }
      term = w_157;
      c_158 = w_157;
      b_158 = term;
      term = c_158;
      IStrategoList list139;
      list139 = checkListTail(b_158);
      if(list139 == null)
        break Fail1883;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list139);
      if(true)
        return term;
    }
    return null;
  }
}