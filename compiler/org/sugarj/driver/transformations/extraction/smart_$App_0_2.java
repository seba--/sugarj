package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$App_0_2 extends Strategy 
{ 
  public static smart_$App_0_2 instance = new smart_$App_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_232, IStrategoTerm ref_g_232)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference f_232 = new TermReference(ref_f_232);
    TermReference g_232 = new TermReference(ref_g_232);
    context.push("smart_App_0_2");
    Fail548:
    { 
      IStrategoTerm h_232 = null;
      IStrategoTerm n_233 = null;
      IStrategoTerm p_233 = null;
      term = extraction.constNil0;
      lifted309 lifted3090 = new lifted309();
      lifted3090.f_232 = f_232;
      lifted3090.g_232 = g_232;
      term = try_1_0.instance.invoke(context, term, lifted3090);
      if(term == null)
        break Fail548;
      lifted310 lifted3100 = new lifted310();
      lifted3100.f_232 = f_232;
      lifted3100.g_232 = g_232;
      term = try_1_0.instance.invoke(context, term, lifted3100);
      if(term == null)
        break Fail548;
      h_232 = term;
      if(f_232.value == null || g_232.value == null)
        break Fail548;
      term = (IStrategoTerm)termFactory.makeListCons(f_232.value, termFactory.makeListCons(g_232.value, (IStrategoList)extraction.constNil0));
      n_233 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", n_233, NO_STRATEGIES, new IStrategoTerm[]{extraction.const509});
      if(term == null)
        break Fail548;
      p_233 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, h_232);
      if(term == null)
        break Fail548;
      term = put_syntax_sort_0_1.instance.invoke(context, p_233, term);
      if(term == null)
        break Fail548;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}