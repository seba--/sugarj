package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted23 extends Strategy 
{ 
  public static final lifted23 instance = new lifted23();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2194:
    { 
      term = extraction.const46;
      if(true)
        return term;
    }
    return null;
  }
}