package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted221 extends Strategy 
{ 
  TermReference d_180;

  TermReference e_180;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1790:
    { 
      IStrategoTerm g_180 = null;
      IStrategoTerm h_180 = null;
      IStrategoTerm m_180 = null;
      IStrategoTerm n_180 = null;
      g_180 = term;
      if(d_180.value == null)
        break Fail1790;
      term = termFactory.makeTuple(d_180.value, extraction.constSortNoArgs172);
      IStrategoTerm term512 = term;
      Success703:
      { 
        Fail1791:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1791;
          if(true)
            break Success703;
        }
        term = term512;
        IStrategoTerm j_180 = null;
        j_180 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_180, extraction.const442);
        if(term == null)
          break Fail1790;
        if(true)
          break Fail1790;
      }
      term = g_180;
      h_180 = g_180;
      if(e_180.value == null)
        break Fail1790;
      term = termFactory.makeTuple(e_180.value, extraction.constSortNoArgs41);
      IStrategoTerm term513 = term;
      Success704:
      { 
        Fail1792:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1792;
          if(true)
            break Success704;
        }
        term = term513;
        IStrategoTerm l_180 = null;
        l_180 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_180, extraction.const442);
        if(term == null)
          break Fail1790;
        if(true)
          break Fail1790;
      }
      term = h_180;
      n_180 = h_180;
      m_180 = term;
      term = n_180;
      IStrategoList list179;
      list179 = checkListTail(m_180);
      if(list179 == null)
        break Fail1790;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs174, list179);
      if(true)
        return term;
    }
    return null;
  }
}