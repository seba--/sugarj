package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted1 extends Strategy 
{ 
  TermReference s_14;

  TermReference t_14;

  TermReference u_14;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail261:
    { 
      term = rename_java_0_3.instance.invoke(context, term, s_14.value, t_14.value, u_14.value);
      if(term == null)
        break Fail261;
      if(true)
        return term;
    }
    return null;
  }
}