package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted297 extends Strategy 
{ 
  TermReference p_225;

  TermReference q_225;

  TermReference r_225;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1566:
    { 
      IStrategoTerm t_225 = null;
      IStrategoTerm u_225 = null;
      IStrategoTerm v_225 = null;
      IStrategoTerm c_226 = null;
      IStrategoTerm d_226 = null;
      t_225 = term;
      if(p_225.value == null)
        break Fail1566;
      term = termFactory.makeTuple(p_225.value, extraction.constSortNoArgs0);
      IStrategoTerm term659 = term;
      Success555:
      { 
        Fail1567:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1567;
          if(true)
            break Success555;
        }
        term = term659;
        IStrategoTerm x_225 = null;
        x_225 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_225, extraction.const502);
        if(term == null)
          break Fail1566;
        if(true)
          break Fail1566;
      }
      term = t_225;
      u_225 = t_225;
      if(q_225.value == null)
        break Fail1566;
      term = termFactory.makeTuple(q_225.value, extraction.constSort40);
      IStrategoTerm term660 = term;
      Success556:
      { 
        Fail1568:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1568;
          if(true)
            break Success556;
        }
        term = term660;
        IStrategoTerm z_225 = null;
        z_225 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_225, extraction.const502);
        if(term == null)
          break Fail1566;
        if(true)
          break Fail1566;
      }
      term = u_225;
      v_225 = u_225;
      if(r_225.value == null)
        break Fail1566;
      term = termFactory.makeTuple(r_225.value, extraction.constSortNoArgs0);
      IStrategoTerm term661 = term;
      Success557:
      { 
        Fail1569:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1569;
          if(true)
            break Success557;
        }
        term = term661;
        IStrategoTerm b_226 = null;
        b_226 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_226, extraction.const502);
        if(term == null)
          break Fail1566;
        if(true)
          break Fail1566;
      }
      term = v_225;
      d_226 = v_225;
      c_226 = term;
      term = d_226;
      IStrategoList list255;
      list255 = checkListTail(c_226);
      if(list255 == null)
        break Fail1566;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list255);
      if(true)
        return term;
    }
    return null;
  }
}