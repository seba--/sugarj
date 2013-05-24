package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class smart_$Sort$Var_0_1 extends Strategy 
{ 
  public static smart_$Sort$Var_0_1 instance = new smart_$Sort$Var_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_242)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference u_242 = new TermReference(ref_u_242);
    context.push("smart_SortVar_0_1");
    Fail562:
    { 
      IStrategoTerm v_242 = null;
      IStrategoTerm c_243 = null;
      IStrategoTerm e_243 = null;
      term = extraction.constNil0;
      lifted330 lifted3300 = new lifted330();
      lifted3300.u_242 = u_242;
      term = try_1_0.instance.invoke(context, term, lifted3300);
      if(term == null)
        break Fail562;
      v_242 = term;
      if(u_242.value == null)
        break Fail562;
      term = (IStrategoTerm)termFactory.makeListCons(u_242.value, (IStrategoList)extraction.constNil0);
      c_243 = term;
      term = context.invokePrimitive("SUGARJ_unsafe_build", c_243, NO_STRATEGIES, new IStrategoTerm[]{extraction.const522});
      if(term == null)
        break Fail562;
      e_243 = term;
      term = build_alt_sort_or_fail_0_0.instance.invoke(context, v_242);
      if(term == null)
        break Fail562;
      term = put_syntax_sort_0_1.instance.invoke(context, e_243, term);
      if(term == null)
        break Fail562;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}