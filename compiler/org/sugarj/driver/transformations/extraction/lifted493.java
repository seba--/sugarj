package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted493 extends Strategy 
{ 
  public static final lifted493 instance = new lifted493();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail1121:
    { 
      term = extract_1_0.instance.invoke(context, term, lifted494.instance);
      if(term == null)
        break Fail1121;
      if(true)
        return term;
    }
    return null;
  }
}