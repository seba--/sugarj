package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Real$Time_0_0 extends Strategy 
{ 
  public static smart_$Real$Time_0_0 instance = new smart_$Real$Time_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_RealTime_0_0");
    Fail378:
    { 
      IStrategoTerm d_114 = null;
      IStrategoTerm h_114 = null;
      IStrategoTerm j_114 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted99.instance);
      if(term == null)
        break Fail378;
      d_114 = term;
      h_114 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", h_114, NO_STRATEGIES, new IStrategoTerm[]{extraction.const369});
      if(term == null)
        break Fail378;
      j_114 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, d_114);
      if(term == null)
        break Fail378;
      term = put_syntax_sort_0_1.instance.invoke(context, j_114, term);
      if(term == null)
        break Fail378;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}