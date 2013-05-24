package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_bracket_0_0 extends Strategy 
{ 
  public static smart_bracket_0_0 instance = new smart_bracket_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_bracket_0_0");
    Fail644:
    { 
      IStrategoTerm c_301 = null;
      IStrategoTerm g_301 = null;
      IStrategoTerm i_301 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted423.instance);
      if(term == null)
        break Fail644;
      c_301 = term;
      g_301 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", g_301, NO_STRATEGIES, new IStrategoTerm[]{extraction.const595});
      if(term == null)
        break Fail644;
      i_301 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, c_301);
      if(term == null)
        break Fail644;
      term = put_syntax_sort_0_1.instance.invoke(context, i_301, term);
      if(term == null)
        break Fail644;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}