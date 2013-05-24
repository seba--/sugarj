package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted355 extends Strategy 
{ 
  TermReference m_258;

  TermReference n_258;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1415:
    { 
      IStrategoTerm r_258 = null;
      IStrategoTerm s_258 = null;
      IStrategoTerm y_258 = null;
      IStrategoTerm z_258 = null;
      r_258 = term;
      if(m_258.value == null)
        break Fail1415;
      term = termFactory.makeTuple(m_258.value, extraction.constSortNoArgs44);
      IStrategoTerm term753 = term;
      Success462:
      { 
        Fail1416:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1416;
          if(true)
            break Success462;
        }
        term = term753;
        IStrategoTerm u_258 = null;
        u_258 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_258, extraction.const540);
        if(term == null)
          break Fail1415;
        if(true)
          break Fail1415;
      }
      term = r_258;
      s_258 = r_258;
      if(n_258.value == null)
        break Fail1415;
      term = termFactory.makeTuple(n_258.value, extraction.constSortNoArgs45);
      IStrategoTerm term754 = term;
      Success463:
      { 
        Fail1417:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1417;
          if(true)
            break Success463;
        }
        term = term754;
        IStrategoTerm x_258 = null;
        x_258 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_258, extraction.const540);
        if(term == null)
          break Fail1415;
        if(true)
          break Fail1415;
      }
      term = s_258;
      z_258 = s_258;
      y_258 = term;
      term = z_258;
      IStrategoList list313;
      list313 = checkListTail(y_258);
      if(list313 == null)
        break Fail1415;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs198, list313);
      if(true)
        return term;
    }
    return null;
  }
}