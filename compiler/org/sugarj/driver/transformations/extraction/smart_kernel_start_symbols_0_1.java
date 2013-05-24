package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_kernel_start_symbols_0_1 extends Strategy 
{ 
  public static smart_kernel_start_symbols_0_1 instance = new smart_kernel_start_symbols_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_279)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_279 = new TermReference(ref_w_279);
    context.push("smart_kernel_start_symbols_0_1");
    Fail620:
    { 
      IStrategoTerm x_279 = null;
      IStrategoTerm i_280 = null;
      IStrategoTerm k_280 = null;
      term = extraction.constNil0;
      lifted397 lifted3970 = new lifted397();
      lifted3970.w_279 = w_279;
      term = try_1_0.instance.invoke(context, term, lifted3970);
      if(term == null)
        break Fail620;
      x_279 = term;
      if(w_279.value == null)
        break Fail620;
      term = (IStrategoTerm)termFactory.makeListCons(w_279.value, (IStrategoList)extraction.constNil0);
      i_280 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", i_280, NO_STRATEGIES, new IStrategoTerm[]{extraction.const571});
      if(term == null)
        break Fail620;
      k_280 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, x_279);
      if(term == null)
        break Fail620;
      term = put_syntax_sort_0_1.instance.invoke(context, k_280, term);
      if(term == null)
        break Fail620;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}