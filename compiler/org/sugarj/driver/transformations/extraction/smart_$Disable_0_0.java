package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Disable_0_0 extends Strategy 
{ 
  public static smart_$Disable_0_0 instance = new smart_$Disable_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_Disable_0_0");
    Fail392:
    { 
      IStrategoTerm f_123 = null;
      IStrategoTerm p_123 = null;
      IStrategoTerm r_123 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted120.instance);
      if(term == null)
        break Fail392;
      term = try_1_0.instance.invoke(context, term, lifted121.instance);
      if(term == null)
        break Fail392;
      term = try_1_0.instance.invoke(context, term, lifted122.instance);
      if(term == null)
        break Fail392;
      term = try_1_0.instance.invoke(context, term, lifted123.instance);
      if(term == null)
        break Fail392;
      f_123 = term;
      p_123 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", p_123, NO_STRATEGIES, new IStrategoTerm[]{extraction.const382});
      if(term == null)
        break Fail392;
      r_123 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, f_123);
      if(term == null)
        break Fail392;
      term = put_syntax_sort_0_1.instance.invoke(context, r_123, term);
      if(term == null)
        break Fail392;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}