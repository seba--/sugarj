package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted188 extends Strategy 
{ 
  TermReference u_160;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1869:
    { 
      IStrategoTerm x_160 = null;
      IStrategoTerm e_161 = null;
      IStrategoTerm f_161 = null;
      x_160 = term;
      if(u_160.value == null)
        break Fail1869;
      term = termFactory.makeTuple(u_160.value, extraction.constSortNoArgs135);
      IStrategoTerm term467 = term;
      Success749:
      { 
        Fail1870:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1870;
          if(true)
            break Success749;
        }
        term = term467;
        IStrategoTerm d_161 = null;
        d_161 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_161, extraction.const426);
        if(term == null)
          break Fail1869;
        if(true)
          break Fail1869;
      }
      term = x_160;
      f_161 = x_160;
      e_161 = term;
      term = f_161;
      IStrategoList list146;
      list146 = checkListTail(e_161);
      if(list146 == null)
        break Fail1869;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list146);
      if(true)
        return term;
    }
    return null;
  }
}