package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_assoc_group_0_2 extends Strategy 
{ 
  public static smart_assoc_group_0_2 instance = new smart_assoc_group_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_w_304, IStrategoTerm ref_x_304)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference w_304 = new TermReference(ref_w_304);
    TermReference x_304 = new TermReference(ref_x_304);
    context.push("smart_assoc_group_0_2");
    Fail651:
    { 
      IStrategoTerm y_304 = null;
      IStrategoTerm i_305 = null;
      IStrategoTerm k_305 = null;
      term = extraction.constNil0;
      lifted432 lifted4320 = new lifted432();
      lifted4320.w_304 = w_304;
      lifted4320.x_304 = x_304;
      term = try_1_0.instance.invoke(context, term, lifted4320);
      if(term == null)
        break Fail651;
      y_304 = term;
      if(w_304.value == null || x_304.value == null)
        break Fail651;
      term = (IStrategoTerm)termFactory.makeListCons(w_304.value, termFactory.makeListCons(x_304.value, (IStrategoList)extraction.constNil0));
      i_305 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", i_305, NO_STRATEGIES, new IStrategoTerm[]{extraction.const601});
      if(term == null)
        break Fail651;
      k_305 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_304);
      if(term == null)
        break Fail651;
      term = put_syntax_sort_0_1.instance.invoke(context, k_305, term);
      if(term == null)
        break Fail651;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}