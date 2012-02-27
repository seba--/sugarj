package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $True_0_0 extends Strategy 
{ 
  public static $True_0_0 instance = new $True_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail192:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTrue_0 != ((IStrategoAppl)term).getConstructor())
        break Fail192;
      if(true)
        return term;
    }
    context.push("True_0_0");
    context.popOnFailure();
    return null;
  }
}