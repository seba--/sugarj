package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_unparameterized_0_1 extends Strategy 
{ 
  public static smart_unparameterized_0_1 instance = new smart_unparameterized_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_315)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_315 = new TermReference(ref_n_315);
    context.push("smart_unparameterized_0_1");
    Fail670:
    { 
      IStrategoTerm o_315 = null;
      IStrategoTerm v_315 = null;
      IStrategoTerm x_315 = null;
      term = extraction.constNil0;
      lifted451 lifted4511 = new lifted451();
      lifted4511.n_315 = n_315;
      term = try_1_0.instance.invoke(context, term, lifted4511);
      if(term == null)
        break Fail670;
      o_315 = term;
      if(n_315.value == null)
        break Fail670;
      term = (IStrategoTerm)termFactory.makeListCons(n_315.value, (IStrategoList)extraction.constNil0);
      v_315 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", v_315, NO_STRATEGIES, new IStrategoTerm[]{extraction.const619});
      if(term == null)
        break Fail670;
      x_315 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_315);
      if(term == null)
        break Fail670;
      term = put_syntax_sort_0_1.instance.invoke(context, x_315, term);
      if(term == null)
        break Fail670;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}