package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_iter_star_0_1 extends Strategy 
{ 
  public static smart_iter_star_0_1 instance = new smart_iter_star_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_308)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_308 = new TermReference(ref_h_308);
    context.push("smart_iter_star_0_1");
    Fail658:
    { 
      IStrategoTerm j_308 = null;
      IStrategoTerm u_308 = null;
      IStrategoTerm w_308 = null;
      term = extraction.constNil0;
      lifted439 lifted4390 = new lifted439();
      lifted4390.h_308 = h_308;
      term = try_1_0.instance.invoke(context, term, lifted4390);
      if(term == null)
        break Fail658;
      j_308 = term;
      if(h_308.value == null)
        break Fail658;
      term = (IStrategoTerm)termFactory.makeListCons(h_308.value, (IStrategoList)extraction.constNil0);
      u_308 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_308, NO_STRATEGIES, new IStrategoTerm[]{extraction.const607});
      if(term == null)
        break Fail658;
      w_308 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, j_308);
      if(term == null)
        break Fail658;
      term = put_syntax_sort_0_1.instance.invoke(context, w_308, term);
      if(term == null)
        break Fail658;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}