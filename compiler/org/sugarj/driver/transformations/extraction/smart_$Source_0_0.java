package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Source_0_0 extends Strategy 
{ 
  public static smart_$Source_0_0 instance = new smart_$Source_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_Source_0_0");
    Fail382:
    { 
      IStrategoTerm k_115 = null;
      IStrategoTerm p_115 = null;
      IStrategoTerm r_115 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted103.instance);
      if(term == null)
        break Fail382;
      k_115 = term;
      p_115 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", p_115, NO_STRATEGIES, new IStrategoTerm[]{extraction.const373});
      if(term == null)
        break Fail382;
      r_115 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_115);
      if(term == null)
        break Fail382;
      term = put_syntax_sort_0_1.instance.invoke(context, r_115, term);
      if(term == null)
        break Fail382;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}