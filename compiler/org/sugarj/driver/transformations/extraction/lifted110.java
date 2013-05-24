package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted110 extends Strategy 
{ 
  TermReference c_118;

  TermReference d_118;

  TermReference e_118;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2041:
    { 
      IStrategoTerm g_118 = null;
      IStrategoTerm h_118 = null;
      IStrategoTerm i_118 = null;
      IStrategoTerm v_118 = null;
      IStrategoTerm w_118 = null;
      g_118 = term;
      if(c_118.value == null)
        break Fail2041;
      term = termFactory.makeTuple(c_118.value, extraction.constSortNoArgs92);
      IStrategoTerm term371 = term;
      Success843:
      { 
        Fail2042:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2042;
          if(true)
            break Success843;
        }
        term = term371;
        IStrategoTerm q_118 = null;
        q_118 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, q_118, extraction.const378);
        if(term == null)
          break Fail2041;
        if(true)
          break Fail2041;
      }
      term = g_118;
      h_118 = g_118;
      if(d_118.value == null)
        break Fail2041;
      term = termFactory.makeTuple(d_118.value, extraction.constSort24);
      IStrategoTerm term372 = term;
      Success844:
      { 
        Fail2043:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2043;
          if(true)
            break Success844;
        }
        term = term372;
        IStrategoTerm s_118 = null;
        s_118 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_118, extraction.const378);
        if(term == null)
          break Fail2041;
        if(true)
          break Fail2041;
      }
      term = h_118;
      i_118 = h_118;
      if(e_118.value == null)
        break Fail2041;
      term = termFactory.makeTuple(e_118.value, extraction.constSortNoArgs309);
      IStrategoTerm term373 = term;
      Success845:
      { 
        Fail2044:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2044;
          if(true)
            break Success845;
        }
        term = term373;
        IStrategoTerm u_118 = null;
        u_118 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_118, extraction.const378);
        if(term == null)
          break Fail2041;
        if(true)
          break Fail2041;
      }
      term = i_118;
      w_118 = i_118;
      v_118 = term;
      term = w_118;
      IStrategoList list68;
      list68 = checkListTail(v_118);
      if(list68 == null)
        break Fail2041;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs148, list68);
      if(true)
        return term;
    }
    return null;
  }
}