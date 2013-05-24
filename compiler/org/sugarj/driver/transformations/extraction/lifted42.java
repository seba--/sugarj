package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted42 extends Strategy 
{ 
  TermReference e_357;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2185:
    { 
      if(e_357.value == null)
        break Fail2185;
      term = termFactory.makeTuple(extraction.const324, e_357.value, extraction.const325);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2185;
      if(true)
        return term;
    }
    return null;
  }
}