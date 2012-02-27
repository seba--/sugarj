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
  TermReference l_12;

  TermReference m_12;

  TermReference n_12;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail212:
    { 
      term = do_rename_java_0_3.instance.invoke(context, term, l_12.value, m_12.value, n_12.value);
      if(term == null)
        break Fail212;
      if(true)
        return term;
    }
    return null;
  }
}