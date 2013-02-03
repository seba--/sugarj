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
  TermReference e_9;

  TermReference f_9;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail148:
    { 
      term = rename_rule_0_2.instance.invoke(context, term, e_9.value, f_9.value);
      if(term == null)
        break Fail148;
      if(true)
        return term;
    }
    return null;
  }
}