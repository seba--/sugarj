package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted132 extends Strategy 
{ 
  TermReference d_128;

  TermReference e_128;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1985:
    { 
      IStrategoTerm i_128 = null;
      IStrategoTerm j_128 = null;
      IStrategoTerm w_128 = null;
      IStrategoTerm x_128 = null;
      i_128 = term;
      if(d_128.value == null)
        break Fail1985;
      term = termFactory.makeTuple(d_128.value, extraction.constSortNoArgs94);
      IStrategoTerm term406 = term;
      Success809:
      { 
        Fail1986:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1986;
          if(true)
            break Success809;
        }
        term = term406;
        IStrategoTerm t_128 = null;
        t_128 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, t_128, extraction.const389);
        if(term == null)
          break Fail1985;
        if(true)
          break Fail1985;
      }
      term = i_128;
      j_128 = i_128;
      if(e_128.value == null)
        break Fail1985;
      term = termFactory.makeTuple(e_128.value, extraction.constSortNoArgs115);
      IStrategoTerm term407 = term;
      Success810:
      { 
        Fail1987:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1987;
          if(true)
            break Success810;
        }
        term = term407;
        IStrategoTerm v_128 = null;
        v_128 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, v_128, extraction.const389);
        if(term == null)
          break Fail1985;
        if(true)
          break Fail1985;
      }
      term = j_128;
      x_128 = j_128;
      w_128 = term;
      term = x_128;
      IStrategoList list90;
      list90 = checkListTail(w_128);
      if(list90 == null)
        break Fail1985;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs117, list90);
      if(true)
        return term;
    }
    return null;
  }
}