package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Open$Editor_0_0 extends Strategy 
{ 
  public static smart_$Open$Editor_0_0 instance = new smart_$Open$Editor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_OpenEditor_0_0");
    Fail377:
    { 
      IStrategoTerm w_113 = null;
      IStrategoTerm a_114 = null;
      IStrategoTerm c_114 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted98.instance);
      if(term == null)
        break Fail377;
      w_113 = term;
      a_114 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", a_114, NO_STRATEGIES, new IStrategoTerm[]{extraction.const368});
      if(term == null)
        break Fail377;
      c_114 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_113);
      if(term == null)
        break Fail377;
      term = put_syntax_sort_0_1.instance.invoke(context, c_114, term);
      if(term == null)
        break Fail377;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}