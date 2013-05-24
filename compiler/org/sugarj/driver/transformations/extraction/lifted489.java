package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted489 extends Strategy 
{ 
  public static final lifted489 instance = new lifted489();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail1123:
    { 
      term = extract_1_0.instance.invoke(context, term, lifted490.instance);
      if(term == null)
        break Fail1123;
      if(true)
        return term;
    }
    return null;
  }
}