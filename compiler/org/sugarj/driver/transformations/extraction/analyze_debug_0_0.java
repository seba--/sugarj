package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class analyze_debug_0_0 extends Strategy 
{ 
  public static analyze_debug_0_0 instance = new analyze_debug_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("analyze_debug_0_0");
    Fail15:
    { 
      term = analyze_main_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail15;
      term = nice_analysis_data_term_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail15;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}