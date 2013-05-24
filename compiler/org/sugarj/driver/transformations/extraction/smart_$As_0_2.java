package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$As_0_2 extends Strategy 
{ 
  public static smart_$As_0_2 instance = new smart_$As_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_237, IStrategoTerm ref_r_237)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference q_237 = new TermReference(ref_q_237);
    TermReference r_237 = new TermReference(ref_r_237);
    context.push("smart_As_0_2");
    Fail554:
    { 
      IStrategoTerm t_237 = null;
      IStrategoTerm f_239 = null;
      IStrategoTerm h_239 = null;
      term = extraction.constNil0;
      lifted319 lifted3190 = new lifted319();
      lifted3190.q_237 = q_237;
      lifted3190.r_237 = r_237;
      term = try_1_0.instance.invoke(context, term, lifted3190);
      if(term == null)
        break Fail554;
      lifted320 lifted3200 = new lifted320();
      lifted3200.q_237 = q_237;
      lifted3200.r_237 = r_237;
      term = try_1_0.instance.invoke(context, term, lifted3200);
      if(term == null)
        break Fail554;
      lifted321 lifted3210 = new lifted321();
      lifted3210.q_237 = q_237;
      lifted3210.r_237 = r_237;
      term = try_1_0.instance.invoke(context, term, lifted3210);
      if(term == null)
        break Fail554;
      lifted322 lifted3220 = new lifted322();
      lifted3220.q_237 = q_237;
      lifted3220.r_237 = r_237;
      term = try_1_0.instance.invoke(context, term, lifted3220);
      if(term == null)
        break Fail554;
      t_237 = term;
      if(q_237.value == null || r_237.value == null)
        break Fail554;
      term = (IStrategoTerm)termFactory.makeListCons(q_237.value, termFactory.makeListCons(r_237.value, (IStrategoList)extraction.constNil0));
      f_239 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_239, NO_STRATEGIES, new IStrategoTerm[]{extraction.const514});
      if(term == null)
        break Fail554;
      h_239 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, t_237);
      if(term == null)
        break Fail554;
      term = put_syntax_sort_0_1.instance.invoke(context, h_239, term);
      if(term == null)
        break Fail554;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}