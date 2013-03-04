package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted9 extends Strategy 
{ 
  TermReference s_23;

  TermReference t_23;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail385:
    { 
      term = rename_editordec_0_2.instance.invoke(context, term, s_23.value, t_23.value);
      if(term == null)
        break Fail385;
      if(true)
        return term;
    }
    return null;
  }
}