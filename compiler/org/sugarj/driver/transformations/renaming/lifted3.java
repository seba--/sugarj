package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted3 extends Strategy 
{ 
  TermReference t_14;

  TermReference u_14;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail259:
    { 
      term = rename_modeldec_0_2.instance.invoke(context, term, t_14.value, u_14.value);
      if(term == null)
        break Fail259;
      if(true)
        return term;
    }
    return null;
  }
}