package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Star$Star_0_0 extends Strategy 
{ 
  public static smart_$Star$Star_0_0 instance = new smart_$Star$Star_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_StarStar_0_0");
    Fail559:
    { 
      IStrategoTerm l_241 = null;
      IStrategoTerm r_241 = null;
      IStrategoTerm u_241 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted327.instance);
      if(term == null)
        break Fail559;
      l_241 = term;
      r_241 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_241, NO_STRATEGIES, new IStrategoTerm[]{extraction.const519});
      if(term == null)
        break Fail559;
      u_241 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_241);
      if(term == null)
        break Fail559;
      term = put_syntax_sort_0_1.instance.invoke(context, u_241, term);
      if(term == null)
        break Fail559;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}