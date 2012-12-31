package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted3 extends Strategy 
{ 
  TermReference z_8;

  TermReference a_9;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail147:
    { 
      lifted4 lifted40 = new lifted4();
      lifted40.z_8 = z_8;
      lifted40.a_9 = a_9;
      term = $S$Var_1_0.instance.invoke(context, term, lifted40);
      if(term == null)
        break Fail147;
      if(true)
        return term;
    }
    return null;
  }
}