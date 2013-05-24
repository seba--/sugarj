package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Set$Dyn$Rule$Match_0_2 extends Strategy 
{ 
  public static smart_$Set$Dyn$Rule$Match_0_2 instance = new smart_$Set$Dyn$Rule$Match_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_182, IStrategoTerm ref_g_182)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference f_182 = new TermReference(ref_f_182);
    TermReference g_182 = new TermReference(ref_g_182);
    context.push("smart_SetDynRuleMatch_0_2");
    Fail476:
    { 
      IStrategoTerm h_182 = null;
      IStrategoTerm r_182 = null;
      IStrategoTerm t_182 = null;
      term = extraction.constNil0;
      lifted224 lifted2240 = new lifted224();
      lifted2240.f_182 = f_182;
      lifted2240.g_182 = g_182;
      term = try_1_0.instance.invoke(context, term, lifted2240);
      if(term == null)
        break Fail476;
      h_182 = term;
      if(f_182.value == null || g_182.value == null)
        break Fail476;
      term = (IStrategoTerm)termFactory.makeListCons(f_182.value, termFactory.makeListCons(g_182.value, (IStrategoList)extraction.constNil0));
      r_182 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_182, NO_STRATEGIES, new IStrategoTerm[]{extraction.const445});
      if(term == null)
        break Fail476;
      t_182 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, h_182);
      if(term == null)
        break Fail476;
      term = put_syntax_sort_0_1.instance.invoke(context, t_182, term);
      if(term == null)
        break Fail476;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}