package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$T$K__$E$R$R$O$R_0_0 extends Strategy 
{ 
  public static smart_$T$K__$E$R$R$O$R_0_0 instance = new smart_$T$K__$E$R$R$O$R_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_TK__ERROR_0_0");
    Fail415:
    { 
      IStrategoTerm z_139 = null;
      IStrategoTerm j_140 = null;
      IStrategoTerm l_140 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted148.instance);
      if(term == null)
        break Fail415;
      z_139 = term;
      j_140 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", j_140, NO_STRATEGIES, new IStrategoTerm[]{extraction.const402});
      if(term == null)
        break Fail415;
      l_140 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, z_139);
      if(term == null)
        break Fail415;
      term = put_syntax_sort_0_1.instance.invoke(context, l_140, term);
      if(term == null)
        break Fail415;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}