package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class debug_analysis_1_0 extends Strategy 
{ 
  public static debug_analysis_1_0 instance = new debug_analysis_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_54)
  { 
    context.push("debug_analysis_1_0");
    Fail40:
    { 
      IStrategoTerm d_54 = null;
      d_54 = term;
      term = nice_analysis_data_term_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail40;
      term = debug_1_0.instance.invoke(context, term, e_54);
      if(term == null)
        break Fail40;
      term = d_54;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}