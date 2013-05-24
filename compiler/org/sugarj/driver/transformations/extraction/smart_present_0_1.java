package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_present_0_1 extends Strategy 
{ 
  public static smart_present_0_1 instance = new smart_present_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_g_287)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference g_287 = new TermReference(ref_g_287);
    context.push("smart_present_0_1");
    Fail634:
    { 
      IStrategoTerm h_287 = null;
      IStrategoTerm t_287 = null;
      IStrategoTerm v_287 = null;
      term = extraction.constNil0;
      lifted412 lifted4120 = new lifted412();
      lifted4120.g_287 = g_287;
      term = try_1_0.instance.invoke(context, term, lifted4120);
      if(term == null)
        break Fail634;
      lifted413 lifted4130 = new lifted413();
      lifted4130.g_287 = g_287;
      term = try_1_0.instance.invoke(context, term, lifted4130);
      if(term == null)
        break Fail634;
      h_287 = term;
      if(g_287.value == null)
        break Fail634;
      term = (IStrategoTerm)termFactory.makeListCons(g_287.value, (IStrategoList)extraction.constNil0);
      t_287 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", t_287, NO_STRATEGIES, new IStrategoTerm[]{extraction.const585});
      if(term == null)
        break Fail634;
      v_287 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, h_287);
      if(term == null)
        break Fail634;
      term = put_syntax_sort_0_1.instance.invoke(context, v_287, term);
      if(term == null)
        break Fail634;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}