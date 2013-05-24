package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted257 extends Strategy 
{ 
  TermReference f_201;

  TermReference g_201;

  TermReference h_201;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1673:
    { 
      IStrategoTerm j_201 = null;
      IStrategoTerm k_201 = null;
      IStrategoTerm m_201 = null;
      IStrategoTerm v_201 = null;
      IStrategoTerm w_201 = null;
      j_201 = term;
      if(f_201.value == null)
        break Fail1673;
      term = termFactory.makeTuple(f_201.value, extraction.constSortNoArgs8);
      IStrategoTerm term592 = term;
      Success622:
      { 
        Fail1674:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1674;
          if(true)
            break Success622;
        }
        term = term592;
        IStrategoTerm o_201 = null;
        o_201 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, o_201, extraction.const465);
        if(term == null)
          break Fail1673;
        if(true)
          break Fail1673;
      }
      term = j_201;
      k_201 = j_201;
      if(g_201.value == null)
        break Fail1673;
      term = termFactory.makeTuple(g_201.value, extraction.constSort36);
      IStrategoTerm term593 = term;
      Success623:
      { 
        Fail1675:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1675;
          if(true)
            break Success623;
        }
        term = term593;
        IStrategoTerm s_201 = null;
        s_201 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, s_201, extraction.const465);
        if(term == null)
          break Fail1673;
        if(true)
          break Fail1673;
      }
      term = k_201;
      m_201 = k_201;
      if(h_201.value == null)
        break Fail1673;
      term = termFactory.makeTuple(h_201.value, extraction.constSortNoArgs179);
      IStrategoTerm term594 = term;
      Success624:
      { 
        Fail1676:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1676;
          if(true)
            break Success624;
        }
        term = term594;
        IStrategoTerm u_201 = null;
        u_201 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, u_201, extraction.const465);
        if(term == null)
          break Fail1673;
        if(true)
          break Fail1673;
      }
      term = m_201;
      w_201 = m_201;
      v_201 = term;
      term = w_201;
      IStrategoList list215;
      list215 = checkListTail(v_201);
      if(list215 == null)
        break Fail1673;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs55, list215);
      if(true)
        return term;
    }
    return null;
  }
}