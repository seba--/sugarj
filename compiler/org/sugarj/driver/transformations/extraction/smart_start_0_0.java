package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_start_0_0 extends Strategy 
{ 
  public static smart_start_0_0 instance = new smart_start_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_start_0_0");
    Fail697:
    { 
      IStrategoTerm d_329 = null;
      IStrategoTerm h_329 = null;
      IStrategoTerm j_329 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted478.instance);
      if(term == null)
        break Fail697;
      d_329 = term;
      h_329 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", h_329, NO_STRATEGIES, new IStrategoTerm[]{extraction.const645});
      if(term == null)
        break Fail697;
      j_329 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, d_329);
      if(term == null)
        break Fail697;
      term = put_syntax_sort_0_1.instance.invoke(context, j_329, term);
      if(term == null)
        break Fail697;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}