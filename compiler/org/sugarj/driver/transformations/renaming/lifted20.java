package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted20 extends Strategy 
{ 
  TermReference r_9;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail148:
    { 
      if(r_9.value == null)
        break Fail148;
      term = r_9.value;
      if(true)
        return term;
    }
    return null;
  }
}