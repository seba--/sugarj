package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class start_analysis_0_0 extends Strategy 
{ 
  public static start_analysis_0_0 instance = new start_analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail16:
    { 
      if(true)
        break Fail16;
      if(true)
        return term;
    }
    context.push("start_analysis_0_0");
    context.popOnFailure();
    return null;
  }
}