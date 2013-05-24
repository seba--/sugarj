package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_id_0_1 extends Strategy 
{ 
  public static smart_id_0_1 instance = new smart_id_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_316)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_316 = new TermReference(ref_n_316);
    context.push("smart_id_0_1");
    Fail672:
    { 
      IStrategoTerm o_316 = null;
      IStrategoTerm v_316 = null;
      IStrategoTerm x_316 = null;
      term = extraction.constNil0;
      lifted453 lifted4530 = new lifted453();
      lifted4530.n_316 = n_316;
      term = try_1_0.instance.invoke(context, term, lifted4530);
      if(term == null)
        break Fail672;
      o_316 = term;
      if(n_316.value == null)
        break Fail672;
      term = (IStrategoTerm)termFactory.makeListCons(n_316.value, (IStrategoList)extraction.constNil0);
      v_316 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", v_316, NO_STRATEGIES, new IStrategoTerm[]{extraction.const621});
      if(term == null)
        break Fail672;
      x_316 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_316);
      if(term == null)
        break Fail672;
      term = put_syntax_sort_0_1.instance.invoke(context, x_316, term);
      if(term == null)
        break Fail672;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}