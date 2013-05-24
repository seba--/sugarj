package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted156 extends Strategy 
{ 
  TermReference p_143;

  TermReference q_143;

  TermReference r_143;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1941:
    { 
      IStrategoTerm t_143 = null;
      IStrategoTerm v_143 = null;
      IStrategoTerm w_143 = null;
      IStrategoTerm e_144 = null;
      IStrategoTerm f_144 = null;
      t_143 = term;
      if(p_143.value == null)
        break Fail1941;
      term = termFactory.makeTuple(p_143.value, extraction.constSortNoArgs10);
      IStrategoTerm term425 = term;
      Success789:
      { 
        Fail1942:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1942;
          if(true)
            break Success789;
        }
        term = term425;
        IStrategoTerm y_143 = null;
        y_143 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_143, extraction.const409);
        if(term == null)
          break Fail1941;
        if(true)
          break Fail1941;
      }
      term = t_143;
      v_143 = t_143;
      if(q_143.value == null)
        break Fail1941;
      term = termFactory.makeTuple(q_143.value, extraction.constSortNoArgs10);
      IStrategoTerm term426 = term;
      Success790:
      { 
        Fail1943:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1943;
          if(true)
            break Success790;
        }
        term = term426;
        IStrategoTerm b_144 = null;
        b_144 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_144, extraction.const409);
        if(term == null)
          break Fail1941;
        if(true)
          break Fail1941;
      }
      term = v_143;
      w_143 = v_143;
      if(r_143.value == null)
        break Fail1941;
      term = termFactory.makeTuple(r_143.value, extraction.constSortNoArgs10);
      IStrategoTerm term427 = term;
      Success791:
      { 
        Fail1944:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1944;
          if(true)
            break Success791;
        }
        term = term427;
        IStrategoTerm d_144 = null;
        d_144 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_144, extraction.const409);
        if(term == null)
          break Fail1941;
        if(true)
          break Fail1941;
      }
      term = w_143;
      f_144 = w_143;
      e_144 = term;
      term = f_144;
      IStrategoList list114;
      list114 = checkListTail(e_144);
      if(list114 == null)
        break Fail1941;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs95, list114);
      if(true)
        return term;
    }
    return null;
  }
}