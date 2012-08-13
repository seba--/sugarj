package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Double_0_0 extends Strategy 
{ 
  public static $Double_0_0 instance = new $Double_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail224:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consDouble_0 != ((IStrategoAppl)term).getConstructor())
        break Fail224;
      if(true)
        return term;
    }
    context.push("Double_0_0");
    context.popOnFailure();
    return null;
  }
}