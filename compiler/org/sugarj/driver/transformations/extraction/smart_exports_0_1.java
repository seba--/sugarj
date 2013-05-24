package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_exports_0_1 extends Strategy 
{ 
  public static smart_exports_0_1 instance = new smart_exports_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_314)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference p_314 = new TermReference(ref_p_314);
    context.push("smart_exports_0_1");
    Fail668:
    { 
      IStrategoTerm q_314 = null;
      IStrategoTerm y_314 = null;
      IStrategoTerm a_315 = null;
      term = extraction.constNil0;
      lifted449 lifted4490 = new lifted449();
      lifted4490.p_314 = p_314;
      term = try_1_0.instance.invoke(context, term, lifted4490);
      if(term == null)
        break Fail668;
      q_314 = term;
      if(p_314.value == null)
        break Fail668;
      term = (IStrategoTerm)termFactory.makeListCons(p_314.value, (IStrategoList)extraction.constNil0);
      y_314 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", y_314, NO_STRATEGIES, new IStrategoTerm[]{extraction.const617});
      if(term == null)
        break Fail668;
      a_315 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, q_314);
      if(term == null)
        break Fail668;
      term = put_syntax_sort_0_1.instance.invoke(context, a_315, term);
      if(term == null)
        break Fail668;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}