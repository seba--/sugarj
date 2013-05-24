package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Color$Default_0_0 extends Strategy 
{ 
  public static $Color$Default_0_0 instance = new $Color$Default_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail806:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || ext._consColorDefault_0 != ((IStrategoAppl)term).getConstructor())
        break Fail806;
      if(true)
        return term;
    }
    context.push("ColorDefault_0_0");
    context.popOnFailure();
    return null;
  }
}