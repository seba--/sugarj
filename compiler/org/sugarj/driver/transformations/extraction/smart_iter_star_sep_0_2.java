package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_iter_star_sep_0_2 extends Strategy 
{ 
  public static smart_iter_star_sep_0_2 instance = new smart_iter_star_sep_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_309, IStrategoTerm ref_p_309)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference o_309 = new TermReference(ref_o_309);
    TermReference p_309 = new TermReference(ref_p_309);
    context.push("smart_iter_star_sep_0_2");
    Fail660:
    { 
      IStrategoTerm q_309 = null;
      IStrategoTerm b_310 = null;
      IStrategoTerm d_310 = null;
      term = extraction.constNil0;
      lifted441 lifted4410 = new lifted441();
      lifted4410.o_309 = o_309;
      lifted4410.p_309 = p_309;
      term = try_1_0.instance.invoke(context, term, lifted4410);
      if(term == null)
        break Fail660;
      q_309 = term;
      if(o_309.value == null || p_309.value == null)
        break Fail660;
      term = (IStrategoTerm)termFactory.makeListCons(o_309.value, termFactory.makeListCons(p_309.value, (IStrategoList)extraction.constNil0));
      b_310 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", b_310, NO_STRATEGIES, new IStrategoTerm[]{extraction.const609});
      if(term == null)
        break Fail660;
      d_310 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, q_309);
      if(term == null)
        break Fail660;
      term = put_syntax_sort_0_1.instance.invoke(context, d_310, term);
      if(term == null)
        break Fail660;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}