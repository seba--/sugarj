package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted353 extends Strategy 
{ 
  TermReference r_256;

  TermReference s_256;

  TermReference u_256;

  TermReference v_256;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1422:
    { 
      IStrategoTerm x_256 = null;
      IStrategoTerm y_256 = null;
      IStrategoTerm a_257 = null;
      IStrategoTerm b_257 = null;
      IStrategoTerm l_257 = null;
      IStrategoTerm m_257 = null;
      x_256 = term;
      if(r_256.value == null)
        break Fail1422;
      term = termFactory.makeTuple(r_256.value, extraction.constSortNoArgs8);
      IStrategoTerm term746 = term;
      Success467:
      { 
        Fail1423:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1423;
          if(true)
            break Success467;
        }
        term = term746;
        IStrategoTerm d_257 = null;
        d_257 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_257, extraction.const538);
        if(term == null)
          break Fail1422;
        if(true)
          break Fail1422;
      }
      term = x_256;
      y_256 = x_256;
      if(s_256.value == null)
        break Fail1422;
      term = termFactory.makeTuple(s_256.value, extraction.constSort36);
      IStrategoTerm term747 = term;
      Success468:
      { 
        Fail1424:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1424;
          if(true)
            break Success468;
        }
        term = term747;
        IStrategoTerm f_257 = null;
        f_257 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, f_257, extraction.const538);
        if(term == null)
          break Fail1422;
        if(true)
          break Fail1422;
      }
      term = y_256;
      a_257 = y_256;
      if(u_256.value == null)
        break Fail1422;
      term = termFactory.makeTuple(u_256.value, extraction.constSort36);
      IStrategoTerm term748 = term;
      Success469:
      { 
        Fail1425:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1425;
          if(true)
            break Success469;
        }
        term = term748;
        IStrategoTerm i_257 = null;
        i_257 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, i_257, extraction.const538);
        if(term == null)
          break Fail1422;
        if(true)
          break Fail1422;
      }
      term = a_257;
      b_257 = a_257;
      if(v_256.value == null)
        break Fail1422;
      term = termFactory.makeTuple(v_256.value, extraction.constSortNoArgs0);
      IStrategoTerm term749 = term;
      Success470:
      { 
        Fail1426:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1426;
          if(true)
            break Success470;
        }
        term = term749;
        IStrategoTerm k_257 = null;
        k_257 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, k_257, extraction.const538);
        if(term == null)
          break Fail1422;
        if(true)
          break Fail1422;
      }
      term = b_257;
      m_257 = b_257;
      l_257 = term;
      term = m_257;
      IStrategoList list311;
      list311 = checkListTail(l_257);
      if(list311 == null)
        break Fail1422;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs53, list311);
      if(true)
        return term;
    }
    return null;
  }
}