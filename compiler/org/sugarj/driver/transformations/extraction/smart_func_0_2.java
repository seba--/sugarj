package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_func_0_2 extends Strategy 
{ 
  public static smart_func_0_2 instance = new smart_func_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_310, IStrategoTerm ref_u_310)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference t_310 = new TermReference(ref_t_310);
    TermReference u_310 = new TermReference(ref_u_310);
    context.push("smart_func_0_2");
    Fail662:
    { 
      IStrategoTerm v_310 = null;
      IStrategoTerm f_311 = null;
      IStrategoTerm h_311 = null;
      term = extraction.constNil0;
      lifted443 lifted4430 = new lifted443();
      lifted4430.t_310 = t_310;
      lifted4430.u_310 = u_310;
      term = try_1_0.instance.invoke(context, term, lifted4430);
      if(term == null)
        break Fail662;
      v_310 = term;
      if(t_310.value == null || u_310.value == null)
        break Fail662;
      term = (IStrategoTerm)termFactory.makeListCons(t_310.value, termFactory.makeListCons(u_310.value, (IStrategoList)extraction.constNil0));
      f_311 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", f_311, NO_STRATEGIES, new IStrategoTerm[]{extraction.const611});
      if(term == null)
        break Fail662;
      h_311 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, v_310);
      if(term == null)
        break Fail662;
      term = put_syntax_sort_0_1.instance.invoke(context, h_311, term);
      if(term == null)
        break Fail662;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}