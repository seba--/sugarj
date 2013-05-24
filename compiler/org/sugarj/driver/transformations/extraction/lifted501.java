package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted501 extends Strategy 
{ 
  TermReference u_355;

  TermReference v_355;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail1115:
    { 
      term = aux_$Subsort_$Stack_0_1.instance.invoke(context, term, u_355.value);
      if(term == null)
        break Fail1115;
      if(v_355.value == null)
        v_355.value = term;
      else
        if(v_355.value != term && !v_355.value.match(term))
          break Fail1115;
      if(true)
        return term;
    }
    return null;
  }
}