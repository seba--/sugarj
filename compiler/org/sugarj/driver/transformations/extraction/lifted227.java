package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted227 extends Strategy 
{ 
  TermReference b_184;

  TermReference c_184;

  TermReference d_184;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1771:
    { 
      IStrategoTerm f_184 = null;
      IStrategoTerm g_184 = null;
      IStrategoTerm h_184 = null;
      IStrategoTerm o_184 = null;
      IStrategoTerm p_184 = null;
      f_184 = term;
      if(b_184.value == null)
        break Fail1771;
      term = termFactory.makeTuple(b_184.value, extraction.constSortNoArgs172);
      IStrategoTerm term524 = term;
      Success690:
      { 
        Fail1772:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1772;
          if(true)
            break Success690;
        }
        term = term524;
        IStrategoTerm j_184 = null;
        j_184 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_184, extraction.const448);
        if(term == null)
          break Fail1771;
        if(true)
          break Fail1771;
      }
      term = f_184;
      g_184 = f_184;
      if(c_184.value == null)
        break Fail1771;
      term = termFactory.makeTuple(c_184.value, extraction.constSortNoArgs179);
      IStrategoTerm term525 = term;
      Success691:
      { 
        Fail1773:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1773;
          if(true)
            break Success691;
        }
        term = term525;
        IStrategoTerm l_184 = null;
        l_184 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_184, extraction.const448);
        if(term == null)
          break Fail1771;
        if(true)
          break Fail1771;
      }
      term = g_184;
      h_184 = g_184;
      if(d_184.value == null)
        break Fail1771;
      term = termFactory.makeTuple(d_184.value, extraction.constSortNoArgs41);
      IStrategoTerm term526 = term;
      Success692:
      { 
        Fail1774:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1774;
          if(true)
            break Success692;
        }
        term = term526;
        IStrategoTerm n_184 = null;
        n_184 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_184, extraction.const448);
        if(term == null)
          break Fail1771;
        if(true)
          break Fail1771;
      }
      term = h_184;
      p_184 = h_184;
      o_184 = term;
      term = p_184;
      IStrategoList list185;
      list185 = checkListTail(o_184);
      if(list185 == null)
        break Fail1771;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs174, list185);
      if(true)
        return term;
    }
    return null;
  }
}