package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_natural_0_1 extends Strategy 
{ 
  public static smart_natural_0_1 instance = new smart_natural_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_322)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference k_322 = new TermReference(ref_k_322);
    context.push("smart_natural_0_1");
    Fail684:
    { 
      IStrategoTerm l_322 = null;
      IStrategoTerm s_322 = null;
      IStrategoTerm u_322 = null;
      term = extraction.constNil0;
      lifted465 lifted4650 = new lifted465();
      lifted4650.k_322 = k_322;
      term = try_1_0.instance.invoke(context, term, lifted4650);
      if(term == null)
        break Fail684;
      l_322 = term;
      if(k_322.value == null)
        break Fail684;
      term = (IStrategoTerm)termFactory.makeListCons(k_322.value, (IStrategoList)extraction.constNil0);
      s_322 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_322, NO_STRATEGIES, new IStrategoTerm[]{extraction.const632});
      if(term == null)
        break Fail684;
      u_322 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_322);
      if(term == null)
        break Fail684;
      term = put_syntax_sort_0_1.instance.invoke(context, u_322, term);
      if(term == null)
        break Fail684;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}