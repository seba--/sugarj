package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$No$Color_0_0 extends Strategy 
{ 
  public static smart_$No$Color_0_0 instance = new smart_$No$Color_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_NoColor_0_0");
    Fail423:
    { 
      IStrategoTerm l_144 = null;
      IStrategoTerm r_144 = null;
      IStrategoTerm t_144 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted157.instance);
      if(term == null)
        break Fail423;
      l_144 = term;
      r_144 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_144, NO_STRATEGIES, new IStrategoTerm[]{extraction.const108});
      if(term == null)
        break Fail423;
      t_144 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_144);
      if(term == null)
        break Fail423;
      term = put_syntax_sort_0_1.instance.invoke(context, t_144, term);
      if(term == null)
        break Fail423;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}