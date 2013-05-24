package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_top_0_0 extends Strategy 
{ 
  public static smart_top_0_0 instance = new smart_top_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_top_0_0");
    Fail627:
    { 
      IStrategoTerm p_284 = null;
      IStrategoTerm t_284 = null;
      IStrategoTerm w_284 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted404.instance);
      if(term == null)
        break Fail627;
      p_284 = term;
      t_284 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_284, NO_STRATEGIES, new IStrategoTerm[]{extraction.const578});
      if(term == null)
        break Fail627;
      w_284 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, p_284);
      if(term == null)
        break Fail627;
      term = put_syntax_sort_0_1.instance.invoke(context, w_284, term);
      if(term == null)
        break Fail627;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}