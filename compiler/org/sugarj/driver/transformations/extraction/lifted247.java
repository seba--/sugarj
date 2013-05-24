package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted247 extends Strategy 
{ 
  TermReference v_195;

  TermReference w_195;

  TermReference x_195;

  TermReference y_195;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1706:
    { 
      IStrategoTerm a_196 = null;
      IStrategoTerm b_196 = null;
      IStrategoTerm c_196 = null;
      IStrategoTerm d_196 = null;
      IStrategoTerm q_196 = null;
      IStrategoTerm r_196 = null;
      a_196 = term;
      if(v_195.value == null)
        break Fail1706;
      term = termFactory.makeTuple(v_195.value, extraction.constSortNoArgs0);
      IStrategoTerm term568 = term;
      Success645:
      { 
        Fail1707:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1707;
          if(true)
            break Success645;
        }
        term = term568;
        IStrategoTerm j_196 = null;
        j_196 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, j_196, extraction.const460);
        if(term == null)
          break Fail1706;
        if(true)
          break Fail1706;
      }
      term = a_196;
      b_196 = a_196;
      if(w_195.value == null)
        break Fail1706;
      term = termFactory.makeTuple(w_195.value, extraction.constSortNoArgs103);
      IStrategoTerm term569 = term;
      Success646:
      { 
        Fail1708:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1708;
          if(true)
            break Success646;
        }
        term = term569;
        IStrategoTerm l_196 = null;
        l_196 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, l_196, extraction.const460);
        if(term == null)
          break Fail1706;
        if(true)
          break Fail1706;
      }
      term = b_196;
      c_196 = b_196;
      if(x_195.value == null)
        break Fail1706;
      term = termFactory.makeTuple(x_195.value, extraction.constSortNoArgs103);
      IStrategoTerm term570 = term;
      Success647:
      { 
        Fail1709:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1709;
          if(true)
            break Success647;
        }
        term = term570;
        IStrategoTerm n_196 = null;
        n_196 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, n_196, extraction.const460);
        if(term == null)
          break Fail1706;
        if(true)
          break Fail1706;
      }
      term = c_196;
      d_196 = c_196;
      if(y_195.value == null)
        break Fail1706;
      term = termFactory.makeTuple(y_195.value, extraction.constSortNoArgs0);
      IStrategoTerm term571 = term;
      Success648:
      { 
        Fail1710:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1710;
          if(true)
            break Success648;
        }
        term = term571;
        IStrategoTerm p_196 = null;
        p_196 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, p_196, extraction.const460);
        if(term == null)
          break Fail1706;
        if(true)
          break Fail1706;
      }
      term = d_196;
      r_196 = d_196;
      q_196 = term;
      term = r_196;
      IStrategoList list205;
      list205 = checkListTail(q_196);
      if(list205 == null)
        break Fail1706;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list205);
      if(true)
        return term;
    }
    return null;
  }
}