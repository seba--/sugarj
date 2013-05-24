package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_strategy_0_2 extends Strategy 
{ 
  public static smart_strategy_0_2 instance = new smart_strategy_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_311, IStrategoTerm ref_j_311)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_311 = new TermReference(ref_i_311);
    TermReference j_311 = new TermReference(ref_j_311);
    context.push("smart_strategy_0_2");
    Fail663:
    { 
      IStrategoTerm k_311 = null;
      IStrategoTerm u_311 = null;
      IStrategoTerm w_311 = null;
      term = extraction.constNil0;
      lifted444 lifted4440 = new lifted444();
      lifted4440.i_311 = i_311;
      lifted4440.j_311 = j_311;
      term = try_1_0.instance.invoke(context, term, lifted4440);
      if(term == null)
        break Fail663;
      k_311 = term;
      if(i_311.value == null || j_311.value == null)
        break Fail663;
      term = (IStrategoTerm)termFactory.makeListCons(i_311.value, termFactory.makeListCons(j_311.value, (IStrategoList)extraction.constNil0));
      u_311 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_311, NO_STRATEGIES, new IStrategoTerm[]{extraction.const612});
      if(term == null)
        break Fail663;
      w_311 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, k_311);
      if(term == null)
        break Fail663;
      term = put_syntax_sort_0_1.instance.invoke(context, w_311, term);
      if(term == null)
        break Fail663;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}