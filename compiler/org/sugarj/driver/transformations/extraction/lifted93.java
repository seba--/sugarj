package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted93 extends Strategy 
{ 
  TermReference f_111;

  TermReference g_111;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2076:
    { 
      IStrategoTerm i_111 = null;
      IStrategoTerm j_111 = null;
      IStrategoTerm s_111 = null;
      IStrategoTerm t_111 = null;
      i_111 = term;
      if(f_111.value == null)
        break Fail2076;
      term = termFactory.makeTuple(f_111.value, extraction.constSortNoArgs14);
      IStrategoTerm term354 = term;
      Success861:
      { 
        Fail2077:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2077;
          if(true)
            break Success861;
        }
        term = term354;
        IStrategoTerm p_111 = null;
        p_111 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_111, extraction.const364);
        if(term == null)
          break Fail2076;
        if(true)
          break Fail2076;
      }
      term = i_111;
      j_111 = i_111;
      if(g_111.value == null)
        break Fail2076;
      term = termFactory.makeTuple(g_111.value, extraction.constSort22);
      IStrategoTerm term355 = term;
      Success862:
      { 
        Fail2078:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2078;
          if(true)
            break Success862;
        }
        term = term355;
        IStrategoTerm r_111 = null;
        r_111 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_111, extraction.const364);
        if(term == null)
          break Fail2076;
        if(true)
          break Fail2076;
      }
      term = j_111;
      t_111 = j_111;
      s_111 = term;
      term = t_111;
      IStrategoList list51;
      list51 = checkListTail(s_111);
      if(list51 == null)
        break Fail2076;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs67, list51);
      if(true)
        return term;
    }
    return null;
  }
}