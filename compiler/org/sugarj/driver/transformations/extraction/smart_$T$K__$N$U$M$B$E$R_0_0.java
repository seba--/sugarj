package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$T$K__$N$U$M$B$E$R_0_0 extends Strategy 
{ 
  public static smart_$T$K__$N$U$M$B$E$R_0_0 instance = new smart_$T$K__$N$U$M$B$E$R_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_TK__NUMBER_0_0");
    Fail409:
    { 
      IStrategoTerm r_137 = null;
      IStrategoTerm v_137 = null;
      IStrategoTerm x_137 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted142.instance);
      if(term == null)
        break Fail409;
      r_137 = term;
      v_137 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", v_137, NO_STRATEGIES, new IStrategoTerm[]{extraction.const396});
      if(term == null)
        break Fail409;
      x_137 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, r_137);
      if(term == null)
        break Fail409;
      term = put_syntax_sort_0_1.instance.invoke(context, x_137, term);
      if(term == null)
        break Fail409;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}