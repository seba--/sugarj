package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Meta_0_0 extends Strategy 
{ 
  public static $Meta_0_0 instance = new $Meta_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail766:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || ext._consMeta_0 != ((IStrategoAppl)term).getConstructor())
        break Fail766;
      if(true)
        return term;
    }
    context.push("Meta_0_0");
    context.popOnFailure();
    return null;
  }
}