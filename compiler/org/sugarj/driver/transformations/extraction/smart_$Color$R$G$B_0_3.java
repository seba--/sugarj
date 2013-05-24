package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Color$R$G$B_0_3 extends Strategy 
{ 
  public static smart_$Color$R$G$B_0_3 instance = new smart_$Color$R$G$B_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_143, IStrategoTerm ref_q_143, IStrategoTerm ref_r_143)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_143 = new TermReference(ref_p_143);
    TermReference q_143 = new TermReference(ref_q_143);
    TermReference r_143 = new TermReference(ref_r_143);
    context.push("smart_ColorRGB_0_3");
    Fail422:
    { 
      IStrategoTerm s_143 = null;
      IStrategoTerm i_144 = null;
      IStrategoTerm k_144 = null;
      term = extraction.constNil0;
      lifted156 lifted1560 = new lifted156();
      lifted1560.p_143 = p_143;
      lifted1560.q_143 = q_143;
      lifted1560.r_143 = r_143;
      term = try_1_0.instance.invoke(context, term, lifted1560);
      if(term == null)
        break Fail422;
      s_143 = term;
      if(p_143.value == null || (q_143.value == null || r_143.value == null))
        break Fail422;
      term = (IStrategoTerm)termFactory.makeListCons(p_143.value, termFactory.makeListCons(q_143.value, termFactory.makeListCons(r_143.value, (IStrategoList)extraction.constNil0)));
      i_144 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", i_144, NO_STRATEGIES, new IStrategoTerm[]{extraction.const409});
      if(term == null)
        break Fail422;
      k_144 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_143);
      if(term == null)
        break Fail422;
      term = put_syntax_sort_0_1.instance.invoke(context, k_144, term);
      if(term == null)
        break Fail422;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}