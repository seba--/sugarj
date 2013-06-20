package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class empty_0_0 extends Strategy 
{ 
  public static empty_0_0 instance = new empty_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail6:
    { 
      term = extraction.constNil0;
      if(true)
        return term;
    }
    context.push("empty_0_0");
    context.popOnFailure();
    return null;
  }
}