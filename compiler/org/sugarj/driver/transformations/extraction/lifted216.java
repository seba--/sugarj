package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted216 extends Strategy 
{ 
  TermReference y_176;

  TermReference z_176;

  TermReference h_177;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1803:
    { 
      IStrategoTerm j_177 = null;
      IStrategoTerm k_177 = null;
      IStrategoTerm l_177 = null;
      IStrategoTerm s_177 = null;
      IStrategoTerm t_177 = null;
      j_177 = term;
      if(y_176.value == null)
        break Fail1803;
      term = termFactory.makeTuple(y_176.value, extraction.constSortNoArgs8);
      IStrategoTerm term503 = term;
      Success711:
      { 
        Fail1804:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1804;
          if(true)
            break Success711;
        }
        term = term503;
        IStrategoTerm n_177 = null;
        n_177 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_177, extraction.const193);
        if(term == null)
          break Fail1803;
        if(true)
          break Fail1803;
      }
      term = j_177;
      k_177 = j_177;
      if(z_176.value == null)
        break Fail1803;
      term = termFactory.makeTuple(z_176.value, extraction.constSort11);
      IStrategoTerm term504 = term;
      Success712:
      { 
        Fail1805:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1805;
          if(true)
            break Success712;
        }
        term = term504;
        IStrategoTerm p_177 = null;
        p_177 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_177, extraction.const193);
        if(term == null)
          break Fail1803;
        if(true)
          break Fail1803;
      }
      term = k_177;
      l_177 = k_177;
      if(h_177.value == null)
        break Fail1803;
      term = termFactory.makeTuple(h_177.value, extraction.constSortNoArgs41);
      IStrategoTerm term505 = term;
      Success713:
      { 
        Fail1806:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1806;
          if(true)
            break Success713;
        }
        term = term505;
        IStrategoTerm r_177 = null;
        r_177 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, r_177, extraction.const193);
        if(term == null)
          break Fail1803;
        if(true)
          break Fail1803;
      }
      term = l_177;
      t_177 = l_177;
      s_177 = term;
      term = t_177;
      IStrategoList list174;
      list174 = checkListTail(s_177);
      if(list174 == null)
        break Fail1803;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs182, list174);
      if(true)
        return term;
    }
    return null;
  }
}