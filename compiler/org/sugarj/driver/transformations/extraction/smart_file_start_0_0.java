package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_file_start_0_0 extends Strategy 
{ 
  public static smart_file_start_0_0 instance = new smart_file_start_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_file_start_0_0");
    Fail698:
    { 
      IStrategoTerm k_329 = null;
      IStrategoTerm o_329 = null;
      IStrategoTerm q_329 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted479.instance);
      if(term == null)
        break Fail698;
      k_329 = term;
      o_329 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", o_329, NO_STRATEGIES, new IStrategoTerm[]{extraction.const646});
      if(term == null)
        break Fail698;
      q_329 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_329);
      if(term == null)
        break Fail698;
      term = put_syntax_sort_0_1.instance.invoke(context, q_329, term);
      if(term == null)
        break Fail698;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}