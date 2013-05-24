package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $N$O$R$M$A$L_0_0 extends Strategy 
{ 
  public static $N$O$R$M$A$L_0_0 instance = new $N$O$R$M$A$L_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail802:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || ext._consNORMAL_0 != ((IStrategoAppl)term).getConstructor())
        break Fail802;
      if(true)
        return term;
    }
    context.push("NORMAL_0_0");
    context.popOnFailure();
    return null;
  }
}