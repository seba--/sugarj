package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$T$K__$U$N$K$N$O$W$N_0_0 extends Strategy 
{ 
  public static smart_$T$K__$U$N$K$N$O$W$N_0_0 instance = new smart_$T$K__$U$N$K$N$O$W$N_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_TK__UNKNOWN_0_0");
    Fail416:
    { 
      IStrategoTerm m_140 = null;
      IStrategoTerm w_140 = null;
      IStrategoTerm y_140 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted149.instance);
      if(term == null)
        break Fail416;
      m_140 = term;
      w_140 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", w_140, NO_STRATEGIES, new IStrategoTerm[]{extraction.const403});
      if(term == null)
        break Fail416;
      y_140 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, m_140);
      if(term == null)
        break Fail416;
      term = put_syntax_sort_0_1.instance.invoke(context, y_140, term);
      if(term == null)
        break Fail416;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}