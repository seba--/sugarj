package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted409 extends Strategy 
{ 
  TermReference i_286;

  TermReference j_286;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1295:
    { 
      IStrategoTerm l_286 = null;
      IStrategoTerm m_286 = null;
      IStrategoTerm r_286 = null;
      IStrategoTerm s_286 = null;
      l_286 = term;
      if(i_286.value == null)
        break Fail1295;
      term = termFactory.makeTuple(i_286.value, extraction.constSortNoArgs62);
      IStrategoTerm term819 = term;
      Success396:
      { 
        Fail1296:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1296;
          if(true)
            break Success396;
        }
        term = term819;
        IStrategoTerm o_286 = null;
        o_286 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_286, extraction.const583);
        if(term == null)
          break Fail1295;
        if(true)
          break Fail1295;
      }
      term = l_286;
      m_286 = l_286;
      if(j_286.value == null)
        break Fail1295;
      term = termFactory.makeTuple(j_286.value, extraction.constSortNoArgs62);
      IStrategoTerm term820 = term;
      Success397:
      { 
        Fail1297:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1297;
          if(true)
            break Success397;
        }
        term = term820;
        IStrategoTerm q_286 = null;
        q_286 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_286, extraction.const583);
        if(term == null)
          break Fail1295;
        if(true)
          break Fail1295;
      }
      term = m_286;
      s_286 = m_286;
      r_286 = term;
      term = s_286;
      IStrategoList list367;
      list367 = checkListTail(r_286);
      if(list367 == null)
        break Fail1295;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs62, list367);
      if(true)
        return term;
    }
    return null;
  }
}