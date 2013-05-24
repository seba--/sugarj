package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted158 extends Strategy 
{ 
  TermReference u_144;

  TermReference v_144;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1937:
    { 
      IStrategoTerm x_144 = null;
      IStrategoTerm y_144 = null;
      IStrategoTerm i_145 = null;
      IStrategoTerm p_145 = null;
      x_144 = term;
      if(u_144.value == null)
        break Fail1937;
      term = termFactory.makeTuple(u_144.value, extraction.constSortNoArgs98);
      IStrategoTerm term428 = term;
      Success787:
      { 
        Fail1938:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1938;
          if(true)
            break Success787;
        }
        term = term428;
        IStrategoTerm c_145 = null;
        c_145 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_145, extraction.const410);
        if(term == null)
          break Fail1937;
        if(true)
          break Fail1937;
      }
      term = x_144;
      y_144 = x_144;
      if(v_144.value == null)
        break Fail1937;
      term = termFactory.makeTuple(v_144.value, extraction.constSortNoArgs115);
      IStrategoTerm term429 = term;
      Success788:
      { 
        Fail1939:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1939;
          if(true)
            break Success788;
        }
        term = term429;
        IStrategoTerm h_145 = null;
        h_145 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, h_145, extraction.const410);
        if(term == null)
          break Fail1937;
        if(true)
          break Fail1937;
      }
      term = y_144;
      p_145 = y_144;
      i_145 = term;
      term = p_145;
      IStrategoList list116;
      list116 = checkListTail(i_145);
      if(list116 == null)
        break Fail1937;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs117, list116);
      if(true)
        return term;
    }
    return null;
  }
}