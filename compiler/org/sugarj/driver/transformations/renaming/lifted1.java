package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted1 extends Strategy 
{ 
  TermReference w_22;

  TermReference x_22;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail387:
    { 
      term = rename_rule_0_2.instance.invoke(context, term, w_22.value, x_22.value);
      if(term == null)
        break Fail387;
      if(true)
        return term;
    }
    return null;
  }
}