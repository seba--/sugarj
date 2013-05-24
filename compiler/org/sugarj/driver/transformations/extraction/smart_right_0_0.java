package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_right_0_0 extends Strategy 
{ 
  public static smart_right_0_0 instance = new smart_right_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_right_0_0");
    Fail641:
    { 
      IStrategoTerm g_300 = null;
      IStrategoTerm l_300 = null;
      IStrategoTerm n_300 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted420.instance);
      if(term == null)
        break Fail641;
      g_300 = term;
      l_300 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", l_300, NO_STRATEGIES, new IStrategoTerm[]{extraction.const592});
      if(term == null)
        break Fail641;
      n_300 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_300);
      if(term == null)
        break Fail641;
      term = put_syntax_sort_0_1.instance.invoke(context, n_300, term);
      if(term == null)
        break Fail641;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}