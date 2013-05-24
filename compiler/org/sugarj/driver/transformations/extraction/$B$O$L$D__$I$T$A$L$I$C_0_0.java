package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $B$O$L$D__$I$T$A$L$I$C_0_0 extends Strategy 
{ 
  public static $B$O$L$D__$I$T$A$L$I$C_0_0 instance = new $B$O$L$D__$I$T$A$L$I$C_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail805:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || ext._consBOLD_ITALIC_0 != ((IStrategoAppl)term).getConstructor())
        break Fail805;
      if(true)
        return term;
    }
    context.push("BOLD__ITALIC_0_0");
    context.popOnFailure();
    return null;
  }
}