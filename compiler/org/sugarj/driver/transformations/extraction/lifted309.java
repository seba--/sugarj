package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted309 extends Strategy 
{ 
  TermReference f_232;

  TermReference g_232;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1537:
    { 
      IStrategoTerm i_232 = null;
      IStrategoTerm j_232 = null;
      IStrategoTerm t_232 = null;
      IStrategoTerm v_232 = null;
      i_232 = term;
      if(f_232.value == null)
        break Fail1537;
      term = termFactory.makeTuple(f_232.value, extraction.constSortNoArgs0);
      IStrategoTerm term677 = term;
      Success538:
      { 
        Fail1538:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1538;
          if(true)
            break Success538;
        }
        term = term677;
        IStrategoTerm q_232 = null;
        q_232 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_232, extraction.const509);
        if(term == null)
          break Fail1537;
        if(true)
          break Fail1537;
      }
      term = i_232;
      j_232 = i_232;
      if(g_232.value == null)
        break Fail1537;
      term = termFactory.makeTuple(g_232.value, extraction.constSortNoArgs41);
      IStrategoTerm term678 = term;
      Success539:
      { 
        Fail1539:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1539;
          if(true)
            break Success539;
        }
        term = term678;
        IStrategoTerm s_232 = null;
        s_232 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_232, extraction.const509);
        if(term == null)
          break Fail1537;
        if(true)
          break Fail1537;
      }
      term = j_232;
      v_232 = j_232;
      t_232 = term;
      term = v_232;
      IStrategoList list267;
      list267 = checkListTail(t_232);
      if(list267 == null)
        break Fail1537;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs51, list267);
      if(true)
        return term;
    }
    return null;
  }
}