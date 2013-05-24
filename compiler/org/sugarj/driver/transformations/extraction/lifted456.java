package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted456 extends Strategy 
{ 
  TermReference u_317;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1192:
    { 
      IStrategoTerm x_317 = null;
      IStrategoTerm a_318 = null;
      IStrategoTerm b_318 = null;
      x_317 = term;
      if(u_317.value == null)
        break Fail1192;
      term = termFactory.makeTuple(u_317.value, extraction.constSortNoArgs16);
      IStrategoTerm term876 = term;
      Success340:
      { 
        Fail1193:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1193;
          if(true)
            break Success340;
        }
        term = term876;
        IStrategoTerm z_317 = null;
        z_317 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_317, extraction.const616);
        if(term == null)
          break Fail1192;
        if(true)
          break Fail1192;
      }
      term = x_317;
      b_318 = x_317;
      a_318 = term;
      term = b_318;
      IStrategoList list414;
      list414 = checkListTail(a_318);
      if(list414 == null)
        break Fail1192;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs69, list414);
      if(true)
        return term;
    }
    return null;
  }
}