package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted249 extends Strategy 
{ 
  TermReference l_197;

  TermReference m_197;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1698:
    { 
      IStrategoTerm o_197 = null;
      IStrategoTerm p_197 = null;
      IStrategoTerm w_197 = null;
      IStrategoTerm x_197 = null;
      o_197 = term;
      if(l_197.value == null)
        break Fail1698;
      term = termFactory.makeTuple(l_197.value, extraction.constSortNoArgs40);
      IStrategoTerm term576 = term;
      Success639:
      { 
        Fail1699:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1699;
          if(true)
            break Success639;
        }
        term = term576;
        IStrategoTerm t_197 = null;
        t_197 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_197, extraction.const461);
        if(term == null)
          break Fail1698;
        if(true)
          break Fail1698;
      }
      term = o_197;
      p_197 = o_197;
      if(m_197.value == null)
        break Fail1698;
      term = termFactory.makeTuple(m_197.value, extraction.constSortNoArgs41);
      IStrategoTerm term577 = term;
      Success640:
      { 
        Fail1700:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1700;
          if(true)
            break Success640;
        }
        term = term577;
        IStrategoTerm v_197 = null;
        v_197 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_197, extraction.const461);
        if(term == null)
          break Fail1698;
        if(true)
          break Fail1698;
      }
      term = p_197;
      x_197 = p_197;
      w_197 = term;
      term = x_197;
      IStrategoList list207;
      list207 = checkListTail(w_197);
      if(list207 == null)
        break Fail1698;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list207);
      if(true)
        return term;
    }
    return null;
  }
}