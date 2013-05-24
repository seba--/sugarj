package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$T$K__$K$E$Y$W$O$R$D_0_0 extends Strategy 
{ 
  public static smart_$T$K__$K$E$Y$W$O$R$D_0_0 instance = new smart_$T$K__$K$E$Y$W$O$R$D_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_TK__KEYWORD_0_0");
    Fail412:
    { 
      IStrategoTerm p_138 = null;
      IStrategoTerm w_138 = null;
      IStrategoTerm y_138 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted145.instance);
      if(term == null)
        break Fail412;
      p_138 = term;
      w_138 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", w_138, NO_STRATEGIES, new IStrategoTerm[]{extraction.const399});
      if(term == null)
        break Fail412;
      y_138 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, p_138);
      if(term == null)
        break Fail412;
      term = put_syntax_sort_0_1.instance.invoke(context, y_138, term);
      if(term == null)
        break Fail412;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}