package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted457 extends Strategy 
{ 
  TermReference g_318;

  TermReference h_318;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1189:
    { 
      IStrategoTerm j_318 = null;
      IStrategoTerm k_318 = null;
      IStrategoTerm p_318 = null;
      IStrategoTerm q_318 = null;
      j_318 = term;
      if(g_318.value == null)
        break Fail1189;
      term = termFactory.makeTuple(g_318.value, extraction.constSortNoArgs16);
      IStrategoTerm term877 = term;
      Success338:
      { 
        Fail1190:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1190;
          if(true)
            break Success338;
        }
        term = term877;
        IStrategoTerm m_318 = null;
        m_318 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, m_318, extraction.const624);
        if(term == null)
          break Fail1189;
        if(true)
          break Fail1189;
      }
      term = j_318;
      k_318 = j_318;
      if(h_318.value == null)
        break Fail1189;
      term = termFactory.makeTuple(h_318.value, extraction.constSortNoArgs266);
      IStrategoTerm term878 = term;
      Success339:
      { 
        Fail1191:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1191;
          if(true)
            break Success339;
        }
        term = term878;
        IStrategoTerm o_318 = null;
        o_318 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_318, extraction.const624);
        if(term == null)
          break Fail1189;
        if(true)
          break Fail1189;
      }
      term = k_318;
      q_318 = k_318;
      p_318 = term;
      term = q_318;
      IStrategoList list415;
      list415 = checkListTail(p_318);
      if(list415 == null)
        break Fail1189;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs69, list415);
      if(true)
        return term;
    }
    return null;
  }
}