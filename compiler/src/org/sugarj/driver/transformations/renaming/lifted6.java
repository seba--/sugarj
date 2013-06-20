package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted6 extends Strategy 
{ 
  TermReference e_9;

  TermReference f_9;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail151:
    { 
      if(e_9.value == null)
        e_9.value = term;
      else
        if(e_9.value != term && !e_9.value.match(term))
          break Fail151;
      if(f_9.value == null)
        break Fail151;
      term = f_9.value;
      if(true)
        return term;
    }
    return null;
  }
}