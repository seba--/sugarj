package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Id_0_0 extends Strategy 
{ 
  public static $Id_0_0 instance = new $Id_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail133:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consId_0 != ((IStrategoAppl)term).getConstructor())
        break Fail133;
      if(true)
        return term;
    }
    context.push("Id_0_0");
    context.popOnFailure();
    return null;
  }
}