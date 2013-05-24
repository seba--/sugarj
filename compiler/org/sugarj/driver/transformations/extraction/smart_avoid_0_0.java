package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_avoid_0_0 extends Strategy 
{ 
  public static smart_avoid_0_0 instance = new smart_avoid_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_avoid_0_0");
    Fail611:
    { 
      IStrategoTerm x_273 = null;
      IStrategoTerm b_274 = null;
      IStrategoTerm d_274 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted386.instance);
      if(term == null)
        break Fail611;
      x_273 = term;
      b_274 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", b_274, NO_STRATEGIES, new IStrategoTerm[]{extraction.const562});
      if(term == null)
        break Fail611;
      d_274 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_273);
      if(term == null)
        break Fail611;
      term = put_syntax_sort_0_1.instance.invoke(context, d_274, term);
      if(term == null)
        break Fail611;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}