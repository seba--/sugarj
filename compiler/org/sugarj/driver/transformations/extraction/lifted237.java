package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted237 extends Strategy 
{ 
  TermReference u_189;

  TermReference v_189;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1744:
    { 
      IStrategoTerm x_189 = null;
      IStrategoTerm y_189 = null;
      IStrategoTerm f_190 = null;
      IStrategoTerm g_190 = null;
      x_189 = term;
      if(u_189.value == null)
        break Fail1744;
      term = termFactory.makeTuple(u_189.value, extraction.constSortNoArgs103);
      IStrategoTerm term542 = term;
      Success673:
      { 
        Fail1745:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1745;
          if(true)
            break Success673;
        }
        term = term542;
        IStrategoTerm c_190 = null;
        c_190 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, c_190, extraction.const455);
        if(term == null)
          break Fail1744;
        if(true)
          break Fail1744;
      }
      term = x_189;
      y_189 = x_189;
      if(v_189.value == null)
        break Fail1744;
      term = termFactory.makeTuple(v_189.value, extraction.constSortNoArgs0);
      IStrategoTerm term543 = term;
      Success674:
      { 
        Fail1746:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1746;
          if(true)
            break Success674;
        }
        term = term543;
        IStrategoTerm e_190 = null;
        e_190 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, e_190, extraction.const455);
        if(term == null)
          break Fail1744;
        if(true)
          break Fail1744;
      }
      term = y_189;
      g_190 = y_189;
      f_190 = term;
      term = g_190;
      IStrategoList list195;
      list195 = checkListTail(f_190);
      if(list195 == null)
        break Fail1744;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list195);
      if(true)
        return term;
    }
    return null;
  }
}