package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted45 extends Strategy 
{ 
  TermReference l_91;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2182:
    { 
      if(l_91.value == null)
        break Fail2182;
      term = l_91.value;
      if(true)
        return term;
    }
    return null;
  }
}