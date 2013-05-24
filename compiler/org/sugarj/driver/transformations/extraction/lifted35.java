package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted35 extends Strategy 
{ 
  public static final lifted35 instance = new lifted35();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2188:
    { 
      term = repeat1_1_0.instance.invoke(context, term, unrename_sort_0_0.instance);
      if(term == null)
        break Fail2188;
      if(true)
        return term;
    }
    return null;
  }
}