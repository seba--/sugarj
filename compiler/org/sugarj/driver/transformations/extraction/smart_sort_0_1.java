package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_sort_0_1 extends Strategy 
{ 
  public static smart_sort_0_1 instance = new smart_sort_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_281)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference k_281 = new TermReference(ref_k_281);
    context.push("smart_sort_0_1");
    Fail623:
    { 
      IStrategoTerm l_281 = null;
      IStrategoTerm s_281 = null;
      IStrategoTerm u_281 = null;
      term = extraction.constNil0;
      lifted400 lifted4000 = new lifted400();
      lifted4000.k_281 = k_281;
      term = try_1_0.instance.invoke(context, term, lifted4000);
      if(term == null)
        break Fail623;
      l_281 = term;
      if(k_281.value == null)
        break Fail623;
      term = (IStrategoTerm)termFactory.makeListCons(k_281.value, (IStrategoList)extraction.constNil0);
      s_281 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_281, NO_STRATEGIES, new IStrategoTerm[]{extraction.const574});
      if(term == null)
        break Fail623;
      u_281 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_281);
      if(term == null)
        break Fail623;
      term = put_syntax_sort_0_1.instance.invoke(context, u_281, term);
      if(term == null)
        break Fail623;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}