package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted165 extends Strategy 
{ 
  TermReference s_149;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1920:
    { 
      IStrategoTerm u_149 = null;
      IStrategoTerm e_150 = null;
      IStrategoTerm f_150 = null;
      u_149 = term;
      if(s_149.value == null)
        break Fail1920;
      term = termFactory.makeTuple(s_149.value, extraction.constSortNoArgs6);
      IStrategoTerm term439 = term;
      Success777:
      { 
        Fail1921:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1921;
          if(true)
            break Success777;
        }
        term = term439;
        IStrategoTerm d_150 = null;
        d_150 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, d_150, extraction.const416);
        if(term == null)
          break Fail1920;
        if(true)
          break Fail1920;
      }
      term = u_149;
      f_150 = u_149;
      e_150 = term;
      term = f_150;
      IStrategoList list123;
      list123 = checkListTail(e_150);
      if(list123 == null)
        break Fail1920;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs144, list123);
      if(true)
        return term;
    }
    return null;
  }
}