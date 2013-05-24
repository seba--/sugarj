package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_empty_grammar_0_0 extends Strategy 
{ 
  public static smart_empty_grammar_0_0 instance = new smart_empty_grammar_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("smart_empty_grammar_0_0");
    Fail681:
    { 
      IStrategoTerm u_320 = null;
      IStrategoTerm y_320 = null;
      IStrategoTerm a_321 = null;
      term = try_1_0.instance.invoke(context, extraction.constNil0, lifted462.instance);
      if(term == null)
        break Fail681;
      u_320 = term;
      y_320 = extraction.constNil0;
      term = context.invokePrimitive("SUGARJ_unsafe_build", y_320, NO_STRATEGIES, new IStrategoTerm[]{extraction.const629});
      if(term == null)
        break Fail681;
      a_321 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_320);
      if(term == null)
        break Fail681;
      term = put_syntax_sort_0_1.instance.invoke(context, a_321, term);
      if(term == null)
        break Fail681;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}