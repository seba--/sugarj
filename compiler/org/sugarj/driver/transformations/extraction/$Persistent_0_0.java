package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Persistent_0_0 extends Strategy 
{ 
  public static $Persistent_0_0 instance = new $Persistent_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail765:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || ext._consPersistent_0 != ((IStrategoAppl)term).getConstructor())
        break Fail765;
      if(true)
        return term;
    }
    context.push("Persistent_0_0");
    context.popOnFailure();
    return null;
  }
}