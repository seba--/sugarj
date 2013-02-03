package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted4 extends Strategy 
{ 
  TermReference e_9;

  TermReference f_9;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail149:
    { 
      lifted5 lifted50 = new lifted5();
      lifted50.e_9 = e_9;
      lifted50.f_9 = f_9;
      term = try_1_0.instance.invoke(context, term, lifted50);
      if(term == null)
        break Fail149;
      if(true)
        return term;
    }
    return null;
  }
}