package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_numeric_0_1 extends Strategy 
{ 
  public static smart_numeric_0_1 instance = new smart_numeric_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_283)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_283 = new TermReference(ref_n_283);
    context.push("smart_numeric_0_1");
    Fail625:
    { 
      IStrategoTerm o_283 = null;
      IStrategoTerm x_283 = null;
      IStrategoTerm b_284 = null;
      term = extraction.constNil0;
      lifted402 lifted4020 = new lifted402();
      lifted4020.n_283 = n_283;
      term = try_1_0.instance.invoke(context, term, lifted4020);
      if(term == null)
        break Fail625;
      o_283 = term;
      if(n_283.value == null)
        break Fail625;
      term = (IStrategoTerm)termFactory.makeListCons(n_283.value, (IStrategoList)extraction.constNil0);
      x_283 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", x_283, NO_STRATEGIES, new IStrategoTerm[]{extraction.const576});
      if(term == null)
        break Fail625;
      b_284 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_283);
      if(term == null)
        break Fail625;
      term = put_syntax_sort_0_1.instance.invoke(context, b_284, term);
      if(term == null)
        break Fail625;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}