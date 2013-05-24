package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_prefix_fun_0_4 extends Strategy 
{ 
  public static smart_prefix_fun_0_4 instance = new smart_prefix_fun_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_278, IStrategoTerm ref_v_278, IStrategoTerm ref_w_278, IStrategoTerm ref_x_278)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference u_278 = new TermReference(ref_u_278);
    TermReference v_278 = new TermReference(ref_v_278);
    TermReference w_278 = new TermReference(ref_w_278);
    TermReference x_278 = new TermReference(ref_x_278);
    context.push("smart_prefix_fun_0_4");
    Fail619:
    { 
      IStrategoTerm y_278 = null;
      IStrategoTerm r_279 = null;
      IStrategoTerm v_279 = null;
      term = extraction.constNil0;
      lifted396 lifted3960 = new lifted396();
      lifted3960.u_278 = u_278;
      lifted3960.v_278 = v_278;
      lifted3960.w_278 = w_278;
      lifted3960.x_278 = x_278;
      term = try_1_0.instance.invoke(context, term, lifted3960);
      if(term == null)
        break Fail619;
      y_278 = term;
      if(u_278.value == null || (v_278.value == null || (w_278.value == null || x_278.value == null)))
        break Fail619;
      term = (IStrategoTerm)termFactory.makeListCons(u_278.value, termFactory.makeListCons(v_278.value, termFactory.makeListCons(w_278.value, termFactory.makeListCons(x_278.value, (IStrategoList)extraction.constNil0))));
      r_279 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", r_279, NO_STRATEGIES, new IStrategoTerm[]{extraction.const570});
      if(term == null)
        break Fail619;
      v_279 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, y_278);
      if(term == null)
        break Fail619;
      term = put_syntax_sort_0_1.instance.invoke(context, v_279, term);
      if(term == null)
        break Fail619;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}