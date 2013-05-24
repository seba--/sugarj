package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_prefer_0_0 extends Strategy 
{ 
  public static smart_prefer_0_0 instance = new smart_prefer_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_prefer_0_0");
    Fail610:
    { 
      IStrategoTerm o_273 = null;
      IStrategoTerm u_273 = null;
      IStrategoTerm w_273 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted385.instance);
      if(term == null)
        break Fail610;
      o_273 = term;
      u_273 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_273, NO_STRATEGIES, new IStrategoTerm[]{extraction.const561});
      if(term == null)
        break Fail610;
      w_273 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_273);
      if(term == null)
        break Fail610;
      term = put_syntax_sort_0_1.instance.invoke(context, w_273, term);
      if(term == null)
        break Fail610;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}