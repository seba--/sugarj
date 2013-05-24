package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted275 extends Strategy 
{ 
  TermReference v_211;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1623:
    { 
      IStrategoTerm x_211 = null;
      IStrategoTerm a_212 = null;
      IStrategoTerm b_212 = null;
      x_211 = term;
      if(v_211.value == null)
        break Fail1623;
      term = termFactory.makeTuple(v_211.value, extraction.constSortNoArgs18);
      IStrategoTerm term626 = term;
      Success590:
      { 
        Fail1624:
        { 
          term = has_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1624;
          if(true)
            break Success590;
        }
        term = term626;
        IStrategoTerm z_211 = null;
        z_211 = term;
        term = log_mismatching_sort_error_0_1.instance.invoke(context, z_211, extraction.const481);
        if(term == null)
          break Fail1623;
        if(true)
          break Fail1623;
      }
      term = x_211;
      b_212 = x_211;
      a_212 = term;
      term = b_212;
      IStrategoList list233;
      list233 = checkListTail(a_212);
      if(list233 == null)
        break Fail1623;
      term = (IStrategoTerm)termFactory.makeListCons(extraction.constSortNoArgs0, list233);
      if(true)
        return term;
    }
    return null;
  }
}