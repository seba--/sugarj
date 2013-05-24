package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted264 extends Strategy 
{ 
  TermReference u_205;

  TermReference v_205;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1650:
    { 
      IStrategoTerm x_205 = null;
      IStrategoTerm y_205 = null;
      IStrategoTerm f_206 = null;
      IStrategoTerm g_206 = null;
      x_205 = term;
      if(u_205.value == null)
        break Fail1650;
      term = termFactory.makeTuple(u_205.value, extraction.constSortNoArgs8);
      IStrategoTerm term609 = term;
      Success606:
      { 
        Fail1651:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1651;
          if(true)
            break Success606;
        }
        term = term609;
        IStrategoTerm c_206 = null;
        c_206 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_206, extraction.const470);
        if(term == null)
          break Fail1650;
        if(true)
          break Fail1650;
      }
      term = x_205;
      y_205 = x_205;
      if(v_205.value == null)
        break Fail1650;
      term = termFactory.makeTuple(v_205.value, extraction.constSortNoArgs0);
      IStrategoTerm term610 = term;
      Success607:
      { 
        Fail1652:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1652;
          if(true)
            break Success607;
        }
        term = term610;
        IStrategoTerm e_206 = null;
        e_206 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_206, extraction.const470);
        if(term == null)
          break Fail1650;
        if(true)
          break Fail1650;
      }
      term = y_205;
      g_206 = y_205;
      f_206 = term;
      term = g_206;
      IStrategoList list222;
      list222 = checkListTail(f_206);
      if(list222 == null)
        break Fail1650;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs53, list222);
      if(true)
        return term;
    }
    return null;
  }
}