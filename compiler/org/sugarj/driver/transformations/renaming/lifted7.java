package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted7 extends Strategy 
{ 
  TermReference v_14;

  TermReference w_14;

  TermReference x_14;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail257:
    { 
      term = apply_renaming_0_3.instance.invoke(context, term, v_14.value, w_14.value, x_14.value);
      if(term == null)
        break Fail257;
      if(true)
        return term;
    }
    return null;
  }
}