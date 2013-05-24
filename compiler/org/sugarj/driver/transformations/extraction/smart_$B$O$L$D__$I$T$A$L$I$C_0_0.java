package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$B$O$L$D__$I$T$A$L$I$C_0_0 extends Strategy 
{ 
  public static smart_$B$O$L$D__$I$T$A$L$I$C_0_0 instance = new smart_$B$O$L$D__$I$T$A$L$I$C_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_BOLD__ITALIC_0_0");
    Fail420:
    { 
      IStrategoTerm w_142 = null;
      IStrategoTerm c_143 = null;
      IStrategoTerm f_143 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted153.instance);
      if(term == null)
        break Fail420;
      term = try_1_0.instance.invoke(context, term, lifted154.instance);
      if(term == null)
        break Fail420;
      w_142 = term;
      c_143 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", c_143, NO_STRATEGIES, new IStrategoTerm[]{extraction.const407});
      if(term == null)
        break Fail420;
      f_143 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_142);
      if(term == null)
        break Fail420;
      term = put_syntax_sort_0_1.instance.invoke(context, f_143, term);
      if(term == null)
        break Fail420;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}