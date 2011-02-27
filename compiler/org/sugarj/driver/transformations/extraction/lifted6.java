package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted6 extends Strategy 
{ 
  Strategy g_15;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail294:
    { 
      term = filter_tree_1_0.instance.invoke(context, term, g_15);
      if(term == null)
        break Fail294;
      if(true)
        return term;
    }
    return null;
  }
}