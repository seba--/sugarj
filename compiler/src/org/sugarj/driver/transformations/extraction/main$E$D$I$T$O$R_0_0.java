package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class main$E$D$I$T$O$R_0_0 extends Strategy 
{ 
  public static main$E$D$I$T$O$R_0_0 instance = new main$E$D$I$T$O$R_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("mainEDITOR_0_0");
    Fail25:
    { 
      term = io_wrap_1_0.instance.invoke(context, term, extract_editor_0_0.instance);
      if(term == null)
        break Fail25;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}