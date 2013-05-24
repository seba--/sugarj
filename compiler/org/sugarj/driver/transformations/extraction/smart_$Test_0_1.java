package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Test_0_1 extends Strategy 
{ 
  public static smart_$Test_0_1 instance = new smart_$Test_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_211)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference k_211 = new TermReference(ref_k_211);
    context.push("smart_Test_0_1");
    Fail515:
    { 
      IStrategoTerm l_211 = null;
      IStrategoTerm s_211 = null;
      IStrategoTerm u_211 = null;
      term = extraction.constNil0;
      lifted274 lifted2740 = new lifted274();
      lifted2740.k_211 = k_211;
      term = try_1_0.instance.invoke(context, term, lifted2740);
      if(term == null)
        break Fail515;
      l_211 = term;
      if(k_211.value == null)
        break Fail515;
      term = (IStrategoTerm)termFactory.makeListCons(k_211.value, (IStrategoList)extraction.constNil0);
      s_211 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_211, NO_STRATEGIES, new IStrategoTerm[]{extraction.const480});
      if(term == null)
        break Fail515;
      u_211 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, l_211);
      if(term == null)
        break Fail515;
      term = put_syntax_sort_0_1.instance.invoke(context, u_211, term);
      if(term == null)
        break Fail515;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}