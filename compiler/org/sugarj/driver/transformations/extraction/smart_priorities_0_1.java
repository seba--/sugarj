package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_priorities_0_1 extends Strategy 
{ 
  public static smart_priorities_0_1 instance = new smart_priorities_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_101)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_101 = new TermReference(ref_r_101);
    context.push("smart_priorities_0_1");
    Fail358:
    { 
      IStrategoTerm s_101 = null;
      IStrategoTerm e_102 = null;
      IStrategoTerm g_102 = null;
      term = extraction.constNil0;
      lifted71 lifted710 = new lifted71();
      lifted710.r_101 = r_101;
      term = try_1_0.instance.invoke(context, term, lifted710);
      if(term == null)
        break Fail358;
      lifted72 lifted720 = new lifted72();
      lifted720.r_101 = r_101;
      term = try_1_0.instance.invoke(context, term, lifted720);
      if(term == null)
        break Fail358;
      s_101 = term;
      if(r_101.value == null)
        break Fail358;
      term = (IStrategoTerm)termFactory.makeListCons(r_101.value, (IStrategoList)extraction.constNil0);
      e_102 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", e_102, NO_STRATEGIES, new IStrategoTerm[]{extraction.const348});
      if(term == null)
        break Fail358;
      g_102 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, s_101);
      if(term == null)
        break Fail358;
      term = put_syntax_sort_0_1.instance.invoke(context, g_102, term);
      if(term == null)
        break Fail358;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}