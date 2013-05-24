package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Blank_0_0 extends Strategy 
{ 
  public static smart_$Blank_0_0 instance = new smart_$Blank_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_Blank_0_0");
    Fail393:
    { 
      IStrategoTerm s_123 = null;
      IStrategoTerm w_123 = null;
      IStrategoTerm y_123 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted124.instance);
      if(term == null)
        break Fail393;
      s_123 = term;
      w_123 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", w_123, NO_STRATEGIES, new IStrategoTerm[]{extraction.const383});
      if(term == null)
        break Fail393;
      y_123 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_123);
      if(term == null)
        break Fail393;
      term = put_syntax_sort_0_1.instance.invoke(context, y_123, term);
      if(term == null)
        break Fail393;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}