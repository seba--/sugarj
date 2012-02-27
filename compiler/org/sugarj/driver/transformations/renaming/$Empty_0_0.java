package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Empty_0_0 extends Strategy 
{ 
  public static $Empty_0_0 instance = new $Empty_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail95:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEmpty_0 != ((IStrategoAppl)term).getConstructor())
        break Fail95;
      if(true)
        return term;
    }
    context.push("Empty_0_0");
    context.popOnFailure();
    return null;
  }
}