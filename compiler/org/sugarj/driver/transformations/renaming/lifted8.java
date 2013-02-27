package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted8 extends Strategy 
{ 
  TermReference r_18;

  TermReference s_18;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail152:
    { 
      term = replace_name_0_2.instance.invoke(context, term, r_18.value, s_18.value);
      if(term == null)
        break Fail152;
      if(true)
        return term;
    }
    return null;
  }
}