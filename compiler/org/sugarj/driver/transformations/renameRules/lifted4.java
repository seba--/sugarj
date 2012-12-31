package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted4 extends Strategy 
{ 
  TermReference z_8;

  TermReference a_9;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail148:
    { 
      if(z_8.value == null)
        z_8.value = term;
      else
        if(z_8.value != term && !z_8.value.match(term))
          break Fail148;
      if(a_9.value == null)
        break Fail148;
      term = a_9.value;
      if(true)
        return term;
    }
    return null;
  }
}