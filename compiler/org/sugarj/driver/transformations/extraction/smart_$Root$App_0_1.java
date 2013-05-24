package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Root$App_0_1 extends Strategy 
{ 
  public static smart_$Root$App_0_1 instance = new smart_$Root$App_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_s_233)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference s_233 = new TermReference(ref_s_233);
    context.push("smart_RootApp_0_1");
    Fail549:
    { 
      IStrategoTerm t_233 = null;
      IStrategoTerm o_234 = null;
      IStrategoTerm q_234 = null;
      term = extraction.constNil0;
      lifted311 lifted3110 = new lifted311();
      lifted3110.s_233 = s_233;
      term = try_1_0.instance.invoke(context, term, lifted3110);
      if(term == null)
        break Fail549;
      lifted312 lifted3120 = new lifted312();
      lifted3120.s_233 = s_233;
      term = try_1_0.instance.invoke(context, term, lifted3120);
      if(term == null)
        break Fail549;
      t_233 = term;
      if(s_233.value == null)
        break Fail549;
      term = (IStrategoTerm)termFactory.makeListCons(s_233.value, (IStrategoList)extraction.constNil0);
      o_234 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", o_234, NO_STRATEGIES, new IStrategoTerm[]{extraction.const510});
      if(term == null)
        break Fail549;
      q_234 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, t_233);
      if(term == null)
        break Fail549;
      term = put_syntax_sort_0_1.instance.invoke(context, q_234, term);
      if(term == null)
        break Fail549;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}