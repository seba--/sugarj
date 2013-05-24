package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_negative_0_1 extends Strategy 
{ 
  public static smart_negative_0_1 instance = new smart_negative_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_323)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_323 = new TermReference(ref_n_323);
    context.push("smart_negative_0_1");
    Fail686:
    { 
      IStrategoTerm o_323 = null;
      IStrategoTerm w_323 = null;
      IStrategoTerm y_323 = null;
      term = extraction.constNil0;
      lifted467 lifted4670 = new lifted467();
      lifted4670.n_323 = n_323;
      term = try_1_0.instance.invoke(context, term, lifted4670);
      if(term == null)
        break Fail686;
      o_323 = term;
      if(n_323.value == null)
        break Fail686;
      term = (IStrategoTerm)termFactory.makeListCons(n_323.value, (IStrategoList)extraction.constNil0);
      w_323 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", w_323, NO_STRATEGIES, new IStrategoTerm[]{extraction.const634});
      if(term == null)
        break Fail686;
      y_323 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, o_323);
      if(term == null)
        break Fail686;
      term = put_syntax_sort_0_1.instance.invoke(context, y_323, term);
      if(term == null)
        break Fail686;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}