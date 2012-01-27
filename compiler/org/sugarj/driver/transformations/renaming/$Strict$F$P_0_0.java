package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Strict$F$P_0_0 extends Strategy 
{ 
  public static $Strict$F$P_0_0 instance = new $Strict$F$P_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail193:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consStrictFP_0 != ((IStrategoAppl)term).getConstructor())
        break Fail193;
      if(true)
        return term;
    }
    context.push("StrictFP_0_0");
    context.popOnFailure();
    return null;
  }
}