package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_non_assoc_0_0 extends Strategy 
{ 
  public static smart_non_assoc_0_0 instance = new smart_non_assoc_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_non_assoc_0_0");
    Fail642:
    { 
      IStrategoTerm o_300 = null;
      IStrategoTerm s_300 = null;
      IStrategoTerm u_300 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted421.instance);
      if(term == null)
        break Fail642;
      o_300 = term;
      s_300 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_300, NO_STRATEGIES, new IStrategoTerm[]{extraction.const593});
      if(term == null)
        break Fail642;
      u_300 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_300);
      if(term == null)
        break Fail642;
      term = put_syntax_sort_0_1.instance.invoke(context, u_300, term);
      if(term == null)
        break Fail642;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}