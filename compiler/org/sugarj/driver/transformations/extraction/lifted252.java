package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted252 extends Strategy 
{ 
  TermReference j_198;

  TermReference k_198;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1689:
    { 
      IStrategoTerm o_198 = null;
      IStrategoTerm p_198 = null;
      IStrategoTerm b_199 = null;
      IStrategoTerm c_199 = null;
      o_198 = term;
      if(j_198.value == null)
        break Fail1689;
      term = termFactory.makeTuple(j_198.value, extraction.constSortNoArgs0);
      IStrategoTerm term582 = term;
      Success633:
      { 
        Fail1690:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1690;
          if(true)
            break Success633;
        }
        term = term582;
        IStrategoTerm y_198 = null;
        y_198 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_198, extraction.const462);
        if(term == null)
          break Fail1689;
        if(true)
          break Fail1689;
      }
      term = o_198;
      p_198 = o_198;
      if(k_198.value == null)
        break Fail1689;
      term = termFactory.makeTuple(k_198.value, extraction.constSortNoArgs41);
      IStrategoTerm term583 = term;
      Success634:
      { 
        Fail1691:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1691;
          if(true)
            break Success634;
        }
        term = term583;
        IStrategoTerm a_199 = null;
        a_199 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_199, extraction.const462);
        if(term == null)
          break Fail1689;
        if(true)
          break Fail1689;
      }
      term = p_198;
      c_199 = p_198;
      b_199 = term;
      term = c_199;
      IStrategoList list210;
      list210 = checkListTail(b_199);
      if(list210 == null)
        break Fail1689;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list210);
      if(true)
        return term;
    }
    return null;
  }
}