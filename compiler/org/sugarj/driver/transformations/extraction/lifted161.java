package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted161 extends Strategy 
{ 
  TermReference l_147;

  TermReference m_147;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1929:
    { 
      IStrategoTerm o_147 = null;
      IStrategoTerm t_147 = null;
      IStrategoTerm b_148 = null;
      IStrategoTerm c_148 = null;
      o_147 = term;
      if(l_147.value == null)
        break Fail1929;
      term = termFactory.makeTuple(l_147.value, extraction.constSortNoArgs14);
      IStrategoTerm term433 = term;
      Success782:
      { 
        Fail1930:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1930;
          if(true)
            break Success782;
        }
        term = term433;
        IStrategoTerm y_147 = null;
        y_147 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_147, extraction.const412);
        if(term == null)
          break Fail1929;
        if(true)
          break Fail1929;
      }
      term = o_147;
      t_147 = o_147;
      if(m_147.value == null)
        break Fail1929;
      term = termFactory.makeTuple(m_147.value, extraction.constSort28);
      IStrategoTerm term434 = term;
      Success783:
      { 
        Fail1931:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1931;
          if(true)
            break Success783;
        }
        term = term434;
        IStrategoTerm a_148 = null;
        a_148 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_148, extraction.const412);
        if(term == null)
          break Fail1929;
        if(true)
          break Fail1929;
      }
      term = t_147;
      c_148 = t_147;
      b_148 = term;
      term = c_148;
      IStrategoList list119;
      list119 = checkListTail(b_148);
      if(list119 == null)
        break Fail1929;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs67, list119);
      if(true)
        return term;
    }
    return null;
  }
}