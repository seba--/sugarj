package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Color$Default_0_0 extends Strategy 
{ 
  public static smart_$Color$Default_0_0 instance = new smart_$Color$Default_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_ColorDefault_0_0");
    Fail421:
    { 
      IStrategoTerm g_143 = null;
      IStrategoTerm l_143 = null;
      IStrategoTerm o_143 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted155.instance);
      if(term == null)
        break Fail421;
      g_143 = term;
      l_143 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", l_143, NO_STRATEGIES, new IStrategoTerm[]{extraction.const408});
      if(term == null)
        break Fail421;
      o_143 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_143);
      if(term == null)
        break Fail421;
      term = put_syntax_sort_0_1.instance.invoke(context, o_143, term);
      if(term == null)
        break Fail421;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}