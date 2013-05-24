package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_bot_0_0 extends Strategy 
{ 
  public static smart_bot_0_0 instance = new smart_bot_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_bot_0_0");
    Fail629:
    { 
      IStrategoTerm e_285 = null;
      IStrategoTerm i_285 = null;
      IStrategoTerm k_285 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted406.instance);
      if(term == null)
        break Fail629;
      e_285 = term;
      i_285 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", i_285, NO_STRATEGIES, new IStrategoTerm[]{extraction.const580});
      if(term == null)
        break Fail629;
      k_285 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, e_285);
      if(term == null)
        break Fail629;
      term = put_syntax_sort_0_1.instance.invoke(context, k_285, term);
      if(term == null)
        break Fail629;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}