package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$I$T$A$L$I$C_0_0 extends Strategy 
{ 
  public static smart_$I$T$A$L$I$C_0_0 instance = new smart_$I$T$A$L$I$C_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_ITALIC_0_0");
    Fail419:
    { 
      IStrategoTerm p_142 = null;
      IStrategoTerm t_142 = null;
      IStrategoTerm v_142 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted152.instance);
      if(term == null)
        break Fail419;
      p_142 = term;
      t_142 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_142, NO_STRATEGIES, new IStrategoTerm[]{extraction.const406});
      if(term == null)
        break Fail419;
      v_142 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, p_142);
      if(term == null)
        break Fail419;
      term = put_syntax_sort_0_1.instance.invoke(context, v_142, term);
      if(term == null)
        break Fail419;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}