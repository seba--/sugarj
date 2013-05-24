package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_default_0_1 extends Strategy 
{ 
  public static smart_default_0_1 instance = new smart_default_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_301)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference u_301 = new TermReference(ref_u_301);
    context.push("smart_default_0_1");
    Fail646:
    { 
      IStrategoTerm v_301 = null;
      IStrategoTerm n_302 = null;
      IStrategoTerm p_302 = null;
      term = extraction.constNil0;
      lifted425 lifted4250 = new lifted425();
      lifted4250.u_301 = u_301;
      term = try_1_0.instance.invoke(context, term, lifted4250);
      if(term == null)
        break Fail646;
      lifted426 lifted4260 = new lifted426();
      lifted4260.u_301 = u_301;
      term = try_1_0.instance.invoke(context, term, lifted4260);
      if(term == null)
        break Fail646;
      lifted427 lifted4270 = new lifted427();
      lifted4270.u_301 = u_301;
      term = try_1_0.instance.invoke(context, term, lifted4270);
      if(term == null)
        break Fail646;
      v_301 = term;
      if(u_301.value == null)
        break Fail646;
      term = (IStrategoTerm)termFactory.makeListCons(u_301.value, (IStrategoList)extraction.constNil0);
      n_302 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", n_302, NO_STRATEGIES, new IStrategoTerm[]{extraction.const596});
      if(term == null)
        break Fail646;
      p_302 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, v_301);
      if(term == null)
        break Fail646;
      term = put_syntax_sort_0_1.instance.invoke(context, p_302, term);
      if(term == null)
        break Fail646;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}