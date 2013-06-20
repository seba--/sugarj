package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted4 extends Strategy 
{ 
  public static final lifted4 instance = new lifted4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail287:
    { 
      term = extract_1_0.instance.invoke(context, term, lifted5.instance);
      if(term == null)
        break Fail287;
      if(true)
        return term;
    }
    return null;
  }
}