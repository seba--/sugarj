package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Real$Cong_0_1 extends Strategy 
{ 
  public static smart_$Real$Cong_0_1 instance = new smart_$Real$Cong_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_213)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_213 = new TermReference(ref_t_213);
    context.push("smart_RealCong_0_1");
    Fail520:
    { 
      IStrategoTerm u_213 = null;
      IStrategoTerm b_214 = null;
      IStrategoTerm d_214 = null;
      term = extraction.constNil0;
      lifted279 lifted2790 = new lifted279();
      lifted2790.t_213 = t_213;
      term = try_1_0.instance.invoke(context, term, lifted2790);
      if(term == null)
        break Fail520;
      u_213 = term;
      if(t_213.value == null)
        break Fail520;
      term = (IStrategoTerm)termFactory.makeListCons(t_213.value, (IStrategoList)extraction.constNil0);
      b_214 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", b_214, NO_STRATEGIES, new IStrategoTerm[]{extraction.const485});
      if(term == null)
        break Fail520;
      d_214 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, u_213);
      if(term == null)
        break Fail520;
      term = put_syntax_sort_0_1.instance.invoke(context, d_214, term);
      if(term == null)
        break Fail520;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}