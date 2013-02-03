package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Empty$Tuple$Cong_0_0 extends Strategy 
{ 
  public static $Empty$Tuple$Cong_0_0 instance = new $Empty$Tuple$Cong_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail79:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || out._consEmptyTupleCong_0 != ((IStrategoAppl)term).getConstructor())
        break Fail79;
      if(true)
        return term;
    }
    context.push("EmptyTupleCong_0_0");
    context.popOnFailure();
    return null;
  }
}