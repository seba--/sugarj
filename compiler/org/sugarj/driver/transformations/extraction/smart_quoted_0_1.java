package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_quoted_0_1 extends Strategy 
{ 
  public static smart_quoted_0_1 instance = new smart_quoted_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_274)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference f_274 = new TermReference(ref_f_274);
    context.push("smart_quoted_0_1");
    Fail612:
    { 
      IStrategoTerm g_274 = null;
      IStrategoTerm u_274 = null;
      IStrategoTerm w_274 = null;
      term = extraction.constNil0;
      lifted387 lifted3870 = new lifted387();
      lifted3870.f_274 = f_274;
      term = try_1_0.instance.invoke(context, term, lifted3870);
      if(term == null)
        break Fail612;
      lifted388 lifted3880 = new lifted388();
      lifted3880.f_274 = f_274;
      term = try_1_0.instance.invoke(context, term, lifted3880);
      if(term == null)
        break Fail612;
      g_274 = term;
      if(f_274.value == null)
        break Fail612;
      term = (IStrategoTerm)termFactory.makeListCons(f_274.value, (IStrategoList)extraction.constNil0);
      u_274 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", u_274, NO_STRATEGIES, new IStrategoTerm[]{extraction.const563});
      if(term == null)
        break Fail612;
      w_274 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, g_274);
      if(term == null)
        break Fail612;
      term = put_syntax_sort_0_1.instance.invoke(context, w_274, term);
      if(term == null)
        break Fail612;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}