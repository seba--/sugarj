package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted220 extends Strategy 
{ 
  TermReference o_179;

  TermReference p_179;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1793:
    { 
      IStrategoTerm r_179 = null;
      IStrategoTerm s_179 = null;
      IStrategoTerm x_179 = null;
      IStrategoTerm y_179 = null;
      r_179 = term;
      if(o_179.value == null)
        break Fail1793;
      term = termFactory.makeTuple(o_179.value, extraction.constSortNoArgs8);
      IStrategoTerm term510 = term;
      Success705:
      { 
        Fail1794:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1794;
          if(true)
            break Success705;
        }
        term = term510;
        IStrategoTerm u_179 = null;
        u_179 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_179, extraction.const441);
        if(term == null)
          break Fail1793;
        if(true)
          break Fail1793;
      }
      term = r_179;
      s_179 = r_179;
      if(p_179.value == null)
        break Fail1793;
      term = termFactory.makeTuple(p_179.value, extraction.constSortNoArgs41);
      IStrategoTerm term511 = term;
      Success706:
      { 
        Fail1795:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1795;
          if(true)
            break Success706;
        }
        term = term511;
        IStrategoTerm w_179 = null;
        w_179 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_179, extraction.const441);
        if(term == null)
          break Fail1793;
        if(true)
          break Fail1793;
      }
      term = s_179;
      y_179 = s_179;
      x_179 = term;
      term = y_179;
      IStrategoList list178;
      list178 = checkListTail(x_179);
      if(list178 == null)
        break Fail1793;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs174, list178);
      if(true)
        return term;
    }
    return null;
  }
}