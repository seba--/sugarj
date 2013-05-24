package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Sort_0_2 extends Strategy 
{ 
  public static smart_$Sort_0_2 instance = new smart_$Sort_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_243, IStrategoTerm ref_s_243)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_243 = new TermReference(ref_r_243);
    TermReference s_243 = new TermReference(ref_s_243);
    context.push("smart_Sort_0_2");
    Fail564:
    { 
      IStrategoTerm t_243 = null;
      IStrategoTerm e_244 = null;
      IStrategoTerm g_244 = null;
      term = extraction.constNil0;
      lifted332 lifted3320 = new lifted332();
      lifted3320.r_243 = r_243;
      lifted3320.s_243 = s_243;
      term = try_1_0.instance.invoke(context, term, lifted3320);
      if(term == null)
        break Fail564;
      t_243 = term;
      if(r_243.value == null || s_243.value == null)
        break Fail564;
      term = (IStrategoTerm)termFactory.makeListCons(r_243.value, termFactory.makeListCons(s_243.value, (IStrategoList)extraction.constNil0));
      e_244 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", e_244, NO_STRATEGIES, new IStrategoTerm[]{extraction.const6});
      if(term == null)
        break Fail564;
      g_244 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, t_243);
      if(term == null)
        break Fail564;
      term = put_syntax_sort_0_1.instance.invoke(context, g_244, term);
      if(term == null)
        break Fail564;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}