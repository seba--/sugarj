package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Final_0_0 extends Strategy 
{ 
  public static $Final_0_0 instance = new $Final_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail199:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consFinal_0 != ((IStrategoAppl)term).getConstructor())
        break Fail199;
      if(true)
        return term;
    }
    context.push("Final_0_0");
    context.popOnFailure();
    return null;
  }
}