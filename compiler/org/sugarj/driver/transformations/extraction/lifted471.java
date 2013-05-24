package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted471 extends Strategy 
{ 
  TermReference i_325;

  TermReference j_325;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1159:
    { 
      IStrategoTerm l_325 = null;
      IStrategoTerm m_325 = null;
      IStrategoTerm r_325 = null;
      IStrategoTerm s_325 = null;
      l_325 = term;
      if(i_325.value == null)
        break Fail1159;
      term = termFactory.makeTuple(i_325.value, extraction.constSortNoArgs279);
      IStrategoTerm term893 = term;
      Success322:
      { 
        Fail1160:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1160;
          if(true)
            break Success322;
        }
        term = term893;
        IStrategoTerm o_325 = null;
        o_325 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_325, extraction.const638);
        if(term == null)
          break Fail1159;
        if(true)
          break Fail1159;
      }
      term = l_325;
      m_325 = l_325;
      if(j_325.value == null)
        break Fail1159;
      term = termFactory.makeTuple(j_325.value, extraction.constSort46);
      IStrategoTerm term894 = term;
      Success323:
      { 
        Fail1161:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1161;
          if(true)
            break Success323;
        }
        term = term894;
        IStrategoTerm q_325 = null;
        q_325 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_325, extraction.const638);
        if(term == null)
          break Fail1159;
        if(true)
          break Fail1159;
      }
      term = m_325;
      s_325 = m_325;
      r_325 = term;
      term = s_325;
      IStrategoList list429;
      list429 = checkListTail(r_325);
      if(list429 == null)
        break Fail1159;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs277, list429);
      if(true)
        return term;
    }
    return null;
  }
}