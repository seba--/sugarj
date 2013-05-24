package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$N$O$R$M$A$L_0_0 extends Strategy 
{ 
  public static smart_$N$O$R$M$A$L_0_0 instance = new smart_$N$O$R$M$A$L_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_NORMAL_0_0");
    Fail417:
    { 
      IStrategoTerm z_140 = null;
      IStrategoTerm g_141 = null;
      IStrategoTerm l_141 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted150.instance);
      if(term == null)
        break Fail417;
      z_140 = term;
      g_141 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", g_141, NO_STRATEGIES, new IStrategoTerm[]{extraction.const404});
      if(term == null)
        break Fail417;
      l_141 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, z_140);
      if(term == null)
        break Fail417;
      term = put_syntax_sort_0_1.instance.invoke(context, l_141, term);
      if(term == null)
        break Fail417;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}