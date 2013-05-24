package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_assoc_0_0 extends Strategy 
{ 
  public static smart_assoc_0_0 instance = new smart_assoc_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_assoc_0_0");
    Fail643:
    { 
      IStrategoTerm v_300 = null;
      IStrategoTerm z_300 = null;
      IStrategoTerm b_301 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted422.instance);
      if(term == null)
        break Fail643;
      v_300 = term;
      z_300 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", z_300, NO_STRATEGIES, new IStrategoTerm[]{extraction.const594});
      if(term == null)
        break Fail643;
      b_301 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, v_300);
      if(term == null)
        break Fail643;
      term = put_syntax_sort_0_1.instance.invoke(context, b_301, term);
      if(term == null)
        break Fail643;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}