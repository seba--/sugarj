package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$No$Continuation_0_0 extends Strategy 
{ 
  public static smart_$No$Continuation_0_0 instance = new smart_$No$Continuation_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_NoContinuation_0_0");
    Fail453:
    { 
      IStrategoTerm m_168 = null;
      IStrategoTerm q_168 = null;
      IStrategoTerm s_168 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted199.instance);
      if(term == null)
        break Fail453;
      m_168 = term;
      q_168 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", q_168, NO_STRATEGIES, new IStrategoTerm[]{extraction.const140});
      if(term == null)
        break Fail453;
      s_168 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, m_168);
      if(term == null)
        break Fail453;
      term = put_syntax_sort_0_1.instance.invoke(context, s_168, term);
      if(term == null)
        break Fail453;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}