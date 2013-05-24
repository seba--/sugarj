package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_eof_0_0 extends Strategy 
{ 
  public static smart_eof_0_0 instance = new smart_eof_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_eof_0_0");
    Fail628:
    { 
      IStrategoTerm x_284 = null;
      IStrategoTerm b_285 = null;
      IStrategoTerm d_285 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted405.instance);
      if(term == null)
        break Fail628;
      x_284 = term;
      b_285 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", b_285, NO_STRATEGIES, new IStrategoTerm[]{extraction.const579});
      if(term == null)
        break Fail628;
      d_285 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_284);
      if(term == null)
        break Fail628;
      term = put_syntax_sort_0_1.instance.invoke(context, d_285, term);
      if(term == null)
        break Fail628;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}