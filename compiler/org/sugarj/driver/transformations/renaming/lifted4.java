package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted4 extends Strategy 
{ 
  TermReference w_22;

  TermReference x_22;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail390:
    { 
      if(w_22.value == null)
        w_22.value = term;
      else
        if(w_22.value != term && !w_22.value.match(term))
          break Fail390;
      if(x_22.value == null)
        break Fail390;
      term = x_22.value;
      if(true)
        return term;
    }
    return null;
  }
}