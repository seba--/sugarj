package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Persistent_0_0 extends Strategy 
{ 
  public static smart_$Persistent_0_0 instance = new smart_$Persistent_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_Persistent_0_0");
    Fail379:
    { 
      IStrategoTerm k_114 = null;
      IStrategoTerm o_114 = null;
      IStrategoTerm s_114 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted100.instance);
      if(term == null)
        break Fail379;
      k_114 = term;
      o_114 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", o_114, NO_STRATEGIES, new IStrategoTerm[]{extraction.const370});
      if(term == null)
        break Fail379;
      s_114 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_114);
      if(term == null)
        break Fail379;
      term = put_syntax_sort_0_1.instance.invoke(context, s_114, term);
      if(term == null)
        break Fail379;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}