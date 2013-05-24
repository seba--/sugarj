package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted214 extends Strategy 
{ 
  TermReference s_175;

  TermReference t_175;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1810:
    { 
      IStrategoTerm v_175 = null;
      IStrategoTerm w_175 = null;
      IStrategoTerm b_176 = null;
      IStrategoTerm c_176 = null;
      v_175 = term;
      if(s_175.value == null)
        break Fail1810;
      term = termFactory.makeTuple(s_175.value, extraction.constSortNoArgs16);
      IStrategoTerm term499 = term;
      Success716:
      { 
        Fail1811:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1811;
          if(true)
            break Success716;
        }
        term = term499;
        IStrategoTerm y_175 = null;
        y_175 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, y_175, extraction.const437);
        if(term == null)
          break Fail1810;
        if(true)
          break Fail1810;
      }
      term = v_175;
      w_175 = v_175;
      if(t_175.value == null)
        break Fail1810;
      term = termFactory.makeTuple(t_175.value, extraction.constSortNoArgs8);
      IStrategoTerm term500 = term;
      Success717:
      { 
        Fail1812:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1812;
          if(true)
            break Success717;
        }
        term = term500;
        IStrategoTerm a_176 = null;
        a_176 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, a_176, extraction.const437);
        if(term == null)
          break Fail1810;
        if(true)
          break Fail1810;
      }
      term = w_175;
      c_176 = w_175;
      b_176 = term;
      term = c_176;
      IStrategoList list172;
      list172 = checkListTail(b_176);
      if(list172 == null)
        break Fail1810;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs69, list172);
      if(true)
        return term;
    }
    return null;
  }
}