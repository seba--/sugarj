package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_empty_0_0 extends Strategy 
{ 
  public static smart_empty_0_0 instance = new smart_empty_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_empty_0_0");
    Fail655:
    { 
      IStrategoTerm a_307 = null;
      IStrategoTerm e_307 = null;
      IStrategoTerm h_307 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted436.instance);
      if(term == null)
        break Fail655;
      a_307 = term;
      e_307 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", e_307, NO_STRATEGIES, new IStrategoTerm[]{extraction.const604});
      if(term == null)
        break Fail655;
      h_307 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, a_307);
      if(term == null)
        break Fail655;
      term = put_syntax_sort_0_1.instance.invoke(context, h_307, term);
      if(term == null)
        break Fail655;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}