package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$T$K__$O$P$E$R$A$T$O$R_0_0 extends Strategy 
{ 
  public static smart_$T$K__$O$P$E$R$A$T$O$R_0_0 instance = new smart_$T$K__$O$P$E$R$A$T$O$R_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_TK__OPERATOR_0_0");
    Fail413:
    { 
      IStrategoTerm z_138 = null;
      IStrategoTerm d_139 = null;
      IStrategoTerm f_139 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted146.instance);
      if(term == null)
        break Fail413;
      z_138 = term;
      d_139 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", d_139, NO_STRATEGIES, new IStrategoTerm[]{extraction.const400});
      if(term == null)
        break Fail413;
      f_139 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, z_138);
      if(term == null)
        break Fail413;
      term = put_syntax_sort_0_1.instance.invoke(context, f_139, term);
      if(term == null)
        break Fail413;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}