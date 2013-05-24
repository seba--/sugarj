package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Dyn$Rule$Union_0_3 extends Strategy 
{ 
  public static smart_$Dyn$Rule$Union_0_3 instance = new smart_$Dyn$Rule$Union_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_194, IStrategoTerm ref_q_194, IStrategoTerm ref_r_194)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_194 = new TermReference(ref_p_194);
    TermReference q_194 = new TermReference(ref_q_194);
    TermReference r_194 = new TermReference(ref_r_194);
    context.push("smart_DynRuleUnion_0_3");
    Fail493:
    { 
      IStrategoTerm s_194 = null;
      IStrategoTerm s_195 = null;
      IStrategoTerm u_195 = null;
      term = extraction.constNil0;
      lifted245 lifted2450 = new lifted245();
      lifted2450.p_194 = p_194;
      lifted2450.q_194 = q_194;
      lifted2450.r_194 = r_194;
      term = try_1_0.instance.invoke(context, term, lifted2450);
      if(term == null)
        break Fail493;
      lifted246 lifted2460 = new lifted246();
      lifted2460.p_194 = p_194;
      lifted2460.q_194 = q_194;
      lifted2460.r_194 = r_194;
      term = try_1_0.instance.invoke(context, term, lifted2460);
      if(term == null)
        break Fail493;
      s_194 = term;
      if(p_194.value == null || (q_194.value == null || r_194.value == null))
        break Fail493;
      term = (IStrategoTerm)termFactory.makeListCons(p_194.value, termFactory.makeListCons(q_194.value, termFactory.makeListCons(r_194.value, (IStrategoList)extraction.constNil0)));
      s_195 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_195, NO_STRATEGIES, new IStrategoTerm[]{extraction.const459});
      if(term == null)
        break Fail493;
      u_195 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_194);
      if(term == null)
        break Fail493;
      term = put_syntax_sort_0_1.instance.invoke(context, u_195, term);
      if(term == null)
        break Fail493;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}