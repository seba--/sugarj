package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_module_0_1 extends Strategy 
{ 
  public static smart_module_0_1 instance = new smart_module_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_317)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference u_317 = new TermReference(ref_u_317);
    context.push("smart_module_0_1");
    Fail675:
    { 
      IStrategoTerm v_317 = null;
      IStrategoTerm d_318 = null;
      IStrategoTerm f_318 = null;
      term = extraction.constNil0;
      lifted456 lifted4560 = new lifted456();
      lifted4560.u_317 = u_317;
      term = try_1_0.instance.invoke(context, term, lifted4560);
      if(term == null)
        break Fail675;
      v_317 = term;
      if(u_317.value == null)
        break Fail675;
      term = (IStrategoTerm)termFactory.makeListCons(u_317.value, (IStrategoList)extraction.constNil0);
      d_318 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", d_318, NO_STRATEGIES, new IStrategoTerm[]{extraction.const616});
      if(term == null)
        break Fail675;
      f_318 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, v_317);
      if(term == null)
        break Fail675;
      term = put_syntax_sort_0_1.instance.invoke(context, f_318, term);
      if(term == null)
        break Fail675;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}