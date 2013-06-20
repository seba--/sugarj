package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class right_0_0 extends Strategy 
{ 
  public static right_0_0 instance = new right_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail210:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consright_0 != ((IStrategoAppl)term).getConstructor())
        break Fail210;
      if(true)
        return term;
    }
    context.push("right_0_0");
    context.popOnFailure();
    return null;
  }
}