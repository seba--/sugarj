package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_real_con_0_3 extends Strategy 
{ 
  public static smart_real_con_0_3 instance = new smart_real_con_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_321, IStrategoTerm ref_r_321, IStrategoTerm ref_s_321)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference q_321 = new TermReference(ref_q_321);
    TermReference r_321 = new TermReference(ref_r_321);
    TermReference s_321 = new TermReference(ref_s_321);
    context.push("smart_real_con_0_3");
    Fail683:
    { 
      IStrategoTerm t_321 = null;
      IStrategoTerm g_322 = null;
      IStrategoTerm j_322 = null;
      term = extraction.constNil0;
      lifted464 lifted4640 = new lifted464();
      lifted4640.q_321 = q_321;
      lifted4640.r_321 = r_321;
      lifted4640.s_321 = s_321;
      term = try_1_0.instance.invoke(context, term, lifted4640);
      if(term == null)
        break Fail683;
      t_321 = term;
      if(q_321.value == null || (r_321.value == null || s_321.value == null))
        break Fail683;
      term = (IStrategoTerm)termFactory.makeListCons(q_321.value, termFactory.makeListCons(r_321.value, termFactory.makeListCons(s_321.value, (IStrategoList)extraction.constNil0)));
      g_322 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", g_322, NO_STRATEGIES, new IStrategoTerm[]{extraction.const631});
      if(term == null)
        break Fail683;
      j_322 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, t_321);
      if(term == null)
        break Fail683;
      term = put_syntax_sort_0_1.instance.invoke(context, j_322, term);
      if(term == null)
        break Fail683;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}