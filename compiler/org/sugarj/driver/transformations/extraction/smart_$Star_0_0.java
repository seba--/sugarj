package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Star_0_0 extends Strategy 
{ 
  public static smart_$Star_0_0 instance = new smart_$Star_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_Star_0_0");
    Fail558:
    { 
      IStrategoTerm a_241 = null;
      IStrategoTerm i_241 = null;
      IStrategoTerm k_241 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted326.instance);
      if(term == null)
        break Fail558;
      a_241 = term;
      i_241 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", i_241, NO_STRATEGIES, new IStrategoTerm[]{extraction.const518});
      if(term == null)
        break Fail558;
      k_241 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, a_241);
      if(term == null)
        break Fail558;
      term = put_syntax_sort_0_1.instance.invoke(context, k_241, term);
      if(term == null)
        break Fail558;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}