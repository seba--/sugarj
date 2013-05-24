package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Meta_0_0 extends Strategy 
{ 
  public static smart_$Meta_0_0 instance = new smart_$Meta_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_Meta_0_0");
    Fail380:
    { 
      IStrategoTerm t_114 = null;
      IStrategoTerm y_114 = null;
      IStrategoTerm a_115 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted101.instance);
      if(term == null)
        break Fail380;
      t_114 = term;
      y_114 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", y_114, NO_STRATEGIES, new IStrategoTerm[]{extraction.const371});
      if(term == null)
        break Fail380;
      a_115 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, t_114);
      if(term == null)
        break Fail380;
      term = put_syntax_sort_0_1.instance.invoke(context, a_115, term);
      if(term == null)
        break Fail380;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}