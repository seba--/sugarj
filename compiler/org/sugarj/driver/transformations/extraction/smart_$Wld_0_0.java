package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Wld_0_0 extends Strategy 
{ 
  public static smart_$Wld_0_0 instance = new smart_$Wld_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_Wld_0_0");
    Fail573:
    { 
      IStrategoTerm g_249 = null;
      IStrategoTerm k_249 = null;
      IStrategoTerm n_249 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted341.instance);
      if(term == null)
        break Fail573;
      g_249 = term;
      k_249 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_249, NO_STRATEGIES, new IStrategoTerm[]{extraction.const62});
      if(term == null)
        break Fail573;
      n_249 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_249);
      if(term == null)
        break Fail573;
      term = put_syntax_sort_0_1.instance.invoke(context, n_249, term);
      if(term == null)
        break Fail573;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}