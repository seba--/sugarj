package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Default_0_0 extends Strategy 
{ 
  public static $Default_0_0 instance = new $Default_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail73:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDefault_0 != ((IStrategoAppl)term).getConstructor())
        break Fail73;
      if(true)
        return term;
    }
    context.push("Default_0_0");
    context.popOnFailure();
    return null;
  }
}