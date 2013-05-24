package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Id_0_0 extends Strategy 
{ 
  public static smart_$Id_0_0 instance = new smart_$Id_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_Id_0_0");
    Fail590:
    { 
      IStrategoTerm b_260 = null;
      IStrategoTerm g_260 = null;
      IStrategoTerm i_260 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted358.instance);
      if(term == null)
        break Fail590;
      b_260 = term;
      g_260 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", g_260, NO_STRATEGIES, new IStrategoTerm[]{extraction.const15});
      if(term == null)
        break Fail590;
      i_260 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, b_260);
      if(term == null)
        break Fail590;
      term = put_syntax_sort_0_1.instance.invoke(context, i_260, term);
      if(term == null)
        break Fail590;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}