package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_label__start_0_0 extends Strategy 
{ 
  public static smart_label__start_0_0 instance = new smart_label__start_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_label__start_0_0");
    Fail630:
    { 
      IStrategoTerm l_285 = null;
      IStrategoTerm p_285 = null;
      IStrategoTerm r_285 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted407.instance);
      if(term == null)
        break Fail630;
      l_285 = term;
      p_285 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", p_285, NO_STRATEGIES, new IStrategoTerm[]{extraction.const581});
      if(term == null)
        break Fail630;
      r_285 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_285);
      if(term == null)
        break Fail630;
      term = put_syntax_sort_0_1.instance.invoke(context, r_285, term);
      if(term == null)
        break Fail630;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}