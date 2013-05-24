package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted238 extends Strategy 
{ 
  TermReference u_189;

  TermReference v_189;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1741:
    { 
      IStrategoTerm z_189 = null;
      IStrategoTerm a_190 = null;
      IStrategoTerm l_190 = null;
      IStrategoTerm m_190 = null;
      z_189 = term;
      if(u_189.value == null)
        break Fail1741;
      term = termFactory.makeTuple(u_189.value, extraction.constSortNoArgs103);
      IStrategoTerm term544 = term;
      Success671:
      { 
        Fail1742:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1742;
          if(true)
            break Success671;
        }
        term = term544;
        IStrategoTerm i_190 = null;
        i_190 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_190, extraction.const455);
        if(term == null)
          break Fail1741;
        if(true)
          break Fail1741;
      }
      term = z_189;
      a_190 = z_189;
      if(v_189.value == null)
        break Fail1741;
      term = termFactory.makeTuple(v_189.value, extraction.constSortNoArgs0);
      IStrategoTerm term545 = term;
      Success672:
      { 
        Fail1743:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1743;
          if(true)
            break Success672;
        }
        term = term545;
        IStrategoTerm k_190 = null;
        k_190 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_190, extraction.const455);
        if(term == null)
          break Fail1741;
        if(true)
          break Fail1741;
      }
      term = a_190;
      m_190 = a_190;
      l_190 = term;
      term = m_190;
      IStrategoList list196;
      list196 = checkListTail(l_190);
      if(list196 == null)
        break Fail1741;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list196);
      if(true)
        return term;
    }
    return null;
  }
}