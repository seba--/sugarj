package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted254 extends Strategy 
{ 
  TermReference j_199;

  TermReference k_199;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1683:
    { 
      IStrategoTerm o_199 = null;
      IStrategoTerm p_199 = null;
      IStrategoTerm c_200 = null;
      IStrategoTerm d_200 = null;
      o_199 = term;
      if(j_199.value == null)
        break Fail1683;
      term = termFactory.makeTuple(j_199.value, extraction.constSortNoArgs0);
      IStrategoTerm term586 = term;
      Success629:
      { 
        Fail1684:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1684;
          if(true)
            break Success629;
        }
        term = term586;
        IStrategoTerm z_199 = null;
        z_199 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_199, extraction.const463);
        if(term == null)
          break Fail1683;
        if(true)
          break Fail1683;
      }
      term = o_199;
      p_199 = o_199;
      if(k_199.value == null)
        break Fail1683;
      term = termFactory.makeTuple(k_199.value, extraction.constSortNoArgs0);
      IStrategoTerm term587 = term;
      Success630:
      { 
        Fail1685:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1685;
          if(true)
            break Success630;
        }
        term = term587;
        IStrategoTerm b_200 = null;
        b_200 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_200, extraction.const463);
        if(term == null)
          break Fail1683;
        if(true)
          break Fail1683;
      }
      term = p_199;
      d_200 = p_199;
      c_200 = term;
      term = d_200;
      IStrategoList list212;
      list212 = checkListTail(c_200);
      if(list212 == null)
        break Fail1683;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list212);
      if(true)
        return term;
    }
    return null;
  }
}