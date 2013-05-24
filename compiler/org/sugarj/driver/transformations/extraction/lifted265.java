package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted265 extends Strategy 
{ 
  TermReference m_206;

  TermReference n_206;

  TermReference o_206;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1646:
    { 
      IStrategoTerm s_206 = null;
      IStrategoTerm t_206 = null;
      IStrategoTerm u_206 = null;
      IStrategoTerm b_207 = null;
      IStrategoTerm c_207 = null;
      s_206 = term;
      if(m_206.value == null)
        break Fail1646;
      term = termFactory.makeTuple(m_206.value, extraction.constSortNoArgs8);
      IStrategoTerm term611 = term;
      Success603:
      { 
        Fail1647:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1647;
          if(true)
            break Success603;
        }
        term = term611;
        IStrategoTerm w_206 = null;
        w_206 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, w_206, extraction.const471);
        if(term == null)
          break Fail1646;
        if(true)
          break Fail1646;
      }
      term = s_206;
      t_206 = s_206;
      if(n_206.value == null)
        break Fail1646;
      term = termFactory.makeTuple(n_206.value, extraction.constSort36);
      IStrategoTerm term612 = term;
      Success604:
      { 
        Fail1648:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1648;
          if(true)
            break Success604;
        }
        term = term612;
        IStrategoTerm y_206 = null;
        y_206 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_206, extraction.const471);
        if(term == null)
          break Fail1646;
        if(true)
          break Fail1646;
      }
      term = t_206;
      u_206 = t_206;
      if(o_206.value == null)
        break Fail1646;
      term = termFactory.makeTuple(o_206.value, extraction.constSortNoArgs0);
      IStrategoTerm term613 = term;
      Success605:
      { 
        Fail1649:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1649;
          if(true)
            break Success605;
        }
        term = term613;
        IStrategoTerm a_207 = null;
        a_207 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_207, extraction.const471);
        if(term == null)
          break Fail1646;
        if(true)
          break Fail1646;
      }
      term = u_206;
      c_207 = u_206;
      b_207 = term;
      term = c_207;
      IStrategoList list223;
      list223 = checkListTail(b_207);
      if(list223 == null)
        break Fail1646;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs53, list223);
      if(true)
        return term;
    }
    return null;
  }
}