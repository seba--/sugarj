package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted171 extends Strategy 
{ 
  TermReference s_149;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1908:
    { 
      IStrategoTerm a_150 = null;
      IStrategoTerm c_151 = null;
      IStrategoTerm f_151 = null;
      a_150 = term;
      if(s_149.value == null)
        break Fail1908;
      term = termFactory.makeTuple(s_149.value, extraction.constSortNoArgs6);
      IStrategoTerm term445 = term;
      Success771:
      { 
        Fail1909:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1909;
          if(true)
            break Success771;
        }
        term = term445;
        IStrategoTerm b_151 = null;
        b_151 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, b_151, extraction.const416);
        if(term == null)
          break Fail1908;
        if(true)
          break Fail1908;
      }
      term = a_150;
      f_151 = a_150;
      c_151 = term;
      term = f_151;
      IStrategoList list129;
      list129 = checkListTail(c_151);
      if(list129 == null)
        break Fail1908;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs150, list129);
      if(true)
        return term;
    }
    return null;
  }
}