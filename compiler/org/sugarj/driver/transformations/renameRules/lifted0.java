package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted0 extends Strategy 
{ 
  TermReference z_8;

  TermReference a_9;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail144:
    { 
      lifted1 lifted10 = new lifted1();
      lifted10.z_8 = z_8;
      lifted10.a_9 = a_9;
      term = try_1_0.instance.invoke(context, term, lifted10);
      if(term == null)
        break Fail144;
      if(true)
        return term;
    }
    return null;
  }
}