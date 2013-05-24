package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Open$Editor_0_0 extends Strategy 
{ 
  public static $Open$Editor_0_0 instance = new $Open$Editor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail763:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || ext._consOpenEditor_0 != ((IStrategoAppl)term).getConstructor())
        break Fail763;
      if(true)
        return term;
    }
    context.push("OpenEditor_0_0");
    context.popOnFailure();
    return null;
  }
}