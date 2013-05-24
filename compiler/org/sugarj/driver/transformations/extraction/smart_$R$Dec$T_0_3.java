package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$R$Dec$T_0_3 extends Strategy 
{ 
  public static smart_$R$Dec$T_0_3 instance = new smart_$R$Dec$T_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_188, IStrategoTerm ref_q_188, IStrategoTerm ref_r_188)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_188 = new TermReference(ref_p_188);
    TermReference q_188 = new TermReference(ref_q_188);
    TermReference r_188 = new TermReference(ref_r_188);
    context.push("smart_RDecT_0_3");
    Fail487:
    { 
      IStrategoTerm s_188 = null;
      IStrategoTerm f_189 = null;
      IStrategoTerm i_189 = null;
      term = extraction.constNil0;
      lifted235 lifted2350 = new lifted235();
      lifted2350.p_188 = p_188;
      lifted2350.q_188 = q_188;
      lifted2350.r_188 = r_188;
      term = try_1_0.instance.invoke(context, term, lifted2350);
      if(term == null)
        break Fail487;
      s_188 = term;
      if(p_188.value == null || (q_188.value == null || r_188.value == null))
        break Fail487;
      term = (IStrategoTerm)termFactory.makeListCons(p_188.value, termFactory.makeListCons(q_188.value, termFactory.makeListCons(r_188.value, (IStrategoList)extraction.constNil0)));
      f_189 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_189, NO_STRATEGIES, new IStrategoTerm[]{extraction.const454});
      if(term == null)
        break Fail487;
      i_189 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_188);
      if(term == null)
        break Fail487;
      term = put_syntax_sort_0_1.instance.invoke(context, i_189, term);
      if(term == null)
        break Fail487;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}