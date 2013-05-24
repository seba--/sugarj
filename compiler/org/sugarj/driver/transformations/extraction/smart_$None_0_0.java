package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$None_0_0 extends Strategy 
{ 
  public static smart_$None_0_0 instance = new smart_$None_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_None_0_0");
    Fail391:
    { 
      IStrategoTerm u_122 = null;
      IStrategoTerm c_123 = null;
      IStrategoTerm e_123 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted117.instance);
      if(term == null)
        break Fail391;
      term = try_1_0.instance.invoke(context, term, lifted118.instance);
      if(term == null)
        break Fail391;
      term = try_1_0.instance.invoke(context, term, lifted119.instance);
      if(term == null)
        break Fail391;
      u_122 = term;
      c_123 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", c_123, NO_STRATEGIES, new IStrategoTerm[]{extraction.const381});
      if(term == null)
        break Fail391;
      e_123 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_122);
      if(term == null)
        break Fail391;
      term = put_syntax_sort_0_1.instance.invoke(context, e_123, term);
      if(term == null)
        break Fail391;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}