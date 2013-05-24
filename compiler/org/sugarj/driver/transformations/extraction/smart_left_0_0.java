package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_left_0_0 extends Strategy 
{ 
  public static smart_left_0_0 instance = new smart_left_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_left_0_0");
    Fail640:
    { 
      IStrategoTerm z_299 = null;
      IStrategoTerm d_300 = null;
      IStrategoTerm f_300 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted419.instance);
      if(term == null)
        break Fail640;
      z_299 = term;
      d_300 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", d_300, NO_STRATEGIES, new IStrategoTerm[]{extraction.const591});
      if(term == null)
        break Fail640;
      f_300 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, z_299);
      if(term == null)
        break Fail640;
      term = put_syntax_sort_0_1.instance.invoke(context, f_300, term);
      if(term == null)
        break Fail640;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}