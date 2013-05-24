package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_layout_0_0 extends Strategy 
{ 
  public static smart_layout_0_0 instance = new smart_layout_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_layout_0_0");
    Fail680:
    { 
      IStrategoTerm n_320 = null;
      IStrategoTerm r_320 = null;
      IStrategoTerm t_320 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted461.instance);
      if(term == null)
        break Fail680;
      n_320 = term;
      r_320 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_320, NO_STRATEGIES, new IStrategoTerm[]{extraction.const628});
      if(term == null)
        break Fail680;
      t_320 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, n_320);
      if(term == null)
        break Fail680;
      term = put_syntax_sort_0_1.instance.invoke(context, t_320, term);
      if(term == null)
        break Fail680;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}