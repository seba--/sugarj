package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Cursor_0_0 extends Strategy 
{ 
  public static smart_$Cursor_0_0 instance = new smart_$Cursor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_Cursor_0_0");
    Fail381:
    { 
      IStrategoTerm d_115 = null;
      IStrategoTerm h_115 = null;
      IStrategoTerm j_115 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted102.instance);
      if(term == null)
        break Fail381;
      d_115 = term;
      h_115 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", h_115, NO_STRATEGIES, new IStrategoTerm[]{extraction.const372});
      if(term == null)
        break Fail381;
      j_115 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, d_115);
      if(term == null)
        break Fail381;
      term = put_syntax_sort_0_1.instance.invoke(context, j_115, term);
      if(term == null)
        break Fail381;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}