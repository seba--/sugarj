package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_isect_0_2 extends Strategy 
{ 
  public static smart_isect_0_2 instance = new smart_isect_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_298, IStrategoTerm ref_q_298)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_298 = new TermReference(ref_p_298);
    TermReference q_298 = new TermReference(ref_q_298);
    context.push("smart_isect_0_2");
    Fail638:
    { 
      IStrategoTerm r_298 = null;
      IStrategoTerm e_299 = null;
      IStrategoTerm h_299 = null;
      term = extraction.constNil0;
      lifted417 lifted4170 = new lifted417();
      lifted4170.p_298 = p_298;
      lifted4170.q_298 = q_298;
      term = try_1_0.instance.invoke(context, term, lifted4170);
      if(term == null)
        break Fail638;
      r_298 = term;
      if(p_298.value == null || q_298.value == null)
        break Fail638;
      term = (IStrategoTerm)termFactory.makeListCons(p_298.value, termFactory.makeListCons(q_298.value, (IStrategoList)extraction.constNil0));
      e_299 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", e_299, NO_STRATEGIES, new IStrategoTerm[]{extraction.const589});
      if(term == null)
        break Fail638;
      h_299 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, r_298);
      if(term == null)
        break Fail638;
      term = put_syntax_sort_0_1.instance.invoke(context, h_299, term);
      if(term == null)
        break Fail638;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}