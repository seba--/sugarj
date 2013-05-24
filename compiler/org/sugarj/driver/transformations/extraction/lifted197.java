package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted197 extends Strategy 
{ 
  TermReference g_167;

  TermReference h_167;

  TermReference i_167;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1849:
    { 
      IStrategoTerm k_167 = null;
      IStrategoTerm l_167 = null;
      IStrategoTerm n_167 = null;
      IStrategoTerm y_167 = null;
      IStrategoTerm z_167 = null;
      k_167 = term;
      if(g_167.value == null)
        break Fail1849;
      term = termFactory.makeTuple(g_167.value, extraction.constSortNoArgs6);
      IStrategoTerm term476 = term;
      Success738:
      { 
        Fail1850:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1850;
          if(true)
            break Success738;
        }
        term = term476;
        IStrategoTerm s_167 = null;
        s_167 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_167, extraction.const142);
        if(term == null)
          break Fail1849;
        if(true)
          break Fail1849;
      }
      term = k_167;
      l_167 = k_167;
      if(h_167.value == null)
        break Fail1849;
      term = termFactory.makeTuple(h_167.value, extraction.constSortNoArgs6);
      IStrategoTerm term477 = term;
      Success739:
      { 
        Fail1851:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1851;
          if(true)
            break Success739;
        }
        term = term477;
        IStrategoTerm v_167 = null;
        v_167 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_167, extraction.const142);
        if(term == null)
          break Fail1849;
        if(true)
          break Fail1849;
      }
      term = l_167;
      n_167 = l_167;
      if(i_167.value == null)
        break Fail1849;
      term = termFactory.makeTuple(i_167.value, extraction.constSortNoArgs6);
      IStrategoTerm term478 = term;
      Success740:
      { 
        Fail1852:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1852;
          if(true)
            break Success740;
        }
        term = term478;
        IStrategoTerm x_167 = null;
        x_167 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_167, extraction.const142);
        if(term == null)
          break Fail1849;
        if(true)
          break Fail1849;
      }
      term = n_167;
      z_167 = n_167;
      y_167 = term;
      term = z_167;
      IStrategoList list155;
      list155 = checkListTail(y_167);
      if(list155 == null)
        break Fail1849;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs131, list155);
      if(true)
        return term;
    }
    return null;
  }
}