package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted504 extends Strategy 
{ 
  TermReference t_356;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail1112:
    { 
      term = aux_$Subsort_$Stack_0_1.instance.invoke(context, term, t_356.value);
      if(term == null)
        break Fail1112;
      if(true)
        return term;
    }
    return null;
  }
}