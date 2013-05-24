package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $T$K__$O$P$E$R$A$T$O$R_0_0 extends Strategy 
{ 
  public static $T$K__$O$P$E$R$A$T$O$R_0_0 instance = new $T$K__$O$P$E$R$A$T$O$R_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail798:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || ext._consTK_OPERATOR_0 != ((IStrategoAppl)term).getConstructor())
        break Fail798;
      if(true)
        return term;
    }
    context.push("TK__OPERATOR_0_0");
    context.popOnFailure();
    return null;
  }
}