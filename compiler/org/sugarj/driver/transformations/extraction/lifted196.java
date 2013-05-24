package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted196 extends Strategy 
{ 
  TermReference v_166;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1853:
    { 
      IStrategoTerm x_166 = null;
      IStrategoTerm a_167 = null;
      IStrategoTerm b_167 = null;
      x_166 = term;
      if(v_166.value == null)
        break Fail1853;
      term = termFactory.makeTuple(v_166.value, extraction.constSort33);
      IStrategoTerm term475 = term;
      Success741:
      { 
        Fail1854:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1854;
          if(true)
            break Success741;
        }
        term = term475;
        IStrategoTerm z_166 = null;
        z_166 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_166, extraction.const432);
        if(term == null)
          break Fail1853;
        if(true)
          break Fail1853;
      }
      term = x_166;
      b_167 = x_166;
      a_167 = term;
      term = b_167;
      IStrategoList list154;
      list154 = checkListTail(a_167);
      if(list154 == null)
        break Fail1853;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs133, list154);
      if(true)
        return term;
    }
    return null;
  }
}