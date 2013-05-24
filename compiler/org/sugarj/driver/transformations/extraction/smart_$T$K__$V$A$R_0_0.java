package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$T$K__$V$A$R_0_0 extends Strategy 
{ 
  public static smart_$T$K__$V$A$R_0_0 instance = new smart_$T$K__$V$A$R_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_TK__VAR_0_0");
    Fail414:
    { 
      IStrategoTerm g_139 = null;
      IStrategoTerm k_139 = null;
      IStrategoTerm m_139 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted147.instance);
      if(term == null)
        break Fail414;
      g_139 = term;
      k_139 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", k_139, NO_STRATEGIES, new IStrategoTerm[]{extraction.const401});
      if(term == null)
        break Fail414;
      m_139 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_139);
      if(term == null)
        break Fail414;
      term = put_syntax_sort_0_1.instance.invoke(context, m_139, term);
      if(term == null)
        break Fail414;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}