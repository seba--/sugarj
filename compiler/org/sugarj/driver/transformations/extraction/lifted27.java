package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted27 extends Strategy 
{ 
  TermReference y_61;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2189:
    { 
      IStrategoTerm z_61 = null;
      IStrategoTerm a_62 = null;
      a_62 = term;
      z_61 = term;
      term = a_62;
      if(y_61.value == null)
        break Fail2189;
      term = termFactory.makeTuple(z_61, y_61.value);
      term = has_subsort_of_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2189;
      if(true)
        return term;
    }
    return null;
  }
}