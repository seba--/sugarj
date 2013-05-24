package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted38 extends Strategy 
{ 
  public static final lifted38 instance = new lifted38();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2186:
    { 
      term = extraction.const323;
      if(true)
        return term;
    }
    return null;
  }
}