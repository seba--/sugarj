package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted294 extends Strategy 
{ 
  TermReference n_223;

  TermReference o_223;

  TermReference p_223;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1576:
    { 
      IStrategoTerm r_223 = null;
      IStrategoTerm s_223 = null;
      IStrategoTerm t_223 = null;
      IStrategoTerm a_224 = null;
      IStrategoTerm b_224 = null;
      r_223 = term;
      if(n_223.value == null)
        break Fail1576;
      term = termFactory.makeTuple(n_223.value, extraction.constSortNoArgs0);
      IStrategoTerm term652 = term;
      Success562:
      { 
        Fail1577:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1577;
          if(true)
            break Success562;
        }
        term = term652;
        IStrategoTerm v_223 = null;
        v_223 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_223, extraction.const499);
        if(term == null)
          break Fail1576;
        if(true)
          break Fail1576;
      }
      term = r_223;
      s_223 = r_223;
      if(o_223.value == null)
        break Fail1576;
      term = termFactory.makeTuple(o_223.value, extraction.constSortNoArgs0);
      IStrategoTerm term653 = term;
      Success563:
      { 
        Fail1578:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1578;
          if(true)
            break Success563;
        }
        term = term653;
        IStrategoTerm x_223 = null;
        x_223 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, x_223, extraction.const499);
        if(term == null)
          break Fail1576;
        if(true)
          break Fail1576;
      }
      term = s_223;
      t_223 = s_223;
      if(p_223.value == null)
        break Fail1576;
      term = termFactory.makeTuple(p_223.value, extraction.constSortNoArgs0);
      IStrategoTerm term654 = term;
      Success564:
      { 
        Fail1579:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1579;
          if(true)
            break Success564;
        }
        term = term654;
        IStrategoTerm z_223 = null;
        z_223 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_223, extraction.const499);
        if(term == null)
          break Fail1576;
        if(true)
          break Fail1576;
      }
      term = t_223;
      b_224 = t_223;
      a_224 = term;
      term = b_224;
      IStrategoList list252;
      list252 = checkListTail(a_224);
      if(list252 == null)
        break Fail1576;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list252);
      if(true)
        return term;
    }
    return null;
  }
}