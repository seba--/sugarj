package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted11 extends Strategy 
{ 
  TermReference u_18;

  TermReference v_18;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail150:
    { 
      term = replace_name_0_2.instance.invoke(context, term, u_18.value, v_18.value);
      if(term == null)
        break Fail150;
      if(true)
        return term;
    }
    return null;
  }
}