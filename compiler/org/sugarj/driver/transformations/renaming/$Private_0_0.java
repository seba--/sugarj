package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Private_0_0 extends Strategy 
{ 
  public static $Private_0_0 instance = new $Private_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail253:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPrivate_0 != ((IStrategoAppl)term).getConstructor())
        break Fail253;
      if(true)
        return term;
    }
    context.push("Private_0_0");
    context.popOnFailure();
    return null;
  }
}