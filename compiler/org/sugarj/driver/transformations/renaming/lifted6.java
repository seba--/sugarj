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
  TermReference r_23;

  TermReference s_23;

  TermReference t_23;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail384:
    { 
      term = rename_java_0_3.instance.invoke(context, term, r_23.value, s_23.value, t_23.value);
      if(term == null)
        break Fail384;
      if(true)
        return term;
    }
    return null;
  }
}