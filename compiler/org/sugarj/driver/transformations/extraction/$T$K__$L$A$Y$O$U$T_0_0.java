package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $T$K__$L$A$Y$O$U$T_0_0 extends Strategy 
{ 
  public static $T$K__$L$A$Y$O$U$T_0_0 instance = new $T$K__$L$A$Y$O$U$T_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail795:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || ext._consTK_LAYOUT_0 != ((IStrategoAppl)term).getConstructor())
        break Fail795;
      if(true)
        return term;
    }
    context.push("TK__LAYOUT_0_0");
    context.popOnFailure();
    return null;
  }
}