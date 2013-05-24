package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$On$Save_0_2 extends Strategy 
{ 
  public static smart_$On$Save_0_2 instance = new smart_$On$Save_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_151, IStrategoTerm ref_q_151)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_151 = new TermReference(ref_p_151);
    TermReference q_151 = new TermReference(ref_q_151);
    context.push("smart_OnSave_0_2");
    Fail432:
    { 
      IStrategoTerm t_151 = null;
      IStrategoTerm t_154 = null;
      IStrategoTerm v_154 = null;
      term = extraction.constNil0;
      lifted173 lifted1730 = new lifted173();
      lifted1730.p_151 = p_151;
      lifted1730.q_151 = q_151;
      term = try_1_0.instance.invoke(context, term, lifted1730);
      if(term == null)
        break Fail432;
      lifted174 lifted1740 = new lifted174();
      lifted1740.p_151 = p_151;
      lifted1740.q_151 = q_151;
      term = try_1_0.instance.invoke(context, term, lifted1740);
      if(term == null)
        break Fail432;
      lifted175 lifted1750 = new lifted175();
      lifted1750.p_151 = p_151;
      lifted1750.q_151 = q_151;
      term = try_1_0.instance.invoke(context, term, lifted1750);
      if(term == null)
        break Fail432;
      lifted176 lifted1760 = new lifted176();
      lifted1760.p_151 = p_151;
      lifted1760.q_151 = q_151;
      term = try_1_0.instance.invoke(context, term, lifted1760);
      if(term == null)
        break Fail432;
      t_151 = term;
      if(p_151.value == null || q_151.value == null)
        break Fail432;
      term = (IStrategoTerm)termFactory.makeListCons(p_151.value, termFactory.makeListCons(q_151.value, (IStrategoList)extraction.constNil0));
      t_154 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_154, NO_STRATEGIES, new IStrategoTerm[]{extraction.const417});
      if(term == null)
        break Fail432;
      v_154 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, t_151);
      if(term == null)
        break Fail432;
      term = put_syntax_sort_0_1.instance.invoke(context, v_154, term);
      if(term == null)
        break Fail432;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}