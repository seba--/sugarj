package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Dyn$Rule$Intersect$Fix_0_2 extends Strategy 
{ 
  public static smart_$Dyn$Rule$Intersect$Fix_0_2 instance = new smart_$Dyn$Rule$Intersect$Fix_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_189, IStrategoTerm ref_v_189)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference u_189 = new TermReference(ref_u_189);
    TermReference v_189 = new TermReference(ref_v_189);
    context.push("smart_DynRuleIntersectFix_0_2");
    Fail489:
    { 
      IStrategoTerm w_189 = null;
      IStrategoTerm o_190 = null;
      IStrategoTerm q_190 = null;
      term = extraction.constNil0;
      lifted237 lifted2370 = new lifted237();
      lifted2370.u_189 = u_189;
      lifted2370.v_189 = v_189;
      term = try_1_0.instance.invoke(context, term, lifted2370);
      if(term == null)
        break Fail489;
      lifted238 lifted2380 = new lifted238();
      lifted2380.u_189 = u_189;
      lifted2380.v_189 = v_189;
      term = try_1_0.instance.invoke(context, term, lifted2380);
      if(term == null)
        break Fail489;
      w_189 = term;
      if(u_189.value == null || v_189.value == null)
        break Fail489;
      term = (IStrategoTerm)termFactory.makeListCons(u_189.value, termFactory.makeListCons(v_189.value, (IStrategoList)extraction.constNil0));
      o_190 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", o_190, NO_STRATEGIES, new IStrategoTerm[]{extraction.const455});
      if(term == null)
        break Fail489;
      q_190 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_189);
      if(term == null)
        break Fail489;
      term = put_syntax_sort_0_1.instance.invoke(context, q_190, term);
      if(term == null)
        break Fail489;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}