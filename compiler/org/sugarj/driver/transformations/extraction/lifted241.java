package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted241 extends Strategy 
{ 
  TermReference q_191;

  TermReference r_191;

  TermReference s_191;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1731:
    { 
      IStrategoTerm x_191 = null;
      IStrategoTerm y_191 = null;
      IStrategoTerm z_191 = null;
      IStrategoTerm l_192 = null;
      IStrategoTerm m_192 = null;
      x_191 = term;
      if(q_191.value == null)
        break Fail1731;
      term = termFactory.makeTuple(q_191.value, extraction.constSortNoArgs103);
      IStrategoTerm term550 = term;
      Success664:
      { 
        Fail1732:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1732;
          if(true)
            break Success664;
        }
        term = term550;
        IStrategoTerm g_192 = null;
        g_192 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, g_192, extraction.const457);
        if(term == null)
          break Fail1731;
        if(true)
          break Fail1731;
      }
      term = x_191;
      y_191 = x_191;
      if(r_191.value == null)
        break Fail1731;
      term = termFactory.makeTuple(r_191.value, extraction.constSortNoArgs103);
      IStrategoTerm term551 = term;
      Success665:
      { 
        Fail1733:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1733;
          if(true)
            break Success665;
        }
        term = term551;
        IStrategoTerm i_192 = null;
        i_192 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_192, extraction.const457);
        if(term == null)
          break Fail1731;
        if(true)
          break Fail1731;
      }
      term = y_191;
      z_191 = y_191;
      if(s_191.value == null)
        break Fail1731;
      term = termFactory.makeTuple(s_191.value, extraction.constSortNoArgs0);
      IStrategoTerm term552 = term;
      Success666:
      { 
        Fail1734:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1734;
          if(true)
            break Success666;
        }
        term = term552;
        IStrategoTerm k_192 = null;
        k_192 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_192, extraction.const457);
        if(term == null)
          break Fail1731;
        if(true)
          break Fail1731;
      }
      term = z_191;
      m_192 = z_191;
      l_192 = term;
      term = m_192;
      IStrategoList list199;
      list199 = checkListTail(l_192);
      if(list199 == null)
        break Fail1731;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list199);
      if(true)
        return term;
    }
    return null;
  }
}