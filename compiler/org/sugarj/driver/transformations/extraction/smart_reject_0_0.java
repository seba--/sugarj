package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_reject_0_0 extends Strategy 
{ 
  public static smart_reject_0_0 instance = new smart_reject_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_reject_0_0");
    Fail609:
    { 
      IStrategoTerm g_273 = null;
      IStrategoTerm k_273 = null;
      IStrategoTerm n_273 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted384.instance);
      if(term == null)
        break Fail609;
      g_273 = term;
      k_273 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_273, NO_STRATEGIES, new IStrategoTerm[]{extraction.const560});
      if(term == null)
        break Fail609;
      n_273 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_273);
      if(term == null)
        break Fail609;
      term = put_syntax_sort_0_1.instance.invoke(context, n_273, term);
      if(term == null)
        break Fail609;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}