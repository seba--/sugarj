package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted198 extends Strategy 
{ 
  TermReference g_167;

  TermReference h_167;

  TermReference i_167;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1845:
    { 
      IStrategoTerm o_167 = null;
      IStrategoTerm p_167 = null;
      IStrategoTerm q_167 = null;
      IStrategoTerm g_168 = null;
      IStrategoTerm h_168 = null;
      o_167 = term;
      if(g_167.value == null)
        break Fail1845;
      term = termFactory.makeTuple(g_167.value, extraction.constSortNoArgs6);
      IStrategoTerm term479 = term;
      Success735:
      { 
        Fail1846:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1846;
          if(true)
            break Success735;
        }
        term = term479;
        IStrategoTerm b_168 = null;
        b_168 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_168, extraction.const142);
        if(term == null)
          break Fail1845;
        if(true)
          break Fail1845;
      }
      term = o_167;
      p_167 = o_167;
      if(h_167.value == null)
        break Fail1845;
      term = termFactory.makeTuple(h_167.value, extraction.constSortNoArgs129);
      IStrategoTerm term480 = term;
      Success736:
      { 
        Fail1847:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1847;
          if(true)
            break Success736;
        }
        term = term480;
        IStrategoTerm d_168 = null;
        d_168 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_168, extraction.const142);
        if(term == null)
          break Fail1845;
        if(true)
          break Fail1845;
      }
      term = p_167;
      q_167 = p_167;
      if(i_167.value == null)
        break Fail1845;
      term = termFactory.makeTuple(i_167.value, extraction.constSortNoArgs6);
      IStrategoTerm term481 = term;
      Success737:
      { 
        Fail1848:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1848;
          if(true)
            break Success737;
        }
        term = term481;
        IStrategoTerm f_168 = null;
        f_168 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_168, extraction.const142);
        if(term == null)
          break Fail1845;
        if(true)
          break Fail1845;
      }
      term = q_167;
      h_168 = q_167;
      g_168 = term;
      term = h_168;
      IStrategoList list156;
      list156 = checkListTail(g_168);
      if(list156 == null)
        break Fail1845;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs131, list156);
      if(true)
        return term;
    }
    return null;
  }
}