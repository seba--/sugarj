package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_unquoted_fun_0_1 extends Strategy 
{ 
  public static smart_unquoted_fun_0_1 instance = new smart_unquoted_fun_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_276)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference q_276 = new TermReference(ref_q_276);
    context.push("smart_unquoted_fun_0_1");
    Fail615:
    { 
      IStrategoTerm r_276 = null;
      IStrategoTerm y_276 = null;
      IStrategoTerm a_277 = null;
      term = extraction.constNil0;
      lifted392 lifted3920 = new lifted392();
      lifted3920.q_276 = q_276;
      term = try_1_0.instance.invoke(context, term, lifted3920);
      if(term == null)
        break Fail615;
      r_276 = term;
      if(q_276.value == null)
        break Fail615;
      term = (IStrategoTerm)termFactory.makeListCons(q_276.value, (IStrategoList)extraction.constNil0);
      y_276 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", y_276, NO_STRATEGIES, new IStrategoTerm[]{extraction.const566});
      if(term == null)
        break Fail615;
      a_277 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, r_276);
      if(term == null)
        break Fail615;
      term = put_syntax_sort_0_1.instance.invoke(context, a_277, term);
      if(term == null)
        break Fail615;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}