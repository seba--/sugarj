package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$T$K__$L$A$Y$O$U$T_0_0 extends Strategy 
{ 
  public static smart_$T$K__$L$A$Y$O$U$T_0_0 instance = new smart_$T$K__$L$A$Y$O$U$T_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_TK__LAYOUT_0_0");
    Fail410:
    { 
      IStrategoTerm y_137 = null;
      IStrategoTerm f_138 = null;
      IStrategoTerm h_138 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted143.instance);
      if(term == null)
        break Fail410;
      y_137 = term;
      f_138 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_138, NO_STRATEGIES, new IStrategoTerm[]{extraction.const397});
      if(term == null)
        break Fail410;
      h_138 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_137);
      if(term == null)
        break Fail410;
      term = put_syntax_sort_0_1.instance.invoke(context, h_138, term);
      if(term == null)
        break Fail410;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}