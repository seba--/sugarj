package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_absent_0_0 extends Strategy 
{ 
  public static smart_absent_0_0 instance = new smart_absent_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_absent_0_0");
    Fail633:
    { 
      IStrategoTerm x_286 = null;
      IStrategoTerm d_287 = null;
      IStrategoTerm f_287 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted410.instance);
      if(term == null)
        break Fail633;
      term = try_1_0.instance.invoke(context, term, lifted411.instance);
      if(term == null)
        break Fail633;
      x_286 = term;
      d_287 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", d_287, NO_STRATEGIES, new IStrategoTerm[]{extraction.const584});
      if(term == null)
        break Fail633;
      f_287 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_286);
      if(term == null)
        break Fail633;
      term = put_syntax_sort_0_1.instance.invoke(context, f_287, term);
      if(term == null)
        break Fail633;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}