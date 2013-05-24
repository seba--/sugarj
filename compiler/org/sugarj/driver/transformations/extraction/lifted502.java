package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted502 extends Strategy 
{ 
  TermReference e_356;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail1114:
    { 
      term = aux_$Subsort_$Stack_0_1.instance.invoke(context, term, e_356.value);
      if(term == null)
        break Fail1114;
      if(true)
        return term;
    }
    return null;
  }
}