package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Module_0_2 extends Strategy 
{ 
  public static smart_$Module_0_2 instance = new smart_$Module_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_266, IStrategoTerm ref_g_266)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference f_266 = new TermReference(ref_f_266);
    TermReference g_266 = new TermReference(ref_g_266);
    context.push("smart_Module_0_2");
    Fail599:
    { 
      IStrategoTerm h_266 = null;
      IStrategoTerm s_266 = null;
      IStrategoTerm u_266 = null;
      term = extraction.constNil0;
      lifted370 lifted3700 = new lifted370();
      lifted3700.f_266 = f_266;
      lifted3700.g_266 = g_266;
      term = try_1_0.instance.invoke(context, term, lifted3700);
      if(term == null)
        break Fail599;
      h_266 = term;
      if(f_266.value == null || g_266.value == null)
        break Fail599;
      term = (IStrategoTerm)termFactory.makeListCons(f_266.value, termFactory.makeListCons(g_266.value, (IStrategoList)extraction.constNil0));
      s_266 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", s_266, NO_STRATEGIES, new IStrategoTerm[]{extraction.const76});
      if(term == null)
        break Fail599;
      u_266 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, h_266);
      if(term == null)
        break Fail599;
      term = put_syntax_sort_0_1.instance.invoke(context, u_266, term);
      if(term == null)
        break Fail599;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}