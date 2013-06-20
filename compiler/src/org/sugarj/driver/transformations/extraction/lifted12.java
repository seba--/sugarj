package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted12 extends Strategy 
{ 
  public static final lifted12 instance = new lifted12();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail283:
    { 
      term = extract_1_0.instance.invoke(context, term, lifted13.instance);
      if(term == null)
        break Fail283;
      if(true)
        return term;
    }
    return null;
  }
}