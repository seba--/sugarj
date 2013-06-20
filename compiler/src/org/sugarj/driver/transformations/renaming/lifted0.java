package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted0 extends Strategy 
{ 
  TermReference a_9;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail152:
    { 
      term = rename_decl_0_1.instance.invoke(context, term, a_9.value);
      if(term == null)
        break Fail152;
      if(true)
        return term;
    }
    return null;
  }
}