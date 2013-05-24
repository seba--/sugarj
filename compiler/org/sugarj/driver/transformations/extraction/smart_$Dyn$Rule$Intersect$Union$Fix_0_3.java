package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Dyn$Rule$Intersect$Union$Fix_0_3 extends Strategy 
{ 
  public static smart_$Dyn$Rule$Intersect$Union$Fix_0_3 instance = new smart_$Dyn$Rule$Intersect$Union$Fix_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_191, IStrategoTerm ref_r_191, IStrategoTerm ref_s_191)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference q_191 = new TermReference(ref_q_191);
    TermReference r_191 = new TermReference(ref_r_191);
    TermReference s_191 = new TermReference(ref_s_191);
    context.push("smart_DynRuleIntersectUnionFix_0_3");
    Fail491:
    { 
      IStrategoTerm w_191 = null;
      IStrategoTerm a_193 = null;
      IStrategoTerm c_193 = null;
      term = extraction.constNil0;
      lifted241 lifted2410 = new lifted241();
      lifted2410.q_191 = q_191;
      lifted2410.r_191 = r_191;
      lifted2410.s_191 = s_191;
      term = try_1_0.instance.invoke(context, term, lifted2410);
      if(term == null)
        break Fail491;
      lifted242 lifted2420 = new lifted242();
      lifted2420.q_191 = q_191;
      lifted2420.r_191 = r_191;
      lifted2420.s_191 = s_191;
      term = try_1_0.instance.invoke(context, term, lifted2420);
      if(term == null)
        break Fail491;
      w_191 = term;
      if(q_191.value == null || (r_191.value == null || s_191.value == null))
        break Fail491;
      term = (IStrategoTerm)termFactory.makeListCons(q_191.value, termFactory.makeListCons(r_191.value, termFactory.makeListCons(s_191.value, (IStrategoList)extraction.constNil0)));
      a_193 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", a_193, NO_STRATEGIES, new IStrategoTerm[]{extraction.const457});
      if(term == null)
        break Fail491;
      c_193 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, w_191);
      if(term == null)
        break Fail491;
      term = put_syntax_sort_0_1.instance.invoke(context, c_193, term);
      if(term == null)
        break Fail491;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}