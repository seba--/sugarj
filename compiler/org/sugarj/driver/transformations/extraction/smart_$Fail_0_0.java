package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Fail_0_0 extends Strategy 
{ 
  public static smart_$Fail_0_0 instance = new smart_$Fail_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_Fail_0_0");
    Fail589:
    { 
      IStrategoTerm s_259 = null;
      IStrategoTerm w_259 = null;
      IStrategoTerm a_260 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted357.instance);
      if(term == null)
        break Fail589;
      s_259 = term;
      w_259 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", w_259, NO_STRATEGIES, new IStrategoTerm[]{extraction.const542});
      if(term == null)
        break Fail589;
      a_260 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_259);
      if(term == null)
        break Fail589;
      term = put_syntax_sort_0_1.instance.invoke(context, a_260, term);
      if(term == null)
        break Fail589;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}