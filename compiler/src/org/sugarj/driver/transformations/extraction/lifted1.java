package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted1 extends Strategy 
{ 
  Strategy w_14;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail291:
    { 
      term = extract_1_0.instance.invoke(context, term, w_14);
      if(term == null)
        break Fail291;
      if(true)
        return term;
    }
    return null;
  }
}